package pkg13.pkg06.exc;

public class myException extends Exception {
    private int errorCode;
    
    public myException(String message){
        this(0, message);
    }
    
    public myException(int errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode(){
        return errorCode;
    }
    
}
