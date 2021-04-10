package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.itdfq.cotton.model.TZpglsj;

import java.util.List;

/**
 *
 */
public interface TZpglsjDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link TZpglsj}
     */
    TZpglsj findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link TZpglsj}
     */
    Page<TZpglsj> findByPage();

    /**
     * 新增
     *
     * @param tZpglsj
     */
    void insert(TZpglsj tZpglsj);

    /**
     * 修改
     *
     * @param tZpglsj
     */
    void update(TZpglsj tZpglsj);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

    Page<TZpglsj> findByTJ(TZpglsj tZpglsj);

    void deleteSelect(List<String> list);
}