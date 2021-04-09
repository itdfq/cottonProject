package com.itdfq.cotton.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.dao.TZdbZytxDAO;
import com.itdfq.cotton.model.TZdbZytx;
import com.itdfq.cotton.service.TZdbZytxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TZdbZytxServiceImpl implements TZdbZytxService {

    @Autowired
    private TZdbZytxDAO tZdbZytxDAO;

    @Transactional(readOnly = true)
    @Override
    public TZdbZytx findById(Integer id) {
        return tZdbZytxDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<TZdbZytx> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(tZdbZytxDAO.findByPage());
    }

    @Override
    public void insert(TZdbZytx tZdbZytx) {
        tZdbZytxDAO.insert(tZdbZytx);
    }

    @Override
    public void update(TZdbZytx tZdbZytx) {
        tZdbZytxDAO.update(tZdbZytx);
    }

    @Override
    public void deleteById(Integer id) {
        tZdbZytxDAO.deleteById(id);
    }

}