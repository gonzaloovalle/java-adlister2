import models.Album;
import models.Author;
import models.Quote;

public class BeanTest {

    public static void main(String[] args) {
        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("Rush");
        album1.setName("Moving Pictures");
        album1.setReleaseDate(1981);
        album1.setSales(5460000);
        album1.setGenre("Progressive Rock");

        Album album2 = new Album();
        album2.setId(2);
        album2.setArtist("Queen");
        album2.setName("Queen II");
        album2.setReleaseDate(1974);
        album2.setSales(220000);
        album2.setGenre("Rock");

        System.out.println("Artist 1 is: " + album1.getArtist() + "\n Album 1 is: " + album1.getName());
        System.out.println("Artist 2 is: " + album2.getArtist() + "\n Album 2 is: " + album2.getName());

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("Kurt");
        author1.setLastName("Vonnegut");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Douglas");
        author2.setLastName("Adams");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("And so it goes...");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Don't Panic");
        quote2.setAuthor(author2);

        System.out.println("Quote 1 is: " + quote1.getContent() + ". Attributed to: " + quote1.getAuthor().getFirstName() + " " + quote1.getAuthor().getLastName());
        System.out.println("Quote 2 is: " + quote2.getContent() + ". Attributed to: " + quote2.getAuthor().getFirstName() + " " + quote2.getAuthor().getLastName());
    }

}
