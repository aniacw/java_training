package FileScanner;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("bookFile.txt");
        Scanner scanner = new Scanner(file);

        int wordCount = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordCount += line.split(" ").length;
        }
        System.out.println(wordCount);
    }
}
