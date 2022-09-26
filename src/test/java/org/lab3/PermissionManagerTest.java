package org.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PermissionManagerTest {

    PermissionManager manager;
    @BeforeEach
    void setup() {
        manager = new PermissionManager();
    }

    @Test
    void checkGetmCurrentLevel() {
        manager.setmCurrentLevel(PermissionLevel.ADMIN);
        assertEquals("ADMIN", manager.getmCurrentLevel());
    }
}
