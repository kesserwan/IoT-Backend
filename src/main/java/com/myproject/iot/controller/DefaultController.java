package com.myproject.iot.controller;

import com.myproject.iot.domain.Device;
import com.myproject.iot.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("")
    public String defaultGetMethod () {
        return "received in defaultGetMethod";
    }

    @GetMapping("getall")
    public List<Device> defaultGetAll () {
        return deviceRepository.findAll();
    }

    @GetMapping("getByNameContains")
    public List<Device> getByNameContains (@RequestParam(name = "search") String search) {
        return deviceRepository.findAllByNameContains(search);
    }

    @PostMapping("")
    public String defaultPostMethod (@RequestBody String body) {
        return body;
    }
}
