public class AuthorDecorator extends BookDecorator {
    private String author;

    public AuthorDecorator(Book book, String author) {
        super(book);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Authors: " + author + ")";
    }
}