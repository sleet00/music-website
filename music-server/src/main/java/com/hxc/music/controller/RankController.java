package com.hxc.music.controller;


import com.hxc.music.entity.Rank;
import com.hxc.music.service.RankService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rank)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:18
 */
@RestController
@RequestMapping("rank")
public class RankController {
    /**
     * 服务对象
     */
    @Resource
    private RankService rankService;

    /**
     * 分页查询
     *
     * @param rank        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Rank>> queryByPage(Rank rank, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.rankService.queryByPage(rank, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Rank> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.rankService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param rank 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Rank> add(Rank rank) {
        return ResponseEntity.ok(this.rankService.insert(rank));
    }

    /**
     * 编辑数据
     *
     * @param rank 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Rank> edit(Rank rank) {
        return ResponseEntity.ok(this.rankService.update(rank));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.rankService.deleteById(id));
    }

}

