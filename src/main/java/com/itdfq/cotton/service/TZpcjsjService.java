package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZpcjsj;

import java.util.List;

/**
 *
 */
public interface TZpcjsjService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TZpcjsj}
     */
    PageInfo<TZpcjsj> findByPage(int pageNum, int pageSize,TZpcjsj tZpcjsj);

    /**
     * 分页条件查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TZpcjsj}
     */
    PageInfo<TZpcjsj> findByTJ(int pageNum, int pageSize,TZpcjsj tZpcjsj);
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

    void deleteSelect(List<String> list);

    void insertList(List<TZpcjsj> list);




}