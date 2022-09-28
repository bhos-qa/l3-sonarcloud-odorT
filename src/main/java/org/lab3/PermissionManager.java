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