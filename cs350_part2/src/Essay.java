/**
 * Created by John on 5/12/2016.
 */
public class Essay extends Question {
    private String questionType = "Essay";

    private int maxChar = -1;

    public Essay(){
        this.setMaxChar(-1);
        this.setQuestionType(questionType);
    }

    public Essay(int maxChar){
        this.setMaxChar(maxChar);
        this.setQuestionType(questionType);
    }

    public int getMaxChar() {
        return maxChar;
    }

    public void setMaxChar(int maxChar) {
        this.maxChar = maxChar;
    }

    /**
     * Display the maximum number of characters warning
     */
    public void displayMaxChar(){
        if(this.getMaxChar() > 0){
            System.out.print(" (Warning: Max characters allowed " + this.getMaxChar());
            System.out.println(", remaining characters will be truncated.)");
        }
    }
    public void displayQuestion(){
        super.display();
        displayMaxChar();

    }

    public String getQuestionType() {
        return questionType;
    }

}
