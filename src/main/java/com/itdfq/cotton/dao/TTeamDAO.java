package com.itdfq.cotton.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TTeam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
public interface TTeamDAO {


    void reset(List<String> list);

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

    List<TTeam> findByTJ(TTeam tTeam);

    void deleteSelect(List<String> list);

    List<TTeam> myselect();

    TTeam findByUsername(String username);
}