package methodsAndClasses;

public class Building {
    public String typeOfBuilding;// "panel" or "monolit"
    public int floor;
    public int apartmentInFloor;
    public static int twoRoomApartment;
    public static int threeRoomApartment;

    Building(String typeOfBuilding, int floor, int apartmentInFloor) {
        if ((floor >= 5 && floor <= 9) && (apartmentInFloor == 2 || apartmentInFloor == 3)) {
            this.floor = floor;
            this.apartmentInFloor = apartmentInFloor;
        } else {
            System.out.println("Input number for floor from 5 to 9 and for apartmentInFloor 2 or 3 ");

            System.exit(1);
        }
        if (apartmentInFloor == 2) {
            twoRoomApartment = threeRoomApartment = 1 * this.floor;
        }
        if (apartmentInFloor == 3) {
            threeRoomApartment = 2 * this.floor;
            twoRoomApartment = 1 * this.floor;
        }


    }

    public int getTwoRoomApartment() {
        return twoRoomApartment;
    }

    public void setTwoRoomApartment(int twoRoomApartment) {
        this.twoRoomApartment = twoRoomApartment;
    }

    public int getThreeRoomApartment() {
        return threeRoomApartment;
    }

    public void setThreeRoomApartment(int threeRoomApartment) {
        this.threeRoomApartment = threeRoomApartment;
    }
}


