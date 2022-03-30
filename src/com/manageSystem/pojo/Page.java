package com.manageSystem.pojo;

/**
 * 页面类
 * - 简单代替前端 并 实现content的传入传出
 * @author HavenJiang
 * @date 2022/03/30
 * @since 2022/03/30
 */

public class Page {

    private String pageName;
    private String content;

    public Page(String pageName) {
        this.pageName = "==============================" + pageName + "==============================";
    }

    public Page(String pageName, String content) {
        this.pageName = "==============================" + pageName + "==============================";
        this.content = content;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return pageName + "\n\n\n" + content;
    }
}
