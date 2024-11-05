package SOLID_Design_Principle.Library_Items;

// Open Closed Principle is followed here
// Closed Principle is followed here as the library item is implemented by DVD
// We cannot do any modification in it's function itself until and unless if we change the code of LibraryItem
// This means modification by Interface here is restricted hence closed principle is followed here

public class CD implements Library_Item{

    // Data Members

    // Default Data Member
    String Title;
    // Public Data Member
    public String uniqueId;
    // Private Data Member
    private double value;
    private String artist;

    // Public Parameterized Constructor

    public CD(String title, String uniqueId, double value, String artist) {
        Title = title;
        this.uniqueId = uniqueId;
        this.value = value;
        this.artist = artist;
    }

    // Member Functions


    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 20;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
