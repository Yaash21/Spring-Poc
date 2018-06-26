package com.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Flexware_Service_Order")
public class FlexwareDomain {
	
@Column(name="SERVICE_ORDER")	
private String serviceOrder;
@Column(name="PIM")
private String pim;
@Column(name="Modem_SNO")
private String modemSno;
@Column(name="Device_SNO")
private String deviceSno;

public String getServiceOrder() {
	return serviceOrder;
}
public void setServiceOrder(String serviceOrder) {
	this.serviceOrder = serviceOrder;
}
public String getPim() {
	return pim;
}
public void setPim(String pim) {
	this.pim = pim;
}
public String getModemSno() {
	return modemSno;
}
public void setModemSno(String modemSno) {
	this.modemSno = modemSno;
}
public String getDeviceSno() {
	return deviceSno;
}
public void setDeviceSno(String deviceSno) {
	this.deviceSno = deviceSno;
}
	
}
