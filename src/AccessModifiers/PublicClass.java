package AccessModifiers;

// Class with public fields and methods
public class PublicClass {
    public int publicField = 40;

    public void publicMethod() {
        System.out.println("Public Method");
    }
}

// Another class in the same package accessing public members
class AccessPublicClassSamePackage {
    public static void main(String[] args) {
        PublicClass publicObj = new PublicClass();
        System.out.println("Public Field: " + publicObj.publicField);
        publicObj.publicMethod();
    }
}

// Another class in a different package accessing public members
class AccessPublicClassDifferentPackage {
    public static void main(String[] args) {
        PublicClass publicObj = new PublicClass();
        System.out.println("Public Field in Different Package: " + publicObj.publicField);
        publicObj.publicMethod();
    }
}
