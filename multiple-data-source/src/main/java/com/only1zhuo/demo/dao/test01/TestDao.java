package com.only1zhuo.demo.dao.test01;

import com.only1zhuo.demo.model.Test;

/**
 * @author zhuo
 * @date 2019/8/5 17:39
 */
public interface TestDao {

    Test selectByPrimaryKey(Integer id);

}
