package TwoQueue;

import java.util.Scanner;

public class TwoQueue {

	int queue[], front1, rear1, front2, rear2, Maxsize;

	void createQueue(int size) {

		Maxsize = size;
		front1 = 0;
		rear1 = -1;
		front2 = Maxsize - 1;
		rear2 = Maxsize;
		queue = new int[Maxsize];
	}

	void enqueue1(int e) {

		rear1++;
		queue[rear1] = e;
	}

	void enqueue2(int e) {

		rear2--;
		queue[rear2] = e;
	}

	int dequeue1() {
		int temp = queue[front1];
		front1++;
		return (temp);
	}

	int dequeue2() {
		int temp = queue[front2];
		front2--;
		return (temp);
	}

	boolean queue1IsFull() {
		if (rear1 == Maxsize / 2 - 1)
			return true;
		else
			return false;
	}

	boolean queue2IsFull() {
		if (rear2 == Maxsize / 2)
			return true;
		else
			return false;
	}

	boolean queue1IsEmpty() {
		if (front1 > rear1)
			return true;
		else
			return false;
	}

	boolean queue2IsEmpty() {
		if (front2 < rear2)
			return true;
		else
			return false;
	}

	void printQueue1() {

		for (int i = front1; i <= rear1; i++)
			System.out.println(queue[i]);
	}

	void printQueue2() {
		for (int i = front2; i >= rear2; i--)
			System.out.println(queue[i]);
	}

	public static void main(String[] args) {

		int ch, e;
		var obj = new TwoQueue();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Queue:");
		int s = in.nextInt();
		obj.createQueue(s);
		do {
			System.out.println(
					"1.Enqueue1\n2.Enqueue2\n3.Dequeue1\n4.Dequeue2\n5.Print Queue 1\n6.Print Queue 2 \n0.exit");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (!obj.queue1IsFull())// is not full
				{
					System.out.println("Enter Data:");
					e = in.nextInt();
					obj.enqueue1(e);
					System.out.println("Enqueued");
				} else
					System.out.println("Queue Full");
				break;

			case 2:
				if (!obj.queue2IsFull())// is not full
				{
					System.out.println("Enter Data:");
					e = in.nextInt();
					obj.enqueue2(e);
					System.out.println("Enqueued");
				} else
					System.out.println("Queue Full");
				break;

			case 3:
				if (!obj.queue1IsEmpty())// is not empty
				{
					e = obj.dequeue1();
					System.out.println("Dequeued:" + e);
				} else
					System.out.println("Queue Empty");
				break;

			case 4:
				if (!obj.queue2IsEmpty())// is not empty
				{
					e = obj.dequeue2();
					System.out.println("Dequeued:" + e);
				} else
					System.out.println("Queue Empty");
				break;

			case 5:

				if (!obj.queue1IsEmpty())// is not empty
				{
					System.out.println("Queue has:");
					obj.printQueue1();
				} else
					System.out.println("Queue Empty");
				break;

			case 6:

				if (!obj.queue2IsEmpty())// is not empty
				{
					System.out.println("Queue has:");
					obj.printQueue2();
				} else
					System.out.println("Queue Empty");
				break;

			case 0:
				System.out.println("Exiting ");
				break;
			default:
				System.out.println("Wrong option selected");
				break;
			}
		} while (ch != 0);
		in.close();
	}

}
