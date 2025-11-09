package quizProj;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1,"What_A","a","b","c","d","a");
        questions[1] = new Question(2,"What_B","a","b","c","d","b");
        questions[2] = new Question(3,"What_C","a","b","c","d","c");
        questions[3] = new Question(4,"What_D","a","b","c","d","d");
        questions[4] = new Question(5,"What_A","a","b","c","d","a");
    }

    public void displayQuestions() {
        for(Question q : questions) {
            // System.err.println(q.getQuestion());
            System.err.println(q);
        }
    }
}