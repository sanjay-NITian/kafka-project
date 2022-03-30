package com.corp314e.messagetracking.filehandler;

import java.io.*;

public class FileHandler {
    PrintWriter printWriter;
    FileWriter fileWriter;
    File file;

    public FileHandler(String path) {
        file = new File(path);
    }

    public void append(String msg) throws IOException {
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(msg);
            printWriter.close();
        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
