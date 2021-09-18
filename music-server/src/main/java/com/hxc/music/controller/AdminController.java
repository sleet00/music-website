package com.hxc.music.controller;


import com.alibaba.fastjson.JSONObject;
import com.hxc.music.entity.Admin;
import com.hxc.music.service.AdminService;
import com.hxc.music.utils.Consts;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:05
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 判断是否登录成功
     * @param request
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/admin/login/status", method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean flag = adminService.verifyPassword(name, password);
        if (flag){
            jsonObject.put(Consts.CODE, 1);
            jsonObject.put(Consts.MSG, "登录成功");
            jsonObject.put(Consts.NAME, name);
            return jsonObject;
        }
        jsonObject.put(Consts.CODE, 0);
        jsonObject.put(Consts.MSG, "用户名或密码错误");
        return jsonObject;
    }

    /**
     * 分页查询
     *
     * @param admin       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Admin>> queryByPage(Admin admin, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.adminService.queryByPage(admin, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Admin> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.adminService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param admin 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Admin> add(Admin admin) {
        return ResponseEntity.ok(this.adminService.insert(admin));
    }

    /**
     * 编辑数据
     *
     * @param admin 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Admin> edit(Admin admin) {
        return ResponseEntity.ok(this.adminService.update(admin));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.adminService.deleteById(id));
    }

}

