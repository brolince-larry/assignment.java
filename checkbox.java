import java.awt.*;

class Lan {

    Lan() {
        Frame f = new Frame();

        Label li = new Label("Select a language");
        li.setBounds(100, 50, 200, 30);
        li.setBackground(Color.LIGHT_GRAY); // Set background color for the label
        f.add(li);

        Checkbox c2 = new Checkbox("Hindi");
        c2.setBounds(100, 100, 100, 30);
        c2.setBackground(Color.PINK); // Set background color for the checkbox
        f.add(c2);

        Checkbox c3 = new Checkbox("English");//create checkbox
        c3.setBounds(100, 150, 100, 30);
        c3.setBackground(Color.CYAN); // Set background color for the checkbox
        f.add(c3);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setBackground(Color.ORANGE); // Set background color for the frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Lan();
    }
}
