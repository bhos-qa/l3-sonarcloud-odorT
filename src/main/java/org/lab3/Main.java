package org.lab3;

enum PermissionLevel {
    ADMIN,
    DEVELOPER,
    USER
}

class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel getmCurrentLevel() {
        return mCurrentLevel;
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PermissionManager manager = new PermissionManager();
        manager.setmCurrentLevel(PermissionLevel.ADMIN);
        System.out.println(manager.getmCurrentLevel());
    }
}