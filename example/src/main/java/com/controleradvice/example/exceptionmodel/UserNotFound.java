package com.controleradvice.example.exceptionmodel;

import java.util.Date;

public class UserNotFound {

    Date timestamp ;
    String message ;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserNotFound{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }

    public UserNotFound(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }
}
