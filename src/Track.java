public class Track {

    public String trackName;
    public double duration;
    public int albumId = 0;
    public int trackId = 0;
      
    Track()
    {
    }
    
     public String getTrackName() 
    {  
        return trackName;  
    }  
    
    public void setTrackName(String TrackName) 
    {  
        this.trackName = trackName;  
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
    
    public double getTrackId() 
    {  
        return trackId;  
    }  
    
    public void setTrackId(int TrackId) 
    {  
        this.trackId = trackId;  
    }  
    
    Track(String trackName, double duration) {
        this.trackName = trackName; 
        this.duration = duration; 
    }
   
//    @Override
//    public String toString() 
//    { 
//        return this.trackName;
//    } 
}
