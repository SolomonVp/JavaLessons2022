package File;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test9.txt");
        File folder = new File("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork");
        File file2 = new File("\"D:\\\\Java\\\\Projects\\\\JavaUdemy\\\\JavaCourse\\\\src\\\\IO_NIO\\\\anyFilesForWork\\test20.txt");
        File folder2 = new File("\"D:\\\\Java\\\\Projects\\\\JavaUdemy\\\\JavaCourse\\\\src\\\\IO_NIO\\\\B\\");

        System.out.println("");
        System.out.println("------------------------Абсолютный путь--------------------------------------------------");
        System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("getAbsolutePath(): " + folder.getAbsolutePath());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("------------------------Проверяет абсолютный ли путь-------------------------------------");
        System.out.println("isAbsolute(): " + file.isAbsolute());
        System.out.println("isAbsolute(): " + folder.isAbsolute());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("------------------------Является ли файл директорией(папка это или нет)------------------");
        System.out.println("isDirectory(): " + file.isDirectory());
        System.out.println("isDirectory(): " + folder.isDirectory());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("------------------------Существует ли файл или папка-------------------------------------");
        System.out.println("exists(): " + file.exists());
        System.out.println("exists(): " + folder.exists());
        System.out.println("exists(): " + file2.exists());
        System.out.println("exists(): " + folder2.exists());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("------------------------Создать файл или дирректорию-------------------------------------");
        System.out.println("file2.createNewFile(): " + file2.createNewFile());
        System.out.println("folder2.mkdir(): " + folder2.mkdir());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ IO_NIO про File");

        System.out.println("------------------------Узнать размер папки или файла---------(.length)------------------");
        System.out.println("------------------------Удалить файл или папку----------------(.delete)------------------");
        System.out.println("------------------------Удалить файл или папку----------------(.delete)------------------");
        System.out.println("------------------------Какое то там содержимое куда-то посмотреть-----------------------");
        System.out.println("------------------------Скрыта ли папка-----------------------(.isHidden)----------------");
        System.out.println("------------------------Есть ли доступ на чтение--------------(.canRead)-----------------");
        System.out.println("------------------------Есть ли доступ на запись--------------(.canWrite)----------------");
        System.out.println("------------------------Есть ли доступ на выполнение файла----(.canExecute)--------------");

        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ
        // БЛЯ ДАЛЬШЕ Я БЫЛ ПЬЯН, ЕСЛИ ЧТО СМОТРЕТЬ НА УДЕМИ

    }
}






























