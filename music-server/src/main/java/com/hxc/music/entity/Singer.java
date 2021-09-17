package com.hxc.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Singer)实体类
 *
 * @author makejava
 * @since 2021-09-17 15:18:20
 */
public class Singer implements Serializable {
    private static final long serialVersionUID = -18402570795612236L;

    private Object id;

    private String name;

    private Integer sex;

    private String pic;

    private Date birth;

    private String location;

    private String introduction;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}

