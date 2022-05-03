/** * Professional class — It represents a major health professional.

* It inherits the Human (Parent Class) class. * This class will also have accessibility to all non-private data from the parent class.

*/
public class Professional extends Person {
    // Define unique attributes
    private int yearsOfExp;

    // Multi-args constructor
    public Professional(String name, int yearsOfExp){
        // Call the parent constructor with the inherited data.
        super(name);

        this.yearsOfExp = yearsOfExp;
    }

    //  THE Setter & Getter
    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    // Override the toString method -- to return an object's data in a custom format.
    @Override
    public String toString() {
        // call super to get super's attribute.
        return  "{" + super.toString() + '\'' + ", Months Of Practical Experience = " + this.getYearsOfExp() + "}";
    }
}