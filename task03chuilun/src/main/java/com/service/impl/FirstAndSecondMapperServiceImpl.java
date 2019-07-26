package com.service.impl;

import com.danga.MemCached.MemCachedClient;
import com.dao.FirstAndSecondDao;
import com.pojo.FirstAndSecond;
import com.service.FirstAndSecondMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
@Service
public class FirstAndSecondMapperServiceImpl implements FirstAndSecondMapperService {
    @Autowired
    private FirstAndSecondDao firstAndSecondMapper;
    @Autowired
    private MemCachedClient memCachedClient;
    @Override
    public List<FirstAndSecond> showAll() {
//        return firstAndSecondMapper.showAll();
        List<FirstAndSecond> firstAndSeconds;
        if (this.memCachedClient.get("firstAndSeconds")== null){
            firstAndSeconds = firstAndSecondMapper.showAll();
            this.memCachedClient.set("firstAndSeconds",firstAndSeconds);
            System.out.println("从数据库中获取数据");
        }else {
            firstAndSeconds=(List<FirstAndSecond>) memCachedClient.get("firstAndSeconds");
            System.out.println("从缓存中查询");
        }
        return firstAndSeconds;
//        System.out.println("从缓存中取出数据");
//        firstAndSeconds =(List<FirstAndSecond>) memCachedClient.get("firstAndSeconds");
//        if (ObjectUtils.isEmpty(memCachedClient.get("firstAndSeconds"))){
//            System.out.println("缓存中没有数据，从数据库中取数据，然后放入缓存");
//           firstAndSeconds = firstAndSecondMapper.showAll();
//            boolean firstandsecond = memCachedClient.set("firstandsecond", firstAndSeconds);
//            System.out.println("将数据放入缓存中是否成功："+firstandsecond);
//        }
//        return firstAndSeconds;
    }

    @Override
    public List<FirstAndSecond> searchsecond(String name) {
        return firstAndSecondMapper.searchsecond(name);
    }
}
