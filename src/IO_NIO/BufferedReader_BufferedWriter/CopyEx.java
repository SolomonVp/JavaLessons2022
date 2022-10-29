package IO_NIO.BufferedReader_BufferedWriter;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))
        ) {
//            int character;
//            while ((character= reader.read()) != -1) {
//                writer.write(character);
//            }

            String line;
            while ((line= reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
