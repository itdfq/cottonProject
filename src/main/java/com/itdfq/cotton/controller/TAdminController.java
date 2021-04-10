package com.itdfq.cotton.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.service.TAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/tAdmins")
public class TAdminController {

    Map<String,Object> map = new HashMap<>();

    @Autowired
    private TAdminService tAdminService;

    @RequestMapping("/findByUser")
    public Map<String,Object> findByUser(HttpSession session){
        try {
            TAdmin user = (TAdmin) session.getAttribute("user");
            if (user==null){
                map.put("msg","用户登录异常，请重新登录");
                return map;
            }else {
                map.put("role",user.getRole());
                map.put("msg",1);
                return map;
            }

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
            PageInfo<TAdmin> byPage = tAdminService.findByPage(page, limit);
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
    public void insert(@RequestBody TAdmin tAdmin) {
        tAdminService.insert(tAdmin);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody TAdmin tAdmin) {
        tAdminService.update(tAdmin);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        tAdminService.deleteById(id);
    }


    @RequestMapping("/login") Map<String,Object> login(@RequestBody TAdmin tAdmin,HttpServletRequest request){
        map.clear();
        TAdmin byUsername = null;
        try {
            byUsername = tAdminService.findByUsername(tAdmin.getUsername());
            if (byUsername==null) {
                map.put("msg", "用户不存在");
            }else {
                if (byUsername.getPassword().equals(tAdmin.getPassword())) {
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
