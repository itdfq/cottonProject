package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZdbZytx;

/**
 *
 */
public interface TZdbZytxService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TZdbZytx}
     */
    PageInfo<TZdbZytx> findByPage(int pageNum, int pageSize);

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