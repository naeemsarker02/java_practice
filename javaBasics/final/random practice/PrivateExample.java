class Privatee {

    private String name = "Private example";

    public void print() {
        System.out.println(name);

    }

}

class PrivateExample {

    public static void main(String[] args) {
        Privatee pr = new Privatee();
        pr.print();
        // OK

    }

}