package com.hxc.music.service.impl;

import com.hxc.music.dao.CollectDao;
import com.hxc.music.entity.Collect;
import com.hxc.music.service.CollectService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Collect)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:14
 */
@Service("collectService")
public class CollectServiceImpl implements CollectService {
    @Resource
    private CollectDao collectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Collect queryById(Object id) {
        return this.collectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param collect     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Collect> queryByPage(Collect collect, PageRequest pageRequest) {
//        long total = this.collectDao.count(collect);
//        return new PageImpl<>(this.collectDao.queryAllByLimit(collect, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    @Override
    public Collect insert(Collect collect) {
        this.collectDao.insert(collect);
        return collect;
    }

    /**
     * 修改数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    @Override
    public Collect update(Collect collect) {
        this.collectDao.update(collect);
        return this.queryById(collect.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.collectDao.deleteById(id) > 0;
    }
}
