package cal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileModel implements Model {
	private List<Event> events =  new ArrayList<>();

	@Override
	public void addEvent(Event event) {
		events.add(event);

	}

	@Override
	public void load(Path file) {
		try {
			List<String> lines = Files.readAllLines(file);
			for (String line : lines) {
				addEvent(Event.parseLine(line));
			}
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}

	}

	@Override
	public void save(Path file) {
		List<String> lines = new ArrayList<>();
		for (Event event : events) {
			lines.add(event.toLine());
		}
		try {
			Files.write(file, lines);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}

	}

	@Override
	public Iterable<Event> getEvents() {
		return Collections.unmodifiableList(events);
	}



}

