package Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

public abstract class Media_Decorator implements Media {
    protected Media decoratedMedia;
    public Media_Decorator(Media decoratedMedia){
        this.decoratedMedia = decoratedMedia;
    }
    public void play() {
        this.decoratedMedia.play();
    }
}
