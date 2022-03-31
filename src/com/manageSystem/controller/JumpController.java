package com.manageSystem.controller;

import com.manageSystem.config.SecurityConfig;
import com.manageSystem.pojo.Menu;
import com.manageSystem.pojo.Page;
import com.manageSystem.pojo.User;
import com.manageSystem.service.BackstageManageService;
import com.manageSystem.service.PageObtainService;
import com.manageSystem.service.impl.BackstageManageServiceImpl;
import com.manageSystem.service.impl.PageObtainServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * 页面跳转类
 * : 对应Menu实现
 *  - 0111 显示所有客户信息
 *  - 0112 添加客户信息
 *  - 0113 修改客户信息
 *  - 0114 查询客户信息
 *  - 0331 幸运大放送
 *  - 0332 幸运抽奖
 *  - 0333 生日问候
 *  - 0012 购物结算
 *  - 0014 注销
 *  - 0002 退出
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class JumpController {

//    private static boolean isAuth = false;

    /**
     * 导入Scanner 支持终端输入
     */

    Scanner in = new Scanner(System.in);

    /**
     * 导入BackstageManageService层
     */

    BackstageManageService backstageManageService = new BackstageManageServiceImpl();

    /**
     * 导入PageObtainService层
     */

    PageObtainService pageObtainService = new PageObtainServiceImpl();

    public JumpController() {
    }

    public JumpController(BackstageManageService backstageManageService, PageObtainService pageObtainService) {
        this.backstageManageService = backstageManageService;
        this.pageObtainService = pageObtainService;
    }


    public boolean toLogin(String username, String password) {
        for (User user : backstageManageService.queryUserAll())
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) return true;
        return false;
    }

    /**
     * 查询所有User
     *  - 0111 显示所有客户信息
     * @return
     */

    public String queryUserAll() {
        String responseString = "";
        for (User user : backstageManageService.queryUserAll()) {
            responseString += user.toString() + '\n';
        }
        return responseString;
    }

    public String queryUserByName(String name) {
        String responseString = name + "'s intro is: ";
        for (User user : backstageManageService.queryUserByUsername(name)) {
            responseString += user.getIntro() + '\n';
        }
        return responseString;
    }

    public String insertUser(String name, String password) {
        if(backstageManageService.insertUser(new User(name, password))) return "添加成功";
        return "添加失败";
    }

    public String insertUserIntro(String name, String password, String intro) {
        if(backstageManageService.insertUser(new User(name, password, intro))) return "添加成功";
        return "添加失败";
    }

    public String updateUser(User user) {
        if(backstageManageService.updateUser(user)) return "修改成功";
        return "修改失败";
    }

    public String deleteUser(User user) {
        if(backstageManageService.deleteUser(user)) return "删除成功";
        return "删除失败";
    }

    public String getLuckyBroadcastPage() {
        Page page = new Page("LuckyBroadcast", pageObtainService.luckyBroadcasting());
        return page.toString();
    }

    public String getLuckyDrawPage() {
        Page page = new Page("LuckyDraw", pageObtainService.luckyDraw());
        return page.toString();
    }

    public String getBirthGreetPage() {
        Page page = new Page("BirthGreet", pageObtainService.birthGreet());
        return page.toString();
    }

    public String getAccountsPage() {
        Page page = new Page("Settle Accounts", "已成功结账");
        return page.toString();
    }

    public void pageControl() {

        int index;

        List<Menu> mainMenu = SecurityConfig.loginFilter(backstageManageService);

        while (mainMenu.get(index = in.nextInt()-1).getExecuteAction() == null) {
            mainMenu = mainMenu.get(index).getMainMenu();
            for (Menu menu : mainMenu) System.out.println(menu.getMenuName());
        }
        switch (mainMenu.get(index).getExecuteAction()) {
            case 0111:
                System.out.println(queryUserAll());
                pageControl();
                break;
            case 0112:
                System.out.print("输入username:");
                String username = in.next();
                System.out.print("输入password:");
                System.out.println(insertUser(username, in.next()));
                pageControl();
                break;
            case 0113:
                index = 0;
                for (User user : backstageManageService.getUserList()) {
                    System.out.println(index++ + ". " + user);
                }
                System.out.print("选择数字标号:");
                index = in.nextInt();
                User user = backstageManageService.getUserList().get(index);
                user.setUsername(in.next());
                user.setPassword(in.next());
                user.setIntro(in.next());
                System.out.println(updateUser(user));
                pageControl();
                break;
            case 0114:
                System.out.print("请输入要查询的username:");
                System.out.println(queryUserByName(in.next()));
                pageControl();
                break;
            case 0331:
                System.out.println(getLuckyBroadcastPage());
                pageControl();
                break;
            case 0332:
                System.out.println(getLuckyDrawPage());
                pageControl();
                break;
            case 0333:
                System.out.println(getBirthGreetPage());
                pageControl();
                break;
            case 0012:
                System.out.println(getAccountsPage());
                pageControl();
                break;
            case 0014:
                SecurityConfig.setIsAuth(false);
                pageControl();
                break;
            case 0002:
                System.out.println("再见");
                break;
            case 0001:
                System.out.print("输入您的账号:");
                username = in.next();
                System.out.print("输入您的密码:");
                while (!toLogin(username, in.next())) {
                    System.out.println("账号或密码错误, 请重新输入!");
                    System.out.print("账号:");
                    username = in.next();
                    System.out.print("密码:");
                }
                SecurityConfig.setIsAuth(true);
                pageControl();
                break;
            default:
                System.out.println("系统错误!");
                break;
        }

    }

}
