package com.controller;

import redis.clients.jedis.Jedis;

public class RedisTest {
    //redis测试，看能否实现缓存，并通过K值取得V值
    public static void main(String[] args) {
        //这一步应该是创建一个Jedis实现，并且连接本地
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        jedis.set("艾小龙","1997");
        System.out.println("Jedis键值对应的V是:"+jedis.get("艾小龙"));
    }
}
