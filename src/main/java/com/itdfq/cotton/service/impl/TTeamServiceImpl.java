package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TTeamDAO;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.service.TTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TTeamServiceImpl implements TTeamService {

    @Autowired
    private TTeamDAO tTeamDAO;


    @Override
    public void resert(List<String> list) {
        tTeamDAO.reset(list);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<TTeam> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tTeamDAO.findByPage());
    }

    @Override
    public void insert(TTeam tTeam) {
        tTeamDAO.insert(tTeam);
    }

    @Override
    public void update(TTeam tTeam) {
        tTeamDAO.update(tTeam);
    }

    @Override
    public void deleteById(Integer id) {
        tTeamDAO.deleteById(id);
    }

    @Override
    public List<TTeam> findByTJ(TTeam tTeam) {
        return tTeamDAO.findByTJ(tTeam);
    }

    @Override
    public void deleteSelect(List<String> list) {
        tTeamDAO.deleteSelect(list);
    }

    @Override
    public List<TTeam> myselect() {
        List<TTeam> myselect = tTeamDAO.myselect();
        return myselect;
    }

    @Override
    public TTeam findByUsername(String username) {
        return tTeamDAO.findByUsername(username);
    }


}