public class Main {
    public static void main(String[] args) {
        Book book = new BasicBook("Gang of Four (GoF)");

        Book authorBook = new AuthorDecorator(book, "Erich Gamma, John Vlissides, Richard Helm, Ralph Johnson ");
        Book fullBook = new PublicationDecorator(authorBook, "1994");

        System.out.println(fullBook.getDescription());
    }
}