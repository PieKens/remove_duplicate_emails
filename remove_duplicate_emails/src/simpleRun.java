import java.io.IOException;

//Simple Run of all classes to prove it can be executed in less than 1second
public class simpleRun {
    public static void main(String[] args) throws IOException {
        //finding the time before all operations are executed
        long start = System.currentTimeMillis();

        //Create new CreateRandomMail Object
        createRandomMail randommail = new createRandomMail();
        //Calling the methods of createRandomMail to write 50.000 random generated emails to originalEmails.txt file
        randommail.createRandomMails();
        randommail.main(args);

        //Create new createEMailDuplicates Object
        createEmailDuplicates createduplicates = new createEmailDuplicates();
        /*Calling the main method of createEmailDuplicates to write 100.000 emails (containing 50% duplicates) to new
        emailsWithDuplicates.txt*/
        createduplicates.main(args);

        //Create new removeDuplicates Object
        removeDuplicates removedups = new removeDuplicates();
        /*Calling the main method of removeDuplicates to remove the duplicates from emailsWithDuplicates.txt and
        save to new file duplicatesRemoved.txt*/
        removedups.main(args);

        //Finding the timer after all operations are executed
        long end = System.currentTimeMillis();
        //Finding the time difference, converting into seconds and print on screen
        float elapsed = (end - start) / 1000F;
        System.out.println("Completed in: " + elapsed + " seconds");
    }
}
