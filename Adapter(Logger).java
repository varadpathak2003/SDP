//Target Interface
interface ModernLogger{
    void logMessage(int level,String message);
}
//Adaptee
class LegacyLogger{
    
    String message;
    LegacyLogger(String message){
        this.message=message;
    }
    void logMessage(){
        System.out.println("Message" + message);
    }
}

//Adapter
class ModernLoggerAdapter implements ModernLogger{
    
    @Override
    public void logMessage(int level,String message){
        String finalMessage="Level : "+level+" Message : " +message;
        LegacyLogger logger=new LegacyLogger(finalMessage);
        logger.logMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        ModernLoggerAdapter adapter=new ModernLoggerAdapter();
        adapter.logMessage(5,"Hello");
    }
}
