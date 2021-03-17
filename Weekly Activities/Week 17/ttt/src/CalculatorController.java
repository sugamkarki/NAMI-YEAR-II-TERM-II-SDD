
/**
 * CalculatorController
 */

import java.awt.event.*;

public class CalculatorController {

    public static CalculatorView calculatorView = new CalculatorView();
    static int addedNum;

    public static void main(String[] args) {
        calculatorView.setVisible(true);

        calculatorView.addEventListenerToSubmit(new SubmitButtonPressed());
    }

    private static class SubmitButtonPressed implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            new CalculatorModel(calculatorView.getNum1(), calculatorView.getNum2();
            addedNum = Integer.parseInt(calculatorView.getNum1()) + Integer.parseInt(calculatorView.getNum2());
//            System.out.println(addedNum);
            calculatorView.showAnswer(addedNum);
        }
    }

}