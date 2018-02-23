package practical.musicOrganiser;

/**
 * @author Will
 * Practical Week 18
 */

import java.util.*;

public class MusicManager {
	private int musicCollection_Max;
    private ArrayList<Album> musicCollection;
	private Album album;
 
    public MusicManager() {
    		musicCollection = new ArrayList<Album>();
    }
    
    public void buyNewAlbum(Album newAlbum) {
    		if(musicCollection.size() <= musicCollection_Max) {
    			musicCollection.add(newAlbum);
    			System.out.println("New Album added");
    		} else {
    			System.out.println("Collection too large");
    		}
    }
    
    public void sellAlbum(int index) {
    		musicCollection.remove(index);
    }
    
    public void sellAlbumByTitle(String albumTitle) {
        Iterator<Album> collection_Iterator = musicCollection.iterator();
        Album currentAlbum;
        String currentAlbum_Title;
        boolean found = false;
        
        while(collection_Iterator.hasNext()) {
        		currentAlbum = collection_Iterator.next();
        		currentAlbum_Title = currentAlbum.getTitle();
        		
        		if(currentAlbum_Title.equals(albumTitle)) {
        			collection_Iterator.remove();
        			System.out.println(albumTitle + " has been sold");
        		}
        		
        		break;
        }
        
        if(!found) {
        		System.out.println("Album not found");
        }
    }
    
    public boolean checkAlbumPurchased(Album albumToCheck) {
    		int index = 0;
    		boolean found = false;
    		Album currentAlbum;
    		String albumName;
    		
    		while(index < musicCollection.size() && !found) {
    			currentAlbum = musicCollection.get(index);
    			albumName = currentAlbum.getTitle();
    			
    			if(albumName.equals(albumToCheck)) {
    				currentAlbum.printAlbumInfo();
    				found = true;
    			} else {
    				index++;
    			}
    		}
    		
    		if(!found) {
    			System.out.println("Album not found");
    		}
    		
		return found;
    }

    public int getMusicCollectionSize() {
    		return musicCollection.size();
    }

    public Album getAlbum(int index) {
        return musicCollection.get(index);
    }

    public void printInfo() {
        System.out.println("Album Artist: " + album.getArtist());
        System.out.println("Album Title: " + album.getTitle());
        System.out.println("Album Label: " + album.getLabel());
       
    }

    public void printAllAlbumsByArtist(String artistToPrint) {
        for(Album album: musicCollection) {
        		if(album.getArtist().equals(artistToPrint)) {
        			album.printAlbumInfo();
        		}
        }
    }

    public void findArtist(String searchArtist) {
	    	Iterator<Album> collection_Iterator = musicCollection.iterator();
        Album currentAlbum;
        String currentAlbum_Artist;
        boolean found = false;
        
        while(collection_Iterator.hasNext()) {
        		currentAlbum = collection_Iterator.next();
        		currentAlbum_Artist = currentAlbum.getArtist();
        		
        		if(currentAlbum_Artist.equals(searchArtist)) {
        			collection_Iterator.remove();
        			System.out.println(searchArtist + " found");
        		}
        }
        
        if(!found) {
        		System.out.println("Artist not found");
        }
    }

    public void removeArtist(String artistToRemove) {
    		int index = 0;
		boolean found = false;
		Album currentAlbum;
		String albumArtist;
		
		while(index < musicCollection.size() && !found) {
			currentAlbum = musicCollection.get(index);
			albumArtist = currentAlbum.getArtist();
			
			if(albumArtist.equals(artistToRemove)) {
				currentAlbum.setArtist("");
				found = true;
			} else {
				index++;
			}
		}
		
		if(!found) {
			System.out.println("Album not found");
		}
    }
}
