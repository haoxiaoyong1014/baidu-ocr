package cn.haoxiaoyong.business.license.ocr.tool;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.ocr.AipOcr;
import cn.haoxiaoyong.business.license.ocr.bean.JsonBody;
import cn.haoxiaoyong.business.license.ocr.bean.OCRApi;
import cn.haoxiaoyong.business.license.ocr.bean.RespInfo;
import cn.haoxiaoyong.business.license.ocr.utils.Constant;
import cn.haoxiaoyong.business.license.ocr.utils.ResUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.*;
import java.util.Map;


/**
 * Created by haoxy on 2018/11/21.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@SuppressWarnings("unchecked")
@Component
public class BusinessOcr implements Constant {

    @Autowired
    private OCRApi OCRApi;

    public String sampleBusiness(String imgPath) {
        RespInfo respInfo = new RespInfo();
        AipOcr client = getAipOcr();
        JSONObject res = client.businessLicense(imgPath, new HashMap<String, String>());
        Map<String, Object> jsonMap = (Map<String, Object>) JSON.parse(res.toString(2));
        String error_code = (String) jsonMap.get(OCR_ERROR_CODE);
        if (error_code != null) {
            String strBody = ResUtils.callBack(error_code);
            respInfo.setContent(strBody);
            return JSON.toJSONString(respInfo);
        }
        Map<String, String> valueMap = (Map<String, String>) jsonMap.get(OCR_WORDS_RESULT);
        List<JsonBody> list = new ArrayList<JsonBody>(valueMap.keySet().size());
        for (String key : valueMap.keySet()) {
            JsonBody jsonBody = JSON.parseObject(JSON.toJSONString(valueMap.get(key)), JsonBody.class);
            jsonBody.setKey(key);
            list.add(jsonBody);
        }
        respInfo.setContent(list);
        return JSON.toJSONString(respInfo);
    }

    /**
     * 初始化一个AipOcr
     * @return
     */
    private AipOcr getAipOcr() {
        return new AipOcr(OCRApi.getAPPID(), OCRApi.getAPIKEY(), OCRApi.getSECRETKEY());
    }
}
