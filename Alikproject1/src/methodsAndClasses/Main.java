package methodsAndClasses;

class Main {
    public static void main(String[] args) {
        GasStove GasStove1 = new GasStove();
        int z = GasStove1.gasEnergy(false) + GasStove1.elEnergy(true);
        System.out.println(z);

        Sportsman sportsman1 = new Sportsman();
        double c = sportsman1.AverageOfConcurs(100, 90, 80, 50);
        System.out.println(c);

        Sportsman sportsman2 = new Sportsman();
        double d = sportsman1.AverageOfConcurs(65, 95, 70);
        System.out.println(d);

        Sportsman sportsman3 = new Sportsman();
        double e = sportsman3.AverageOfConcurs(100, 55, 80, 90);
        System.out.println(e);


        District NorTax = new District();
        System.out.println(NorTax.garden / NorTax.allBuildingsApartments);

        int m = sportsman1.compareSportsmanScors(sportsman1.getSportsman1(), sportsman2.getSportsman2());
        System.out.println(m);


    }


}
