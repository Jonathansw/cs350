/**
 * Created by John on 5/12/2016.
 */
public class Response {
    String response;

    public Response(){
        this.response = "";
    }
    public Response(String _response){
        this.response = _response;
    }
    public String getResponse(){
        return this.response;
    }

    public void setResponse(String _response){
        this.response = _response;
    }

    public boolean equals(Response r) {
        if (this.getResponse().equals(r.getResponse())){
            return true;
        } else{
            return false;
        }
    }
}
