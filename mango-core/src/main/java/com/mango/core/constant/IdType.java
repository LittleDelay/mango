package com.mango.core.constant;

/**
 * 身份认证
 * @author : xs.Liu
 * @date: 2020-12-02
 */
public enum IdType {

    /**
     * 未定义
     */
    UNDEFINE(0, "未定义"),

    /**
     * 微信号
     */
    WEIXIN(9, "微信号"),

    /**
     * 大陆身份证
     */
    ID_CARD(10, "大陆身份证"),

    /**
     * 港澳台身份证
     */
    HK_TW_IDCARD(11, "港澳台身份证"),

    /**
     * 学生证
     */
    STUDENT_CARD(12, "学生证"),

    /**
     * 军官证
     */
    MILITARY_ID(13, "军官证"),

    /**
     * 护照
     */
    PASSPORT(14, "护照"),

    /**
     * 名片
     */
    BIZ_CARD(15, "名片");

    private final String desc;
    private final int value;

    private IdType(int value, String desc) {
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return this.desc;
    }

    public int value() {
        return this.value;
    }

    public static IdType valueOf(int value) {
        switch (value) {
            case 9:
                return WEIXIN;
            case 10:
                return ID_CARD;
            case 11:
                return HK_TW_IDCARD;
            case 12:
                return STUDENT_CARD;
            case 13:
                return MILITARY_ID;
            case 14:
                return PASSPORT;
            case 15:
                return BIZ_CARD;
            default:
                return UNDEFINE;
        }
    }

}
