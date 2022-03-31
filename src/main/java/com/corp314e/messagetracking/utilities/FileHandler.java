package com.corp314e.messagetracking.utilities;

import java.io.*;

public class FileHandler {
    PrintWriter printWriter;
    FileWriter fileWriter;
    File file;

    public FileHandler(String path) throws IOException{
        file = new File(path);
        fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
    }

    public void append(String msg) {
        printWriter.println(msg);
        printWriter.close();
    }
}
