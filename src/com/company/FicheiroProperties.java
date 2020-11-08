package com.company;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.Properties;

import static java.lang.System.getProperty;

public class FicheiroProperties {

    public static void main(String[] args){

        Properties properties = new Properties();
        InputStream entrada = null;

        try {
            entrada = new FileInputStream("base.properties");

            properties.load(entrada);

            System.out.println(properties.getProperty("nome"));
            System.out.println(properties.getProperty("apelido"));
            System.out.println(properties.getProperty("endereco"));
            System.out.println(properties.getProperty("cidade"));

            properties.setProperty("endereco","Rua Joao de Laet 1300");
            System.out.println(properties.getProperty("cidade"));

            properties.store(new FileWriter("base.properties"),"Log");


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


    }

}
