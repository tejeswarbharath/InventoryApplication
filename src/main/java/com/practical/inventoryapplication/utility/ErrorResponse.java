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

    public ErrorResponse(int status,String error,String message){
        this.localDateTime = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
    }

}
