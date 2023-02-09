package methodsAndClasses;

class City {

    String name;
    String country;
    int population= 15000;
    double area=8;
    City(String country,int population,double area){

    }

}
    class Main {
    public static void main(String[] args) {
        City town =new City("Armenia",15000,8);

        town.name="Goris";
        System.out.println(town.name);
        System.out.println(town.area);
        System.out.println(town.country);
        System.out.println(town.population);
    }
}