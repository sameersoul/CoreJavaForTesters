package THIS_SUPER;
class ParentClass {
    int y ;
}

class ChildClass extends ParentClass {
    void printParentField() {
    	this.y=40;
        // Using super to access the field of the parent class
        System.out.println("Parent field value using super: " +y);
    }
}

public class printFieldsUsingSuper {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();
        childObj.printParentField();
    }
}
