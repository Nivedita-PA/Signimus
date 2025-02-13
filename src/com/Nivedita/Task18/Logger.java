package com.Nivedita.Task18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static  volatile Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return  instance;
    }
    public void log(String message){
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("[ " + timestamp + " ] " + message);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started...");
        logger.log("Application is processing..");
        logger.log("Processing ended..");
    }
}
