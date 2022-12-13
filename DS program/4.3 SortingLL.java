import java.util.Scanner;

class Node
	{
	    int data;
	    Node next;
	    Node(int data)
	    {
	        this.data=data;
	        next=null;
	    }
	}

public class SortingLL {
	
	
	
	  Node root;
	  
	 void createLinkedList()
	 {
	     root=null;
	 }
	         
	 void insertLeft(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=n;
	     }
	     else
	     {
	         n.next=root;//1
	         root=n;//2
	     }
	   }
	 void deleteLeft()
	 {    
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t=root;//1
	         root=root.next;//2
	         System.out.println("Deleted:"+t.data);
	     }
	     }
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
	 void deleteRight()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t,t2;
	         t=t2=root;
	         while(t.next!=null)//2
	         {
	             t2=t;
	             t=t.next;
	         }
	         t2.next=null;//break link
	         System.out.println("Deleted:"+t.data);
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
	         t=root;
	         while(t!=null)//2
	         {
	             System.out.println(t.data);
	             t=t.next;
	         }
	         
	     }
	   }
	 void countNodes()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         int c=0;
	         t=root;
	         while(t!=null)//2
	         {
	             //System.out.println(t.data);
	             t=t.next;
	             c++;
	         }
	          System.out.println("Total nodes in list are:"+c);
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
		 
		 int choice=0 , data=0;
		 SortingLL obj = new SortingLL();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("");
		 do
		 {
			 System.out.println("1.Insert Left");
			 System.out.println("2.Delete Left");
			 System.out.println("3.Insert Right");
			 System.out.println("4.Delete Right");
			 System.out.println("5.print");
			 System.out.println("6.sort");
			 System.out.println("5.Exit");
			 
			 choice = sc.nextInt();
			 
			 switch(choice)
			 {
			 case 1:
				   System.out.println(" enter data");
				   data= sc.nextInt();
				       obj.insertLeft(data);
				       break;
				       
				       
			 case 5:
				    obj.printList();
				    break;
				    
			 case 6:
				    obj.sort();
				    break;
			 case 0:  System.out.println(" Exit");
				 
			 }
			 
		 }while(choice!=0);
	 }
}

