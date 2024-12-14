package Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern;

// Implementation of Adapter Design Pattern

// This image adapter is trying to adapt the image
// And Convert the display method of image in the form of play method

// This ensures that Audio, Video and Image Adapter can be played at the Same time

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
