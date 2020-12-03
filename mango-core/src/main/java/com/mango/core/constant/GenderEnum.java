package com.mango.core.constant;

/**
 * 性别
 * @author : xs.Liu
 * @date: 2020-12-02
 */
public enum GenderEnum {

    /**
     * 女
     */
    FEMALE(2, "女"),

    /**
     * 男
     */
    MALE(1, "男"),

    /**
     * 未定义
     */
    UNDEFINE(0, "未定义");

    private final String desc;
    private final int value;

    private GenderEnum(int value, String desc) {
        this.desc = desc;
        this.value = value;
    }

    public static GenderEnum valueOf(int value) {
        switch (value) {
            case 2:
                return FEMALE;
            case 1:
                return MALE;
            case 0:
                return UNDEFINE;
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
