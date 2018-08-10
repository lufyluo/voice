package com.voice;


import com.voice.domain.ResourceEntity;

import java.util.UUID;

public interface EsServices {
    int save(ResourceEntity resourceEntity);
    int delete(ResourceEntity resourceEntity);
    int get(UUID uuid);
}
