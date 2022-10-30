package io_nio.NIO.Path_Files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\M");
        Path directoryBPath = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\B");

        // .copy(filePath, directoryPath.resolve(filePath)) копирует файл в директорию под своим именем и с новым именем.
        // Если мы хоти перезаписать уже имеющийся файл, то может использовать .resolve(filePath), StandardCopyOption.REPLACE_EXISTING)
//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("Done!");
        System.out.println("-----------------------------------------------------------------------------------------");

        // .copy(directoryPath, directoryBPath.resolve("B") копирует B в М папку без файлов, просто папка только
//        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .move() вырезать - вставить файл. Можно даже переименовывать, если перемещать в ту же самую папку
//        Files.move(filePath, directoryPath.resolve("test15.txt"));
//        Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt")));
        System.out.println("-----------------------------------------------------------------------------------------");

//        Files.delete(Paths.get("test5.txt"));
//        Files.delete(directoryPath);


    }
}






















