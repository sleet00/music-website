package com.hxc.music.entity;

import java.io.Serializable;

/**
 * (SongList)实体类
 *
 * @author makejava
 * @since 2021-09-17 15:18:23
 */
public class SongList implements Serializable {
    private static final long serialVersionUID = -22589457591348905L;

    private Object id;

    private String title;

    private String pic;

    private String introduction;

    private String style;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

}

