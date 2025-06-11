package anotherpackage;

import mypackage.AccessModifiers;

public class OtherPackage extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Other package, non-subclass:");
        System.out.println(obj.pub);   // ✅ public
        // System.out.println(obj.prot); ❌ Error
        // System.out.println(obj.def);  ❌ Error
        // System.out.println(obj.priv); ❌ Error

        // Now let's test from subclass:
        OtherPackage sub = new OtherPackage();
        System.out.println("Other package, subclass:");
        System.out.println(sub.pub);   // ✅ public
        System.out.println(sub.prot);  // ✅ protected (through inheritance)
        // System.out.println(sub.def);  ❌ Error
        // System.out.println(sub.priv); ❌ Error
    }
    
}
