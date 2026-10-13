//3.Remove the top element using pop().	[10, 20, 30] → removes 30

import java.util.*;

class PopEleStack{
	public static void main(String[]args){
		Stack<Integer>stack=new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		Iterator<Integer>it=stack.it();
		
		while(it.hasNext()){
			int num=it.next();
			num.pop()