package Examen;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class reader {
    public reader(){

    }
    public static Object[] allUsers () { // Read all users
        try {
            File myObj = new File("src/Examen/db.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> users = new ArrayList<String>();
            int count = 0;
            while (myReader.hasNextLine()) {
                String rawData = myReader.nextLine();
                String [] data = rawData.split(",");
                users.add(data[1] + ", " + data[2] + ", " + data[6]);
                count += 1;
            }
            Object[] data = users.toArray();
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new String[0][];
    }

    public static String[] userByID(int id) { // Search specific user (by ID)
        try {
            File myObj = new File("src/Examen/db.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String rawData = myReader.nextLine();
                String [] data = rawData.split(",");
                if (data[0].equals(String.valueOf(id))) {
                    System.out.println("User found");

                    return data;
                }
                System.out.println("User not found");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new String[0];
    }

    public static String[] userLogin (String usr, String pwd) { // Search specific user (login)
        try {
            File myObj = new File("src/Examen/db.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String rawData = myReader.nextLine();
                String [] data = rawData.split(",");
                if (data[4].equals(usr) && data[5].equals(pwd)) {
                    System.out.println("User found");

                    return data;
                }
                System.out.println("User not found");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new String[0];
    }
    public static String[] userByName (String usrName, String usrLast) { // Search specific user (by name)
        try {
            File myObj = new File("src/Examen/db.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String rawData = myReader.nextLine();
                String [] data = rawData.split(",");
                if (data[1].equals(usrName) && data[2].equals(usrLast)) {
                    System.out.println("User found");
                    return data;
                }
                System.out.println("User not found");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new String[0];
    }
}