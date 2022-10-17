package com.iotdevice.iotdevicetracking.interfaces;

import org.json.JSONException;
import org.json.JSONObject;

import com.iotdevice.iotdevicetracking.model.Device;

public interface IDeviceService {
	public JSONObject getDevicesWithStatus(String status) throws JSONException; 
    public JSONObject updateDevices(Device device); 
    public JSONObject deleteDevices(Device device); 
}
