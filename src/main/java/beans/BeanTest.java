package beans;

import java.util.Date;

public class BeanTest {

    public static void main(String[] args) {
        BeanTest test = new BeanTest();
        test.testBean();
    }

    public void testBean() {
        Artist artist = new Artist();
        artist.setId(1);
        artist.setName("Artist 1");
        artist.setIsBand(true);
        artist.setLanguage("English");

        Album album = new Album();
        album.setId(1);
        album.setArtist(artist);
        album.setName("Album 1");
        album.setReleaseDate(new Date());
        album.setSales(100.0);
        album.setGenre("Rock");

        System.out.println(album.getArtist().getName());
    }

}
