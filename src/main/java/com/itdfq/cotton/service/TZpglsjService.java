package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.model.TZpglsj;

import java.util.List;

/**
 *
 */
public interface TZpglsjService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TZpglsj}
     */
    PageInfo<TZpglsj> findByPage(int pageNum, int pageSize, TZpglsj tZpglsj);

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

    PageInfo<TZpglsj> findByTJ(Integer page, Integer limit, TZpglsj tZpglsj);

    void deleteSelect(List<String> list);
}