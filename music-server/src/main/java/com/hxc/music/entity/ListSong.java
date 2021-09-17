package com.hxc.music.entity;

import java.io.Serializable;

/**
 * (ListSong)实体类
 *
 * @author makejava
 * @since 2021-09-17 15:18:17
 */
public class ListSong implements Serializable {
    private static final long serialVersionUID = -44095351888828505L;

    private Object id;

    private Object songId;

    private Object songListId;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
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

}

