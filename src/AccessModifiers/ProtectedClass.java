package AccessModifiers;

// Class with protected fields and methods
public class ProtectedClass {
    protected int protectedField = 30;

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
}

// Another class in the same package accessing protected members
class AccessProtectedClassSamePackage {
    public static void main(String[] args) {
        ProtectedClass protectedObj = new ProtectedClass();
        System.out.println("Protected Field: " + protectedObj.protectedField);
        protectedObj.protectedMethod();
    }
}

// Subclass in a different package accessing protected members
class SubClassInDifferentPackage extends ProtectedClass {
    public static void main(String[] args) {
        SubClassInDifferentPackage subObj = new SubClassInDifferentPackage();
        System.out.println("Protected Field in Subclass: " + subObj.protectedField);
        subObj.protectedMethod();
    }
}

// Another class in a different package accessing protected members
class AccessProtectedClassDifferentPackage {
    public static void main(String[] args) {
        ProtectedClass protectedObj = new ProtectedClass();
        System.out.println("Protected Field in Different Package: " + protectedObj.protectedField);
        protectedObj.protectedMethod();
    }
}
