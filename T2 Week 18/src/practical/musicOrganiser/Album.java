package practical.musicOrganiser;

/**
 * @author Will
 * Practical Week 18
 */

public class Album {
    private String title;
    private String artist;
    private String label;    

    public Album(String albumTitle, String albumArtist, String albumLabel) {
        title = albumTitle;
        artist = albumArtist;
        label = albumLabel;
    }
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void printAlbumInfo() {
        System.out.println(title + " by " + artist + ". Produced by " + label);
    }
}
