package com.mango.core.constant;

/**
 * 请求来源
 * @author : xs.Liu
 * @date: 2020-12-02
 */
public enum SourceEnum {

    /**
     * 网站
     */
    WEB(1, "网站"),

    /**
     * 微信
     */
    WECHAT(2, "微信"),

    /**
     * QQ
     */
    QQ(3, "QQ"),

    /**
     * 微博
     */
    WEIBO(4, "微博"),

    /**
     * 苹果手机应用
     */
    IOS_PHONE(91, "苹果手机应用"),

    /**
     * 苹果平板应用
     */
    IOS_PAD(92, "苹果平板应用"),

    /**
     * ANDROID手机应用
     */
    ANDROID_PHONE(93, "ANDROID手机应用"),

    /**
     * ANDROID平板应用
     */
    ANDROID_PAD(94, "ANDROID平板应用"),

    /**
     * 运营后台
     */
    BOSS(-1, "运营后台");

    private final String desc;
    private final int value;

    private SourceEnum(int value, String desc) {
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getValue() {
        return this.value;
    }

    public static SourceEnum valueOf(int value) {
        switch (value) {
            case 1:
                return WEB;
            case 2:
                return WECHAT;
            case 3:
                return QQ;
            case 4:
                return WEIBO;
            case 91:
                return IOS_PHONE;
            case 92:
                return IOS_PAD;
            case 93:
                return ANDROID_PHONE;
            case 94:
                return ANDROID_PAD;
            case -1:
                return BOSS;
            default:
                return WEB;
        }
    }

}
