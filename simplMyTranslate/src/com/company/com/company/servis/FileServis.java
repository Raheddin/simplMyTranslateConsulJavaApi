package com.company.com.company.servis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServis {
    public static void writeFile(byte[] data,String flieName)  {
       try{
        Path path = Paths.get(flieName);
        Files.write(path, data);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public static byte[] readFile(String fileName) {
        try {
            Path path = Paths.get(fileName);
            byte[] byteArray = Files.readAllBytes(path);
            return byteArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
