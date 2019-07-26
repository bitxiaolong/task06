package com.dao;

import com.pojo.Works;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorksMapper {
  //根据搜索框中的关键字模糊查询,这个查询的是三级
  List<Works> search(String workname);
  //点击一级查询三级
  List<Works> getlist(int parent_id);
  //点击二级查询二级下面所有的作品集
  List<Works> getsecondlist(int parent_id);
}
