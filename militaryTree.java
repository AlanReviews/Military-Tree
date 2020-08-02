import java.io.*;

public class militaryTree extends militaryBranch {
    public static final int branchNum = 3;
    private String name;
    private String country;
    private String motto;
    private int foundingYear;
    public militaryBranch[] branches = new militaryBranch[branchNum];

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
        militaryTree wehr = new militaryTree();
        wehr.setInfo("Bundeswehr", "Germany", "We server Germany", 1955);
        militaryBranch heer = new militaryBranch();
        heer.setBranch("army", "Heer");
        militaryBranch marine = new militaryBranch();
        marine.setBranch("navy", "Marine");
        militaryBranch luftwaffe = new militaryBranch();
        luftwaffe.setBranch("air force", "Luftwaffe");
        wehr.branches[0] = heer;
        wehr.branches[1] = marine;
        wehr.branches[2] = luftwaffe;

        wehr.displayInfo();
        for (int i = 0; i < branchNum; i++) {
            wehr.branches[i].displayInfo();
        }
        
    }
}
