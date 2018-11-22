package cn.haoxiaoyong.business.license.ocr.bean;


import java.io.Serializable;

/**
 * Created by haoxy on 2018/11/21.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class ResultBody implements Serializable{

    private static final long serialVersionUID = -4614701870629915777L;
    private String code; //社会信用代码

    private String ceo;  //法人

    private String creatat; //成立时间

    private String money;  //注册资本

    private String  address; //地址

    private String companyName; //公司名称

    private String validity; //有效期

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCreatat() {
        return creatat;
    }

    public void setCreatat(String creatat) {
        this.creatat = creatat;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
