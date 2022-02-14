# remove_duplicate_emails

The Task:
In the Language of your choice, write a function that removes all duplicates from an unsorted list of email addresses while leaving the remaining list in the original Order. Prove that this function can handle 100.000 email addresses containing 50% randomly placed duplicates in under 1 second on a typical laptop.

The language of my choice was Java for this task, I created three java classes to:
1. create random emails and write them to a txt file (createRandomMail.java)
2. create duplicates of emails (1) and write them to a new txt file (createEmailDuplicates.java)
3. remove the duplicates from list (2) and save the result in a new txt file (removeDuplicates.java)

I have created a simpleRun.java class to run all classes and print the elapsed time to the user to indicate that it can run in under 1 second.
In order to execute you can either run each class sequenced (1. createRandomMail, 2. createEmailDuplicates, 3. removeDuplicates) for it self or just run the simpleRun.java to execute all classes with the elapsed time print to screen.


Written in IntelliJ IDEA 2021.2.3 (Community Edition)
Project SDK: java jdk-17.0.1
