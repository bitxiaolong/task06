package com.dao;

import com.pojo.FirstAndSecond;

import java.util.List;

public interface FirstAndSecondDao {
    //展示所有的一二级导航
    List<FirstAndSecond> showAll();
    //搜索框搜索二级导航
    List<FirstAndSecond> searchsecond(String name);
}
