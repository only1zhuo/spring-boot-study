package com.only1zhuo.demo.service.test02.impl;

import com.only1zhuo.demo.dao.test02.TestDao2;
import com.only1zhuo.demo.model.Test;
import com.only1zhuo.demo.service.test02.intf.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuo
 * @date 2019/8/5 17:52
 */
@Service("testService2")
public class TestServiceImpl implements TestService {

    // 注意这里的 TestDao2 引用的是 test02 包上的
    @Autowired
    private TestDao2 testDao;

    @Override
    public Test selectByPrimaryKey(Integer id) {
        return testDao.selectByPrimaryKey(id);
    }
}
