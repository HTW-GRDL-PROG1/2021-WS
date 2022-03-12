package family;

public class Person {
    Name name;
    int age;
    Address address;
    Father father;
    Mother mother;

    public boolean isSibling(Person p) {
        return ((p.father == this.father) && (p.mother == this.mother));
    }

    public boolean isHalfSibling(Person p) {
        return ((p.father == this.father) ^ (p.mother == this.mother));
    }

    public boolean livesInTheSameCity(Person p) {
        return p.address.wohnort == this.address.wohnort;
    }

    public void compareAge(Person p) {

        String pIs = "same age";

        if (p.age > this.age) {
            pIs = "older";
        } else if (p.age < this.age) {
            pIs = "younger";
        }

        System.out.println(pIs);
    }
}
