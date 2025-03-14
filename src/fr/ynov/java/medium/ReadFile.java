package fr.ynov.java.medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ReadFile {


    public static void main(String[] args) throws IOException {
        Random random = new Random();
        // Generate a random number
        int randomNumber = random.nextInt(10);
        System.out.println("Random number: " + randomNumber);

        final File folder = new File("src/resources/vfzm9mfqeqoszw2oi");
        listFilesForFolder(folder);

    }


    // path = src\resources\read.txt
    //this function permit to read one File
    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new  Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    //this function is more huge create the folder and the files in the folder with random name and random number for the files
    public static void createFile(int numFiles) {
        try {
            String nameOfDire = generateRandom();
            createFolder(nameOfDire);
            //set the path into the dictionary
            String paths = "src/resources/" + nameOfDire + "/";


            //Loop to create all the files
            for (int i = 0; i < numFiles; i++) {

                String name = generateUniqueFileName();

                //give the path to the files
                File myObj = new File(paths + name);

                //check if the files already exist
                if (myObj.createNewFile()) {
                    //confirmation for the creation of the file with his name
                    System.out.println("File created: " + myObj.getName());

                    // Data to be written in file
                    String text = generateRandom();

                    String path = paths + name;

                    // Defining the file name of the file
                    Path fileName = Path.of(path);

                    try {

                        Files.writeString(fileName, text);

                        // Reading the content of the file
                        String fileContent = Files.readString(fileName);

                        // Printing the content inside the file
                        System.out.println(fileContent);

                    } catch (IOException e) {
                        System.err.println("An error occurred: " + e.getMessage());
                    }
                } else {
                    System.out.println("File already exists.");
                }
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    //func to create the folder
    public static void createFolder(String nameDir) {
        File theDir = new File("src/resources/" + nameDir);
        if (!theDir.exists()){
            boolean dirCreated = theDir.mkdir();
        }
    }


    //generate random name for the file
    private static String generateUniqueFileName() {
        // Create a Random object
        Random random = new Random();

        // Generate a random number
        int randomNumber = random.nextInt(100000);

        // Return the formatted unique file name
        return "file_" + randomNumber + ".txt";
    }


    //generate Random text for th text in the file
    private static String generateRandom() {

        String aToZ = "abcdefghijklmnopqrstuvwxyz1234567890";

        Random rand = new Random();

        //better string works like a array
        StringBuilder res = new StringBuilder();

        //loop for create a random string
        for (int i = 0; i < 17; i++) {
            //take a random letter in aToZ
            int randIndex = rand.nextInt(aToZ.length());
            //put the letter in the Better string res
            res.append(aToZ.charAt(randIndex));
        }
        return res.toString();
    }


    //show the content of all the files in the folder
    public static void listFilesForFolder(final File folder) throws IOException {
        //with this loop we go into the folder
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {

            //Reading the content od the path to the files
            String fileContent = Files.readString(fileEntry.toPath());
            //print the result
            System.out.println(fileContent);

        }
    }
}
