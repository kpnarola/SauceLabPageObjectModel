package com.nopcommerce.demo;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty extends Utils {

    static Properties prop;
    static FileInputStream input;
    static String fileName = "Config.properties";
    static String fileLocation = "src\\test\\Resources\\";

    public String getProperty(String key) {
        prop = new Properties();
        try{
            System.out.println(fileLocation+fileName);
            input = new FileInputStream(fileLocation+fileName);
            prop.load(input);
            input.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(key);
        return prop.getProperty(key);

    }


}
