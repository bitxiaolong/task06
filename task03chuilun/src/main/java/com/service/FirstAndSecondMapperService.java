package com.service;

import com.pojo.FirstAndSecond;

import java.util.List;

public interface FirstAndSecondMapperService {
    //展示一二级导航
    List<FirstAndSecond> showAll();
    //搜索框搜索二级导航
    List<FirstAndSecond> searchsecond(String name);
}
