package mypackage;

public class AccessModifiers {
    public String pub = "Public";
    protected String prot = "Protected";
    String def = "Default";
    private String priv = "Private";

    public void showAccess() {
        System.out.println("Inside same class:");
        System.out.println(pub);   // ✅ allowed
        System.out.println(prot);  // ✅ allowed
        System.out.println(def);   // ✅ allowed
        System.out.println(priv);  // ✅ allowed
    }
}