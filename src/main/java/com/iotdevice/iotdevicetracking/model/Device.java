package com.iotdevice.iotdevicetracking.model;

import org.bson.types.ObjectId;

import com.iotdevice.iotdevicetracking.enums.DeviceStatus;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Reference;

@Entity("devices")
@Indexes(
    @Index(fields = @Field("status"))
)
public class Device {
	 @Id
	 private ObjectId id; 
	 @Reference
	 private DeviceStatus status;
	 private int temperature;
	 @Reference
	 private SimCard simCard;
	 
	 public Device() {
		 
	 }
	
	 public Device(ObjectId id,DeviceStatus status,int temperature,SimCard simCard) {
		  this.id=id;
		  this.status=status;
		  this.temperature=temperature;
		  this.simCard=simCard;
	 }
	 
	 public ObjectId getId() {
		 return id;
	 } 
	 
	 public void setId(ObjectId id) {
			this.id = id;
		}
	 
	public DeviceStatus getStatus() {
		return status;
	}
  
	public void setStatus(DeviceStatus deviceStatus) {
		this.status = deviceStatus;
	}
  
	public int getTemperature() {
	  if(temperature >-25 && temperature<85) {
		  return temperature;
	  }
	  else {
		  return 0;
	  }
	}
  
	public void setTemperature(int temperature ) {
    this.temperature = temperature;
	}	 
  
	public SimCard getSimCard() {
    return simCard;
	}
  
	public void setSimCard(SimCard simCard) {
    this.simCard = simCard;
	}
}
