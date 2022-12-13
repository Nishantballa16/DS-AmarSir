
import java.util.ArrayList;
import java.util.Scanner;

class Node
	{
	    int Coefficient;
	    int  power;
	    Node next;
	    Node(int co , int po)
	    {
	       Coefficient=co;
	       power=po;
	        next=null;
	    }
	}
public class Polynomial {
	

	  Node root;
	  

	         
	 
	 void insertRight(int co , int po)
	 {
	     Node n=new Node(co , po);
	     if(root==null)
	     {
	         root=n;
	     }
	     else
	     {
	         Node t=root;//1 use t to search right
	         while(t.next!=null)//2
	         {
	             t=t.next;
	         }
	          t.next=n;//3
	     }
	 }
	   

	 void printList()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         t=this.root;
	         while(t!=null)//2
	         {
	             System.out.println(t.Coefficient + " " + t.power);
	             t=t.next;
	         }
	         
	     }
	   }
	 public static Polynomial PolynomialAddition(Polynomial obj1 , Polynomial obj2)
	 {
		Node t1= obj1.root;
		Node t2= obj2.root;
		
		Polynomial obj3= new Polynomial();
		Node t3= obj3.root;
		
		while(t1!=null && t2!=null)
		{
			
		
		
		   if(t2.power>t1.power)
		   {
			    
			   Node n = new Node(t2.Coefficient ,t2.power);
			   if(t3==null && obj3.root==null)
			   {
				 obj3.root=t3=n;
				 t2=t2.next;
			    }
			 else
			    {
				 t3.next=n;
				 t3=t3.next;
				 t2=t2.next;
				 
			    }
			
			  
			 
		   }
		   else if(t2.power<t1.power)
		   {
			   Node n = new Node(t1.Coefficient ,t1.power);
				 if(t3==null && obj3.root==null)
				 {
					 obj3.root=t3=n;
					 t1=t1.next;
				 }
				 else
				 {
					 t3.next=n;
					 t3=t3.next;
					 t1=t1.next;
				 }
		   }
		   else
		   {
			   
			   Node n = new Node(t1.Coefficient+t2.Coefficient ,t1.power);
			   if(t3==null && obj3.root==null)
				 {
					 obj3.root=t3=n;
					 t1=t1.next;
					 t2=t2.next;
				 }
			   else
			   {
				   t3.next=n;
				   t3=t3.next;
				   t1=t1.next;
				   t2=t2.next;
			   }
			   
		   }
		}
		   
		   if(t2!=null)
		      {
		    	  while(t2!=null)
		    	  {
		    		  Node n= new Node(t2.Coefficient ,t2.power);
		    		  t3.next=n;
		        	  t3=t3.next;
		        	  t2=t2.next;
	        		  
		    		  
		    	  }
		      }
		   
		   if(t1!=null)
		      {
		    	  while(t1!=null)
		    	  {
		    		  Node n= new Node(t1.Coefficient ,t1.power);
		    		  t3.next=n;
		        	  t3=t3.next;
		        	  t1=t1.next;
	        		  
		    		  
		    	  }
		      }
		
		   
		   return obj3;
			   
		   
 }
	  public void sort()
		 {
			 if(root==null)
				 System.out.println("List is Empty");
			 else
			 {
				 Node t2=null ,t=null;
				 int temp  , temp2;
				 for(t=root;t.next!=null; t=t.next)
				 {
					 for(t2=t.next;t2!=null;t2=t2.next)
					 {
						 if(t.power>t2.power)
						 {
							 temp=t2.power;
							 t2.power=t.power;
							 t.power=temp;
							 
							 temp2=t2.Coefficient;
							 t2.Coefficient=t.Coefficient;
							 t.Coefficient=temp;
						 }
					 }
				 }
				 
			 }
		 }
		
		 
	
	 
	

	 
	 public static void main(String[] args) {
		 
		 int choice=0 ,  data1=0, data2=0;
		 Scanner sc = new Scanner(System.in);
		 
		
		  System.out.println(" enter the first Equation");
		Polynomial obj1 = new Polynomial();
		 do
		 {
			 System.out.println("1.Insert Eelement");
			 
			 System.out.println("2.print");
			 
			 System.out.println("0.Exit");
			 
			 choice = sc.nextInt();
			 
			 switch(choice)
			 {
			  case 1:
				 System.out.println(" enter the coefficent");
				 data1=sc.nextInt();
				 System.out.println(" enter the power");
				 data2=sc.nextInt();
				
				 obj1.insertRight(data1, data2);;
			        break;
				  
				       
			 case 2:
				   obj1.printList();
				    break;
				    
			
			 case 0:  System.out.println(" Exit");
		         	 break;
				 
			 }
			 
		 }while(choice!=0);
		 System.out.println(" enter the Second Equation");
			Polynomial obj2 = new Polynomial();
			 do
			 {
				 System.out.println("1.Insert Eelement");
				 
				 System.out.println("2.print");
				 
				 System.out.println("0.Exit");
				 
				 choice = sc.nextInt();
				 
				 switch(choice)
				 {
				  case 1:
					 System.out.println(" enter the coefficent");
					 data1=sc.nextInt();
					 System.out.println(" enter the power");
					 data2=sc.nextInt();
					
					 obj2.insertRight(data1, data2);;
				        break;
					  
					       
				 case 2:
					   obj2.printList();
					    break;
					    
				
				 case 0:  System.out.println(" Exit");
			         	 break;
					 
				 }
				 
			 }while(choice!=0);
			 
			 Polynomial obj3=Polynomial.PolynomialAddition(obj1, obj2);
		  //   obj3.sort();
			 obj3.printList();
			 
	 }

}
