package practical.musicOrganiser;

/**
 * @author Will
 * Practical Week 18
 */

public class MusicOrganiser {
    public static void main(String[] args) {
        Album album1 = new Album("True","Avicii","PRMD");
        Album album2 = new Album("Stories","Avicii","PRMD");
        Album album3 = new Album("Nothing But the Beat","David Guetta","EMI");
        
        MusicManager music = new MusicManager();
        
        music.buyNewAlbum(album1);
        music.buyNewAlbum(album2);
        music.buyNewAlbum(album3);
        
        music.printMusicCollectionInformation();
        System.out.println();
        
        music.sellAlbum(1);
        music.printMusicCollectionInformation();
        System.out.println();
        
        music.sellAlbumByName("Nothing But the Beat");
        music.printMusicCollectionInformation();
        System.out.println();
        
        music.sellAlbumByName("Nothing But the Beat");
        System.out.println();
        
        System.out.println("Album1 Purchased: " + music.checkAlbumPurchased(album1));
        System.out.println("Album2 Purchased: " + music.checkAlbumPurchased(album2));
        System.out.println();
        
        
        System.out.println("Collection Size: " + music.getMusicCollectionSize());
        System.out.println();
        
        music.getAlbum(0).printAlbumInfo();
        System.out.println();
        
        music.printMusicCollectionInformation();
        System.out.println();
        
        music.findArtist("Avicii");
        System.out.println();
        
        music.findArtist("Sebastian Ingrosso");
        System.out.println();
        
        
        music.buyNewAlbum(album2);
        music.buyNewAlbum(album3);
        music.printMusicCollectionInformation();
        System.out.println();
        
        music.printAllAlbumsByArtist("Avicii");
        System.out.println();
        
        music.removeArtist("Avicii");
        music.printMusicCollectionInformation();    
    }
}