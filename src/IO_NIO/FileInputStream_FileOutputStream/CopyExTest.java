package IO_NIO.FileInputStream_FileOutputStream;

import java.io.*;


// не получится, потому что так делать не правильно для копирования картинки.
// Чтобы копировать правильно, надо смотреть класс CopyEx2

public class CopyExTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\womenIMG.png"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("women.png"))
        ) {
            int character;
            while ((character= reader.read()) != -1) {
                writer.write(character);
            }

//            String line;
//            while ((line= reader.readLine()) != null) {
//                writer.write(line);
//                writer.write("\n");
//            }
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
