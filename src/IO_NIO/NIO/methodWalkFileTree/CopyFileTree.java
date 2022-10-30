package IO_NIO.NIO.methodWalkFileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// D:\Java\Projects\JavaUdemy\JavaCourse\X
// D:\Java\Projects\JavaUdemy\JavaCourse\src\IO_NIO\anyFilesForWork\CopyHere

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\X");
        Path destination = Paths.get("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\src\\IO_NIO\\anyFilesForWork\\CopyHere");

        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}





















