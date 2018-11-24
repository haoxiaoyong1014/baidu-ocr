#### baidu-ocr

#### 文字识别-营业执照识别

**支持图片类型:**
    
    *.jpg
    
    *.png
    
    *.bmp
    
    

**使用方式**

* 引入 maven 依赖

```
  <groupId>cn.haoxiaoyong.ocr</groupId>
    <artifactId>business-license-ocr</artifactId>
        <version>v1.1.0</version>
```
  

* 在SpringBoot启动类上通过注解引入Main Class
  
          @Import({
                  BusinessMainConfig.class
          })  
          
* 配置app key

        com:
          haoxy:
            ocr:
              APPID:
              APIKEY:
              SECRETKEY: 
              
* 使用
    
        @Autowired
        private BusinessOcr businessOcr;  
        
        businessOcr.sampleBusiness("imagePath"); //imagePath为图片地址  
        
* 返回结果

      [
        {"key":"社会信用代码","words":"xxxx"},
        {"key":"法人","words":"xxx"},
        {"key":"成立日期","words":"xxx"},
        {"key":"注册资本","words":"xxx"},
        {"key":"证件编号","words":"xxx"},
        {"key":"地址","words":"xxx"},
        {"key":"单位名称","words":"xxx"},
        {"key":"有效期","words":"xxx"}
      ]   
      
* 注意 
    
    * 图片大小不能超过4M 
    * 最短边至少15px，最长边最大4096px                          