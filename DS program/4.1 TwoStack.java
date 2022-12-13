package TwoStack;
import java.util.Scanner;

public class TwoStack {

	int Maxsize, stack[], tos1, tos2;

	void createStack(int size) {

		Maxsize = size;
		tos1 = -1;
		tos2 = Maxsize;
		stack = new int[Maxsize];
	}

	void push1(int e) {

		tos1++;
		stack[tos1] = e;
	}

	void push2(int e) {

		tos2--;
		stack[tos2] = e;
	}

	boolean stack1IsFull() {

		if (tos1 == Maxsize / 2 - 1)
			return true;
		else
			return false;
	}

	boolean stack2IsFull() {

		if (tos2 == Maxsize / 2 )
			return true;
		else
			return false;
	}

	int pop1() {

		int temp = stack[tos1];
		tos1--;
		return (temp);
	}

	int pop2() {

		int temp = stack[tos2];
		tos2++;
		return (temp);
	}

	boolean stack1IsEmpty() {

		if (tos1 == -1)
			return true;
		else
			return false;
	}

	boolean stack2IsEmpty() {

		if (tos2 == Maxsize)
			return true;
		else
			return false;
	}

	int peek1() {

		return stack[tos1];
	}

	int peek2() {

		return stack[tos2];
	}

	void printStack1() {

		for (int i = tos1; i > -1; i--)
			System.out.println(stack[i]);
	}

	void printStack2() {

		for (int i = tos2; i < Maxsize; i++)
			System.out.println(stack[i]);
	}

	public static void main(String[] args) {

		int ch,e;
	      TwoStack obj=new TwoStack();
	      Scanner in=new Scanner(System.in);
	      System.out.println("Enter size of stack:");
	      int s=in.nextInt();
	      obj.createStack(s);
	      do
	      {
	           System.out.println("1.push1\n2.push2\n3.pop1\n4.pop2\n5.peek1\n6.peek2\n7.print stack 1\n8. print stack 2\n0.exit");
	           ch=in.nextInt();
	           switch(ch)
	           {
	               case 1:
	                   if(!obj.stack1IsFull())//is not full
	                   {
	                        System.out.println("Enter Data:");
	                        e=in.nextInt();
	                        obj.push1(e);
	                        System.out.println("Pushed");
	                   }
	                   else
	                        System.out.println("Stack Full");
	                   break;
	                   
	               case 2:
	                   if(!obj.stack2IsFull())//is not full
	                   {
	                        System.out.println("Enter Data:");
	                        e=in.nextInt();
	                        obj.push2(e);
	                        System.out.println("Pushed");
	                   }
	                   else
	                        System.out.println("Stack Full");
	                   break;
	                   
	                case 3:
	                   if(!obj.stack1IsEmpty())//is not empty
	                   {
	                        e=obj.pop1();
	                        System.out.println("Poped:"+e);
	                   }
	                   else
	                        System.out.println("Stack Empty");
	                   break;
	                   
	                case 4:
		                   if(!obj.stack2IsEmpty())//is not empty
		                   {
		                        e=obj.pop2();
		                        System.out.println("Poped:"+e);
		                   }
		                   else
		                        System.out.println("Stack Empty");
		                   break;
		                   
	                   
	                 case 5:
	                   if(!obj.stack1IsEmpty())//is not empty
	                   {
	                        e=obj.peek1();
	                        System.out.println("@ peek:"+e);
	                   }
	                   else
	                        System.out.println("Stack Empty");
	                   break;  
	                
	                 case 6:
		                   if(!obj.stack2IsEmpty())//is not empty
		                   {
		                        e=obj.peek2();
		                        System.out.println("@ peek:"+e);
		                   }
		                   else
		                        System.out.println("Stack Empty");
		                   break;
	                 case 7:
	                   if(!obj.stack2IsEmpty())//is not empty
	                   {
	                        System.out.println("Stack has:");
	                        obj.printStack1();
	                   }
	                   else
	                        System.out.println("Stack Empty");
	                   break; 
	                   
	                 case 8:
		                   if(!obj.stack2IsEmpty())//is not empty
		                   {
		                        System.out.println("Stack has:");
		                        obj.printStack2();
		                   }
		                   else
		                        System.out.println("Stack Empty");
		                   break;
		                   
	                 case 0:
	                        System.out.println("Exiting ");
	                        break;
	                        
	                 default:
	                        System.out.println("Wrong option selected");
	                        break;
	           }
	      }while(ch!=0);
	      in.close();
	      }
}


