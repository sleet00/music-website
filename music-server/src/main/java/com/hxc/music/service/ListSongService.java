package com.hxc.music.service;

import com.hxc.music.entity.ListSong;


/**
 * (ListSong)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:17
 */
public interface ListSongService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ListSong queryById(Object id);

    /**
     * 分页查询
     *
     * @param listSong    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<ListSong> queryByPage(ListSong listSong, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    ListSong insert(ListSong listSong);

    /**
     * 修改数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    ListSong update(ListSong listSong);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
