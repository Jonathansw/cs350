import java.util.Scanner;

/**
 * Created by John on 5/10/2016.
 */
public abstract class Question {
    private String questionType = null;

    private String question;
    private String response;

    public Question(){
        System.out.println("Enter the question: ");
        Scanner s = new Scanner(System.in);
        this.question = s.nextLine();
    }

    public void setResponse(String _response){
        this.response = _response;
    }
    public void setQuestion(String _question){
        this.question = _question;
    }
    public void setQuestionType(String _questionType){
        this.questionType = _questionType;
    }

    public String getQuestion(){
        return question;
    }
    public String getResponse(){
        return response;
    }
    public String getQuestionType(){
        return  questionType;
    }

    public void display(){
        System.out.println("| " + this.getQuestionType() + " | ");
        System.out.println(this.getQuestion());
    }





}
