package com.manageSystem.service.impl;

import com.manageSystem.mapper.BackstageMapper;
import com.manageSystem.pojo.Menu;
import com.manageSystem.pojo.User;
import com.manageSystem.service.BackstageManageService;

import java.util.List;

/**
 * 后台管理实现类
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class BackstageManageServiceImpl implements BackstageManageService {

    /**
     * 模拟数据库导入数据
     */

    BackstageMapper backstageMapper = new BackstageMapper();

        /**
     * 显示所有user
     * 对应功能 0111 显示所有客户信息
     * @return
     */

    @Override
    public List<User> queryUserAll() {
        return backstageMapper.queryUserAll();
    }

        /**
     * 查询user通过username
     * 对应功能 0114 查询客户信息
     * @param username
     * @return
     */

    @Override
    public List<User> queryUserByUsername(String username) {
        return backstageMapper.queryUserByUsername(username);
    }

    /**
     * 修改user
     * 对应功能 0113 修改客户信息
     * @param user
     * @return
     */

    @Override
    public boolean updateUser(User user) {
        return backstageMapper.updateUser(user);
    }

    /**
     * 增加user
     * 对应功能 0112 添加客户信息
     * @param user
     * @return
     */

    @Override
    public boolean insertUser(User user) {
        return backstageMapper.insertUser(user);
    }

    /**
     * 删除user
     * @param user
     * @return
     */

    @Override
    public boolean deleteUser(User user) {
        return backstageMapper.deleteUser(user);
    }

    @Override
    public List<User> getUserList() {
        return this.backstageMapper.getUserList();
    }

    @Override
    public void setUserList(List<User> userList) {
        backstageMapper.setUserList(userList);
    }

    @Override
    public List<Menu> getMainMenu() {
        return backstageMapper.getMainMenu();
    }

    @Override
    public void setMainMenu(List<Menu> mainMenu) {
        backstageMapper.setMainMenu(mainMenu);
    }


}
