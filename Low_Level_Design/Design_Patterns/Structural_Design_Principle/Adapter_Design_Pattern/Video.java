package Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern;

public class Video implements Media{

    // Data Member
    private String fileName;

    // Parameterized Constructor
    public Video(String fileName) {
        this.fileName = fileName;
    }

    @Override
    // Member Function
    public void play() {
        System.out.println("Playing Video:- " + this.fileName);
    }
}
