package com.itdfq.cotton.controller;

import com.github.pagehelper.PageInfo;
import com.itdfq.cotton.model.TTeam;
import com.itdfq.cotton.service.TTeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/tTeams")
@Api(tags = "")
public class TTeamController {
    @Autowired
    private TTeamService tTeamService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public TTeam findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return tTeamService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<TTeam> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                      @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return tTeamService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody TTeam tTeam) {
        tTeamService.insert(tTeam);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody TTeam tTeam) {
        tTeamService.update(tTeam);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        tTeamService.deleteById(id);
    }
}
