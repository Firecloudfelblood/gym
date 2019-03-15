package com.erivalaxl.gym.entities;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "gym")
public class ClientEntitie {

    @Id
    public String id;
    public String Id;
    public String Email;
    public String Address;
    @Field("Full Name")
    public String name;
    @Field("Created At")
    public String joined;

    public ClientEntitie() {
    }

    public ClientEntitie(String id, String email, String address, String name, String joined) {
        Id = id;
        Email = email;
        Address = address;
        this.name = name;
        this.joined = joined;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    @Override
    public String toString() {
        return "ClientEntitie{" +
                "Id='" + Id + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", name='" + name + '\'' +
                ", joined='" + joined + '\'' +
                '}';
    }
}

