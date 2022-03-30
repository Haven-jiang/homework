package com.manageSystem.pojo;


import java.util.Random;
import java.util.function.Supplier;

/**
 * 用户类
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class User {

    /**
     * user 唯一token
     */
    private String userid = setUserid(() -> {
        //定义一个字符串（A-Z，a-z，0-9）；
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //由Random生成随机数
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 18; ++i) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    });

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户信息
     */
    private String intro;

    /**
     * 无参构造
     */

    public User() {
    }

    /**
     * GetterSetter有参和无参构造
     * @param username
     * @param password
     */

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * GetterSetter有参和无参构造
     * @param username
     * @param password
     * @param intro
     */

    public User(String username, String password, String intro) {
        this.username = username;
        this.password = password;
        this.intro = intro;
    }

    /**
     * GetterSetter有参和无参构造
     * @return
     */

    public String getUsername() {
        return username;
    }

    /**
     * GetterSetter有参和无参构造
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * GetterSetter有参和无参构造
     * @return
     */

    public String getPassword() {
        return password;
    }

    /**
     * GetterSetter有参和无参构造
     * @param password
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * GetterSetter有参和无参构造
     * @return
     */

    public String getIntro() {
        return intro;
    }

    /**
     * GetterSetter有参和无参构造
     * @param intro
     */

    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 生成随机ID
     * @param supplier
     * @return
     */
    private String setUserid(Supplier<String> supplier) {
        return supplier.get();
    }

    public String getUserid() {
        return userid;
    }

    @Override
    public String toString() {
        return "username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", intro='" + intro + '\'' ;
    }
}
