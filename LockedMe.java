package lockedme.com;
import java.io.*;
import java.util.*;

public class LockedMe {
	File f= new File("C:\\rajiv\\main");
	Scanner sc=new Scanner(System.in);
		public void menu() {
		System.out.println("*************************************************");
		System.out.println("***Welcome to LockedMe.com**\n" + "**This application is developed by Rajiv Ranjan**\n"+"*************************************************\n");
	     }
		
		public void mainMenu() {
		System.out.println("|   Select any of the following:    |");
		System.out.println("|   1 - List of all files in ascending order           |");
		System.out.println("|   2 - More options       |");
		System.out.println("|   3 - Terminate program             |\n");
		System.out.println("enter choice: ");
		/*Main lm= new Main();
		lm.welcmScreen();
		lm.mainMenuOptions();*/
		
		int choice=sc.nextInt();
        switch(choice) {
		
		case 1 :     
                     File arr[]=f.listFiles();
                     Arrays.sort(arr);
                    
                     for(int i=0; i<arr.length;i++)
                    	 System.out.println(arr[i].getName());
                     break;
		
	
		
		case 2 :
			
		
			    System.out.println("|   select one option:    |" );
			    System.out.println("|   1 - add a file in existing directory     |");
			    System.out.println("|   2 - delete a file from existing directory    |");
			    System.out.println("|   3 - search a file from the directory    |");
			    System.out.println("|   4 - back to previous menu   |");
			    System.out.println("enter choice1: ");
			    int choice1= sc.nextInt();
			    switch(choice1) {
			    
			    case 1:
			    	   System.out.println("enter file name to add: ");
			    	     String name=sc.next();
			    	    if(new File(f,name).exists()) {
			    	    	System.out.println("file already exists");
			    	    }
			    	    	else {
			    	    		File f1= new File(f,name);
			    	    		try {
			    	    		f1.createNewFile();
			    	    		System.out.println("file added succeessfully\n");
			    	    		//if(new File(f1,name).exists()) {
			    	    			
			    	    			
			    	    			
			    	    		//}
			    	    		}
			    	    		catch(Exception e) {
			    	    			System.out.println(e);
			    	    		}
			    	    	}
			    	    break;
			    	    
			    case 2: 
			    	    System.out.println("enter file name to delete: ");
			    	    String name1= sc.next();
			    	    if(new File(f,name1).exists()) {
			    	    	System.out.println("file exixts");
			    	    	File f2=new File(f,name1);
			    	    	f2.delete();
			    	    	System.out.println("file deleted successfully\n");
			    	    }
			    	    else {
			    	    	System.out.println("file doesnot exists");
			    	    }
			    	    break;
			    	    
			    case 3: 
			    	    System.out.println("enter file name to search:");
			    	    String name2=sc.next();
			    	    File arr1[]=f.listFiles();
			    	    for(int i=0; i<arr1.length;i++) {
			    	    	if(arr1[i].getName().startsWith(name2)) {
			    	    		System.out.println(arr1[i]);
			    	    	}
			    	    	else {
			    	    		System.out.println("File Not Found");
			    	    		
			    	    	}
			    	    }
			    	    break;
			    	    


			    	    
			    case 4:
			    	        mainMenu();
			    	        break;
			    	
			    default:
			    	   System.out.println("invalid input");
			    	   break;
			    	              
			    	  }
			    break;
		
		case 3:
                System.out.println("program terminated");
                System.exit(0);
                
         default: 
        	 System.out.println("invalid input\n"+"try again");
        	 break;
			    
			    	    
			    	    }
			    	    
			    	    }


         public static void main(String[] args) {
	
	         LockedMe obj=new LockedMe();
	         obj.menu();
	         obj.mainMenu();
}

}
		
		
		
		
		
		

	


