package com.manageSystem.pojo;

import java.util.List;

/**
 * 菜单类
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class Menu {
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 实现功能
     * 0111 显示所有客户信息
     * 0112 添加客户信息
     * 0113 修改客户信息
     * 0114 查询客户信息
     * 0331 幸运大放送
     * 0332 幸运抽奖
     * 0333 生日问候
     * 0012 购物结算
     * 0014 注销
     * 0002 退出
     */
    private Integer executeAction;
    /**
     * 链式结构
     */
    private List<Menu> mainMenu;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.executeAction = null;
        this.mainMenu = null;
    }

    public Menu(String menuName, List<Menu> mainMenu) {
        this.menuName = menuName;
        this.mainMenu = mainMenu;
        this.executeAction = null;
    }

    public Menu(String menuName, Integer executeAction) {
        this.menuName = menuName;
        this.executeAction = executeAction;
        this.mainMenu = null;
    }

    public Menu(String menuName, Integer executeAction, List<Menu> mainMenu) {
        this.menuName = menuName;
        this.executeAction = executeAction;
        this.mainMenu = mainMenu;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getExecuteAction() {
        return executeAction;
    }

    public void setExecuteAction(Integer executeAction) {
        this.executeAction = executeAction;
    }

    public List<Menu> getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(List<Menu> mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                       "menuName='" + menuName + '\'' +
                       ", executeAction=" + executeAction +
                       ", mainMenu=" + mainMenu +
                       '}';
    }
}
