package SOLID_Design_Principle.Library_Items;
import SOLID_Design_Principle.main.LateFeeCalculate;

// Library Item contains here the information about the items of library
// Hence Single Responsibility Principle is followed here


// Open Closed Principle here is followed as other library item can be added without any modification in code

// Here We can observe that our interface is not fat as well as it handle single responsibility of returning the values
// Interface segregation is done here because we found that interface Library_Item was doing two different functions

public interface Library_Item extends LateFeeCalculate {
    // Methods of Library_Item
    String getTitle();
    String getUniqueId();
    double getValue();
}
