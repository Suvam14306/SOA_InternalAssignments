 /*Write a menu driven Java Program using class, methods and reference variables, to construct
 a singly linked list consisting of the following information in each  node: student regd_no 
(int), mark secured in a subject (float).*/

import java.util.Scanner;
class link
{
	 int reg_no;
	 float mark;
	 link next;	
}
public class program1 {
	static  Scanner sc=new Scanner(System.in);
	 static link start=null;
	 
	 public static void create(link node)//node=start
	 {
		 
		 System.out.println("enter the reg_no of student node");
		 node.reg_no=sc.nextInt();
		 System.out.println("enter the mark of student node");
	     node.mark=sc.nextInt();
	     node.next=null;
	     System.out.println("press 0 to end or any other key to continue ");
	     int x=sc.nextInt();
	     while(x!=0)
	     {
	    	 link curr=new link();
	    	 System.out.println("enter the reg_no of current student node");
	    	 curr.reg_no=sc.nextInt();
			 System.out.println("enter the mark of current student node");
		     curr.mark=sc.nextInt();
		     curr.next=null;
		     node.next=curr;
		     node=curr;
		     System.out.println("press 0 to continue or any other key to continue ");
		      x=sc.nextInt();
		     
	     }
	     //insertion at the beginning of the list
	    
	 }
	 public static link insbeg(link node)
    {
   	link temp=new link();
   	System.out.println("enter the reg_no of temp student node");
   	 temp.reg_no=sc.nextInt();
		 System.out.println("enter the mark of temp student node");
	     temp.mark=sc.nextInt();
	     temp.next=null;
	     start=temp;
	     temp.next=node;
   	return start;
    }
	 // At the end of the list
    public static link insend(link node)
    {
   	 link temp=new link();
   	 System.out.println("enter the reg_no of current student node");
   	 temp.reg_no=sc.nextInt();
		 System.out.println("enter the mark of current student node");
	     temp.mark=sc.nextInt();
	     temp.next=null;
	     while(node.next!=null)
	     {
	    	 node=node.next;
	     }
	     node.next=temp;
	     return start;
    }
    //at any position in the list
    public static link insany(link node)
    {
   	 link temp=new link();
   	 System.out.println("enter the reg_no of current student node");
   	 temp.reg_no=sc.nextInt();
		 System.out.println("enter the mark of current student node");
	     temp.mark=sc.nextInt();
	     temp.next=null;
	     System.out.println("enter the location");
	     int loc=sc.nextInt();
	     if(loc==1)
	     {
	    	 start=temp;
	    	 temp.next=node;
	    	 return start;
	     }
	     else
	     {
	    	 link prev=new link();
	    	 int i=1;
	    	 while(i<loc)
	    	 {
	    		 prev=node;
	    		 node=node.next;
	    		 i++;
	    	 }
	    	 prev.next=temp;
	    	 temp.next=node;
	    	 return start;
	     }
    }
    //DELETION OPERATION
    //from beginning
    public static link delbeg(link node)
    {
   	 start=node.next;
   	 return start;
    }
    //from the end
    public static link delend(link node)
    {
   	 link prev=new link();
   	 while(node.next!=null)
   	 {
   		 prev=node;
   		 node=node.next;
   	 }
   	 prev.next=null;
   	 return start;
    }
    //delete from anywhere
    public static link delany(link node)
    {
   	 System.out.println("enter the location");
   	 int loc=sc.nextInt();
   	 if(loc==1)
   	 {
   		 start=node.next;
   		 return start;
   	 }
   	 else {
   		 link prev=new link();
   		 int i=1;
   		 while(i<loc)
   		 {
   		 prev=node;
   		 node=node.next;
   		 i++;
   		 }
   		 prev.next=node.next;
   		 return start;
   	 }
   	 
   	 
    }
    //delete using registration number
    public static link delreg_no(link node)
    {
   	 System.out.println("enter the registration no you want to delete");
   	 int delreg=sc.nextInt();
   	 int flag=0;
   	 while(node!=null)
   	 {
   		 
   		 int loc=0;
   		 link prev=new link();
   		 prev=node;
   		 node=node.next;
   		 if(delreg==node.reg_no)
   		 {
   			 flag=1;
   			 loc++;
   			 if(loc==1)
   			 {
   				 start=node.next;
   				 return start;
   				 
   			 }
   			 else
   			 {
   			 prev.next=node.next;
   			 return start;
   			 }   			  
   			 
   		 }
   		 
   	 }
   	 if(flag==0)
   	 {
   		 System.out.println("registration number not found.");
   	 }
   	 return start;
    }
    //SEARCH A NODE
    public static void search(link node)
    {
   	 System.out.println("enter the registration number of the student");
   	 int searchreg=sc.nextInt();
   	 int flag=0;
   	 while(node!=null)
   	 {
   		
   		 if(searchreg==node.reg_no)
   		 {
   			 flag=1;
   			 break;
   		 }
   		 node=node.next;
   	 }
   	 if(flag==1)
   	 {
   		 System.out.println("the mark of the student with registration nujmber"+searchreg+"is"+node.mark);
   	 }
   	 else
   	 {
   		 System.out.println("registration number not found");
   	 }
    }
    //count the number of nodes
    public static int count(link node)
    {
   	 int c=0;
   	 while(node!=null)
   	 {
   		 c++;
   		 node=node.next;
   	 }
   	 return c;
    }
    //reverse a number
    public static link reverse(link node)
    {
   	 link temp1=new link();
   	 link temp2=new link();
   	 link temp3=new link();
   	 temp1=node;
   	 temp2=node.next;
   	 temp1.next=null;
   	 while(temp2.next!=null)
   	 {
   		 temp3=temp2.next;
   		 temp2.next=temp1;
   		 
   		 temp1=temp2;
   		 temp2=temp3;
   	 }
   	 temp2.next=temp1;
   	 start=temp2;
   	 return start;
    }
    public static void display(link node)
    {
   	 while(node!=null)
   	 {
   		 System.out.println(node.reg_no+"\t\t"+node.mark+"--->");
   		 node=node.next;
   	 }
    }
	public static void main(String[] args) {		 
		link node=new link();
		start=node;
		create(start);
		insbeg(start);
		insend(start);
		insany(start);
		delbeg(start);
		delend(start);
		delany(start);
		delreg_no(start);
		search(start);
		count(start);
		reverse(start);
		display(start);	
	}
}