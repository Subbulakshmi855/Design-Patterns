public class PublicationDecorator extends BookDecorator {
    private String publicationyear;

    public PublicationDecorator(Book book, String publicationyear) {
        super(book);
        this.publicationyear = publicationyear;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Published Year: " + publicationyear + ")";
    }
}