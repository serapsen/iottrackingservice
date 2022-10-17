package com.iotdevice.iotdevicetracking.model;

import com.iotdevice.iotdevicetracking.enums.SimStatus;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Reference;

@Entity("simCard")
@Indexes(
    @Index(fields = @Field("status"))
)

public class SimCard {
	  @Id
	  private int simId;
	  private int operatorCode;
	  private String countryName;
	  @Reference
	  private SimStatus simStatus;
	  
	  public SimCard(int simId,int operatorCode,String countryName, SimStatus simStatus) {
		  this.simId=simId;
		  this.operatorCode=operatorCode;
		  this.countryName=countryName;
		  this.simStatus=simStatus;   
	  }
	  
	  public SimCard() {
		  
	  }
	  
	  public int getSimId() {
	    return simId;
	  }
	  
	  public void setSimId(int simId) {
	    this.simId = simId;
	  }
	  
	  public int getOperatorCode() {
	    return operatorCode;
	  }
	  
	  public void setOperator(int operatorCode) {
	    this.operatorCode = operatorCode;
	  }
	  
	  public String getCountryName() {
	    return countryName;
	  }
	  
	  public void setCountryName(String countryName) {
	    this.countryName = countryName;
	  }

	  public SimStatus getSimStatus() {
	    return simStatus;
	  }
	  
	  public void setSimStatus(SimStatus simStatus) {
	    this.simStatus = simStatus;
	  }
}
