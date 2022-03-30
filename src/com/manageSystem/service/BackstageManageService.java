package com.manageSystem.service;

import com.manageSystem.pojo.Menu;
import com.manageSystem.pojo.User;

import java.util.List;

/**
 * 后台管理接口
 *
 * 实现对User的增删改查
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public interface BackstageManageService {

    /**
     * 显示所有user
     * 对应功能 0111 显示所有客户信息
     * @return
     */

    List<User> queryUserAll();

    /**
     * 查询user通过username
     * 对应功能 0114 查询客户信息
     * @param username
     * @return
     */

    List<User> queryUserByUsername(String username);

    /**
     * 修改user
     * 对应功能 0113 修改客户信息
     * @param user
     * @return
     */

    boolean updateUser(User user);

    /**
     * 增加user
     * 对应功能 0112 添加客户信息
     * @param user
     * @return
     */

    boolean insertUser(User user);

    /**
     * 删除user
     * @param user
     * @return
     */

    boolean deleteUser(User user);

    /**
     * 获得user数据
     * @return
     */

    List<User> getUserList();

    void setUserList(List<User> userList);

    List<Menu> getMainMenu();

    void setMainMenu(List<Menu> mainMenu);
}
