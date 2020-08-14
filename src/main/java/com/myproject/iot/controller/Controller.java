package com.myproject.iot.controller;

import com.myproject.iot.domain.Device;
import com.myproject.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "/default")
    public ResponseEntity defaultGet(String name) {


        return new ResponseEntity(deviceService.defaultAdd(name),HttpStatus.CREATED);

    }

    @PostMapping(value = "/add")
    public Device add(@RequestBody Device device) {

        return deviceService.addDevice(device);

    }

    // Exercise: add the code delete a device and test it, see DeviceRepository class
}
