import java.util.ArrayList;

/**
 * Created by John on 5/10/2016.
 */
public class Answer {
    ArrayList<Response> correct;

    public Answer(){
        this.correct = new ArrayList<Response>();
    }

    public Answer(ArrayList<Response> _answers){
        this.setAnswer(_answers);
    }

    public Answer(String _answer){
        this.correct = new ArrayList<Response>();
        Response response = new Response(_answer);
        this.addAnswer(response);
    }

    public Answer(Response _response){
        this.correct = new ArrayList<Response>();
        this.addAnswer(_response);
    }

    public ArrayList<Response> getCorrectAns(){
        return this.correct;
    }
    public void displayAnswerSheet(){
        for(Response r : correct){
            System.out.println(r.toString());
        }
    }
    public void setAnswer(ArrayList<Response> _answer){
        this.correct = _answer;
    }
    public Response getAnswer(int i){
        return this.correct.get(i);
    }
    public void addAnswer(Response _response){
        this.correct.add(_response);
    }

    public void addAns(String _answer){
        Response response = new Response();
        response.setResponse(_answer);

        this.correct.add(response);
    }
}
