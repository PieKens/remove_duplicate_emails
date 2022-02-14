import java.util.*;
import java.io.*;

public class createEmailDuplicates {

    public static void main(String[] args) throws IOException{
        //Get source file to create copy with duplicates
        File source = new File("originalEmails.txt");
        //Create new file to store originalEmails.txt content + a copy of those
        File dest = new File("emailsWithDuplicates.txt");

        List<String> lines = readFile(source);

        copyFile(lines, dest);
    }
    //Copying all lines from the source file
    public static List<String> readFile(File source) throws IOException{
        List<String> lines = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(source));
            String copy;

            while((copy = reader.readLine()) != null){
                lines.add(copy);
            }
            reader.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return lines;
    }

    //Adding the copied lines two times (50% duplicates) to the new file
    public static void copyFile(List<String> lines,File dest) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));

        for (int i = 0; i <= 1; i++){
            for(String line:lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();
    }
}
