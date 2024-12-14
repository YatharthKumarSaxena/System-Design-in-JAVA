package Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern;

public class Audio implements Media{

    // Data Member
    private String fileName;

    // Parameterized Constructor
    public Audio(String fileName) {
        this.fileName = fileName;
    }

    @Override

    // Member Function 
    public void play() {
        System.out.println("Playing audio:- "+this.fileName);
    }
}
