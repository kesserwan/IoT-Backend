package com.myproject.iot.controller;

import com.myproject.iot.domain.Device;
import com.myproject.iot.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
     private DeviceRepository deviceRepository;

    @GetMapping(value = "/default")
    public String defaultGet(String give){
        Device device = new Device(1L, "default device");

        return device.toString();

    }

    @GetMapping(value = "/add")
    public String add(@RequestParam(name = "id") String id,
                      @RequestParam(name = "name") String name){
        Device device = new Device(Long.valueOf( id), name);
        deviceRepository.save(device);

        return  "added";

    }

    // Exercise: add the code delete a device and test it, see DeviceRepository class
}
