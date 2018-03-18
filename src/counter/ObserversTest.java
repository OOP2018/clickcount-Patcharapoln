package counter;

import java.util.Scanner;

public class ObserversTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Counter counter = new Counter();
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		CounterView c = new CounterView(counter);  
		while(true) {
			System.out.println("How much?");
			int how = scan.nextInt();
			if(how == 0) System.exit(0);
			counter.add(how);
		}
	}
}
