import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class CalculatorView extends JFrame {

    private JPanel contentPane;
    private JTextField num1;
    private JTextField num2, num3;
    JButton submit;

    public CalculatorView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        num1 = new JTextField();
        num1.setBounds(127, 22, 96, 19);
        contentPane.add(num1);
        num1.setColumns(10);

        num2 = new JTextField();
        num2.setBounds(127, 73, 96, 19);
        contentPane.add(num2);
        num2.setColumns(10);

        submit = new JButton("New button");
        submit.setBounds(127, 148, 85, 21);
        contentPane.add(submit);

        num3 = new JTextField();
        num3.setBounds(127, 100, 96, 19);
        contentPane.add(num3);
        num3.setColumns(10);
    }

    public String getNum1() {
        return num1.getText();
    }

    public String getNum2() {
        return num1.getText();
    }

    public void addEventListenerToSubmit(ActionListener listener) {
        submit.addActionListener(listener);
    }

    public void showAnswer(int num) {
        num3.setText(String.valueOf(num));
        contentPane.add(num3);
    }


}
