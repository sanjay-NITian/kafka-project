package com.corp314e.messagetracking.utilities;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void checkIfPathIsDirectory() {
        assertThrows(IOException.class, () -> new FileHandler("C:\\Users\\sanjay\\OneDrive\\Desktop\\temp"),"Should be an illegal file path");
    }
}