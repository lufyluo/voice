package com.voice.api.controllers;

import com.voice.api.Dtos.ResourceInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {
    @RequestMapping(method = RequestMethod.PUT)
    public int put(@RequestBody ResourceInfo resourceInfo) {
        return 0;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public int delete(@RequestParam UUID uuid) {
        return 0;
    }

    @RequestMapping(method = RequestMethod.POST)
    public int post(@RequestBody List<ResourceInfo> resourceInfos) {
        return 0;
    }

    @RequestMapping(method = RequestMethod.GET)
    public int get(@RequestParam UUID uuid) {
        return 0;
    }
}
