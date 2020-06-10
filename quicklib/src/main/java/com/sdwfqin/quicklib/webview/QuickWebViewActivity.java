package com.sdwfqin.quicklib.webview;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sdwfqin.quicklib.base.QuickArouterConstants;

/**
 * 描述：默认WebViewActivity
 *
 * @author 张钦
 * @date 2018/1/16
 */
@Route(path = QuickArouterConstants.QUICK_WEBVIEW)
public class QuickWebViewActivity extends QuickBaseWebViewActivity {

    /**
     * 加载网页
     *
     * @param url 页面地址
     */
    public static void launch(String url) {
        launch(url, "");
    }

    /**
     * 加载网页，带有默认标题
     *
     * @param url   页面地址
     * @param title 默认标题
     */
    public static void launch(String url, String title) {
        launch(url, "", true);
    }

    /**
     * 加载网页，带有默认标题
     *
     * @param url          页面地址
     * @param title        默认标题
     * @param autoSetTitle 是否自动监听设置标题
     */
    public static void launch(String url, String title, boolean autoSetTitle) {
        ARouter
                .getInstance()
                .build(QuickArouterConstants.QUICK_WEBVIEW)
                .withString("url", url)
                .withString("title", title)
                .withBoolean("autoSetTitle", autoSetTitle)
                .navigation();
    }

    @Override
    public String getUrl() {
        return getIntent().getStringExtra("url");
    }

    @Override
    public String getActivityTitle() {
        if (getIntent().getStringExtra("title") != null) {
            return getIntent().getStringExtra("title");
        }
        return super.getActivityTitle();
    }

    @Override
    protected boolean isAutoSetTitle() {
        return getIntent().getBooleanExtra("autoSetTitle", true);
    }
}
