package Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern;

public class Image_Adapter implements Media{

    // Data Member
    private Image image;

    // Parameterized Constructor
    public Image_Adapter(Image image) {
        this.image = image;
    }

    @Override
    // Member Function
    public void play() {
        this.image.display();
    }
}
