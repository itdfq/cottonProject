package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.itdfq.cotton.model.TTeam;

/**
 *
 */
public interface TTeamDAO {

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
     * @return {@link TTeam}
     */
    Page<TTeam> findByPage();

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