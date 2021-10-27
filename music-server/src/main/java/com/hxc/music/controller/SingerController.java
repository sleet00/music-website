package com.hxc.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.hxc.music.entity.Singer;
import com.hxc.music.service.SingerService;
import com.hxc.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * (Singer)表控制层
 *
 * @author makejava
 * @since 2021-09-17 15:18:20
 */
@RestController
@RequestMapping("/singer")
public class SingerController {
    @Autowired
    private SingerService singerService;

    /**
     * 添加歌手
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String name = request.getParameter("name").trim();
        String sex = request.getParameter("sex").trim();
        String pic = request.getParameter("name").trim();
        String birth = request.getParameter("name").trim();
        String location = request.getParameter("name").trim();
        String introduction = request.getParameter("name").trim();
        //将生日转换成Date格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        Date date = new Date();
        try {
            date = dateFormat.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Singer singer = new Singer();
        singer.setName(name);
        singer.setSex(new Byte(sex));
        singer.setPic(pic);
        singer.setBirth(date);
        singer.setLocation(location);
        singer.setIntroduction(introduction);
        boolean flag = singerService.insert(singer);
        if (flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"添加成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"添加失败");
        return jsonObject;
    }

    /**
     * 修改歌手
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Object updateSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id").trim();
        String name = request.getParameter("name").trim();
        String sex = request.getParameter("sex").trim();
        String pic = request.getParameter("name").trim();
        String birth = request.getParameter("name").trim();
        String location = request.getParameter("name").trim();
        String introduction = request.getParameter("name").trim();
        //将生日转换成Date格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        Date date = new Date();
        try {
            date = dateFormat.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Singer singer = new Singer();
        singer.setId(Integer.parseInt(id));
        singer.setName(name);
        singer.setSex(new Byte(sex));
        singer.setPic(pic);
        singer.setBirth(date);
        singer.setLocation(location);
        singer.setIntroduction(introduction);
        boolean flag = singerService.update(singer);
        if (flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"修改成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"修改失败");
        return jsonObject;
    }

    /**
     * 删除歌手
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Object deleteSinger(HttpServletRequest request){
        String id = request.getParameter("id").trim();
        boolean flag = singerService.delete(Integer.parseInt(id));
        return flag;
    }

    /**
     * 根据主键查询整个对象
     */
    @RequestMapping(value = "/selectByPrimaryKey",method = RequestMethod.GET)
    public Object selectByPrimaryKey(HttpServletRequest request){
        String id = request.getParameter("id").trim();
        return singerService.selectByPrimaryKey(Integer.parseInt(id));
    }

    /**
     * 查询所有歌手
     */
    @RequestMapping(value = "/allSinger",method = RequestMethod.GET)
    public Object allSinger(HttpServletRequest request){
        return singerService.allSinger();
    }

    /**
     * 根据歌手名字模糊查询列表
     */
    @RequestMapping(value = "/singerOfName",method = RequestMethod.GET)
    public Object singerOfName(HttpServletRequest request){
        String name = request.getParameter("name").trim();
        return singerService.singerOfName("%"+name+"%");
    }

    /**
     * 根据性别查询
     */
    @RequestMapping(value = "/singerOfSex",method = RequestMethod.GET)
    public Object singerOfSex(HttpServletRequest request){
        String sex = request.getParameter("sex").trim();
        return singerService.singerOfSex(Integer.parseInt(sex));
    }
}

