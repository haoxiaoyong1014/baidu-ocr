package cn.haoxiaoyong.business.license.ocr.config;

import cn.haoxiaoyong.business.license.ocr.bean.OCRApi;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class BusinessConfig{

    @Bean
    @ConfigurationProperties(prefix = "com.haoxy.ocr")
    public OCRApi ocrApi() {
        OCRApi ocrApi = new OCRApi();
        return ocrApi;
    }
}
