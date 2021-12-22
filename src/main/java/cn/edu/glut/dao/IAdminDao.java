package cn.edu.glut.dao;

import cn.edu.glut.entity.Admin;

/**
 * 功能描述:
 *
 * @Author HuangMenghui
 * @Date 2021/12/22 21:00
 */
public interface IAdminDao {

    //根据用户id获取用户信息
    public Admin selectById(String id);
}
