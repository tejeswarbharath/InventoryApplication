package com.practical.inventoryapplication.utility;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    private LocalDateTime localDateTime;
    private int status;
    private String message;
    private String error;
    private String path;

    public ErrorResponse(String message){
        this.message = message;
    }

    public ErrorResponse(int status,String error,String message,String path){
        this.localDateTime = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

}
