import java.util.*;
public class QueueLinearDemo 
{
     int front,rear,MaxSize,q[];
     
     void createQueue(int size)
     {
         front=0;
         rear=-1;
         MaxSize=size;
         q=new int[MaxSize];
     }
      void enqueue(int e)
      {
          rear++;
          q[rear]=e;
          //q[++rear]=e
      }
  
  boolean isFull()
  {
      if(rear==MaxSize-1)
          return true;
      else
          return false;
  }
  int dequeue()
  {
      int temp=q[front];
      front++;
      return(temp);
  }
  boolean isEmpty()
  {
      if(front>rear)
          return true;
      else
          return false;
  }
  
  void printQueue()
  {
      for(int i=front   ;i  <=rear   ; i++)
          System.out.println(q[i]);
  }


  public static void main(String args[])
  {
      int ch,e;
      QueueLinearDemo obj=new QueueLinearDemo();
      Scanner in=new Scanner(System.in);
      System.out.println("Enter size of queue:");
      int s=in.nextInt();
      obj.createQueue(s);
      do
      {
           System.out.println("1.enqueue\n2.dequeue\n3.print\n0.exit");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                   if(!obj.isFull())//is not full
                   {
                        System.out.println("Enter Data:");
                        e=in.nextInt();
                        obj.enqueue(e);
                        System.out.println("Enqueued");
                   }
                   else
                        System.out.println("Stack Full");
                   break;
                   
                case 2:
                   if(!obj.isEmpty())//is not empty
                   {
                        e=obj.dequeue();
                        System.out.println("Dequeued:"+e);
                   }
                   else
                        System.out.println("Queue Empty");
                   break;
                   
                
                 case 3:
                   if(!obj.isEmpty())//is not empty
                   {
                        System.out.println("Queue has:");
                        obj.printQueue();
                   }
                   else
                        System.out.println("Queue Empty");
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
  








