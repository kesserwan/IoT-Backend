package com.myproject.iot.controller;

import com.myproject.iot.domain.Device;
import com.myproject.iot.domain.Router;
import com.myproject.iot.dto.CreateDevicePayload;
import com.myproject.iot.dto.DeviceDto;
import com.myproject.iot.repository.RouterRepository;
import com.myproject.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/routers")
public class RouterController {

    @Autowired
    private RouterRepository routerRepository;

    @GetMapping("")
    public List<Router> getAll() {
        return routerRepository.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam(name = "id") Long id) {
        routerRepository.deleteById(id);

    }


    // Exercise: add the code delete a device and test it, see DeviceRepository class
}
