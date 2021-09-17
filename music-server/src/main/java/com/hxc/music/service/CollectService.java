package com.hxc.music.service;

import com.hxc.music.entity.Collect;


/**
 * (Collect)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:13
 */
public interface CollectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Collect queryById(Object id);

    /**
     * 分页查询
     *
     * @param collect     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Collect> queryByPage(Collect collect, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    Collect insert(Collect collect);

    /**
     * 修改数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    Collect update(Collect collect);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
