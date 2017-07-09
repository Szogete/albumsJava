
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TrackTableModel extends AbstractTableModel
{
    private ArrayList<Track> tracks;
    
    TrackTableModel(ArrayList<Track> tracks)
    {
        this.tracks = tracks;
    }
    
    @Override
    public int getRowCount() {
        return tracks.size();        
    }

    @Override
    public int getColumnCount() {
        return 2;        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
           case 0:
              return tracks.get(rowIndex).trackName;
           case 1:
              return tracks.get(rowIndex).duration;
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