package SOLID_Design_Principle.Library_Items;

// Open Closed Principle is followed here
// Closed Principle is followed here as the library item is implemented by DVD
// We cannot do any modification in it's function itself until and unless if we change the code of LibraryItem
// This means modification by Interface here is restricted hence closed principle is followed here

public class Books implements Library_Item{

    // Private Data Member
    private String Title;
    private String uniqueId;
    private String author;
    private double value;

    // Public Parameterized Constructor
    public Books(String Title, String uniqueId, String author, double value){
        this.Title = Title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

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
        return days * 10;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
