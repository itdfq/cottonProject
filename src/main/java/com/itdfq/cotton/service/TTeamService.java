package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TTeam;

/**
 *
 */
public interface TTeamService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link TTeam}
     */
    TTeam findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link TTeam}
     */
    PageInfo<TTeam> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param tTeam
     */
    void insert(TTeam tTeam);

    /**
     * 修改
     *
     * @param tTeam
     */
    void update(TTeam tTeam);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}