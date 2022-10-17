package com.iotdevice.iotdevicetracking.database.dao;

import java.util.List;
import com.iotdevice.iotdevicetracking.model.Device;
import dev.morphia.Datastore;
import dev.morphia.query.Query;

public class DeviceDao implements IDeviceDao {

	Datastore datastore;
	
	@Override
	public List<Device> getDevicesWithStatus(String status) {
		final Device elmer = new Device();
		datastore.save(elmer);
		
		final Query<Device> query = datastore.find(Device.class);
		final List<Device> devices = query.iterator().toList();        
		return devices;
	}

	@Override
	public void updateDevice(Device device) {
		final Device elmer = new Device(device.getId(),device.getStatus(),device.getTemperature(),device.getSimCard());
		datastore.save(elmer);
		
	}

	@Override
	public void removeDevice(Device device) {
		// TODO Auto-generated method stub
		
	}	 
}