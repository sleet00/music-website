package com.hxc.music.service;


import com.hxc.music.entity.SongList;

/**
 * (SongList)表服务接口
 *
 * @author makejava
 * @since 2021-09-17 15:18:24
 */
public interface SongListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SongList queryById(Object id);

    /**
     * 分页查询
     *
     * @param songList    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<SongList> queryByPage(SongList songList, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    SongList insert(SongList songList);

    /**
     * 修改数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    SongList update(SongList songList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
