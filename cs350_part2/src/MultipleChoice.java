import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by John on 5/12/2016.
 */
public class MultipleChoice extends Question {
    private String questionType = "MultipleChoice";
    private ArrayList<String> choices;

    public MultipleChoice(){
        choices = new ArrayList<String>();
    }
    public MultipleChoice(int numberOptions){
        choices = new ArrayList<String>();
        this.setQuestionType(questionType);

        //User has to enter more than 1 or else you can't create a multiple choice
        if(numberOptions > 0){
            create();
        }
    }

    public void display(){
        super.display();
        displayChoices();
    }

    public void displayChoices(){
        int count = 1;

        Iterator<String> iterator = choices.iterator();
        while(iterator.hasNext()){
            System.out.println(" ("+ count + ") " + iterator.next());
            count++;
        }
    }

    public void create(){
        boolean addAnother = true;

        while(addAnother){
            String answer;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter choice text: (type '\\done' or '\\d' when done)");
            answer = s.nextLine();
            if(answer.equals("\\done") || answer.equals("\\d")){
                addAnother = false;
            } else{
                this.addChoice(answer);
            }
        }
    }

    public void addChoice(String _option){
        choices.add(_option);
    }

    public String getQuestionType(){
        return questionType;
    }
    public int getQuestionSize(){
        return choices.size();
    }


}
