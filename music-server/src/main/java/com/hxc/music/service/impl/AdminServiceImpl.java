package com.hxc.music.service.impl;


import com.hxc.music.dao.AdminDao;
import com.hxc.music.entity.Admin;
import com.hxc.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Admin)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:11
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;


    /**
     * 验证密码是否正确
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public boolean verifyPassword(String name, String password) {
        return adminDao.verifyPassword(name, password) > 0;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Admin queryById(Object id) {
        return this.adminDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param admin       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Admin> queryByPage(Admin admin, PageRequest pageRequest) {
//        long total = this.adminDao.count(admin);
//        return new PageImpl<>(this.adminDao.queryAllByLimit(admin, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public Admin insert(Admin admin) {
        this.adminDao.insert(admin);
        return admin;
    }

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public Admin update(Admin admin) {
        this.adminDao.update(admin);
        return this.queryById(admin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.adminDao.deleteById(id) > 0;
    }
}
