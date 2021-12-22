package cn.edu.glut.dao.impl;

import cn.edu.glut.dao.IAdminDao;
import cn.edu.glut.entity.Admin;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @Author HuangMenghui
 * @Date 2021/12/22 21:08
 */
@Repository
public class AdminDao extends SqlSessionDaoSupport implements IAdminDao {

    private static final String SQL_NAMESPACE = "Admin";

    @Override
    public Admin selectById(String id) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectById", map);
    }
}
