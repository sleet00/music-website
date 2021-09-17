package com.hxc.music.service;


import com.hxc.music.entity.Consumer;

/**
 * (Consumer)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:16
 */
public interface ConsumerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Consumer queryById(Object id);

    /**
     * 分页查询
     *
     * @param consumer    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Consumer> queryByPage(Consumer consumer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    Consumer insert(Consumer consumer);

    /**
     * 修改数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    Consumer update(Consumer consumer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
