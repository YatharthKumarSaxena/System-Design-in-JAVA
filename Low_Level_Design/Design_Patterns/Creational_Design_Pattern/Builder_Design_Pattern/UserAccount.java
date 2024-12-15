package Design_Patterns.Creational_Design_Pattern.Builder_Design_Pattern;

public class UserAccount {

    // Data Members
    private String username;
    private String password;

    // Parameterized Constructor
    private UserAccount(UserAccountBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    // Nested Class is made in order to ensure the Single Responsibility Principle of SOLID Design Principle
    // Why Nested Class Because UserAccountBuilder has no meaning if user account does not exist
    // This nested class will be used only if User Account exists
    // Hence UserAccountBuilder Class is dependent on UserAccount Class
    // An example in real life can be there is no importance or existence of heart if human body itself does not exist

    // Nested Class
    public static class UserAccountBuilder{

        // Data Members
        private final String username;
        private final String password;

        // Parameterized Constructor
        public UserAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Member Function
        public UserAccount build(){
            return new UserAccount(this);
        }
    }
}
