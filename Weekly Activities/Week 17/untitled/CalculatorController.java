
/**
 * CalculatorController
 */
import java.awt.event.*;

public class CalculatorController {

    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        calculatorView.setVisible(true);

        calculatorView.addEventListenerToSubmit(new SubmitButtonPressed());
    }

}