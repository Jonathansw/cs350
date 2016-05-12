/**
 * Created by John on 5/12/2016.
 */
public class ShortAnswer extends Essay {
    private String questionType = "ShortAnswer";

    public ShortAnswer(){
        this.setMaxChar(10);
        this.setQuestionType(questionType);
    }

    public ShortAnswer(int maxChar){
        this.setMaxChar(maxChar);
    }

    public String getQuestionType() {
        return questionType;
    }

    public void displayQuestion(){
        super.displayQuestion();
    }

}
