package com.javaLive.beans;

public class SingletonBean {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    } 
    public String  getMessage(){
        return this.message;
    }
}
