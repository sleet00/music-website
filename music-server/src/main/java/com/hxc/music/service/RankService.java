package com.hxc.music.service;

import com.hxc.music.entity.Rank;

/**
 * (Rank)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:19
 */
public interface RankService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Rank queryById(Object id);

    /**
     * 分页查询
     *
     * @param rank        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Rank> queryByPage(Rank rank, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank insert(Rank rank);

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank update(Rank rank);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
