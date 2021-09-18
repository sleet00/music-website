package com.hxc.music.service.impl;


import com.hxc.music.dao.RankDao;
import com.hxc.music.entity.Rank;
import com.hxc.music.service.RankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Rank)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:19
 */
@Service
public class RankServiceImpl implements RankService {
    @Resource
    private RankDao rankDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Rank queryById(Object id) {
        return this.rankDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param rank        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Rank> queryByPage(Rank rank, PageRequest pageRequest) {
//        long total = this.rankDao.count(rank);
//        return new PageImpl<>(this.rankDao.queryAllByLimit(rank, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank insert(Rank rank) {
        this.rankDao.insert(rank);
        return rank;
    }

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank update(Rank rank) {
        this.rankDao.update(rank);
        return this.queryById(rank.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.rankDao.deleteById(id) > 0;
    }
}
