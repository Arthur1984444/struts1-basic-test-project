package com.example;

import org.apache.struts.action.ActionForm;

public class MessageForm extends ActionForm {
    private String message;

    public MessageForm(){
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}