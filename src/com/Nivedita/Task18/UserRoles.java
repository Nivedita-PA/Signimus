package com.Nivedita.Task18;

public enum UserRoles {
    ADMIN,
    USER,
    GUEST;
    public void getAccessLevel(){
        if(this==ADMIN) System.out.println("Get all the access");
        else if(this==USER) System.out.println("Limited access");
        else if(this==GUEST) System.out.println("Read only access");
        else System.out.println("No access");
    }

    public static void main(String[] args) {
        UserRoles userRoles = UserRoles.USER;
        userRoles.getAccessLevel();
        UserRoles userRoles1 = UserRoles.ADMIN;
        userRoles1.getAccessLevel();
        UserRoles userRoles2 = UserRoles.GUEST;
        userRoles2.getAccessLevel();
    }
}
