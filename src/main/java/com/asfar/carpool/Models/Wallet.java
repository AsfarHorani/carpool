package com.asfar.carpool.Models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "address", unique=true)
private String address;
private int noice;
@Temporal(TemporalType.TIMESTAMP)
private Date creationDateTime;

public Wallet(long id, String address, int noice, Date creationDateTime) {
    super();
    this.id = id;
    this.address = address;
    this.noice = noice;
    this.creationDateTime = creationDateTime;
}
public Wallet(long id, String address, int noice) {
    super();
    this.id = id;
    this.address = address;
    this.noice = noice;
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public Date getCreationDateTime() {
    return creationDateTime;
}
public void setCreationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
}
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
@Override
public String toString() {
    return "Wallet [id=" + id + ", address=" + address + ", noice=" + noice + "]";
}

}
