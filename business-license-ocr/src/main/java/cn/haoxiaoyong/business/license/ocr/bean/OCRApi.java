package cn.haoxiaoyong.business.license.ocr.bean;

import org.springframework.stereotype.Component;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class OCRApi {

    private String APPID;

    private String APIKEY;

    private String SECRETKEY;

    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getAPIKEY() {
        return APIKEY;
    }

    public void setAPIKEY(String APIKEY) {
        this.APIKEY = APIKEY;
    }

    public String getSECRETKEY() {
        return SECRETKEY;
    }

    public void setSECRETKEY(String SECRETKEY) {
        this.SECRETKEY = SECRETKEY;
    }
}
