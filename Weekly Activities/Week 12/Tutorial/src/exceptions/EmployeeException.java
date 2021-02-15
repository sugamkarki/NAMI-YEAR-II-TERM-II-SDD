package exceptions;

public class EmployeeException {
    String empId, payRate;

    public EmployeeException(String empId, String payRate) {
        this.empId = empId;
        this.payRate = payRate;
    }

}
