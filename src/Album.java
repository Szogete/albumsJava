
import java.util.ArrayList;
import java.util.List;


public class Album {
    private String title = "";
    private String artist = "";
    private double duration = 0;
    private List<Track> tracks;
    private int albumId = 0;    
  
    Album()
    {
    }
    
    Album(String title, String artist, double duration, List<Track> tracks) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.tracks = tracks;
    }
    
    public String getTitle() 
    {  
        return title;  
    }  
    
    public void setTitle(String title) 
    {  
        this.title = title;  
    }  
    
    public String getArtist() 
    {  
        return artist;  
    }  
    
    public void setArtist(String artist) 
    {  
        this.artist = artist;  
    }  
        
    public double getDuration() 
    {  
        return duration;  
    }  
    
    public void setDuration(double duration) 
    {  
        this.duration = duration;  
    }  
    
    public double getAlbumId() 
    {  
        return albumId;  
    }  
    
    public void setAlbumId(int AlbumId) 
    {  
        this.albumId = albumId;  
    }
    
    public void setTracks(List<Track> tracks) 
    {  
        this.tracks = tracks;  
    }  
    
    public List<Track> getTracks() 
    {  
        return tracks;  
    }  
    
   @Override        //żeby ładniej wyglądało
   public String toString() { 
    return this.title;
    } 
}
