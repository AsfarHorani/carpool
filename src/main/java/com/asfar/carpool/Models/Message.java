package com.asfar.carpool.Models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "conversation")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;
    private String text;
  

}
