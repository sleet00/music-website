package com.hxc.music.dao;

import com.hxc.music.entity.Singer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Singer)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-17 15:18:20
 */
public interface SingerDao {

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    int insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    public int update(Singer singer);

    /**
     * 删除
     *
     * @param id 主键
     * @return 影响行数
     */
    public int delete(Integer id);

    /**
     * 根据主键查询整个对象
     */
    public Singer selectByPrimaryKey(Integer id);

    /**
     * 查询所有歌手
     */
    public List<Singer> allSinger();

    /**
     * 根据歌手名字模糊查询列表
     */
    public List<Singer> singerOfName(String name);

    /**
     * 根据性别查询
     */
    public List<Singer> singerOfSex(Integer Sex);




}

