
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

public class TrackTableModel extends AbstractTableModel
{
    private Track[] tracks;
    
    TrackTableModel(Track[] tracks)
    {
        this.tracks = tracks;
    }
    
    @Override
    public int getRowCount() {
        if(tracks == null)
            return 0;
        
        return tracks.length;        
    }

    @Override
    public int getColumnCount() {
        return 2;        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(tracks == null) return "";
        
        switch (columnIndex) {
           case 0:
              return tracks[rowIndex].getTrackName();
           case 1:
              return tracks[rowIndex].getDuration();
           default:
              return "";
         }
    }
    
    @Override
    public String getColumnName(int col) {
        switch (col) {
           case 0:
              return "Track name";
           case 1:
              return "Duration";
           default:
              return "";
         }
    }
}