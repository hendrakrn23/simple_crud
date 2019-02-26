package com.btpn.simplecrud.model;

import org.springframework.stereotype.Component;

@Component
public class Response {

    private String message;
    private Crud data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Crud getData() {
        return data;
    }

    public void setData(Crud data) {
        this.data = data;
    }
}
