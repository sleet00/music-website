package com.hxc.music.service.impl;


import com.hxc.music.dao.ListSongDao;
import com.hxc.music.entity.ListSong;
import com.hxc.music.service.ListSongService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (ListSong)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:18
 */
@Service
public class ListSongServiceImpl implements ListSongService {
    @Resource
    private ListSongDao listSongDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ListSong queryById(Object id) {
        return this.listSongDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param listSong    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<ListSong> queryByPage(ListSong listSong, PageRequest pageRequest) {
//        long total = this.listSongDao.count(listSong);
//        return new PageImpl<>(this.listSongDao.queryAllByLimit(listSong, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    @Override
    public ListSong insert(ListSong listSong) {
        this.listSongDao.insert(listSong);
        return listSong;
    }

    /**
     * 修改数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    @Override
    public ListSong update(ListSong listSong) {
        this.listSongDao.update(listSong);
        return this.queryById(listSong.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.listSongDao.deleteById(id) > 0;
    }
}
