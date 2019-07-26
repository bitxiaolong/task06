package com.service.impl;

import com.dao.BannersMapper;
import com.dao.Cached;
import com.pojo.Banners;
import com.service.BannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BannersServiceImpl implements BannersService {


    @Autowired
    private BannersMapper bannersMapper;

    @Autowired
    @Qualifier("Redis")
    private  Cached cached;

    @Override
    public List<Banners> getall() {
//        return bannersMapper.getall();
//}
     List<Banners> banners;
     if (this.cached.get("banners")==null){
         System.out.println("redis缓存中啥都没有，需要从数据库中获取数据");
         banners = bannersMapper.getall();
         this.cached.set("banners",banners);
         System.out.println("从缓存中拿到了数据："+banners);
     }else {
         banners = (List<Banners>)cached.get("banners");
         System.out.println("直接从缓存中查询");
     }
     return banners;
    }
}
