package cal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class Event{
	private final String name;
	private final LocalDate date;
	private final LocalTime startTime;
	private final LocalTime endTime;

	public Event(String name, LocalDate date, LocalTime startTime, LocalTime endTime) {
		this.name = name;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime; 
	}


	@Override
	public String toString() {
		return String.join(";", name ,date.toString(), startTime.toString(), endTime.toString());
	}

	public String toLine() {
		return toString();
	}

	public static Event parseLine(String line) {
		if(line == null) {
			throw new IllegalArgumentException("Line must be null");
		}

		String[] data = line.split(";");

		if(data.length != 4) {
			throw new IllegalArgumentException("line has the wrong format, expected 4 arguments separated by ;");
		}


		String name = data[0];
		LocalDate date = LocalDate.parse(data[1]);
		LocalTime startTime = LocalTime.parse(data[2]);
		LocalTime endTime = LocalTime.parse(data[3]);

		return new Event(name, date, startTime, endTime);
	}

}