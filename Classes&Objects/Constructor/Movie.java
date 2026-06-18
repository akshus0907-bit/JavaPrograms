/*Question 12: Write a Java program to create a Movie class and count how many movies have rating greater than 4.

Description: Create Movie class with movieId, movieName and rating. Initialize using constructor. 
Store movie objects and count movies having rating above 4.
INPUT:
Enter 4 Movies:
1 Leo 4.5
2 Jawan 3.8
3 Pathan 4.2
4 Tiger 3.5

OUTPUT:
Movies with rating above 4: 2

EXPLANATION:
Create Movie class with fields movieId, movieName, rating. Use constructor to initialize.
 Create Movie[] array to store movies. Loop through array, check if rating > 4.0 and increment counter. 
 Display count of movies with rating > 4.*/
 
 import java.util.*;
 public class Movie{
	 private int MovieId;
	 private String MovieName;
	 private double rating;
	 
	 Movie(int id,String n,double r){
		 MovieId=id;
		 MovieName=n;
		 rating=r;
	 }
	 public void setMovieId(int id){
		 MovieId=id;
		
	 }
	 public void setMovieName(String n){
		 MovieName=n;
	 }
	 public void setrating(double r){
		 rating=r;
		
	 }
	 
	 public int  getMovieId(){
		 return MovieId;
	 }
	 public String getMovieName(){
		 return MovieName;
	 }
	 public double getrating(){
		 return rating;
	 }
	 
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 Movie m[]=new Movie[4];
		 System.out.println("enter movie details");
		 for(int i=0;i<4;i++){
			 System.out.println("enter movie id,movie name, and rating");
			 int id=in.nextInt();
			 String name=in.next();
			 double rating=in.nextDouble();
			 m[i]=new Movie(id ,name,rating);
		 }
		 int count=0;
		 for(int i=0;i<4;i++)
		 if(m[i].getrating()>=4){
			 count++;
		 }
		 System.out.println("movie with rating above 4="+count);
	 }
 }
