package methodsAndClasses;

public class District {
    public int allBuildingsApartments;
    public double garden = 4000;

    District() {

        Building building1 = new Building("panel", 5, 2);
        Building building2 = new Building("panel", 9, 3);
        Building building3 = new Building("panel", 8, 3);
        this.allBuildingsApartments = building1.getTwoRoomApartment() + building2.getTwoRoomApartment() +
                building3.getTwoRoomApartment() + building1.getThreeRoomApartment() + building2.getThreeRoomApartment() +
                building3.getThreeRoomApartment();
    }


}
