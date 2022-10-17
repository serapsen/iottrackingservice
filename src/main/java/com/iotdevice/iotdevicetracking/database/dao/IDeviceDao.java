package com.iotdevice.iotdevicetracking.database.dao;

import java.util.List;

import com.iotdevice.iotdevicetracking.model.Device;

public interface IDeviceDao {
		public List<Device> getDevicesWithStatus(String status);
		public void updateDevice(Device device);
		public void removeDevice(Device device);
}
