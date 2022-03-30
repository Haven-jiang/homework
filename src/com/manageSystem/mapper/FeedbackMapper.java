package com.manageSystem.mapper;

import java.util.Random;

public class FeedbackMapper {

    /**
     * 模拟数据库获取luckyBroadcastingContents数据
     */

    private final String[] luckyBroadcastingContents = {
            "恭喜您，获得奖品【" + new Random().nextInt(20) + "元购物券】，请尽快使用~",
            "恭喜您，好像得到了点什么",
            "恭喜您，获得了今天的好运buff加成",
            "恭喜您，获得了"  + new Random().nextInt(20) + "元返现，请尽快联系客服领取~",
            "恭喜您，获得了成就 [五星好成员]",
            "恭喜您，获得了新的快乐!",
            "恭喜您，今日打卡成功"
    };

    /**
     * 模拟数据库获取luckyDrawContents数据
     */

    private final String[] luckyDrawContents = {
            "恭喜您，获得奖品 [江准汽车] 的两万元优惠券, 预计再邀请10名微信好友帮忙砍价即可拿下",
            "恭喜您，获得奖品 [晶弘冰箱] 的一千元优惠券, 预计再邀请10名微信好友帮忙砍价即可拿下",
            "恭喜您，获得奖品 [格力空调] 的五百元优惠券, 预计再邀请10名微信好友帮忙砍价即可拿下",
            "恭喜您，获得奖品 [特等奖价值20元的购物优惠券]",
            "恭喜您，获得奖品 [优秀奖价值10元优惠券]",
            "恭喜您，获得奖品 [参与奖小红花]"
    };

    /**
     * 模拟数据库获取birthGreetContents数据
     */

    private final String[] birthGreetContents = {
            "愿如梁上燕，岁岁常相见。生日快乐！",
            "在你永远与春天接壤的梦幻里。祝你：心想事成幸福快乐!生日快乐!",
            "愿这完全属于你的一天带给你快乐，愿未来的日子锦上添花!",
            "愿以后有人陪你烧烤火锅焖大虾，也有人陪你素琴调弦品香茶。",
            "愿你有一个灿烂的前程，愿你有情人终成眷属，愿你在尘世获得幸福。",
            "愿时光能缓，愿故人不散；愿你惦念的人能和你道晚安，愿你独闯的日子里不觉得孤单。",
            "愿你如阳光，明媚不忧伤，愿你拥有雌雄同体的灵魂，活得嚣张 永不受伤。",
            "你必须很有自信自己在我心里的位置，因为我永远不会不爱你。",
            "献上我对你的爱，祝你生日快乐充满温馨，你是我永远的好姐妹。",
            "值得纪念的日子，世界因为有了你而更加美好，生日快乐！",
            "愿你三冬暖，愿你春不寒。愿你天黑有灯，下雨有伞。愿你路上有良人伴 。",
            "闪动的短信是我跳动的心，跳跃的字符是我热情的爱！欢快的消息音？当然就是我对你的赞美了！",
            "愿你回望过去皆是无悔，展望前程已然不辜。",
            "愿你三冬暖，愿你春不寒，愿你天黑有灯，下雨有伞，愿你一路上，有良人相伴。",
            "亲爱的，我只想告诉你：你的一切都在牵动着我的心，永远深爱着你。",
            "转眼间一年又过去，今天又是你的生日了，愿今天你拥有世上一切美丽的东西，来年生日更美好，更快乐！一年胜一年青春！生日快乐！",
            "愿你无忧无疾百岁安生不离笑，盼你春暖花开一生喜乐幸福绕。",
            "今天是你的生日，我小心翼翼的记录我们点滴，庆幸我们走过的八年有余，庆幸我在年轮韶华中遇见你。",
            "愿你去往之地皆为热土，愿你所遇之人皆为挚友。"
    };

    /**
     * 获取随机LuckyBroadcasting页面内容
     * @return
     */

    public String getLuckyBroadcastingContent() {
        return luckyBroadcastingContents[new Random().nextInt(luckyBroadcastingContents.length-1)];
    }

    /**
     * 获取随机LuckyDraw页面内容
     * @return
     */

    public String getLuckyDrawContent() {
        return luckyDrawContents[new Random().nextInt(luckyDrawContents.length-1)];
    }

    /**
     * 获取随机BirthGreet页面内容
     * @return
     */

    public String getBirthGreetContent() {
        return birthGreetContents[new Random().nextInt(birthGreetContents.length-1)];
    }
}