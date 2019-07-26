package com.service.impl;

import com.danga.MemCached.MemCachedClient;
import com.dao.LeaveWordsDao;
import com.pojo.LeaveWords;
import com.service.LeaveWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveWordsServiceImpl implements LeaveWordsService {
    @Autowired
    private LeaveWordsDao leaveWordsDao;
    @Autowired
    private MemCachedClient memCachedClient;
    @Override
    public boolean postleaveword(LeaveWords leaveWords) {
        int c = leaveWordsDao.postleaveword(leaveWords);
        if (c == 1){
            return true;
        }
            return false;
    }
}
