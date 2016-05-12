/**
 * Created by John on 5/12/2016.
 */
public class TrueFalse extends MultipleChoice {
    private String questionType = "TrueFalse";

    public TrueFalse(){
        this.addChoice("True");
        this.addChoice("False");
        this.setQuestionType(questionType);
    }

    public String getQuestionType() {
        return questionType;
    }
}
