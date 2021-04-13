package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TZpglsjDAO;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.model.TZpglsj;
import com.itdfq.cotton.service.TZpglsjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TZpglsjServiceImpl implements TZpglsjService {

    @Autowired
    private TZpglsjDAO tZpglsjDAO;

    @Transactional(readOnly = true)
    @Override
    public TZpglsj findById(Integer id) {
        return tZpglsjDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<TZpglsj> findByPage(int pageNum, int pageSize, TZpglsj tZpglsj) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tZpglsjDAO.findByPage(tZpglsj));
    }

    @Override
    public void insert(TZpglsj tZpglsj) {
        tZpglsjDAO.insert(tZpglsj);
    }

    @Override
    public void update(TZpglsj tZpglsj) {
        tZpglsjDAO.update(tZpglsj);
    }

    @Override
    public void deleteById(Integer id) {
        tZpglsjDAO.deleteById(id);
    }

    @Override
    public PageInfo<TZpglsj> findByTJ(Integer page, Integer limit, TZpglsj tZpglsj) {
        PageHelper.startPage(page, limit);
        return PageInfo.of(tZpglsjDAO.findByTJ(tZpglsj));
    }

    @Override
    public void deleteSelect(List<String> list) {
        tZpglsjDAO.deleteSelect(list);
    }

}