package com.hxc.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Collect)实体类
 *
 * @author makejava
 * @since 2021-09-17 15:18:13
 */
public class Collect implements Serializable {
    private static final long serialVersionUID = 773090825135915016L;

    private Object id;

    private Object userId;

    private Integer type;

    private Object songId;

    private Object songListId;

    private Date createTime;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getSongId() {
        return songId;
    }

    public void setSongId(Object songId) {
        this.songId = songId;
    }

    public Object getSongListId() {
        return songListId;
    }

    public void setSongListId(Object songListId) {
        this.songListId = songListId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

