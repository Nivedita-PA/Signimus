package com.Nivedita.Task18;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if(instance==null){
            synchronized (DatabaseConnection.class){
                if(instance==null) instance = new DatabaseConnection();
            }
        }
        return instance;
    }
    public void connect(){
        System.out.println("System is connected to database");
    }
    public void disconnect(){
        System.out.println("System is disconnected with database");
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.connect();
        databaseConnection.disconnect();
    }
}
