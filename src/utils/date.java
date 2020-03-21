/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dell
 */
public class date {
    public static boolean thisday(String folname){
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
   LocalDateTime now = LocalDateTime.now();  
   String date = dtf.format(now);
   String today = date.toString();
   String fileName = "PUSHLOG_"+today;
if (folname.equals(fileName))
return true;
else
    return false;
}
    
   public static boolean checkForNew(String folname){
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
   LocalDateTime now = LocalDateTime.now();  
   String date = dtf.format(now);
   String today = date.toString();
   String fileName = "PUSHLOG_"+today;
if (folname.equals(fileName))
return true;
else
    return false;
}
      public static String newFol(){
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
   LocalDateTime now = LocalDateTime.now(); 
    String date = dtf.format(now);
   String today = date.toString();
   String fileName = "PUSHLOG_"+today;
return fileName;
}
    
}
