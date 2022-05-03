/**
 * Person class will be inherited from another classes [Citizen, Professional].
 * Why it is abstract class?  - To be restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 */

public abstract class Person {
    // Static >> to be shared between all objects
    private static int civilId_Generator = 123456;

    // Declare basics attributes
    private int identity;
    private String nickname;

    // Constructors
    public Person() {
        // Add id to the person
        this.identity = civilId_Generator;
    }

    public Person(String nickname) {
        this.identity = civilId_Generator;
        this.nickname = nickname;

        civilId_Generator++; // To give the following person a unique id, increase the variable.
    }

    // Setters and Getters
    public int getCivilId() {
        return identity;
    }

    public String getName() {
        return nickname;
    }

    public void setName(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Civil Id = " + this.getCivilId() + ", Name = '" + this.getName() + '\'';
    }
}
