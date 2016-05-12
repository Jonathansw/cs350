import java.util.Scanner;

/**
 * Created by John on 5/10/2016.
 */
public class Test extends Survey{
    private Answer answer;

    public Test(){
        setAnswer(new Answer());

    }

    public Test(String _name, String _path){
        setAnswer(new Answer());
        this.setSurveyName(_name);
        this.setSurveyPath(_path);
    }

    public void setAnswer(Answer _answerCorrect) {
        this.answer = _answerCorrect;
    }
    public Answer getAnswer(){
        return this.answer;
    }

    public void display(){
        int count = 0;
        for(Question question : this.getQuestion()){
            count++;
            System.out.print("#" + count + " ");
            question.display();
            System.out.println("");
            System.out.print("Correct Ans: ");
            System.out.println(this.getAnswer().getAnswer(count - 1).toString());
        }
    }

}
