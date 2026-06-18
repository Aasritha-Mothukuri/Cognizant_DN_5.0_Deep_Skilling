public class Logger {

    //Create static object reference
    private static Logger instance;

    //private constructor
    private Logger(){
        System.out.println("Logger Instance Created...");
    }

    //Public method to access object
    public static Logger getInstance(){
        if(instance == null){

            //create object only once
            instance = new Logger();
        }
        return instance;
    }

    public void log(String messsage) {
        System.out.println("LOG:"+messsage);
    }
}
