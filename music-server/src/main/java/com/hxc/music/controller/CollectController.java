package com.hxc.music.controller;;

import com.hxc.music.entity.Collect;
import com.hxc.music.service.CollectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Collect)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:13
 */
@RestController
@RequestMapping("collect")
public class CollectController {
    /**
     * 服务对象
     */
    @Resource
    private CollectService collectService;

    /**
     * 分页查询
     *
     * @param collect     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<entity.Collect>> queryByPage(entity.Collect collect, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.collectService.queryByPage(collect, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Collect> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.collectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param collect 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Collect> add(Collect collect) {
        return ResponseEntity.ok(this.collectService.insert(collect));
    }

    /**
     * 编辑数据
     *
     * @param collect 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Collect> edit(Collect collect) {
        return ResponseEntity.ok(this.collectService.update(collect));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.collectService.deleteById(id));
    }

}

