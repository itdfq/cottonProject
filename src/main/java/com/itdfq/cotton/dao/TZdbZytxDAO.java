package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.itdfq.cotton.model.TZdbZytx;

/**
 *
 */
public interface TZdbZytxDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link TZdbZytx}
     */
    TZdbZytx findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link TZdbZytx}
     */
    Page<TZdbZytx> findByPage();

    /**
     * 新增
     *
     * @param tZdbZytx
     */
    void insert(TZdbZytx tZdbZytx);

    /**
     * 修改
     *
     * @param tZdbZytx
     */
    void update(TZdbZytx tZdbZytx);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}