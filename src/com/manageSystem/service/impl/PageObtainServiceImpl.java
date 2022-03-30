package com.manageSystem.service.impl;

import com.manageSystem.mapper.FeedbackMapper;
import com.manageSystem.pojo.Page;
import com.manageSystem.service.PageObtainService;

/**
 * 前台页面获取实现类
 *
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class PageObtainServiceImpl implements PageObtainService {

    /**
     * 模拟数据库数据导入
     */

    FeedbackMapper feedbackMapper = new FeedbackMapper();

    /**
     * 获取随机LuckyBroadcasting页面内容
     * @return 页面内容
     */

    @Override
    public String luckyBroadcasting() {
        return feedbackMapper.getLuckyBroadcastingContent();
    }

    /**
     * 获取随机LuckyDraw页面内容
     * @return 页面内容
     */

    @Override
    public String luckyDraw() {
        return feedbackMapper.getLuckyDrawContent();
    }

    /**
     * 获取随机BirthGreet页面内容
     * @return 页面内容
     */

    @Override
    public String birthGreet() {
        return feedbackMapper.getBirthGreetContent();
    }

}
