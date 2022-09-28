package org.lab3;

enum PermissionLevel {
    ADMIN,
    DEVELOPER,
    USER
}

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getmCurrentLevel() {
        return switch (this.mCurrentLevel) {
            case USER -> "USER";
            case ADMIN -> "ADMIN";
            case DEVELOPER -> "DEVELOPER";
        };
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }
}