package org.example.customexception1;

public class UserUnderageException extends RuntimeException {

//    private String reason;
//    public UserUnderageException(String message,String reason) {
//        super(message);
//        this.reason =reason;
//    }
//    public String getReason(){
//        return this.reason;
//    }
public UserUnderageException(String message) {
    super(message);

}

}
