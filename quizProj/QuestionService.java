package quizProj;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1,"What_A","a","b","c","d","a");
        questions[1] = new Question(2,"What_B","a","b","c","d","b");
        questions[2] = new Question(3,"What_C","a","b","c","d","c");
        questions[3] = new Question(4,"What_D","a","b","c","d","d");
        questions[4] = new Question(5,"What_A","a","b","c","d","a");
    }

    public void playQuiz() {
        int i = 0;

        for(Question q : questions) {
            // System.err.println(q.getQuestion());
            System.err.println("Question no. : " + q.getId());
            System.err.println(q.getQuestion());
            System.err.println(q.getOpt1());
            System.err.println(q.getOpt2());
            System.err.println(q.getOpt3());
            System.err.println(q.getOpt4());
            
            // bad solution better use out of cicle
            Scanner sc = new Scanner(System.in);

            selection[i] = sc.nextLine();

            i++;
        }

        for(String s : selection) {
            System.err.println("your answer is : " + s);
        }
    }
}