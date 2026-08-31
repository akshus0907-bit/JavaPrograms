/*Question 40: Write a Java program to create a Student Management System using file handling.
Asked In Practice Assignment
Input:
Menu:
1-Add Student
2-View All Students
3-Search Student
4-Delete Student
5-Update Marks
Select: 1
Enter name: Rahul, Marks: 78

Output:
1-Add: Student added successfully
2-View: Display all records
3-Search: Find specific student
4-Delete: Remove record
5-Update: Modify marks

Explanation:
Create menu-driven system using while loop and switch case for user choices. Add Student: Read name/marks, write to file. View All: Read file completely, display all student records in formatted output. Search Student: Input name, find in file, display record or show not found. Delete Student: Read file, exclude matching record, rewrite remaining to file. Update Marks: Read file, locate student, update marks, rewrite file. This complete system demonstrates all file handling operations integrated together.*/
import java.util.*;
import java.io.*;

public class StudentMangSystem {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("\n1-Add Student");
            System.out.println("2-View All Students");
            System.out.println("3-Search Student");
            System.out.println("4-Delete Student");
            System.out.println("5-Update Marks");
            System.out.println("6-Exit");

            System.out.println("Enter your choice");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                // ---------------- ADD ----------------
                case 1:

                    FileWriter fw = new FileWriter("StudentMang.txt");

                    for (int i = 0; i < 3; i++) {

                        System.out.println("Enter student name");
                        String name = in.nextLine();

                        System.out.println("Enter student marks");
                        int marks = in.nextInt();
                        in.nextLine();

                        fw.write(name + " " + marks);
                        fw.write("\n");
                    }

                    fw.close();

                    System.out.println("Data stored successfully");

                    break;


                // ---------------- VIEW ----------------
                case 2:

                    FileReader fr = new FileReader("StudentMang.txt");
                    BufferedReader br = new BufferedReader(fr);

                    String data;

                    System.out.println("All Students:");

                    while ((data = br.readLine()) != null) {
                        System.out.println(data);
                    }

                    br.close();

                    break;


                // ---------------- SEARCH ----------------
                case 3:

                    System.out.println("Enter student name for search");
                    String sername = in.nextLine();

                    FileReader fr1 = new FileReader("StudentMang.txt");
                    BufferedReader br1 = new BufferedReader(fr1);

                    String data1;
                    boolean found = false;

                    while ((data1 = br1.readLine()) != null) {

                        String part[] = data1.split(" ");
                        String name = part[0];

                        if (name.equals(sername)) {

                            System.out.println("Record found:");
                            System.out.println(data1);

                            found = true;
                            break;
                        }
                    }

                    br1.close();

                    if (found == false) {
                        System.out.println("Record not found");
                    }

                    break;


                // ---------------- DELETE ----------------
                case 4:

                    System.out.println("Enter student name for delete");
                    String delname = in.nextLine();

                    FileReader fr3 = new FileReader("StudentMang.txt");
                    BufferedReader br3 = new BufferedReader(fr3);

                    FileWriter fw3 = new FileWriter("temp.txt");

                    String data3;
                    boolean deleted = false;

                    while ((data3 = br3.readLine()) != null) {

                        String part[] = data3.split(" ");
                        String name = part[0];

                        if (name.equals(delname)) {

                            deleted = true;
                            continue;
                        }

                        fw3.write(data3);
                        fw3.write("\n");
                    }

                    br3.close();
                    fw3.close();

                    File oldFile = new File("StudentMang.txt");
                    oldFile.delete();

                    File newFile = new File("temp.txt");
                    newFile.renameTo(oldFile);

                    if (deleted) {
                        System.out.println("Student deleted successfully");
                    }
                    else {
                        System.out.println("Student not found");
                    }

                    break;


                // ---------------- UPDATE ----------------
                case 5:

                    System.out.println("Enter student name to update");
                    String updateName = in.nextLine();

                    System.out.println("Enter new marks");
                    int newMarks = in.nextInt();
                    in.nextLine();

                    FileReader fr5 = new FileReader("StudentMang.txt");
                    BufferedReader br5 = new BufferedReader(fr5);

                    FileWriter fw5 = new FileWriter("temp.txt");

                    String data5;
                    boolean updated = false;

                    while ((data5 = br5.readLine()) != null) {

                        String part[] = data5.split(" ");
                        String name = part[0];

                        if (name.equals(updateName)) {

                            fw5.write(name + " " + newMarks);
                            fw5.write("\n");

                            updated = true;
                        }
                        else {

                            fw5.write(data5);
                            fw5.write("\n");
                        }
                    }

                    br5.close();
                    fw5.close();

                    File oldFile5 = new File("StudentMang.txt");
                    oldFile5.delete();

                    File tempFile = new File("temp.txt");
                    tempFile.renameTo(oldFile5);

                    if (updated) {
                        System.out.println("Marks updated successfully");
                    }
                    else {
                        System.out.println("Student not found");
                    }

                    break;


                // ---------------- EXIT ----------------
                case 6:

                    System.out.println("Program ended");
                    in.close();
                    return;


                default:

                    System.out.println("Invalid choice");
            }

        } while (true);
    }
}
		