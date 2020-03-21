/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
import Models.User;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Dell
 */
public class UserList {

    private static User listUser(String[] metadata) {
        String user = metadata[0];
        String phno = metadata[1];
        String role = metadata[2];
        // create and return book of this metadata 
        return new User(user, phno, role);
    }

    public static List<User> readUsersFromCSV(String fileName) {
        ArrayList<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                User user = listUser(attributes);

                users.add(user);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return users;
    }

}
