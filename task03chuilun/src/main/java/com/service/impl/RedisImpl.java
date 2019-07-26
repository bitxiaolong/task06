package com.service.impl;

import com.dao.Cached;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service("Redis")
public class RedisImpl implements Cached {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Boolean set(String key, Object value) {
        redisTemplate.opsForValue().set(key,value);
        if (redisTemplate.opsForValue().get(key)!=null){
            return true;
        }
             return false;
    }

    @Override
    public Boolean delete(String key) {
      redisTemplate.delete(key);
      if (redisTemplate.opsForValue().get(key)==null){
          return true;
      }
          return false;
    }

    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
