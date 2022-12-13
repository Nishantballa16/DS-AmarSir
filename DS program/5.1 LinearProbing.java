import java.util.*;
public class LinearProbing {
	
	int arr[],e;
	
	public void createArray() {
		System.out.println("Enter size of Array :");
		Scanner scan = new Scanner(System.in);
		e = scan.nextInt();
		try {
			arr = new int[e];
			for(int i=0;i<=arr.length;i++) {
				System.out.println("Insert element ");
				e = scan.nextInt();
				int r = e%10;
				if(arr[r]== 0) {
					arr[r] = e;
					System.out.println("Inserted element "+ e);
				}
				else {
					while(arr[r]!=0){
						r++;
					}
					arr[r]=e;
					System.out.println("Inserted element "+ e);
				}
			}	
			scan.close();
		}
		catch(Exception ex) {
			System.out.println("Array Full....");
		}
	}
	
	void printArrray() {
		
			for(int i = 0; i <=arr.length-1; i++) {
				System.out.println(" "+arr[i]+" inserted at "+ i);	
			}
	}		
	
	public static void main(String args[]) {
		LinearProbing lp = new LinearProbing();
		lp.createArray();
		lp.printArrray();
	}
}
