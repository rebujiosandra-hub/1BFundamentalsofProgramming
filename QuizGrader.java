public class QuizGrader {
// Ito ang unang class code, kung saan dapat parehas sya sa pangalan ng file

    public static void main(String[] args) {
// Ito naman ang unang main method kung saan dito magsisimula ang program

        // Part 1 : Pagset-up ng mga Arrays
        char[] answerKey = {'A', 'B', 'C', 'D', 'A', 'C', 'B', 'D', 'A', 'B'};
// Ito ang tamang sagot sa bawat tanong
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'A', 'C', 'A', 'D', 'A', 'B'};
// Ito naman ang sagot ng mga students

        // Part 2: Pag-grade sa mga quiz
        int correctCount = 0;
        // Nagsimula a zero ang bilang ng mga tamang sagot
        for (int i = 0; i < answerKey.length; i++) {
// Iche-check sng lahat ng sagot sa array
            if (Character.toUpperCase(studentAnswers[i]) == answerKey[i]) {
// Icocompare kung parehas ang sagot ng mga  students at answer key
                correctCount++;
                // Dadagdagan ng 1 kapag tama ang sagot.
            } else {

                // Ipapakita kung anong question ang mali.
                System.out.println("Question " + (i + 1) +
                        ": Incorrect. You answered " + studentAnswers[i] +
                        ", correct answer is '" + answerKey[i] + "'.");
            }
        }
        // Part 3 : Pagcalculate ng score
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;
        // Kinukuha ang percentage ng tamang sagot.
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        // Ipinapakita ang total number of correct answers.
        System.out.println("Score: " + scorePercentage + "%");
        // Ipinapakita ang final percentage.

        // Part 4 : Pass or Fail Logic

        if (scorePercentage >= 70.0) {
            // Tinitingnan kung pasado o bagsak ang score.
            System.out.println("Result: PASS");
            // Kapag 70% pataas, PASS.
        } else {
            System.out.println("Result: FAIL");
            // Kapag mas mababa sa 70%, FAIL.
        }
    }

}


