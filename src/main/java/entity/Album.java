package entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Album extends Item{
    @Column(name="album_artist")
    private String artist;
    @Column(name="album_etc")
    private String etc;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
