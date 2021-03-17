import java.awt.event.*;

public class CalculatorModel implements ActionListener {

    int num1, num2;

    public CalculatorModel() {

    }

    public CalculatorModel(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("hola");
    }


}
