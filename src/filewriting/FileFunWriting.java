package filewriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class FileFunWriting {

        public static void main(String[] args) {
            new FileFunWriting().run();
        }

        private void run() {
            File file = new File("filewriting//output.txt");
            try {
                PrintStream ps = new PrintStream(file);
                ps.println("Hello File");
                ps.println("Goodbye File");
                ps.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


