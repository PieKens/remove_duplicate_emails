import java.io.BufferedWriter;
import java.io.FileWriter;

public class createRandomMail {
    //Create 50.000 random Email addresses (without duplicates)

    public static String createRandomMails()
    {
        //Choose random characters from these strings
        String str = "1234567890" + "abcdefghijklmnopqrstuvxyz" + "ABCDEFGHIJKLMNOPQRSTUVZ" + "-_.+";

        //create random email addresses with a length of 5 characters
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 4; i++) {
            int index = (int) (str.length() * Math.random());
            s.append(str.charAt(index));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        try {
            //Specify the file name for the created email addresses (file will be saved in main directory and overwritten)
            FileWriter originalEmails = new FileWriter("originalEmails.txt");

            //Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(originalEmails);

            //Creates and writes 50.000 email addresses to the file in single lines
            for (int i = 0; i <= 50000; i++) {
                String emails = createRandomMails();
                output.write(emails + "@provider.com");
                output.newLine();
            }
            //Closes the writer
            output.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
