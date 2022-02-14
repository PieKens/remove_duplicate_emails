# remove_duplicate_emails

The Task:
In the Language of your choice, write a function that removes all duplicates from an unsorted list of email addresses while leaving the remaining list in the original Order. Prove that this function can handle 100.000 email addresses containing 50% randomly placed duplicates in under 1 second on a typical laptop.

The language of my choice was Java for this task, I created three java classes to:
1. create random emails and write them to a txt file (createRandomMail.java)
2. create duplicates of emails (1) and write them to a new txt file (createEmailDuplicates.java)
3. remove the duplicates from list (2) and save the result in a new txt file (removeDuplicates.java)

The simpleRun.java class runs all three classes and prints the execution time.
Alternatively, each class can be run sequentially as follows:
1. createRandomMail
2. createEmailDuplicates
3. removeDuplicates


Written in IntelliJ IDEA 2021.2.3 (Community Edition)

Project SDK: java jdk-17.0.1
