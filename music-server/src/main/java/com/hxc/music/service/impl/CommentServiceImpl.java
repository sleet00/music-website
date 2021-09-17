package com.hxc.music.service.impl;

import com.hxc.music.entity.Comment;
import com.hxc.music.dao.CommentDao;
import com.hxc.music.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2021-09-17 15:18:15
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Comment queryById(Object id) {
        return this.commentDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param comment     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Comment> queryByPage(Comment comment, PageRequest pageRequest) {
//        long total = this.commentDao.count(comment);
//        return new PageImpl<>(this.commentDao.queryAllByLimit(comment, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment insert(Comment comment) {
        this.commentDao.insert(comment);
        return comment;
    }

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment update(Comment comment) {
        this.commentDao.update(comment);
        return this.queryById(comment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.commentDao.deleteById(id) > 0;
    }
}
