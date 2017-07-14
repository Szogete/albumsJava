 
import java.util.ArrayList;

public class AlbumRepository 
{
    public static ArrayList <Album> getAlbums()
    {
        ArrayList <Album> albums  = new ArrayList <Album>();
        
        albums.add(getMichaelAlbum());
        albums.add(getPopekAlbum());
        albums.add(getSeasonAlbum());
                  
        return albums;
    }
    
    private static Album getPopekAlbum()
        {
            ArrayList <Track> tracks  = new ArrayList <Track>();
            tracks.add(new Track("fabryka hitow", 2.5));
            tracks.add(new Track("nie mow mu nic", 4.5));
            tracks.add(new Track("wakacje", 3.5));
            tracks.add(new Track("zakocznie", 1.5));
            
            Album album = new Album("krol albanii", "popek", 55, tracks);
                        
            return album;
        }
    
    private static Album getSeasonAlbum()
        {
            ArrayList <Track> tracks  = new ArrayList <Track>();
            tracks.add(new Track("summer", 2.5));
            tracks.add(new Track("winter", 4.5));
            tracks.add(new Track("fall", 3.5));
            tracks.add(new Track("autumn", 6.5));
            tracks.add(new Track("spring", 6.5));
            
            
            Album album = new Album("seasons", "vivaldi", 66, tracks);
                        
            return album;
        }
    
    private static Album getMichaelAlbum()
        {
            ArrayList <Track> tracks  = new ArrayList <Track>();
            tracks.add(new Track("thriller", 2.5));
            tracks.add(new Track("bili dzin", 4.5));
            tracks.add(new Track("bad", 3.5));
            
            Album album = new Album("thriller", "michael", 46, tracks);
                        
            return album;
        }
            
            
}
