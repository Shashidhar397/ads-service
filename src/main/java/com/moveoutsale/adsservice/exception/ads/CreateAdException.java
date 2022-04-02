package com.moveoutsale.adsservice.exception.ads;

/**
 * @author shashidhar
 */
public class CreateAdException extends RuntimeException {
    private static final long serialVersionUID = 6179560012335851745L;

    public CreateAdException(String message) {
        super(message);
    }
}
