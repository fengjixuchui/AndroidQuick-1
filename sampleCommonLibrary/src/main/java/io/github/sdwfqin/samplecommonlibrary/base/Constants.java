package io.github.sdwfqin.samplecommonlibrary.base;

import com.blankj.utilcode.util.PathUtils;

/**
 * 描述：全局配置
 *
 * @author 张钦
 * @date 2017/9/25
 */
public class Constants {

    /**
     * BaseUrl
     */
    public static final String BASE_URL = "https://tianqiapi.com/";
    public static final String BASE_API = "api";
    public static final String BASE_SHARE = BASE_URL + "index.do?id=";

    /**
     * 支付宝
     */
    public static final String A_LI_PAY_ID = "##########";
    public static final String A_LI_PAY_URL = BASE_URL + "/alipayBalance.do";
    public static final String A_LI_PAY_RES = "##################";

    /**
     * 微信
     */
    public static final String WECHAT_ID = "##########";

    /**
     * ========================================
     * ********        sp文件key        ********
     * ========================================
     */
    public static final String TEST = "######";


    /**
     * =======================================
     * ********      EventBus标识      ********
     * =======================================
     */

    /**
     * 账户余额列表
     */
    public static final int EVENT_1 = 205;

    /**
     * 充值后更新我的页面
     */
    public static final int EVENT_2 = 206;

    /**
     * =======================================
     * ********        其他配置        ********
     * =======================================
     */
    /**
     * 图片保存位置
     */
    public static final String SAVE_REAL_PATH = PathUtils.getExternalStoragePath() + "/sdwfqin";

    /**
     * 文件共享
     */
    public static final String FILE_PROVIDER = "com.sdwfqin.quickseed.fileprovider";

    /**
     * 上传文件表单
     */
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    public static final String HEAD = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "    <head>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\n" +
            "        <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n" +
            "        <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n" +
            "        <meta content=\"telephone=no\" name=\"format-detection\">\n" +
            "        <title>商品详情</title>\n" +
            "        <style>\n" +
            "           body{ margin:0; border:0}\n" +
            "       </style>\n" +
            "    </head>\n" +
            "    <body>";

    public static final String END = "</body>\n" +
            "</html>";
}
