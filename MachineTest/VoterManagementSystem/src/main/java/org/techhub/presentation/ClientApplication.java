package org.techhub.presentation;
import java.util.*;
import org.techhub.model.VoterModel;
import org.techhub.service.VoterServiceImpl;

import org.techhub.service.VoterService;

public class ClientApplication {
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		 VoterService voterService = new VoterServiceImpl();
		
		
		
		do {
		System .out.println("1.add user \n2.view user");
		
		System .out.println("enter choice");
		int choice=in.nextInt();
		
		in.nextLine();
			switch(choice) {
		case 1:
			
			
			VoterModel v=new VoterModel();
			System.out.println("enter name ");
			String name=in.nextLine();
			v.setName(name);
			
	
			
			
			
			System.out.println("enter age");
			
			int age=in.nextInt();
			v.setAge(age);
			
			
			
			boolean result =voterService.isAddVoter(v);
			
			
			if(result) {
				
				System .out.println("voter added Sucessfullt......");
				
			}
			else {
				System.out.println("voter not added");
			}
			
			
				break;
				
		

        case 2:

            System.out.println("Enter Voter ID:");
            int id = in.nextInt();

            VoterModel voter = voterService.ViewVoter(id);

            if (voter != null) {

                System.out.println("Voter Found");
                System.out.println("ID: " + voter.getId());
                System.out.println("Name: " + voter.getName());
                System.out.println("Age: " + voter.getAge());
            }
            else {

                System.out.println("Voter not found");
            }

            break;
		
			}
			
			
		
		
			
	}while(true);

}
}
