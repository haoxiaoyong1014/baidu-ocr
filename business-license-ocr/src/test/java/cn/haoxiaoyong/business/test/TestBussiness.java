package cn.haoxiaoyong.business.test;

import cn.haoxiaoyong.business.license.ocr.BusinessMainConfig;
import cn.haoxiaoyong.business.license.ocr.tool.BusinessOcr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by haoxy on 2018/11/22.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BusinessMainConfig.class})
public class TestBussiness {
    @Autowired
    private BusinessOcr businessOcr;

    @Test
    public void testBussiness(){
        String str = businessOcr.sampleBusiness("/Users/haoxiaoyong/Desktop/葫芦娃.png");
        System.out.println(str);
    }
}
