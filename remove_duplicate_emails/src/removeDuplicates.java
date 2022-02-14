import java.io.*;
import java.util.HashSet;

//Removing the duplicates from emailsWithDuplicates.txt and write to duplicatesRemoved.txt
public class removeDuplicates {
    public static void main(String[] args) throws IOException
    {
        //PrintWriter object for duplicatesRemoved.txt
        PrintWriter print = new PrintWriter("duplicatesRemoved.txt");

        //BufferedReader object for emailsWithDuplicates.txt
        BufferedReader reader = new BufferedReader(new FileReader("emailsWithDuplicates.txt"));

        String line = reader.readLine();

        //Set store unique values
        HashSet<String> hs = new HashSet<>();

        //Loop for each line of emailsWithDuplicates.txt
        while(line != null)
        {
            //Write only to new file if not present in hashset
            if(hs.add(line))
                print.println(line);

            line = reader.readLine();
        }

        print.flush();

        //Closing resources
        reader.close();
        print.close();
    }
}