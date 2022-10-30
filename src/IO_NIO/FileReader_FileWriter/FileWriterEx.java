package io_nio.FileReader_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда открытая мной.\n";

        String s = "privet";

        FileWriter writer = null;
        try {
//            writer = new FileWriter("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\test1.txt");
            writer = new FileWriter("test3.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }

//            writer.write(rubai);

            writer.write(s);


            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

    }
}
