package com.Nivedita.Task18;

public enum StatusCode {
    SUCCESS("Operation is successful"),
    ERROR("Error occurred"),
    PENDING("Operation is pending");
    private final String message;

    StatusCode(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        System.out.println(StatusCode.SUCCESS.getMessage());
        System.out.println(StatusCode.PENDING.getMessage());
    }
}
