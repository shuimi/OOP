package genericlab;

public class Exc extends Exception{
    private int errorCode;
    
    public Exc(String message){
        this(0, message);
    }
    
    public Exc(int errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode(){
        return errorCode;
    }
    
}
