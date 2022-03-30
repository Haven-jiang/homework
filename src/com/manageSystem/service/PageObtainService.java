package com.manageSystem.service;

/**
 * 前台页面获取接口
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public interface PageObtainService {

    /**
     * 获取随机LuckyBroadcasting页面内容
     * @return
     */

    String luckyBroadcasting();

    /**
     * 获取随机LuckyDraw页面内容
     * @return
     */

    String luckyDraw();

    /**
     * 获取随机BirthGreet页面内容
     * @return
     */

    String birthGreet();
}
