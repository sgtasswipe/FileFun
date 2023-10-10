package filereading;

import filewriting.FileFunWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        new FileReading().run();
    }

    private void run() {
        Scanner fileScanner = null;
        File file = new File("filewriting//output.txt");
        try  {
             fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String s = fileScanner.nextLine();
                System.out.println("data in file: " +s);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        fileScanner.close();

    }
}
