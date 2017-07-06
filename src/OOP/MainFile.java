package OOP;

/**
 * Created by Admin on 06.07.2017.
 */
//Напишите программу которая примет на вход 2 текстовых файла, а вернет один. Содержимым этого файла должны
// быть слова которые есть и в первом и во втором файле.

import java.io.*;
public class MainFile {
    public static void main(String[] args) {
        File fileOne = new File("a.txt");
        File fileTwo = new File("b.txt");
        File fileThree = new File("Final file.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileOne));
             BufferedReader readerTwo = new BufferedReader(new FileReader(fileTwo));
             PrintWriter writer = new PrintWriter(fileThree)) {
            fileThree.createNewFile();
            String text = "";
            String str = "";
            while ((str = reader.readLine()) != null) {
                text += str + " ";
            }
            String[] words = text.split(" ");
            text = "";
            while ((str = readerTwo.readLine()) != null) {
                text += str + " ";
            }
            String[] wordsTwo = text.split(" ");
            for (String w : words) {
                for (String s : wordsTwo) {
                    if(w.equals(s)){
                        writer.print(w + " ");
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
