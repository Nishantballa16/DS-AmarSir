
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
public class DynamicQueueDemo
{
     Node front,rear;
  
 void createQueue()
 {
     front=rear=null;
 }
         
 void Dequeue()
 {    
     if(front==null)
     {
         System.out.println("Queue Empty");
     }
     else
     {
         Node t=front;//1
         front=front.next;//2
         System.out.println("Dequeued:"+t.data);
     }
     }

  void Enqueue(int data)
 {
     Node n=new Node(data);
     if(front==null)
     {
         front=rear=n;
     }
     else
     {
         rear.next=n;
         rear=n;
     }
   }

   void printQueue()
 {
     if(front==null)
     {
         System.out.println("Queue Empty");
     }
     else
     {
         Node t;
         t=front;
         while(t!=null)//2
         {
             System.out.println(t.data);
             t=t.next;
         }
         
     }
   }
   public static void main(String args[])
  {
      int ch,e;
      DynamicQueueDemo obj=new  DynamicQueueDemo();
      Scanner in=new Scanner(System.in);
      obj.createQueue();
      do
      {
           System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n0.exit");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                           System.out.println("Enter Data:");
                           e=in.nextInt();
                           obj.Enqueue(e);
                           System.out.println("Enqueued");
                           break;
                   
                case 2:
                           obj.Dequeue();
                           break;
                   
                 case 3:
                            obj.printQueue();
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
 

