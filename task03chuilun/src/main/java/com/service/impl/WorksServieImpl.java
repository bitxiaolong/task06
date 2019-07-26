package com.service.impl;

import com.dao.WorksMapper;
import com.pojo.Works;
import com.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorksServieImpl implements WorksService {

    @Autowired
    private WorksMapper worksMapper;

    //根据关键字搜索查询，也就是搜索框的模糊查询
    @Override
    public List<Works> search(String workname) {
        return worksMapper.search(workname);
    }
    //点击一级导航，查询三级
    @Override
    public List<Works> getlist(int parent_id) {
        return worksMapper.getlist(parent_id);
    }
    //点击二级导航，查询所有属于二级的三级作品集
    @Override
    public List<Works> getsecondlist(int parent_id) {
        return worksMapper.getsecondlist(parent_id);
    }
}
