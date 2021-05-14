package cal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface Model {

	 void addEvent(Event event);

	 void load(Path file);

	 void save(Path file);
	 
	 Iterable<Event> getEvents();
}