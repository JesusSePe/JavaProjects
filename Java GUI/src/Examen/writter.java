package Examen;

import java.io.*;

public class writter {
    public static void update (String id, String[] data){
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/Examen/db.txt"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            while ((line = file.readLine()) != null) {
                String[] originalData = line.split(",");
                if (originalData[0].equals(id)) {
                    line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
                }
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();

            // write the new string with the replaced line OVER the same file
            FileOutputStream fileOut = new FileOutputStream("src/Examen/db.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Problem editing file.");
        }
    }
    public static int add (String[] data){
        try {
            // Count lines, to get new ID
            BufferedReader file = new BufferedReader(new FileReader("src/Examen/db.txt"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            int count = -1; // Count lines, to set new ID. If there are no lines, starts with 0 (because on insert, we do count + 1. -1+1=0)

            while ((line = file.readLine()) != null) {
                count +=1;
            }
            file.close();
            // Append new user
            FileWriter fw = new FileWriter("src/Examen/db.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            // Convert array to string + add ID.
            String newLine = String.valueOf(count + 1);
            for (int i = 0; i < data.length; i++) {
                newLine = newLine + ",";
                newLine = newLine + data[i];
            }
            newLine = newLine + ",";
            newLine = newLine + '0';
            bw.write(newLine);
            bw.newLine();
            bw.close();
            return 0;
        } catch (Exception e) {
            System.out.println("Problem adding to file.");
            return 1;
        }
    }
}
