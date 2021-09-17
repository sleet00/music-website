package com.hxc.music.controller;

import com.hxc.music.entity.Song;
import com.hxc.music.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Song)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:21
 */
@RestController
@RequestMapping("song")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 分页查询
     *
     * @param song        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Song>> queryByPage(Song song, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.songService.queryByPage(song, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Song> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.songService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param song 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Song> add(Song song) {
        return ResponseEntity.ok(this.songService.insert(song));
    }

    /**
     * 编辑数据
     *
     * @param song 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Song> edit(Song song) {
        return ResponseEntity.ok(this.songService.update(song));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.songService.deleteById(id));
    }

}

