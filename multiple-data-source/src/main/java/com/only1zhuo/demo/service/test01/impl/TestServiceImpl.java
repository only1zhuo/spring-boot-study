package com.only1zhuo.demo.service.test01.impl;

import com.only1zhuo.demo.dao.test01.TestDao;
import com.only1zhuo.demo.model.Test;
import com.only1zhuo.demo.service.test01.intf.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuo
 * @date 2019/8/5 17:52
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test selectByPrimaryKey(Integer id) {
        return testDao.selectByPrimaryKey(id);
    }
}
