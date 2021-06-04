package com.raj.shashi.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> get(String filePath){

        List<String> result = new ArrayList<>();
        FileInputStream fstream = null;
        BufferedReader br = null;

        try{
            fstream = new FileInputStream(filePath);
            br = new BufferedReader(new InputStreamReader(fstream));
            String line;
            while((line = br.readLine())!=null){
                result.add(line);
            }
            fstream.close();

        }catch(IOException e){
            System.out.println(e.toString());
        }
        finally {
            try{
                if(fstream!=null){
                    fstream.close();
                }
            }
            catch(IOException ex){
                System.out.println(ex.toString());
            }

        }
        return result;

    }
}
