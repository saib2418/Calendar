package cal;

public class Calendar {
	private final Model model;
	private final View view;
	private final BasicController controller;

	public Calendar() {
		model = new FileModel();
		view = new ConsoleView();
		controller = new BasicController(model, view);
		//gui = new GuiView();
	}
	public void show() {
		controller.show();
	}

	public void quit() {
		controller.quit();
	}

	public void save() {
		controller.save();
	}

	public Controller getController() {
		return controller;
	}

	public static void main (String [] args) {
		Calendar calendar = new Calendar();

		calendar.show();
		calendar.controller.startAddEvent();
		calendar.controller.showEvents();
		calendar.quit();
	}
}

