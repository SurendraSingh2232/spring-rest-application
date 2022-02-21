package com.sunglowsys.util;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String massage){

        super(massage);
    }
}
