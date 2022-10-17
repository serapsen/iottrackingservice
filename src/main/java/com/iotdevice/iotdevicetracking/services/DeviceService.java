package com.iotdevice.iotdevicetracking.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.iotdevice.iotdevicetracking.database.dao.DeviceDao;
import com.iotdevice.iotdevicetracking.interfaces.IDeviceService;
import com.iotdevice.iotdevicetracking.model.Device;

@Service
public class DeviceService implements IDeviceService {

	@Override
	public JSONObject getDevicesWithStatus(String status) throws JSONException {
		DeviceDao deviceDao = new DeviceDao();
		JSONObject obj = new JSONObject();
        return obj.put("device",deviceDao.getDevicesWithStatus(status));		
	}

	@Override
	public JSONObject updateDevices(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject deleteDevices(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
