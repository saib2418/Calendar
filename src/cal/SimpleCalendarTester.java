package cal;

public class SimpleCalendarTester {


	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		GuiView g = new GuiView();
		//new Calendar().show();
		g.setup(calendar.getController()); 

	}
}
