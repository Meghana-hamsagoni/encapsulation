package com.publisher;


public class Publisher {
	private String publisherName;
	private String publisherAddress;
	private String licenseCode;
	private Publisher (String publisherName,String publisherAddress,String licenseCode) {
		this.publisherName=publisherName;
		this.publisherAddress=publisherAddress;
		this.licenseCode=licenseCode;	
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		if (publisherName==null || publisherName.isEmpty() ) {
			this.publisherName=null;
		}
		else 
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		if (publisherAddress==null|| publisherAddress.isEmpty()) {
			this.publisherAddress=null;
		}
		else 
		this.publisherAddress = publisherAddress;
	}
	public String getLicenseCode() {
		return licenseCode;
	}
	public void setLicenseCode(String licenseCode) {
		if (licenseCode.length()!=8 || !licenseCode.startsWith("PUB")) {
			this.licenseCode=null;
		}
		else 
		this.licenseCode = licenseCode;
	}
	
			@Override
	public String toString() {
		return "Publisher [publisherName=" + publisherName + ", publisherAddress=" + publisherAddress + ", licenseCode="
				+ licenseCode + "]";
	}
			public static Publisher getPublisherObject (String publisherName,String publisherAddress,String licenseCode) {
		if (publisherName==null || publisherAddress==null || licenseCode==null) {
			return null;
		}
		else 
		 return new Publisher(publisherName, publisherAddress, licenseCode);
		 
	}
	



}
