package com.mxh.banktransfer.orm.dao;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.mxh.banktransfer.orm.entity.TTryLogEntity;

/**
 * TTryLogDao: 数据操作接口
 * <p>
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
public interface TTryLogDao extends IBaseDao<TTryLogEntity> {
    boolean isExist(String tid);
}
