package com.mango.core.constant;

/**
 * 文件类型
 * @author : xs.Liu
 * @date: 2020-12-02
 */
public enum FileType {

    /**
     * 图片类
     */
    JPG(1, "jpg"),
    BMP(1, "bmp"),
    JPEG(1, "jpeg"),
    PNG(1, "png"),
    /**
     * 文档类
     */
    TXT(2, "txt"),
    DOC(2, "doc"),
    DOCX(2, "docx"),
    XLS(2, "xls"),
    PDF(2, "pdf"),
    PPT(2, "ppt"),
    /**
     * 视频类
     */
    MP4(3, "mp4"),
    AVI(3, "avi"),
    MOV(3, "mov"),
    WMV(3, "wmv"),
    WEBM(3, "webm"),
    RMVB(3, "rmvb"),
    /**
     * 音频类
     */
    MP3(4, "mp3"),
    ;


    FileType(int code, String type) {
        this.code = code;
        this.type = type;
    }

    private String type;

    public int getCode() {
        return code;
    }

    private int code;
    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCodeByType(String type) {
        for (FileType fileType : FileType.values()) {
            if (fileType.getType().equals(type)) {
                return fileType.getCode();
            }
        }
        return 0;
    }

}
