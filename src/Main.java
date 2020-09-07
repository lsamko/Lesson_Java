import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // create new file
        File file1 = new File("New File.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // create new folder
        File folder = new File("New Folder");
        folder.mkdirs();

        //create new file in the folder
        File file2 = new File(folder, "file.docx");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // delete file
        file1.delete();

        // delete folder. You will be not able to delete folder with files inside, only empty folder can be deleted!!!
        folder.delete();

        File workFolder = new File(".");
        File [] files = workFolder.listFiles();

        for (int i = 0; i < files.length ; i++) {
            System.out.println(files[i]);
        }


        File file = new File("Hello.txt");
        //try with resources
        try(PrintWriter pw = new PrintWriter(file)){
            pw.println("Hello World!");
        } catch (IOException e){
            System.out.println(e);
        }

    }
}

