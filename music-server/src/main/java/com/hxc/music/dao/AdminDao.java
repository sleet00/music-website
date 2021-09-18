package com.hxc.music.dao;

import com.hxc.music.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Admin)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-17 15:18:06
 */
@Repository
public interface AdminDao {

    /**
     * 验证密码是否正确
     * @param username
     * @param password
     * @return
     */
    public int verifyPassword(String username, String password);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Admin queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param admin    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
//    List<Admin> queryAllByLimit(Admin admin, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param admin 查询条件
     * @return 总行数
     */
    long count(Admin admin);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 影响行数
     */
    int insert(Admin admin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Admin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Admin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Admin> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Admin> entities);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 影响行数
     */
    int update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}

