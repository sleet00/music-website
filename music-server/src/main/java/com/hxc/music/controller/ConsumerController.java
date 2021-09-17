package com.hxc.music.controller;


import com.hxc.music.entity.Consumer;
import com.hxc.music.service.ConsumerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Consumer)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:15
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    /**
     * 服务对象
     */
    @Resource
    private ConsumerService consumerService;

    /**
     * 分页查询
     *
     * @param consumer    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Consumer>> queryByPage(Consumer consumer, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.consumerService.queryByPage(consumer, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Consumer> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.consumerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param consumer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Consumer> add(Consumer consumer) {
        return ResponseEntity.ok(this.consumerService.insert(consumer));
    }

    /**
     * 编辑数据
     *
     * @param consumer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Consumer> edit(Consumer consumer) {
        return ResponseEntity.ok(this.consumerService.update(consumer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.consumerService.deleteById(id));
    }

}

