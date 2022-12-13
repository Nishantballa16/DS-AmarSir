import java.util.*;
public class CircularQueueDemo 
{
 int front,rear,MaxSize,q[],count;
     
     void createQueue(int size)
     {
         front=0;
         rear=-1;
         count=0;
         MaxSize=size;
         q=new int[MaxSize];
     }
      void enqueue(int e)
      {
          rear=(rear+1)%MaxSize;
          count++;
          q[rear]=e;
          //q[++rear]=e
      }
  
  boolean isFull()
  {
      if(count==MaxSize)
          return true;
      else
          return false;
  }
  int dequeue()
  {
      int temp=q[front];
      front=(front+1)%MaxSize;
      count--;
      return(temp);
  }
  boolean isEmpty()
  {
      if(count==0)
          return true;
      else
          return false;
  }
  
  void printQueue()
  {
     int c=0,i=front;
     while(c<count)
     {
          System.out.println(q[i]);
          i=(i+1)%MaxSize;
          c++;
     }
  }

  public static void main(String args[])
  {
      int ch,e;
      CircularQueueDemo obj=new CircularQueueDemo();
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
                        System.out.println("Queue Full");
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
