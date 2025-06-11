class parent{
    public int pAge = 35;
    public void parentMethod(){
        System.out.println("Parent method");
    }
}

class child extends parent{
    public int age = 5;
    public void childMethod(){
        parentMethod();
        System.out.println("in child method -> fathers age "+pAge+" child age "+age);
    }
}

public class inherit {
    public static void main(String[] args) {
        child c = new child();
        c.childMethod();

        c.parentMethod();//calling parent method from child class using object of child class

        System.out.println("parents age : "+c.pAge);
    }
}
