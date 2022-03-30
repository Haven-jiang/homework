package com.manageSystem.mapper;

import com.manageSystem.pojo.Menu;
import com.manageSystem.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackstageMapper {

    private List<User> userList = initUser();
    private List<Menu> mainMenu = initMenu();

    /**
     * 模拟数据库
     * 0001 - 系统登录
     * @return mainMenu 模拟数据库拿菜单值
     */
    private List<Menu> initMenu() {
        List<Menu> menus1 = Arrays.asList(
                new Menu("1.显示所有客户信息", 0111),
                new Menu("2.添加客户信息", 0112),
                new Menu("3.修改客户信息", 0113),
                new Menu("4.查询客户信息", 0114)
        );
        List<Menu> menus2 = Arrays.asList(
                new Menu("1.幸运大放送",0331),
                new Menu("2.幸运抽奖", 0332),
                new Menu("3.生日问候", 0333)
        );
        List<Menu> menus3 = Arrays.asList(
                new Menu("1.客户信息管理", menus1),
                new Menu("2.购物结算", 0012),
                new Menu("3.真情回馈", menus2),
                new Menu("4.注销", 0014)
        );
        List<Menu> mainMenu = Arrays.asList(
                new Menu("1.登录系统", 0001, menus3),
                new Menu("2.退出", 0002)
        );
        return mainMenu;
    }

    /**
     * 模拟数据库
     * @return Arrays.asList(new User("root", "123456")) 模拟数据库拿User
     */

    private List<User> initUser() {
        return Arrays.asList(new User("root", "123456"));
    }

    /**
     * 显示所有user
     * 对应功能 0111 显示所有客户信息
     * @return
     */

    public List<User> queryUserAll() {
        return userList;
    }

    /**
     * 查询user通过username
     * 对应功能 0114 查询客户信息
     * @param username
     * @return
     */

    public List<User> queryUserByUsername(String username) {

        List<User> responseUserList = new ArrayList<>();

        for (User user1 : userList) {
            if(user1.getUserid().equals(username)) {
                responseUserList.add(user1);
            }
        }
        return responseUserList;
    }

    /**
     * 修改user
     * 对应功能 0113 修改客户信息
     * @param user
     * @return
     */

    public boolean updateUser(User user) {

        for (User user1 : userList) {
            if(user1.getUserid().equals(user.getUserid())) {
                userList.remove(user1);
                break;
            }
        }

        return userList.add(user);
    }

    /**
     * 增加user
     * 对应功能 0112 添加客户信息
     * @param user
     * @return
     */

    public boolean insertUser(User user) {
        return userList.add(user);
    }

    /**
     * 删除user
     * @param user
     * @return
     */

    public boolean deleteUser(User user) {
        return userList.remove(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Menu> getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(List<Menu> mainMenu) {
        this.mainMenu = mainMenu;
    }
}
