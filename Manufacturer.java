package com.manufacturer;

public class Manufacturer {
	private String manufacturerName;
	private String manufacturerAddress;
	private String registrationNumber;
	private Manufacturer (String manufacturerName,String manufacturerAddress,String registrationNumber) {
		this.manufacturerName=manufacturerName;
		this.manufacturerAddress=manufacturerAddress;
		this.registrationNumber=registrationNumber;	
	}
	public String getmanufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		if (manufacturerName==null || manufacturerName.isEmpty() ) {
			this.manufacturerName=null;
		}
		else 
		this.manufacturerName = manufacturerName;
	}
	public String getManufacturerAddress() {
		return manufacturerAddress;
	}
	public void setManufacturerAddress(String manufacturerAddress) {
		if (manufacturerAddress==null|| manufacturerAddress.isEmpty()) {
			this.manufacturerAddress=null;
		}
		else 
		this.manufacturerAddress = manufacturerAddress;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumberMotto(String registrationNumber) {
		if (registrationNumber.length()!=10 || registrationNumber.isEmpty()) {
			this.registrationNumber=null;
		}
		else 
		this.registrationNumber = registrationNumber;
	}
	
	
	
		@Override
	public String toString() {
		return "Manufacturer [manufacturerName=" + manufacturerName + ", manufacturerAddress=" + manufacturerAddress
				+ ", registrationNumber=" + registrationNumber + "]";
	}
		public static Manufacturer getManufacturerObject (String manufacturerName,String manufacturerAddress,String registrationNumber) {
		if (manufacturerName==null || manufacturerAddress==null || registrationNumber==null) {
			return null;
		}
		else 
		 return new Manufacturer(manufacturerName, manufacturerAddress, registrationNumber);
		 
	}
	

}
