package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;

/**
 *
 */
public interface TAdminService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link TAdmin}
     */
    TAdmin findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TAdmin}
     */
    PageInfo<TAdmin> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param tAdmin
     */
    void insert(TAdmin tAdmin);
    /**
     * 修改
     *
     * @param tAdmin
     */
    void update(TAdmin tAdmin);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}