package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.service.TZpcjsjService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/tZpcjsjs")
@Api(tags = "")
public class TZpcjsjController {
    @Autowired
    private TZpcjsjService tZpcjsjService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TZpcjsj findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tZpcjsjService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<TZpcjsj> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return tZpcjsjService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody TZpcjsj tZpcjsj) {
        tZpcjsjService.insert(tZpcjsj);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody TZpcjsj tZpcjsj) {
        tZpcjsjService.update(tZpcjsj);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        tZpcjsjService.deleteById(id);
    }
}
