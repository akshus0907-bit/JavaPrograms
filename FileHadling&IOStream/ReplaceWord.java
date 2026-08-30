/*Question 23: Write a Java program to replace a word in file.
Asked In Practice Assignment
Input:
Original file content:
Java is great
Replace: Java with Python

Output:
New file content:
Python is great

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. Use replace(oldWord, newWord) method to replace all occurrences of specific word. Use replaceAll() method for pattern-based replacement using regular expressions. Write modified content to file (can overwrite original or create new). Replacement affects all occurrences throughout entire file. Case-sensitive replacement. Verify replacement by reading modified file.*/
