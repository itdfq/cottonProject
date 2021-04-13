package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.service.TZpcjsjService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/tZpcjsjs")
public class TZpcjsjController {

    private Map<String,Object> map = new HashMap<>();
    @Autowired
    private TZpcjsjService tZpcjsjService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TZpcjsj findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tZpcjsjService.findById(id);
    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public Map<String,Object> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit, HttpSession session) {

        map.clear();
        try {
            //获取session中的用户名
            TTeam user = (TTeam) session.getAttribute("user");
            TZpcjsj tZpcjsj=new TZpcjsj();
            if (!user.getRole().equals("2")){
                tZpcjsj.setBelongToAccount(user.getUsername());
            }
            System.out.println(tZpcjsj);
            PageInfo<TZpcjsj> byPage = tZpcjsjService.findByPage(page, limit,tZpcjsj);
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
    @ApiOperation("分页查询")
    public Map<String,Object> findByTJ(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit,@RequestBody TZpcjsj tZpcjsj,HttpSession session) {
        map.clear();
        //获取session中的用户名
        TTeam user = (TTeam) session.getAttribute("user");
        if (!user.getRole().equals("2")){
            tZpcjsj.setBelongToAccount(user.getUsername());
        }
        System.out.println(tZpcjsj);
        try {
            PageInfo<TZpcjsj> byPage = tZpcjsjService.findByTJ(page, limit,tZpcjsj);
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
    public Map<String,Object> insert(@RequestBody TZpcjsj tZpglsj) {
        System.out.println(tZpglsj);
        map.clear();
        try {
            tZpcjsjService.insert(tZpglsj);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }




   @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody TZpcjsj tZpcjsj) {
        map.clear();
       try {
           tZpcjsjService.update(tZpcjsj);
           map.put("msg",1);
       } catch (Exception e) {
           e.printStackTrace();
           map.put("msg",e.getMessage());
       }
       return map;
   }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public Map<String,Object> deleteById(@RequestBody TZpcjsj tZpcjsj) {
        map.clear();
        try {
            tZpcjsjService.deleteById(tZpcjsj.getId());
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
            tZpcjsjService.deleteSelect(list);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
}
