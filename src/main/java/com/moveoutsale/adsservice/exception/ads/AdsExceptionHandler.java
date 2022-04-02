package com.moveoutsale.adsservice.exception.ads;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shashidhar
 */
@ControllerAdvice
public class AdsExceptionHandler {

    @ExceptionHandler(value = CreateAdException.class)
    public ResponseEntity<Object> exception(CreateAdException createAdException){
        System.out.println("working+1");
        return new ResponseEntity<>(createAdException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<Object> exception(Throwable throwable){
        System.out.println("working");
        return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
