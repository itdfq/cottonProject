package com.itdfq.cotton.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TAdmin;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.model.TZpcjsj;
import com.itdfq.cotton.service.TAdminService;
import com.itdfq.cotton.service.TZpcjsjService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 *
 */
@RestController
@RequestMapping("/tAdmins")
public class TAdminController {

    Map<String,Object> map = new HashMap<>();

    @Autowired
    private TAdminService tAdminService;

    @Autowired
    private TZpcjsjService tZpcjsjService;


    @RequestMapping("/excel")
    public Map<String, Object> upload(@RequestParam("file") MultipartFile upload,
                                      HttpServletRequest request) throws Exception {
        map.clear();

//        文件上传地址
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        System.out.println("路径地址："+path);
        File file = new File(path);
//        判断该路径是否存在
        if (!file.exists()){
            file.mkdir();
        }
        try {
            //获取文件的名字
            String filename = upload.getOriginalFilename();
            System.out.println("运行了"+filename);
            InputStream inputStream = upload.getInputStream();

//        把文件名字设置唯一
//        String uuid = UUID.randomUUID().toString().replace("-", "");
//        filename=uuid+"_"+filename;
            //完成文件上传
//        upload.transferTo(new File(path,filename));
            // 获得一个工作簿对象                             文件名，对应的类，监听器
            EasyExcel.read(inputStream, TZpcjsj.class, new AnalysisEventListener<TZpcjsj>(){
                /**
                 * 批处理阈值
                 */
                private static final int BATCH_COUNT = 2;
                List<TZpcjsj> list = new ArrayList<TZpcjsj>();

                @Override
                public void invoke(TZpcjsj user, AnalysisContext analysisContext) {
                    list.add(user);
                    if (list.size() >= BATCH_COUNT) {
                        saveData();
                        list.clear();
                    }
                }

                @Override
                public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                    saveData();
                    System.out.println("所有数据解析完成！");
                }

                private void saveData(){
//                    System.out.println(list);
//                    tZpcjsjService.insertList(list);
                    for (TZpcjsj t :list){
                        tZpcjsjService.insert(t);
                        System.out.println("插入一条数据"+t);
                    }

                }
            }).sheet().doRead();

//            ExcelReaderBuilder readWorkBook = EasyExcel.read(inputStream, TZpcjsj.class,new UserExcelListener() );
//
//            //获得一个工作表对象
//            ExcelReaderSheetBuilder sheet = readWorkBook.sheet();
//
//            //读工作表中的内容
//            sheet.doRead();
            map.put("msg",1);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }

        return map;
    }

    @RequestMapping("/findByUser")
    public Map<String,Object> findByUser(HttpSession session){
        try {
            TTeam user = (TTeam) session.getAttribute("user");
            if (user==null){
                map.put("msg","用户登录异常，请重新登录");
                return map;
            }else {
                map.put("role",user.getRole());
                map.put("belongToAccount",user.getUsername());
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





}
