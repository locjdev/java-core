package models;

public class Position {
     int positionID;
     PositionName positionName;

     public Position(int positionID, PositionName positionName) {
          this.positionID = positionID;
          this.positionName = positionName;
     }

     @Override
     public String toString() {
          return "models.Position{" +
                  "positionID=" + positionID +
                  ", positionName=" + positionName +
                  '}';
     }
}
