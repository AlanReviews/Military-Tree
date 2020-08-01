public class militaryTree {
    private String name;
    private String country;
    private String motto;
    private int foundingYear;

    // A setter function to set the information of the program
    public void setInfo(String n, String c, String m, int y) {
        this.name = n;
        this.country = c;
        this.motto = m;
        this.foundingYear = y;
    }

    // Getter functions to get the program variables
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getMotto() {
        return motto;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Counry: " + getCountry());
        System.out.println("Motto: " + getMotto());
        System.out.println("Founded: " + getFoundingYear());
    }

    public static void main(String[] args) {
        militaryTree de = new militaryTree();
        militaryTree caf = new militaryTree();
        de.setInfo("Bundeswehr", "Germany", "We serve Germany", 1953);
        de.displayInfo();
    }
}
