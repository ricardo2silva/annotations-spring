package com.ricardo.projetobase.beans;

import org.springframework.stereotype.Component;


public class CustomProperties {
    private String mess;
    public CustomProperties (String message) {
        this.mess = message;
    }

    public void impimir() {
        System.out.println(mess);
    }
}
