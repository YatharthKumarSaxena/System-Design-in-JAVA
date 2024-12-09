package Design_Patterns.Creational_Design_Pattern.Singleton_Design_Pattern.DataAccessLayer;
/*
* Singleton Design Pattern , so that only one instance / object can be created
 */
public class UserDatabase {
    private static UserDatabase instance;
    private UserDatabase(){
        // Makes the constructor private
    }
    // To ensure one thread execution in order to avoid multiple instance creation
    // JAVA is a multithreaded language
    // So when two threads are trying to call the get instance method
    // We might have the multiple instances created
    // To avoid the multiple object creation at the same time synchronized keyword is used
    public static synchronized UserDatabase getInstance(){
        if(instance == null){
            instance = new UserDatabase();
        }
        return instance;
    }
}
