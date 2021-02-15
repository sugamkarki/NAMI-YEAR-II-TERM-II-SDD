package exceptions;

public class Two {
    public static void main(String[] args) {
        int[] initialArray = { 1, 2, 3, 4, -5 };
        TestScores test = new TestScores(initialArray);
        System.out.println(test.returnAverage());
    }

}

class TestScores {
    int[] initialArray;

    // double average;
    public TestScores(int[] initialArray) {
        this.initialArray = initialArray;
    }

    public double returnAverage() {
        double average = 0;
        int length = this.initialArray.length;
        for (int i = 0; i < length; i++) {
            try {
                if(this.initialArray[i]<0||this.initialArray[int]>100){
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                //TODO: handle exception
                System.out.println("error in the var");
                break;
            }
            average+=this.initialArray[i];
        }
        return average;
    }
}