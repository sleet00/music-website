package com.hxc.music.dao;


import com.hxc.music.entity.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Collect)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-17 15:18:13
 */
public interface CollectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Collect queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param collect  查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
//    List<Collect> queryAllByLimit(Collect collect, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param collect 查询条件
     * @return 总行数
     */
    long count(Collect collect);

    /**
     * 新增数据
     *
     * @param collect 实例对象
     * @return 影响行数
     */
    int insert(Collect collect);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Collect> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Collect> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Collect> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Collect> entities);

    /**
     * 修改数据
     *
     * @param collect 实例对象
     * @return 影响行数
     */
    int update(Collect collect);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}

