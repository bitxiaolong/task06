package com.controller;


import com.danga.MemCached.MemCachedClient;
import com.pojo.Banners;
import com.pojo.FirstAndSecond;
import com.pojo.LeaveWords;
import com.pojo.Works;
import com.service.BannersService;
import com.service.FirstAndSecondMapperService;
import com.service.LeaveWordsService;
import com.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("all")
public class WorksMapperController {
//这是前台功能
    @Autowired
    private WorksService worksService;
    @Autowired
    private BannersService bannersService;
    @Autowired
    private FirstAndSecondMapperService firstAndSecondMapperService;
    @Autowired
    private LeaveWordsService leaveWordsService;
    @Autowired
    private MemCachedClient memCachedClient;

   //输入关键字模糊查询
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public ModelAndView findWorks(@RequestParam("workname") String workname,ModelAndView modelAndView){
        List<Works> search = worksService.search(workname);
        if (search != null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","查询成功");
            modelAndView.addObject("data",search);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","查询失败");
        }
            modelAndView.setViewName("success");
            return modelAndView;
    }

    //显示所有的banner图
    @RequestMapping(value = "/getbanner",method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView modelAndView){
        List<Banners> getall = bannersService.getall();
        if (getall.size() <= 6){
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","展示成功");
            modelAndView.addObject("data",getall);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","最多展示六张");
        }
            modelAndView.setViewName("success");
            return modelAndView;
    }

    //显示一二级作品集
    @RequestMapping(value = "/showall",method = RequestMethod.GET)
    public ModelAndView showAll(ModelAndView modelAndView){
        List<FirstAndSecond> firstAndSeconds = firstAndSecondMapperService.showAll();
        if (firstAndSeconds != null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","一二级展示成功");
            modelAndView.addObject("data",firstAndSeconds);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","展示失败");
        }
            modelAndView.setViewName("success");
        return  modelAndView;
    }
     //给作品留言
    @RequestMapping(value = "/insert/{work_id}",method = RequestMethod.POST)
   public ModelAndView insert(@PathVariable("work_id") Long work_id, LeaveWords leaveWords,ModelAndView modelAndView){
        leaveWords.setWork_id(work_id);//接收到的work_id是需要给要留言的作品id
        leaveWords.setState("1");//设定状态为上架
        if (leaveWordsService.postleaveword(leaveWords)) {//在service层已经做了判断，返回的int只要为1就是true
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","留言成功");
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","留言失败");
        }
            modelAndView.setViewName("success");
            return modelAndView;
    }

  //点击一级查询三级
    @RequestMapping(value = "/getlist/{parent_id}",method = RequestMethod.GET)
    public ModelAndView getlist(@PathVariable("parent_id") int parent_id,ModelAndView modelAndView){
        List<Works> getlista = worksService.getlist(parent_id);
        if (getlista != null){ //如果为true,说明不为空，我们就可以拿到这个getlist,也就拿到了这个一级导航下所有上架的三级作品
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","查询成功");
            modelAndView.addObject("data",getlista);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","查询失败");
        }
            modelAndView.setViewName("success");
            return modelAndView;
    }

    //点击二级查询二级下面所属的所有二级作品集
    @RequestMapping(value = "/getsecond/{parent_id}",method = RequestMethod.GET)
    public ModelAndView getsecond(@PathVariable("parent_id") int parent_id,ModelAndView modelAndView){
        List<Works> getsecondlistb = worksService.getsecondlist(parent_id);
        if (getsecondlistb != null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","二级查询所属三级成功");
            modelAndView.addObject("data",getsecondlistb);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","查询失败");
        }
            modelAndView.setViewName("success");
        return modelAndView;
    }

    //搜索框查询二级导航
    @RequestMapping(value = "/selectsecond",method = RequestMethod.GET)
    public ModelAndView searchsecond(@RequestParam("name") String name,ModelAndView modelAndView){
        List<FirstAndSecond> searchsecondc = firstAndSecondMapperService.searchsecond(name);
        if ( searchsecondc != null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("message","查询二级成功");
            modelAndView.addObject("data",searchsecondc);
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("message","查询二级失败");
        }
            modelAndView.setViewName("success");
            return modelAndView;
    }

}
