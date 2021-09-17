package com.hxc.music.service.impl;

import com.hxc.music.dao.SongListDao;
import com.hxc.music.entity.SongList;
import com.hxc.music.service.SongListService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (SongList)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:24
 */
@Service("songListService")
public class SongListServiceImpl implements SongListService {
    @Resource
    private SongListDao songListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SongList queryById(Object id) {
        return this.songListDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param songList    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<SongList> queryByPage(SongList songList, PageRequest pageRequest) {
//        long total = this.songListDao.count(songList);
//        return new PageImpl<>(this.songListDao.queryAllByLimit(songList, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    @Override
    public SongList insert(SongList songList) {
        this.songListDao.insert(songList);
        return songList;
    }

    /**
     * 修改数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    @Override
    public SongList update(SongList songList) {
        this.songListDao.update(songList);
        return this.queryById(songList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.songListDao.deleteById(id) > 0;
    }
}
