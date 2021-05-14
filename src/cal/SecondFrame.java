package cal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondFrame implements View {
    private Controller controller;
    private JFrame f = new JFrame();
    private JPanel eventPanel = new JPanel();
    private JTextField eventName = new JTextField("Event Name", 30);
    private JTextField dayOf = new JTextField("Enter date", 18);
    private JTextField sTime = new JTextField("Enter start time", 15);
    private JTextField eTime = new JTextField("Enter end time", 15);
    private JButton save = new JButton("Save");


    public SecondFrame() {
        f.setTitle("Create An Event");
        f.setSize(400, 200);
        f.setResizable(false);
        eventPanel.add(eventName);
        eventPanel.add(dayOf);
        eventPanel.add(sTime);
        eventPanel.add(eTime);
        eventPanel.add(save);
        f.add(eventPanel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                eventName.getText();
                dayOf.getText();
                sTime.getText();
                eTime.getText();

            }
        });
    }


    public void setup(Controller control) {

    }

    public void show() {

    }

    public void hide() {

    }

    public void quit() {

    }

    public void addEvent() {
        controller.addEvent(eventName.getText(), dayOf.getText(), sTime.getText(), eTime.getText());
    }

    public void showEvents(Iterable<Event> events) {
        System.out.println("Events:");
        for (Event event : events) {
            System.out.println(events);
        }
    }
}

