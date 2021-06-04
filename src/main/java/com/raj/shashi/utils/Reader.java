package com.raj.shashi.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> get(String filePath){

        List<String> result = new ArrayList<String>();
        BufferedReader br = null;

        try{

            br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine())!=null){
                result.add(line);
            }
            br.close();

        }catch(IOException e){

        }
        finally {
            try{
                br.close();
            }
            catch(IOException ex){

            }

        }
        return result;

    }
}
