package com.Logger;

import java.io.File;
import java.io.FileWriter;

public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger(){
        File file = new File("/log.txt");
        writer = new FileWriter(file, true);
    }

    public static Logger getInstance(){
        return instance;
    }

    public void log(String message){
        writer.write(message);
    }
}
