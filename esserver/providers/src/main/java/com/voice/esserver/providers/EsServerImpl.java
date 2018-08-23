package com.voice.esserver.providers;

import com.alibaba.dubbo.config.annotation.Service;
import com.voice.EsServices;
import com.voice.domain.ResourceEntity;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Service(interfaceClass = EsServices.class)
@Component
public class EsServerImpl implements EsServices {
    @Override
    public int save(ResourceEntity resourceEntity) {
        return 2;
    }

    @Override
    public int delete(ResourceEntity resourceEntity) {
        return 2;
    }

    @Override
    public int get(UUID uuid) {
        return 2;
    }
}
