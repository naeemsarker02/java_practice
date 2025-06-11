package mypackage;

public class SamePackage {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Same package:");
        System.out.println(obj.pub);   // ✅ public
        System.out.println(obj.prot);  // ✅ protected
        System.out.println(obj.def);   // ✅ default
        // System.out.println(obj.priv); ❌ Error: private not accessible
    }
}
