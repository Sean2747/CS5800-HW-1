import java.util.*;

public class Folder {
    private String folderName;
    public ArrayList<File> files;
    public ArrayList<Folder> folders;
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";

    public Folder(String name) {
        setFolderName(name);
        folders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void setFolderName(String name) {
        this.folderName = name;
    }

    public String getFolderName() {
        return folderName;
    }

    // to add a folder within this folder
    public void addFolder(String newFolder) {
        folders.add(new Folder(newFolder));
    }

    public void addFile(String newFile) {
        files.add(new File(newFile));
    }

    // display
    public void display() {
        print("");
    }

    public void print(String blank) {
        // System.out.println(blank + getFolderName());
        System.out.print(blank);
        if (files.isEmpty() && folders.isEmpty()) {
            System.out.print("+ ");
        } else {
            System.out.print("- ");
        }
        System.out.println(getFolderName());

        if (folders.size() != 0) {
            for (int i = 0; i < folders.size(); i++) {
                folders.get(i).print(blank + "      ");
            }
        }

        if (files.size() != 0) {
            for (int i = 0; i < files.size(); i++) {
                System.out.println(blank + "      " + GREEN + files.get(i).getFileName() + RESET);
            }
        }
    }
}