package cal;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ConsoleView implements View {
	private Controller controller;
	@Override
	public void setup(Controller controller) {
		this.controller = controller;
		System.out.println("Console Ready!");
	}

	@Override
	public void show() {
		System.out.println("Hello, welcome to the Calendar Manager!");
	}
	@Override
	public void hide() {
		System.out.println(".....");

	}
	@Override
	public void quit() {
		System.out.println("Goodbye!\n" + 
				"Console shutdown.");

	}
	@Override
	public void addEvent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Event Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Date in yyyy/mm/dd format: ");
		String date = sc.nextLine();

		System.out.println("Enter Start Time: ");
		String startTime = sc.nextLine();

		System.out.println("Enter End Time: ");
		String endTime = sc.nextLine();

		controller.addEvent(name, date, startTime, endTime );

	}

	@Override
	public void showEvents(Iterable<Event> events) {
		System.out.println("Events:");
		for(Event event: events) {
			System.out.println(events); 
		}
	}


}
