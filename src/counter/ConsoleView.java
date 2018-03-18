package counter;

import java.util.Observable;
import java.util.Observer;

/**
 * Print the counter value on the console whenever it changes.
 */
//TODO Delare that this implements java.util.Observer
public class ConsoleView implements Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}
	
	public void update(Observable subject, Object info) {
		if(info != null)
			 System.out.println(info);
		System.out.println("Counter: "+counter.getCount());
	}

	//TODO Write the observer method
}
