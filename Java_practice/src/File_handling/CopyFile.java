package File_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("newDemo.txt");
       System.out.println(path.toAbsolutePath());

        // Create file
        Files.createFile(path);
        System.out.println("File created");

        // Copy file
        Path copypath = Paths.get("newDemocopy.txt");
        Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File Copied");

        // Move file
        Path movedPath = Paths.get("newDemo.txt");
        Files.move(copypath, movedPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved.");

        // Delete file
        Files.deleteIfExists(path);
        Files.deleteIfExists(movedPath);
        System.out.println("Files deleted.");
    }
}

