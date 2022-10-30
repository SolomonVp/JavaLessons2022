package IO_NIO.NIO.Path_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\M");

        // .getFileName() возвращает имя файла или директории, которые расположенны на данном пути
        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("-----------------------------------------------------------------------------------------");

        // .getParent() возвращает родителя директории
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("-----------------------------------------------------------------------------------------");

        // .getRoot() возвращает корень, откуда берет начало дирректория
        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("-----------------------------------------------------------------------------------------");

        // .isAbsolute() проверяет работаем мы с абсолютным путем или нет
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("-----------------------------------------------------------------------------------------");

        // .toAbsolutePath() посмотреть абсолютный путь
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("-----------------------------------------------------------------------------------------");

        // .resolve(filePath) объединение двух путей в один
        System.out.println("filePath.toAbsolutePath().getRoot() " + directoryPath.resolve(filePath));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .relativize(anotherPath) относительный путь абсолютного пути относительно directoryPath
        Path anotherPath = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\M\\N\\Z\\test20.txt");
        System.out.println("filePath.toAbsolutePath().getRoot() " + directoryPath.relativize(anotherPath));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .exists(filePath) и .exists(directoryPath) проверяют чуществуют ли файлы или директории, если нет, то создают
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        // .isReadable(filePath) проверяет права на файл, isWritable(filePath) - ??????????, isExecutable(filePath) - можем ли мы запускать этот файл
        System.out.println("Files.isReadable(filePath)" + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath)" + Files.isWritable(filePath));
        System.out.println("Files.isWritable(filePath)" + Files.isExecutable(filePath));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .isSameFile(filePath, filePath2) проверяет ссылаются ли оба пути на один и тот же файл
        Path filePath2 = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .size(filePath) вывести на кэран размер нашего файла
        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("-----------------------------------------------------------------------------------------");

        // .getAttribute(filePath, "creationTime") узнать информацию о каком то атрибуте. Атрибутов много, надо гуглить.
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object>entry: attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}






































