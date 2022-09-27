package org.lab3;

enum PermissionLevel {
    ADMIN,
    DEVELOPER,
    USER
}

class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getmCurrentLevel() {
        switch (this.mCurrentLevel) {
            case USER:
                return "USER";
            case ADMIN:
                return "ADMIN";
            case DEVELOPER:
                return "DEVELOPER";
            default:
                break;
        }
        return null;
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}