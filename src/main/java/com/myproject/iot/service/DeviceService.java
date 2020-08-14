package com.myproject.iot.service;

import com.myproject.iot.domain.Device;
import com.myproject.iot.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;


    public Device defaultAdd(String name) {

        Device device = new Device();
        device.setName(name);
        return deviceRepository.save(device);
    }

    public void addDevice(String id, String name) {
        Device device = new Device(1L, "default device");
        deviceRepository.save(device);
    }

    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }
}
