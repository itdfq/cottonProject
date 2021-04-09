package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TAdminDAO;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    private TAdminDAO tAdminDAO;

    @Transactional(readOnly = true)
    @Override
    public TAdmin findById(Integer id) {
        return tAdminDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<TAdmin> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tAdminDAO.findByPage());
    }

    @Override
    public void insert(TAdmin tAdmin) {
        tAdminDAO.insert(tAdmin);
    }

    @Override
    public void update(TAdmin tAdmin) {
        tAdminDAO.update(tAdmin);
    }

    @Override
    public void deleteById(Integer id) {
        tAdminDAO.deleteById(id);
    }

}