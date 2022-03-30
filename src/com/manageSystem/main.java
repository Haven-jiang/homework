package com.manageSystem;

import com.manageSystem.controller.JumpController;
import com.manageSystem.pojo.Menu;
import com.manageSystem.service.BackstageManageService;
import com.manageSystem.service.PageObtainService;
import com.manageSystem.service.impl.BackstageManageServiceImpl;
import com.manageSystem.service.impl.PageObtainServiceImpl;

import java.util.List;
import java.util.Scanner;

public class main {

    private static BackstageManageService backstageManageService = new BackstageManageServiceImpl();
    private static PageObtainService pageObtainService = new PageObtainServiceImpl();

    public static void main(String[] args) {
        JumpController jumpController = new JumpController(backstageManageService, pageObtainService);
        jumpController.pageControl();
    }
}
