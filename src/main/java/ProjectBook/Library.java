package ProjectBook;

public class Library {
    public static void main(String[] args) {

        final String appName = "Library v0.3";

        Book book1 = new Book("Zawód Programista","Maciej Aniserowicz", 2017, 288,
                "I don't no","9788394905101");

        Book book2 = new Book("Java EE6", "Krzysztof Rychlicki", 2010, 221, "Helion",
                "9788324626595");

        Book book3 = new Book("Włam się do mózgu", "Radek Kotlarski",2019, 286,
                "Altenberg", "9788394871215");


        System.out.println("Books available in library!");
        book1.description();
        book2.description();
        book3.description();

    }
}
