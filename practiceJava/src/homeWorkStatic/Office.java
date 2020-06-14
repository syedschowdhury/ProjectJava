package homeWorkStatic;

public class Office {

    public String officeName;
    public int zip;
    public static String city = "Manhattan";

    //construrctors
    public Office(){}

    public Office(String officeName){
        this.officeName = officeName;
        System.out.println(officeName);
    }
    public Office(String officeName, int zip){
        this.officeName = officeName;
        this.zip = zip;
        System.out.println(officeName +"\n"+ zip);
    }
    //methods
    public void desk(){
        System.out.println("We have total 25 desks in office");
    }
    public void printers(){
        System.out.println("All together three printers working");
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeName() {
        return officeName;
    }
}
