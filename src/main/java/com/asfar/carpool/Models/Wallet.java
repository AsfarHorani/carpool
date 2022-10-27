package com.asfar.carpool.Models;

import org.hibernate.annotations.Entity;

@Entity
public class Wallet {
	
private String address;
private int noice;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNoice() {
	return noice;
}
public void setNoice(int noice) {
	this.noice = noice;
}

}
