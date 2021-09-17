package

.controller;

import .entity.SongList;
import .service.SongListService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SongList)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:23
 */
@RestController
@RequestMapping("songList")
public class SongListController {
    /**
     * 服务对象
     */
    @Resource
    private SongListService songListService;

    /**
     * 分页查询
     *
     * @param songList    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SongList>> queryByPage(SongList songList, PageRequest pageRequest) {
        return ResponseEntity.ok(this.songListService.queryByPage(songList, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SongList> queryById(@PathVariable("id") Object id) {
        return ResponseEntity.ok(this.songListService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param songList 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SongList> add(SongList songList) {
        return ResponseEntity.ok(this.songListService.insert(songList));
    }

    /**
     * 编辑数据
     *
     * @param songList 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SongList> edit(SongList songList) {
        return ResponseEntity.ok(this.songListService.update(songList));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Object id) {
        return ResponseEntity.ok(this.songListService.deleteById(id));
    }

}

