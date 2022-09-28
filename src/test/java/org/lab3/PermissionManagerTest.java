package org.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PermissionManagerTest {

    PermissionManager manager;
    HashMap<PermissionLevel, String> permissions = new HashMap<>();

    @BeforeEach
    void setup() {
        manager = new PermissionManager();
        permissions.put(PermissionLevel.ADMIN, "ADMIN");
        permissions.put(PermissionLevel.USER, "USER");
        permissions.put(PermissionLevel.DEVELOPER, "DEVELOPER");
    }

    @Test
    void checkGetmCurrentLevel() {
        for (PermissionLevel permissionLevel: permissions.keySet()) {
            manager.setmCurrentLevel(permissionLevel);
            assertEquals(permissions.get(permissionLevel), manager.getmCurrentLevel());
        }
    }
}
