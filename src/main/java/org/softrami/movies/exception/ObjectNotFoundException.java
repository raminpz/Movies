package org.softrami.movies.exception;

public class ObjectNotFoundException extends RuntimeException{

    private String objectNotFoundName;
    private final Throwable cause;


    public ObjectNotFoundException(String objectNotFoundName) {
        this.objectNotFoundName = objectNotFoundName;
        this.cause = null;
    }

    public ObjectNotFoundException(String objectNotFoundName, Throwable cause) {
        this.objectNotFoundName = objectNotFoundName;
        this.cause = null;
    }

    @Override
    public String getMessage() {
        return super.getMessage().concat(" ")
                .concat("object not found with name ")
                .concat(this.objectNotFoundName)
                .concat(" ");
    }

    public String getObjectNotFoundName() {
        return objectNotFoundName;
    }
}
