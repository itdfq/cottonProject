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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    @RequestMapping("/findByTJ")
    @ApiOperation("分页条件查询")
    public Map<String,Object> findByTJ(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit,@RequestBody TZpglsj tZpglsj) {
        map.clear();
        try {
            PageInfo<TZpglsj> byPage = tZpglsjService.findByTJ(page, limit,tZpglsj);
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


    @RequestMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody TZpglsj tZpglsj) {
        System.out.println(tZpglsj);
        map.clear();
        try {
            tZpglsjService.insert(tZpglsj);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody TZpglsj tZpglsj) {
        System.out.println(tZpglsj);

        map.clear();
        try {
            tZpglsjService.update(tZpglsj);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public Map<String,Object> deleteById(@RequestBody TZpglsj tZpglsj) {
        map.clear();
        try {
            tZpglsjService.deleteById(tZpglsj.getId());
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    //    批量删除
    @RequestMapping("/deleteSelect")
    public Map<String,Object> deleteSelect(String id){
        map.clear();
        try {
            List<String> list = new ArrayList<>();
            String[] strs = id.split(",");
            for (String str : strs) {
                list.add(str);
            }
            tZpglsjService.deleteSelect(list);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
}
