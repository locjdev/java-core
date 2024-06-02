public class Position {
     int positionID;
     PositionName positionName;

     public Position(int positionID, PositionName positionName) {
          this.positionID = positionID;
          this.positionName = positionName;
     }

     @Override
     public String toString() {
          return "Position{" +
                  "positionID=" + positionID +
                  ", positionName=" + positionName +
                  '}';
     }
}
