package com.itdfq.cotton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author GocChin
 * @Date 2021/4/10 11:27
 * @Blog: itdfq.com
 * @QQ: 909256107
 */
@Controller
public class RouterContrller {
    // 登陆页（首页）
    @GetMapping("/home")
    public String indexHome() {
        return "index";
    }

    // 登陆页（首页）
    @GetMapping("/")
    public String indexPage() {
        return "login";
    }


    // 退出系统
    @RequestMapping("/logout")
    public String administratorLogout(HttpSession session) {
        session.setAttribute("user", null);
//        session.setAttribute("adminName",null);
        return "login";
    }



//    //管理员主页
//    @GetMapping("/admin")
//    public String admin() {
//        return "admin/index";
//    }
//
//    //客户主页
//    @GetMapping("/customer")
//    public String customer() {
//        return "index";
//    }
//
//    //管理员菜单：客户管理
//    @GetMapping("/user")
//    public String user() {
//        return "admin/user";
//    }
//    //管理员菜单：设备管理
//    @GetMapping("/equipment")
//    public String equipment() {
//        return "admin/equipment";
//    }
//    //管理员菜单：权限管理
//    @GetMapping("/authority")
//    public String authority() {
//        return "admin/authority";
//    }
//    //管理员菜单：
//
//    // 退出系统
//    @RequestMapping("/logout")
//    public String administratorLogout(HttpSession session) {
//        session.setAttribute("user", null);
//        session.setAttribute("adminName",null);
//        return "login";
//    }
}
