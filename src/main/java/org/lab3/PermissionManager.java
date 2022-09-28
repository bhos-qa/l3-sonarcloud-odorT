package org.lab3;

enum PermissionLevel {
    ADMIN,
    DEVELOPER,
    USER
}

public class PermissionManager {
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
                return null;
        }
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }
}

class Isgandar {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;
}