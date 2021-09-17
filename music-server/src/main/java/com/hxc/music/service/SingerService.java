package com.hxc.music.service;


import com.hxc.music.entity.Singer;

/**
 * (Singer)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:21
 */
public interface SingerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Singer queryById(Object id);

    /**
     * 分页查询
     *
     * @param singer      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Singer> queryByPage(Singer singer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    Singer insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    Singer update(Singer singer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
