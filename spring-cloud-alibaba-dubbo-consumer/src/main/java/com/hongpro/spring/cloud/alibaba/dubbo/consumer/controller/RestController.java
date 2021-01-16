package com.hongpro.spring.cloud.alibaba.dubbo.consumer.controller;
import com.hongpro.spiring.cloud.alibaba.dubbo.provider.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/13 10:00
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }
}
