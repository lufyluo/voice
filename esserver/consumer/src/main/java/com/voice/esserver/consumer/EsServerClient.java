package com.voice.esserver.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.voice.EsServices;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class EsServerClient {
    @Reference
    private EsServices esServices;
    public void delete(){
        int result = esServices.delete(null);
        System.out.println("delete is run and result is :" + result);
    }
    @Bean
    public EsServerClient client(){
        return new EsServerClient();
    }
}
