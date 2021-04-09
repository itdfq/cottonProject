package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZdbZytx;
import com.itdfq.cotton.service.TZdbZytxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/tZdbZytxs")
@Api(tags = "")
public class TZdbZytxController {
    @Autowired
    private TZdbZytxService tZdbZytxService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TZdbZytx findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tZdbZytxService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<TZdbZytx> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return tZdbZytxService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody TZdbZytx tZdbZytx) {
        tZdbZytxService.insert(tZdbZytx);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody TZdbZytx tZdbZytx) {
        tZdbZytxService.update(tZdbZytx);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        tZdbZytxService.deleteById(id);
    }
}
