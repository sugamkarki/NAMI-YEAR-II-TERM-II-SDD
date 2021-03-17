import java.awt.event.*;

public class CalculatorModel implements ActionListener {

    String num1, num2;
    int addedNum;
//    public CalculatorModel() {
//
//    }

    public CalculatorModel(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.addedNum = Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public int getAddedNum() {
        return this.addedNum;
    }


}
