package com.asfar.carpool.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "rider")
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "walletId", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Wallet wallet;
    @Temporal(TemporalType.TIMESTAMP)
   private Date creationDateTime;
    public long getId() {
        return id;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Rider [id=" + id + ", wallet=" + wallet + "]";
    }
    
    
}
