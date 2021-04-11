package com.itdfq.cotton.service;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TTeam;

import java.util.List;

/**
 *
 */
public interface TTeamService {



    void resert(List<String> list);



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

    List<TTeam> findByTJ(TTeam users);

    void deleteSelect(List<String> list);

    List<TTeam> myselect();


    TTeam findByUsername(String username);
}