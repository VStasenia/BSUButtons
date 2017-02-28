package by.bsu.btn;

import by.bsu.btn.func.SumFunction;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JLabel resultLabel;

    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(640, 480);
        main.setVisible(true);
    }

    public Main() {
        super("Buttons");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        add(createFieldsPanel());
        add(createButtonsPanel());
        add(createResultPanel());
    }

    private JPanel createFieldsPanel() {
        JPanel result = new JPanel();
        result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));
        field1 = new JTextField("Field 1");
        field2 = new JTextField("Field 2");
        field3 = new JTextField("Field 3");
        result.add(field1);
        result.add(field2);
        result.add(field3);
        return result;
    }

    private JPanel createButtonsPanel() {
        JPanel result = new JPanel();
        JButton btn = new JButton("a + b + c");
        btn.addActionListener(e -> {
            SumFunction sumFunction = new SumFunction();
            String strResult = sumFunction.func(field1.getText(), field2.getText(), field3.getText());
            resultLabel.setText(strResult);
        });
        result.add(btn);
        return result;
    }

    private JPanel createResultPanel() {
        JPanel result = new JPanel();
        resultLabel = new JLabel();
        result.add(resultLabel);
        return result;
    }

}
