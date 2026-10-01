package ru.mirea.lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class WordReader {
    public static StringBuilder getLine(String[] words){
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }
        StringBuilder result = new StringBuilder();
        boolean[] used = new boolean[words.length];
        result.append(words[0]);
        used[0] = true;
        for (int i = 1; i < words.length; i++){
            char last = Character.toLowerCase(result.charAt(result.length()-1));
            boolean wordAdded = false;
            for (int j = 0; j < words.length; j ++){
                if (!used[j]){
                    char first = Character.toLowerCase(words[j].charAt(0));
                    if (first == last){
                        wordAdded = true;
                        used[j] = true;
                        result.append(" ").append(words[j]);
                        break;
                    }
                }
            }
            if (wordAdded == false){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Введите имя файла:");
        String fileName = consoleScanner.nextLine().trim();
        String fileContent = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder fileStringBuilder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                fileStringBuilder.append(line).append(" ");
            }
            fileContent = fileStringBuilder.toString().trim();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            consoleScanner.close();
            return;
        }
        if (fileContent.isEmpty()) {
            System.out.println("Файл пуст.");
            consoleScanner.close();
            return;
        }

        String[] test = fileContent.split("\\s+");
        StringBuilder output = getLine(test);
        System.out.println(output.toString());
        consoleScanner.close();
    }
}
