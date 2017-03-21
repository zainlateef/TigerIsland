/**
 * Created by jdavi on 3/11/17.
 */
public class Hexagon {
    public int level ;
    public int tileNumber ;
    public TerrainType terrain ;
    public OccupantType occupant ;

    public Hexagon(){
        level = 0;
    }

    public void setOccupantOnHex(OccupantType occupant){this.occupant = occupant;}

    public TerrainType getTerrain()
    {
        return terrain;
    }

    public int getLevel()
    {
        return level;
    }
}
