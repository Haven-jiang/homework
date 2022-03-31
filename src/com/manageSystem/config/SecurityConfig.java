package com.manageSystem.config;

import com.manageSystem.pojo.Menu;
import com.manageSystem.service.BackstageManageService;

import java.util.List;

public class SecurityConfig {
    private static boolean isAuth = false;

    public static boolean isIsAuth() {
        return isAuth;
    }

    public static void setIsAuth(boolean isAuth) {
        SecurityConfig.isAuth = isAuth;
    }
    public static List<Menu> loginFilter(BackstageManageService backstageManageService) {
        List<Menu> mainMenu = backstageManageService.getMainMenu();
        if (isAuth) {
            backstageManageService.getMainMenu().get(0).setExecuteAction(null);
            mainMenu = mainMenu.get(0).getMainMenu();
            for (Menu menu : mainMenu) System.out.println(menu.getMenuName());
        }
        else {
            backstageManageService.getMainMenu().get(0).setExecuteAction(0001);
            for (Menu menu : mainMenu) System.out.println(menu.getMenuName());
        }
        return mainMenu;
    }
}
