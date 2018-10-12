/**
 * Lucas Waldrop
 * CH4PC3 - TestScores
 * Programming III - AP CS
 * 10/12/18
 */
public class TestScoresDemo {

    public static void main(String[] args) {
        
        TestScores Dylan = new TestScores(75, 98, 81);
        Dylan.testScoreAvg();
        System.out.println(Dylan.getAvg());
        Dylan.gradeCalculator();
        System.out.println(Dylan.getGrade());
    }

}
