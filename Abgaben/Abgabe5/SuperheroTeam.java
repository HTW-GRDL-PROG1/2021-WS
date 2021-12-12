public class SuperheroTeam {
    String teamName;
    int depot = 0;
    Superhero firstCaptain;
    Superhero secondCaptain;
    Superhero[] team = new Superhero[10];

    public SuperheroTeam(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getDepot() {
        return this.depot;
    }

    public Superhero getFirstCaptain() {
        return this.firstCaptain;
    }

    public void setFirstCaptain(Superhero firstCaptain) {
        this.firstCaptain = firstCaptain;
    }

    public Superhero getSecondCaptain() {
        return this.secondCaptain;
    }

    public void setSecondCaptain(Superhero secondCaptain) {
        this.secondCaptain = secondCaptain;
    }

    public Superhero[] getTeam() {
        return this.team;
    }

    public void addSuperhero(Superhero newHero) {
        for (int i = 0; i < this.team.length; i++) {
            if (this.team[i] == null) {
                this.team[i] = newHero;
                return;
            }
        }
    }

    public void deleteSuperhero(String firstName, String lastName) {
        for (int i = 0; i < this.team.length; i++) {
            if (this.team[i] != null) {
                Superhero currentSuperhero = this.team[i];
                if (currentSuperhero.getFirstName() == firstName && currentSuperhero.getLastName() == lastName) {
                    this.team[i] = null;
                }
            }
        }
    }

    public void print() {
        System.out.println(toString());
        for (int i = 0; i < this.team.length; i++) {
            Superhero teamMember = this.team[i];
            if (teamMember != null) {
                System.out.println(teamMember.getFirstName() + ", " + teamMember.getLastName());
            }

        }

    }

    @Override
    public String toString() {
        return "{" +
                " teamName='" + getTeamName() + "'" +
                ", depot='" + getDepot() + "'" +
                ", firstCaptain='" + getFirstCaptain() + "'" +
                ", secondCaptain='" + getSecondCaptain() + "'" +
                "}";
    }

}