
/**
 * Lucas Waldrop
 * CH4PC3 - TestScores Class
 * Programming III - AP CS
 * 10/12/18
 */
public class TestScores {

    /**
     * This declares the three testScore fields.
     */
    private int testScoreOne;
    private int testScoreTwo;
    private int testScoreThree;
    private double testScoreAvg;
    public char letter;

    /**
     * The constructor method initializes the three testScore fields.
     */
    public TestScores(int one, int two, int three) {
        testScoreOne = one;
        testScoreTwo = two;
        testScoreThree = three;
    }

    /**
     * The setOne method allows an argument to store a value in the testScoreOne
     * field.
     */
    public void setOne(int S1) {
        testScoreOne = S1;
    }

    /**
     * The getOne method returns the value stored in the testScoreOne field.
     */
    public int getOne() {
        return testScoreOne;
    }

    /**
     * The setTwo method allows an argument to store a value in the testScoreTwo
     * field.
     */
    public void setTwo(int S2) {
        testScoreTwo = S2;
    }

    /**
     * The getTwo method returns the value stored in the testScoreTwo field.
     */
    public int getTwo() {
        return testScoreTwo;
    }

    /**
     * The setThree method allows an argument to store a value in the
     * testScoreThree field.
     */
    public void setThree(int S3) {
        testScoreThree = S3;
    }

    /**
     * The getThree method returns the value stored in the testScoreThree field.
     */
    public int getThree() {
        return testScoreThree;
    }

    /**
     * The testScoreAvg method gets the average of the three test scores
     * supplied.
     */
    public void testScoreAvg() {
        testScoreAvg = (testScoreOne + testScoreTwo + testScoreThree) / 3;
    }

    /**
     * The getAvg method returns the value stored in the testScoreAvg field.
     */
    
    public double getAvg(){
        return testScoreAvg;
    }
    
    /**
     * The gradeCalculator method finds the grade a test score should receive,
     * and initializes it as such.
     */
    public void gradeCalculator() {
        if (testScoreAvg >= 90) {
            letter = 'A';
        } else if (testScoreAvg >= 80) {
            letter = 'B';
        } else if (testScoreAvg >= 70) {
            letter = 'C';
        } else if (testScoreAvg >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
    }
    
    /**
     * The getGrade method returns the value stored in the letter field. 
     */
    
    public char getGrade(){
        return letter;
    }

}
