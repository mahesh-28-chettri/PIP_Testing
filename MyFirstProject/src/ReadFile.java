import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("src/File.txt", true);
        fw.write("I want to be a singer.");
        fw.close();
        File file=new File("src/File.txt");
        Scanner sc=new Scanner(file);

        while (sc.hasNextLine()) {
            String line=sc.nextLine();
            System.out.println(line);
        }
    }
}
