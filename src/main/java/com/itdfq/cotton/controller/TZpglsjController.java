package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZpglsj;
import com.itdfq.cotton.service.TZpglsjService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/tZpglsjs")
@Api(tags = "")
public class TZpglsjController {
    @Autowired
    private TZpglsjService tZpglsjService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TZpglsj findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tZpglsjService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<TZpglsj> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return tZpglsjService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody TZpglsj tZpglsj) {
        tZpglsjService.insert(tZpglsj);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody TZpglsj tZpglsj) {
        tZpglsjService.update(tZpglsj);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        tZpglsjService.deleteById(id);
    }
}
