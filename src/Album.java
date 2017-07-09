
import java.util.ArrayList;
import java.util.List;


public class Album {
    public String title = "";
    public String artist = "";
    public int duration = 0;
    public ArrayList<Track> tracks;
  

    Album(String title, String artist, int duration, ArrayList<Track> tracks) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.tracks = tracks;
    }
    
    
        
   @Override        //żeby ładniej wyglądało
   public String toString() { 
    return this.title;
    } 
}
