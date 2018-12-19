package com.chai.testProj.utils;

import java.util.List;

public class Response {
    private String code;
    private String message;
    private List data;

    public Response SuccessData(List Data){
        Response result = new Response();
        result.setCode("200");
        result.setMessage("successful");
        result.setData(getData());
        return result;
    }

    public Response Success(){
        Response result = new Response();
        result.setCode("200");
        result.setMessage("successful");
        return result;
    }

    public Response Error(){
        Response result = new Response();
        result.setCode("400");
        result.setMessage("error");
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

}
