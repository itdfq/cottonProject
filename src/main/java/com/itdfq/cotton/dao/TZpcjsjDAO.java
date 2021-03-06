package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.itdfq.cotton.model.TZpcjsj;

import java.util.List;

/**
 *
 */
public interface TZpcjsjDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link TZpcjsj}
     */
    TZpcjsj findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link TZpcjsj}
     */
    Page<TZpcjsj> findByPage(TZpcjsj tZpcjsj);

    /**
     * 新增
     *
     * @param tZpcjsj
     */
    void insert(TZpcjsj tZpcjsj);

    /**
     * 修改
     *
     * @param tZpcjsj
     */
    void update(TZpcjsj tZpcjsj);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

    Page<TZpcjsj> findByTJ(TZpcjsj tZpcjsj);

    void deleteSelect(List<String> list);

    void insertList(List<TZpcjsj> list);


}