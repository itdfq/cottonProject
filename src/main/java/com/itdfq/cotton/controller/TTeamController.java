package com.itdfq.cotton.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.service.TTeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/tTeams")
@Api(tags = "")
public class TTeamController {
    @Autowired
    private TTeamService tTeamService;

    private Map<String,Object> map = new HashMap<>();

    @RequestMapping("/resert")
    public Map<String,Object> resert(String id){
        map.clear();
        try {
            List<String> list = new ArrayList<>();
            String[] strs = id.split(",");
            for (String str : strs) {
                list.add(str);
            }
            tTeamService.resert(list);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping("findByTJ")
    @ApiOperation("分页查询")
    public Map<String,Object> findByTJ(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit,@RequestBody TTeam tAdmin) {
        PageHelper.startPage(page, limit);
        map.clear();
        try {
            List<TTeam> byTJ = tTeamService.findByTJ(tAdmin);
            PageInfo<TTeam> pageInfo = new PageInfo<>(byTJ);
            map.put("count",pageInfo.getTotal());
            map.put("data",pageInfo.getList());
            map.put("code",0);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping("findByPage")
    @ApiOperation("分页查询")
    public Map<String,Object> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer page,
                                         @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer limit) {
        map.clear();
        try {
            PageInfo<TTeam> byPage = tTeamService.findByPage(page, limit);
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


    @PostMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody TTeam tTeam) {
        map.clear();
        try {
            tTeamService.insert(tTeam);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("mas",e.getMessage());
        }
        return map;
    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody TTeam tTeam) {
        map.clear();
        try {
            tTeamService.update(tTeam);
            map.put("msg",1);

        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public Map<String,Object> deleteById(@RequestBody TTeam tTeam) {
        try {
            tTeamService.deleteById(tTeam.getId());
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
            tTeamService.deleteSelect(list);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    @RequestMapping("/myselect")
    public Map<String,Object> myselect(){
        try {
            List<TTeam> myselect = tTeamService.myselect();
            map.put("msg",1);
            map.put("data",myselect);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }

    @RequestMapping("/login") Map<String,Object> login(@RequestBody TTeam tTeam, HttpServletRequest request){

        map.clear();
        TTeam byUsername = null;
        System.out.println(tTeam);
        try {
            byUsername = tTeamService.findByUsername(tTeam.getUsername());
            if (byUsername==null) {
                map.put("msg", "用户不存在或被锁定");
            }else {
                if (byUsername.getPassword().equals(tTeam.getPassword())) {
                    map.put("msg", 1);
                    map.put("role",byUsername.getRole());
                    request.getSession().setAttribute("user", byUsername);
                } else {
                    map.put("msg", "密码不正确");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

}
