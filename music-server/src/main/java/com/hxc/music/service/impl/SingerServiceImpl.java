package com.hxc.music.service.impl;

import com.hxc.music.dao.SingerDao;
import com.hxc.music.entity.Singer;
import com.hxc.music.service.SingerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Singer)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:21
 */
@Service
public class SingerServiceImpl implements SingerService {
    @Resource
    private SingerDao singerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Singer queryById(Object id) {
        return this.singerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param singer      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Singer> queryByPage(Singer singer, PageRequest pageRequest) {
//        long total = this.singerDao.count(singer);
//        return new PageImpl<>(this.singerDao.queryAllByLimit(singer, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public Singer insert(Singer singer) {
        this.singerDao.insert(singer);
        return singer;
    }

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public Singer update(Singer singer) {
        this.singerDao.update(singer);
        return this.queryById(singer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.singerDao.deleteById(id) > 0;
    }
}
