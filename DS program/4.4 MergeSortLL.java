import java.util.Scanner;

class Node
	{
	  
	    int  data;
	    Node next;
	    Node(int data)
	    {
	       this.data=data;
	    
	        next=null;
	    }
	}
public class MergeSortLL {
	

	  Node root=null;
	  

	         
	 
	 void insertRight(int data)
	 {
	     Node n=new Node(data);
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
	 public static  MergeSortLL sort(MergeSortLL obj1 ,MergeSortLL obj2)
	 {
		 Node t=obj1.root;
		 Node t2=obj2.root;
		
		 
	        MergeSortLL obj3 = new MergeSortLL();
	        
	        Node t3=obj3.root;
	        
	      while(t!=null && t2!=null)
	      {
	    	  
	    
	    	  
	      
	          if(t.data < t2.data)
	          {
	        	  Node n= new Node(t.data);
	        	  if(t3==null && obj3.root==null)
	        	  {
	        		 
	        		  t3=obj3.root=n;
	        		  t=t.next;
	        	  }
	        	  else
	        	  {
	        		  t3.next=n;
		        	  t3=t3.next;
		        	  t=t.next;
	        		  
	        	  }
	        	  
	        	 
	          }
	          else
	          {
	        	  Node n= new Node(t2.data);
	        	  
	        	  
	        	  if(t3==null && obj3.root==null)
	        	  {
	        		 
	        		  t3=obj3.root=n;
	        		  t2=t2.next;
	        	  }
	        	  else
	        	  {
	        		  t3.next=n;
		        	  t3=t3.next;
		        	  t2=t2.next;
	        		  
	        	  }
	        	  
	          }
	      }
	      if(t!=null)
	      {
	    	  while(t!=null)
	    	  {
	    		  Node n= new Node(t.data);
	    		  t3.next=n;
	        	  t3=t3.next;
	        	  t=t.next;
        		  
	    		  
	    	  }
	      }
	      
	      if(t2!=null)
	      {
	    	  while(t2!=null)
	    	  {
	    		  Node n= new Node(t2.data);
	    		  t3.next=n;
	        	  t3=t3.next;
	        	  t2=t2.next;
	    		  
	    	  }
	      }
	          
	          
		 return obj3;
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
	         t=root;
	         while(t!=null)//2
	         {
	             System.out.println(t.data);
	             t=t.next;
	         }
	         
	     }
	   }
	  public void sort()
	 {
		 if(root==null)
			 System.out.println("List is Empty");
		 else
		 {
			 Node t2=null ,t=null;
			 int temp;
			 for(t=root;t.next!=null; t=t.next)
			 {
				 for(t2=t.next;t2!=null;t2=t2.next)
				 {
					 if(t.data>t2.data)
					 {
						 temp=t2.data;
						 t2.data=t.data;
						 t.data=temp;
					 }
				 }
			 }
			 
		 }
	 }
	

	 
	 public static void main(String[] args) {
		 
		 int data;
		 Scanner sc = new Scanner(System.in);
		 MergeSortLL obj1 = new MergeSortLL();
		 MergeSortLL obj2 = new MergeSortLL();
		 int count=1;
		 System.out.println(" enter the first LinkedList :   ");
		 
		 while(count!=0)
		 {
			 
			 System.out.println(" enter the data");
			 data=sc.nextInt();
			 obj1.insertRight(data);
			 System.out.println(" do u want to continue to enter data   press 1  else  0 for exit");
			 count=sc.nextInt();
		 }
		 
	 System.out.println(" enter the second LinkedList :  ");
		 count=1;
		 while(count!=0)
		 {
			 
			 System.out.println(" enter the data");
			 data=sc.nextInt();
			 obj2.insertRight(data);
			 System.out.println(" do u want to continue to enter data   press 1  else  0 for exit");
			 count=sc.nextInt();
		 }
		 obj1.sort();
		 obj2.sort();
		 MergeSortLL obj3 =MergeSortLL.sort(obj1, obj2);
		 obj3.printList();
		
		 
 }
	 }
		 

