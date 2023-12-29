package AccessModifiers;
// Class with default fields and methods
class DefaultClass {
    int defaultField = 20;

    void defaultMethod() {
        System.out.println("Default Method");
    }
}

// Another class in the same package accessing default members
class AccessDefaultClass {
    public static void main(String[] args) {
        DefaultClass defaultObj = new DefaultClass();
        System.out.println("Default Field: " + defaultObj.defaultField);
        defaultObj.defaultMethod();
    }
}
