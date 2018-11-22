package cn.haoxiaoyong.business.license.ocr.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class JsonBody implements Serializable{

    private static final long serialVersionUID = 8724929455122056105L;

    private String key;

    private String words;

    /*private List<String>location;*/

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

   /* public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }*/
}
