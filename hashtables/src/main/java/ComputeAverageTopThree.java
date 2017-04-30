import java.util.Iterator;

public class ComputeAverageTopThree {

    /*
    13.11

    Write a program which takes as input a file containing test
    scores and returns the student who has the maximum score
    averaged across his or her top three tests. If the student
    has fewer that three test scores, ignore that student.
     */

    public static class NameScore {
        public String name;
        public Integer score;

        public NameScore(String name, Integer score) {
            this.name = name;
            this.score = score;
        }
    }

    public static String findStudent(Iterator<NameScore> iterator) {

        return "";
    }
}
