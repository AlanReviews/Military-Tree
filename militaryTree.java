import java.io.*;
import java.util.ArrayList;

public class militaryTree extends militaryBranch {
    private String name;
    private String country;
    private String motto;
    private int foundingYear;
    private ArrayList<militaryBranch> branches = new ArrayList<militaryBranch>();

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
    public ArrayList<militaryBranch> getBranchesArrayList() {
        return branches;
    }

    public void addBranch(militaryBranch mb) {
        branches.add(mb);
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Counry: " + getCountry());
        System.out.println("Motto: " + getMotto());
        System.out.println("Founded: " + getFoundingYear());
    }

    public static void main(String[] args) {
        // Creating the military tree base
        militaryTree wehr = new militaryTree();
        wehr.setInfo("Bundeswehr", "Germany", "We server Germany", 1955);
        // Creating the heer branch
        militaryBranch heer = new militaryBranch();
        heer.setBranch("army", "Heer");
        // Creating the marine branch
        militaryBranch marine = new militaryBranch();
        marine.setBranch("navy", "Marine");
        // Creating the luftwaffe branch
        militaryBranch luftwaffe = new militaryBranch();
        luftwaffe.setBranch("air force", "Luftwaffe");
        // Creating the support branch
        militaryBranch support = new militaryBranch();
        support.setBranch("support", "Joint Support Service");
        // Creating the medical branch
        militaryBranch medical = new militaryBranch();
        medical.setBranch("medical", "Joint Medical Service");
        // Creating the cybersecurity branch
        militaryBranch cyber = new militaryBranch();
        cyber.setBranch("electronic warfare", "Cyber and Information Domain Service");

        // Adding the branches
        wehr.addBranch(heer);
        wehr.addBranch(marine);
        wehr.addBranch(luftwaffe);
        wehr.addBranch(support);
        wehr.addBranch(medical);
        wehr.addBranch(cyber);

        // Displaying the info
        wehr.displayInfo();
        System.out.println("\nList of Branches");
        ArrayList<militaryBranch> branches = wehr.getBranchesArrayList();
        for (int i = 0; i < branches.size(); i++) {
            (branches.get(i)).displayInfo();
        }
        
    }
}
