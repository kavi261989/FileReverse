package org.example;

import java.io.*;

public class ReverseFile {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("input"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            reverseFileContent(reader, writer);
            System.out.println("File reversed successfully.");
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }

    }

    public static void reverseFileContent(BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        try {
            String line;
            StringBuilder reversedContent = new StringBuilder();

            while((line = bufferedReader.readLine()) != null){
                reversedContent.append(new StringBuilder(line).reverse()).append("\n");
            }

            // Write the reversed content
            bufferedWriter.write(reversedContent.toString());
            System.out.println("File reversed....");
        } catch (Exception ex){

        }
        }
}