package com.iotdevice.iotdevicetracking.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iotdevice.iotdevicetracking.model.Device;
import com.iotdevice.iotdevicetracking.services.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
    private DeviceService service;
	
	@GetMapping("/getDevicesWithStatus")
    public JSONObject getDevicesWithStatus(String status) throws JSONException{

       return service.getDevicesWithStatus(status);
   } 

    @PutMapping("/{id}")
    public JSONObject updateDevicesWithStatus(Device device){

         return service.updateDevices(device);
    } 

    @DeleteMapping("/{id}")
    public JSONObject removeDevicesWithStatus(Device device){

         return service.deleteDevices(device);
    } 
}
