package com.hxc.music.service.impl;

import com.hxc.music.dao.SingerDao;
import com.hxc.music.entity.Singer;
import com.hxc.music.service.SingerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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


    @Override
    public boolean insert(Singer singer) {
        return singerDao.insert(singer) > 0;
    }

    @Override
    public boolean update(Singer singer) {
        return singerDao.update(singer) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return singerDao.delete(id) > 0;
    }

    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Singer> allSinger() {
        return singerDao.allSinger();
    }

    @Override
    public List<Singer> singerOfName(String name) {
        return singerDao.singerOfName(name);
    }

    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerDao.singerOfSex(sex);
    }
}


