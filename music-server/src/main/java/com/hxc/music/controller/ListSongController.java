package com.hxc.music.controller;


import com.hxc.music.entity.ListSong;
import com.hxc.music.service.ListSongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ListSong)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:17
 */
@RestController
@RequestMapping("listSong")
public class ListSongController {
    /**
     * 服务对象
     */
    @Resource
    private ListSongService listSongService;

    /**
     * 分页查询
     *
     * @param listSong    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<ListSong>> queryByPage(ListSong listSong, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.listSongService.queryByPage(listSong, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ListSong> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.listSongService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param listSong 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ListSong> add(ListSong listSong) {
        return ResponseEntity.ok(this.listSongService.insert(listSong));
    }

    /**
     * 编辑数据
     *
     * @param listSong 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ListSong> edit(ListSong listSong) {
        return ResponseEntity.ok(this.listSongService.update(listSong));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.listSongService.deleteById(id));
    }

}

