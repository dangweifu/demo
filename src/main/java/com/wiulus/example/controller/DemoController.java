package com.wiulus.example.controller;

import com.wiulus.example.common.util.WebResults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口模板
 * @author WiuLuS
 */
@RestController("/demo")
public class DemoController {

    /**
     * test接口
     * @param param 示例参数
     * @return 示例参数
     */
    @PostMapping("one")
    public WebResults<String> demo(String param){
        return WebResults.createSuccessResult(param);
    }

}
