package cal;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Controller {
	void show();

	void load(); 

	void save();

	void addEvent(String name, String date, String startTime, String endTime);

	void startAddEvent();

	void showEvents(); 

	void quit();
	
	void getController();
}
