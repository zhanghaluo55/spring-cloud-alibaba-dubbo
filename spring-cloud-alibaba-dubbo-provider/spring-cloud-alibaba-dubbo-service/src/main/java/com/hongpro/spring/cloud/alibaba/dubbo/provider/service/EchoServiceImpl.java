package com.hongpro.spring.cloud.alibaba.dubbo.provider.service;

import com.hongpro.spiring.cloud.alibaba.dubbo.provider.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/11 14:58
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Hellp Echo " + string + "; port: " + port;
    }
}
