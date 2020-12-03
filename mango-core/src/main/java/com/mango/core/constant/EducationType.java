package com.mango.core.constant;

/**
 * 学历信息
 * @author : xs.Liu
 * @date: 2020-12-02
 */
public enum EducationType {

    /**
     * 未定义
     */
    UNDEFINE(0, "未定义"),

    /**
     * 初中
     */
    MIDDLE(1, "初中"),

    /**
     * 高中
     */
    HIGH(2, "高中"),

    /**
     * 中专
     */
    TECHNICAL(3, "中专"),

    /**
     * 大专
     */
    COLLEGE(4, "大专"),

    /**
     * 本科
     */
    BACHELOR(5, "本科"),

    /**
     * 硕士
     */
    MASTER(6, "硕士"),

    /**
     * MBA
     */
    MBA(7, "MBA"),

    /**
     * EMBA
     */
    EMBA(8, "EMBA"),

    /**
     * 博士
     */
    PHD(9, "博士");

    private final String desc;
    private final int value;

    private EducationType(int value, String desc) {
        this.desc = desc;
        this.value = value;
    }

    public static EducationType valueOf(int value) {
        switch (value) {
            case 1:
                return MIDDLE;
            case 2:
                return HIGH;
            case 3:
                return TECHNICAL;
            case 4:
                return COLLEGE;
            case 5:
                return BACHELOR;
            case 6:
                return MASTER;
            case 7:
                return MBA;
            case 8:
                return EMBA;
            case 9:
                return PHD;
            default:
                return UNDEFINE;
        }
    }

    public String getDesc() {
        return this.desc;
    }

    public int getValue() {
        return this.value;
    }

}
