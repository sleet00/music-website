package com.hxc.music.controller;

import com.hxc.music.service.SingerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Singer)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:20
 */
@RestController
@RequestMapping("singer")
public class SingerController {
    /**
     * 服务对象
     */
    @Resource
    private SingerService singerService;

    /**
     * 分页查询
     *
     * @param singer      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<entity.Singer>> queryByPage(entity.Singer singer, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.singerService.queryByPage(singer, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<entity.Singer> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.singerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param singer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<entity.Singer> add(entity.Singer singer) {
        return ResponseEntity.ok(this.singerService.insert(singer));
    }

    /**
     * 编辑数据
     *
     * @param singer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<entity.Singer> edit(entity.Singer singer) {
        return ResponseEntity.ok(this.singerService.update(singer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.singerService.deleteById(id));
    }

}

