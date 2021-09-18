package com.hxc.music.service.impl;


import com.hxc.music.dao.SongDao;
import com.hxc.music.entity.Song;
import com.hxc.music.service.SongService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Song)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:23
 */
@Service
public class SongServiceImpl implements SongService {
    @Resource
    private SongDao songDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Song queryById(Object id) {
        return this.songDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param song        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Song> queryByPage(Song song, PageRequest pageRequest) {
//        long total = this.songDao.count(song);
//        return new PageImpl<>(this.songDao.queryAllByLimit(song, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song insert(Song song) {
        this.songDao.insert(song);
        return song;
    }

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song update(Song song) {
        this.songDao.update(song);
        return this.queryById(song.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.songDao.deleteById(id) > 0;
    }
}
