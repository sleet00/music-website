package com.hxc.music.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 管理员Dao
 */
@Repository
public interface AdminDao {
    /**
     *验证密码是否正确
     */
    public int verifyPassword(@Param("username")String username, @Param("password")String password);
}
