package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TZpcjsjDAO;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.service.TZpcjsjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TZpcjsjServiceImpl implements TZpcjsjService {

    @Autowired
    private TZpcjsjDAO tZpcjsjDAO;

    @Transactional(readOnly = true)
    @Override
    public TZpcjsj findById(Integer id) {
        return tZpcjsjDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<TZpcjsj> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tZpcjsjDAO.findByPage());
    }

    @Override
    public PageInfo<TZpcjsj> findByTJ(int pageNum, int pageSize, TZpcjsj tZpcjsj) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tZpcjsjDAO.findByTJ(tZpcjsj));
    }

    @Override
    public void insert(TZpcjsj tZpcjsj) {
        tZpcjsjDAO.insert(tZpcjsj);
    }

    @Override
    public void update(TZpcjsj tZpcjsj) {
        tZpcjsjDAO.update(tZpcjsj);
    }

    @Override
    public void deleteById(Integer id) {
        tZpcjsjDAO.deleteById(id);
    }

    @Override
    public void deleteSelect(List<String> list) {
        tZpcjsjDAO.deleteSelect(list);
    }

}