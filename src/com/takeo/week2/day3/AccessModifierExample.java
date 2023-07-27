package com.takeo.week2.day3;

// Animal class with different access modifiers
// Parent class with different access modifiers
class Parent {
    public String publicName = "Public Parent"; // Public field
    protected String protectedName = "Protected Parent"; // Protected field
    String defaultName = "Default Parent"; // Default (package-private) field
    private String privateName = "Private Parent"; // Private field

    // Public method
    public void displayInfo() {
        System.out.println("Public method: " + publicName);
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method: " + protectedName);
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default method: " + defaultName);
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method: " + privateName);
    }
}

// Another class in the same package as Parent
class Sibling {
    // The Sibling class can access public and default fields and methods of the Parent class
    public void displayInfoFromSibling() {
        Parent parent = new Parent();
        System.out.println("Displaying info from Sibling class:");
        System.out.println("Public field: " + parent.publicName);
        parent.displayInfo();

        System.out.println("Default field: " + parent.defaultName);
        parent.defaultMethod();
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Public field: " + parent.publicName);
        parent.displayInfo();
        Sibling sibling = new Sibling();
        sibling.displayInfoFromSibling();
    }
}
