package family;

public class Mother extends Person {
    Person child1;
    Person child2;
    Person child3;

    public Mother(Name name, int age, Address address, Father father, Mother mother, Person child1, Person child2,
            Person child3) {
        super(name, age, address, father, mother);
        this.child1 = child1;
        this.child2 = child2;
        this.child3 = child3;
    }
}
