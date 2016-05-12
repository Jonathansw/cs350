import java.util.*;

/**
 * Created by John on 5/10/2016.
 */
public class Survey {
    private String surveyName;
    private String surveyPath;

    private ArrayList<Question> questions;


    public Survey(){
        questions = new ArrayList<Question>();
        this.surveyName = "";
        this.surveyPath = "";

    }
    public Survey(String _name, String _path){
        questions = new ArrayList<Question>();
        this.surveyPath = _path;
        this.surveyName = _name;
    }

    //Setters
    public void setSurveyName(String _name){
        this.surveyName = _name;
    }
    public void setQuestions(ArrayList<Question> _questions){
        this.questions = _questions;
    }
    public void setSurveyPath(String _path){
        this.surveyPath = _path;
    }

    //Getters
    public int getQuestionSize(){
        return questions.size();
    }
    public String getSurveyName(){
        return this.surveyName;
    }
    public String getSurveyPath(){
        return this.surveyPath;
    }
    public ArrayList<Question> getQuestion(){
        return this.questions;
    }
    public Question getQuestionID(int _id){
        if(_id < questions.size()){
            return questions.get(_id);
        } else {
            return null;
        }
    }

    public void addQuestion(Question question){
        this.questions.add(question);
        System.out.println("Question #" + this.getQuestion().size() + " added.");
    }

    public void display(){
        int count = 0;
        for (Question question : this.questions){
            count++;
            System.out.println("#" + count + " ");
            question.display();
            System.out.println("");
        }
    }

}
