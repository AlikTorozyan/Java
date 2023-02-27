package methodsAndClasses;


public class FootballTeamInter {
    public static void main(String[] args) {
        FootballTeamInter player1 = new FootballTeamInter
                ("Andre", "Onana", "goalkeeper", "Kamerun", 23);
        FootballTeamInter player2 = new FootballTeamInter
                ("Federico", "Dimarko", "defender", "Italy", 32);
        FootballTeamInter player3 = new FootballTeamInter
                ("Matteo", "Darmian", "defender", "Ytaly", 36);
        FootballTeamInter player4 = new FootballTeamInter
                ("Franchesko", "Acherbi", "defender", "Italy", 15);
        FootballTeamInter player5 = new FootballTeamInter
                ("Allesandro", "Bastony", "defender", "Italy", 95);
        FootballTeamInter player6 = new FootballTeamInter
                ("Henrikh", "Mkhitaryan", "halfback", "Armenia", 22);
        FootballTeamInter player7 = new FootballTeamInter
                ("Khoakin", "Korrea", "halfbach", "Argentina", 11);
        FootballTeamInter player8 = new FootballTeamInter
                ("Nikolo", "Barella", "halfback", "Italy", 23);
        FootballTeamInter player9 = new FootballTeamInter
                ("Valentin", "Karboni", "halfback", "Argentina", 45);
        FootballTeamInter player10 = new FootballTeamInter
                ("Romero", "Lukaku", "forward", "Belgium", 90);
        FootballTeamInter player11 = new FootballTeamInter
                ("Lautaro", "Martines", "forward", "Argentina", 10);

        System.out.println(player11.getAllData());
    }

    private String name;
    private String surName;
    private String position;
    private String nationality;
    private int clubNumber;

    public FootballTeamInter(String name, String surName, String position, String nationality, int clubNumber) {
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.nationality = nationality;
        this.clubNumber = clubNumber;
    }

    public String getAllData() {
        return (name + " " + surName + "," + position + "," + nationality + ":");
    }
}
