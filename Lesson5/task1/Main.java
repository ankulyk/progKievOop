package progKievOop.Lesson5.Homework.Task1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File folderFrom = new File("FolderFrom");
        File folderTo = new File("FolderTo");
        String[] ext = {"txt", "doc"};

        try {
            CopyFileFromTo.copyFilesFromFolderToFolder(folderFrom, folderTo, ext);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
