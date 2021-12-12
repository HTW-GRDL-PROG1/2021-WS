public class SuperheroTest {
    public static void main(String[] args) {

        // Erzeugen Sie ein SuperheroTeam mit passendem Teamnamen
        SuperheroTeam avengerTeam = new SuperheroTeam("Avengers");

        // Erzeuge zwei Superheroes und setzen Sie diese als Team-Captains
        Superhero s1 = new Superhero("Captain", "America", 1999);
        Superhero s2 = new Superhero("Iron", "Man", 1999);
        avengerTeam.setFirstCaptain(s1);
        avengerTeam.setSecondCaptain(s2);

        // Erzeugen Sie fünf weitere Superheroes als Teammitglieder
        Superhero s3 = new Superhero("Black", "Widow", 1999);
        Superhero s4 = new Superhero("Nick", "Fury", 1999);
        Superhero s5 = new Superhero("Maria", "Hill", 1999);
        Superhero s6 = new Superhero("Erik", "Selvig", 1999);
        Superhero s7 = new Superhero("Virginia", "Potts", 1999);

        avengerTeam.addSuperhero(s3);
        avengerTeam.addSuperhero(s4);
        avengerTeam.addSuperhero(s5);
        avengerTeam.addSuperhero(s6);
        avengerTeam.addSuperhero(s7);

        // Geben Sie die Attribute des Teams mittels der Getter auf der Konsole aus
        for (int i = 0; i < avengerTeam.getTeam().length; i++) {
            Superhero hero = avengerTeam.getTeam()[i];
            if (hero != null) {
                hero.print();
            }
        }

        // Löschen Sie einen Superhero aus dem Team
        avengerTeam.deleteSuperhero("Erik", "Selvig");

        // Rufen Sie print() auf
        avengerTeam.print();
    }
}
