package cn.haoxiaoyong.business.license.ocr.utils;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class ResUtils implements Constant {

    public static String callBack(String err_code) {

        if (OCR_BUSINESS_SDK108.equals(err_code)) {
            return "connection or read data time out";
        }
        if (OCR_BUSINESS_SDK109.equals(err_code)) {
            return "unsupported image format";
        }
        if (OCR_BUSINESS_SDK102.equals(err_code)) {
            return "read image file error";
        }
        if (OCR_BUSINESS_SDK100.equals(err_code)) {
            return "image size error";
        }
        return null;
    }

}
