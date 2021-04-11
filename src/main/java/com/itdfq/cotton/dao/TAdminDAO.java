package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.itdfq.cotton.model.TAdmin;

/**
 *
 */
public interface TAdminDAO {




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
     * @return {@link TAdmin}
     */
    Page<TAdmin> findByPage();

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