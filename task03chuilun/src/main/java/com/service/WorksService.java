package com.service;

import com.dao.WorksMapper;
import com.pojo.Works;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorksService {

    //搜索框中的模糊查询
    List<Works> search(String workname);
    //点击一级查询三级作品
    List<Works> getlist(int parent_id);
    //点击二级查询二级所属的所有作品集
    List<Works> getsecondlist(int parent_id);
}
