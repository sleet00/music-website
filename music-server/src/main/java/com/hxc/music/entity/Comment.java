package com.hxc.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2021-09-17 15:18:14
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -35393490550674223L;

    private Object id;

    private Object userId;

    private Object songId;

    private Object songListId;

    private String content;

    private Date createTime;

    private Integer type;

    private Object up;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getUp() {
        return up;
    }

    public void setUp(Object up) {
        this.up = up;
    }

}

