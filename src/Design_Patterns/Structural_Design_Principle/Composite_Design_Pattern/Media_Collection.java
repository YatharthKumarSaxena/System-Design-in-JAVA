package Design_Patterns.Structural_Design_Principle.Composite_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

import java.util.ArrayList;
import java.util.List;

public class Media_Collection implements Media {
    private List<Media> mediaList = new ArrayList<>();

    public Media_Collection(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public void play() {
        for(Media media: mediaList){
            media.play();
        }
    }
    public void addMedia(Media media){
        mediaList.add(media);
    }
}
