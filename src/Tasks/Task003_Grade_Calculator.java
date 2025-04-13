package Tasks;

public class Task003_Grade_Calculator {

    public static void main(String[] args) {

        String score1 = args[0];
        System.out.println("Score = " + score1);

        int score = Integer.parseInt(score1);
        String grade = (score<0 || score>100) ? "Score should be between 0 and 100" : (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
        System.out.println("Grade = " + grade);

    }
}
