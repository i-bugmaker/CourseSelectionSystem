package cn.edu.glut.entity;

/**
 * 功能描述:系统用户实体类
 *
 * @Author HuangMenghui
 * @Date 2021年12月22日
 */
public class Admin {

    //登录名
    private String id;
    //密码
    private String pwd;

    public String getUsername() {
        return id;
    }

    public void setUsername(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}