/*Question 12: Write a Java program to calculate the sum of arrays using multiple threads.

Divide array into two parts and assign each part to a separate thread to calculate partial sum and display total sum.
Asked In Practice Assignment
Input:
Enter size: 6
Enter elements: 10 20 30 40 50 60

Output:
Thread1 sum: 60
Thread2 sum: 150
Total sum: 210

Explanation:
Divide large array into smaller segments and process each segment in separate thread for parallel computation. Each thread calculates partial sum independently. Main thread collects results and computes total sum. Demonstrates performance improvement through parallel processing of data.*/