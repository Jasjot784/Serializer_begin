package com.jasjotsingh.serializer_begin;

import java.io.Serializable;

class Userinfo implements Serializable {
    String name;
    String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
