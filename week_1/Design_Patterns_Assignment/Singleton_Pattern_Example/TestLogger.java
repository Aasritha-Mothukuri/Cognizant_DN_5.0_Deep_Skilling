public class TestLogger {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("Application started");
        l2.log("User logged in");
       

        // check if both references point to same object
        System.out.println(l1 == l2);
    }
}