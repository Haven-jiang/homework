package com.manageSystem;

import com.manageSystem.controller.JumpController;

public class main {

//    private static BackstageManageService backstageManageService = new BackstageManageServiceImpl();
//    private static PageObtainService pageObtainService = new PageObtainServiceImpl();

    public static void main(String[] args) {
        JumpController jumpController = new JumpController();
        jumpController.pageControl();
    }
}
