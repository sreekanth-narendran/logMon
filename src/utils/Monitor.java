/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import net.contentobjects.jnotify.JNotify;

/**
 *
 * @author Dell
 */
public class Monitor {
   public static String url = null;
   public static String  url_final  =null;
    
    public static boolean check(File file){
    long dl = file.lastModified();
    
    long curr = System.currentTimeMillis();
    System.out.println("Checking");
    long diff = curr-dl;
    if(diff>10000){
        System.out.println("Difference" + (diff));
    return true;
    }
    else
     return false;
    }
    
    public static int sendNotif(String mobile, String message) {

                int code = 0;

                try {

                String url_1= file.getConfig("OTP_URL_SNOT", "otp");

              //  url = String.format(url_1, mobile, message);
                 url = "http://examples.javacodegeeks.com/core-java/io/bufferedreader/how-to-get-the-standard-input-in-java/";

               //url_final =java.net.URLEncoder.encode(url,"UTF-8").replace("+", "%20");

                URL u = new URL(url);

                HttpURLConnection uc = (HttpURLConnection) u.openConnection();

                code = uc.getResponseCode();

                return code;

                }

                catch(Exception e) {

                        e.printStackTrace();
                        return code;

                }

        }
    
}

