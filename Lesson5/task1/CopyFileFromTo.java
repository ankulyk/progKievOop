package progKievOop.Lesson5.Homework.Task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFileFromTo {


    public CopyFileFromTo() {
    }

    private static void checkParameters(File from, File to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Parameters from and to must be specified");
        }
        if (!from.exists() || !to.exists()) {
            throw new IllegalArgumentException("Folder from or folder to not exist");
        }
        if (!from.canRead() || !to.canWrite()) {
            throw new IllegalArgumentException("Folder from can not read or folder to can not write");
        }
        if (!from.isDirectory() || !to.isDirectory()) {
            throw new IllegalArgumentException("Parameters from and to must be folder");
        }
    }

    public static void copyFilesFromFolderToFolder(File from, File to, String[] extention) throws IOException {

        checkParameters(from, to);
        int countCopiedFiles = 0;
        File[] files = from.listFiles();

        if (extention == null) {
            throw new IllegalArgumentException("You must add extention files");
        }
        for (File file : files) {
            for (String ext : extention) {
                if (file.getName().endsWith("." + ext.toLowerCase())) {
                    try {
                        Files.copy(file.toPath(), Paths.get(to.getAbsolutePath() + File.separator + file.getName()));
                        countCopiedFiles++;
                    } catch (IOException e) {
                        System.out.println("Not copy");
                    }
                } else {
                    continue;
                }
            }
        }
        if (countCopiedFiles == 0) {
            System.out.println("No files to copy");
        }
        System.out.println("Copied files: " + countCopiedFiles);
    }
}
