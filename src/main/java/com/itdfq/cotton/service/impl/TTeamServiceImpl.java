package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TTeamDAO;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.service.TTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TTeamServiceImpl implements TTeamService {

    @Autowired
    private TTeamDAO tTeamDAO;

    @Transactional(readOnly = true)
    @Override
    public TTeam findById(Integer id) {
        return tTeamDAO.findById(id);
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

}