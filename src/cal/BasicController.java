package cal;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;

public class BasicController implements Controller {
	private final Model model;
	private final View view;
	private static final Path FILE = Path.of("events.csv");


	public BasicController(Model model, View view) {
		this.view = view;
		this.model = model;
	}
	@Override
	public void show() {
		if (Files.exists(FILE)) {
			load();
		}
		view.setup(this);
		view.show();
	}
	@Override

	public void load() {
		model.load(FILE);
		showEvents();
	}
	@Override
	public void save() {
		model.save(FILE); 
	}

	@Override
	public void quit() {
		System.out.println("Quit");
		save();
	}
	@Override
	public void startAddEvent() {
		view.addEvent();
		
	}
	@Override
	public void addEvent(String name, String date, String startTime, String endTime) {
		model.addEvent(new Event(name, LocalDate.parse(date), LocalTime.parse(startTime), LocalTime.parse(endTime))); 
		showEvents();
	}
	@Override
	public void showEvents() {
		view.showEvents(model.getEvents());    
	}
	@Override
	public void getController() {
		// TODO Auto-generated method stub
		
	}


}
