package cn.haoxiaoyong.business.license.ocr;

import cn.haoxiaoyong.business.license.ocr.config.BusinessConfig;
import cn.haoxiaoyong.business.license.ocr.tool.BusinessOcr;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableAutoConfiguration
@Configuration
@Import({BusinessConfig.class})
public class BusinessMainConfig {

    @Bean
    public BusinessOcr businessOcr(){
        return new BusinessOcr();
    }
}
