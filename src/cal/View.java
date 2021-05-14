package cal;

public interface View {

    void setup(Controller control);

    void show();

    void hide();

    void quit();

    void addEvent();

    void showEvents(Iterable<Event> events);

}
