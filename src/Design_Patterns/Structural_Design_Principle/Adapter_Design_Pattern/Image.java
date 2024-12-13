package Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern;

public class Image {

    // Data Members
    private String fileName;

    // Parameterized Constructor
    public Image(String fileName) {
        this.fileName = fileName;
    }

    // Member Functions
    public void display(){
        System.out.println("Displaying Image file:- "+this.fileName);
    }
}
