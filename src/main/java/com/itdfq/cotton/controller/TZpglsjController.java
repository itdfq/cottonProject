package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TZpglsj;
import com.itdfq.cotton.service.TZpglsjService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/tZpglsjs")
@Api(tags = "")
public class TZpglsjController {
    @Autowired
    private TZpglsjService tZpglsjService;

    Map<String,Object> map = new HashMap<>();

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TZpglsj findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tZpglsjService.findById(id);
    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public Map<String,Object> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit) {
        map.clear();
        try {
            PageInfo<TZpglsj> byPage = tZpglsjService.findByPage(page, limit);
            map.put("count",byPage.getTotal());
            map.put("data",byPage.getList());
            map.put("code",0);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
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
