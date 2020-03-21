/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStream;

import java.util.Properties;

import java.util.Scanner;

public class file {

    public static String getConfig(String key, String property) {

        try {

            String filePath = "C:\\logmon\\otp.properties";

            try (InputStream input = new FileInputStream(filePath)) {

                Properties properties = new Properties();

                properties.load(input);

                return properties.getProperty(key);

            } catch (IOException ex) {

                return "";

            }

        } catch (Exception e) {

            return "";

        }

    }

    public static String getFile(String fileName) throws IOException {

        StringBuilder result = new StringBuilder("");

        String filePath = "C:\\logmon\\otp.properties";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                result.append(line);

            }

            scanner.close();

        } catch (IOException e) {

            throw e;

        }

        return result.toString();

    }

}

