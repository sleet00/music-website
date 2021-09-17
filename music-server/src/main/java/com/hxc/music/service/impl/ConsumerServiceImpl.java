package com.hxc.music.service.impl;


import com.hxc.music.dao.ConsumerDao;
import com.hxc.music.entity.Consumer;
import com.hxc.music.service.ConsumerService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Consumer)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:17
 */
@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {
    @Resource
    private ConsumerDao consumerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Consumer queryById(Object id) {
        return this.consumerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param consumer    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Consumer> queryByPage(Consumer consumer, PageRequest pageRequest) {
//        long total = this.consumerDao.count(consumer);
//        return new PageImpl<>(this.consumerDao.queryAllByLimit(consumer, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    @Override
    public Consumer insert(Consumer consumer) {
        this.consumerDao.insert(consumer);
        return consumer;
    }

    /**
     * 修改数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    @Override
    public Consumer update(Consumer consumer) {
        this.consumerDao.update(consumer);
        return this.queryById(consumer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.consumerDao.deleteById(id) > 0;
    }
}
