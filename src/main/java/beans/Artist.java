package beans;

import java.io.Serializable;

public class Artist implements Serializable {

    private long id;
    private String name;
    private boolean isBand;
    private String language;

    public Artist() {
    }

    public Artist(long id, String name, boolean isBand, String language) {
        this.id = id;
        this.name = name;
        this.isBand = isBand;
        this.language = language;
    }
}
