
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */
public class DynamicStackDemo 
{
     
    Node tos;
  
 void createStack()
 {
     tos=null;
 }
         
 void push(int data)
 {
     Node n=new Node(data);
     if(tos==null)
     {
         tos=n;
     }
     else
     {
         n.next=tos;//1
         tos=n;//2
     }
   }
 void pop()
 {    
     if(tos==null)
     {
         System.out.println("Stack Empty");
     }
     else
     {
         Node t=tos;//1
         tos=tos.next;//2
         System.out.println("Poped:"+t.data);
     }
 }
  void printStack()
 {
     if(tos==null)
     {
         System.out.println("Stack Empty");
     }
     else
     {
         Node t;
         t=tos;
         while(t!=null)//2
         {
             System.out.println(t.data);
             t=t.next;
         }
         
     }
   }
 void peek()
 {
     if(tos==null)
     {
         System.out.println("Stack Empty");
     }
     else
     {
        System.out.println("@ Peek:"+tos.data);
      }
         
   }
 public static void main(String args[])
  {
      int ch,e;
      DynamicStackDemo obj=new  DynamicStackDemo();
      Scanner in=new Scanner(System.in);
      obj.createStack();
      do
      {
           System.out.println("1.push\n2.pop\n3.peek\n4.print\n0.exit");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                           System.out.println("Enter Data:");
                           e=in.nextInt();
                           obj.push(e);
                           System.out.println("Pushed");
                           break;
                   
                case 2:
                           obj.pop();
                           break;
                   
                 case 3:
                            obj.peek();
                            break;  
                
                 case 4:
                             obj.printStack();
                              break;  
                
                 case 0:
                        System.out.println("Exiting ");
                        break;
                 
                 default:
                        System.out.println("Wrong option selected");
                        break;
           }
      }while(ch!=0);
      }
}
 
  


    

