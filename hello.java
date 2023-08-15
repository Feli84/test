public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println("This is a new line.");

        Gruessen gruessen = new Gruessen("Dani");
        System.out.println(gruessen.gruesse());
    }
}