package com.controller;

import com.danga.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemcachedTest {

    @Autowired
    private MemCachedClient memCachedClient;

    @RequestMapping(value = "/memcached",method = RequestMethod.GET)
    public void testD(){
        boolean sd = memCachedClient.set("艾小龙", "1997");
        System.out.println("数据是否缓存成功:"+sd);
        Object qw = memCachedClient.get("艾小龙");
        System.out.println("缓存中键值对应的数据是:"+qw);
    }


}
