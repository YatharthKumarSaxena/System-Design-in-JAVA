package Design_Patterns.Structural_Design_Principle.Composite_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

import java.util.ArrayList;
import java.util.List;

// Implementation of Composite Design Pattern
// This class is able to play multiple media like audio, image and video

public class Media_Collection implements Media {

    // Data Member
    private List<Media> mediaList = new ArrayList<>();

    // Parameterized Constructor
    public Media_Collection(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    // Member Function
    public void play() {
        for(Media media: mediaList){
            media.play();
        }
    }
    public void addMedia(Media media){
        mediaList.add(media);
    }
}
