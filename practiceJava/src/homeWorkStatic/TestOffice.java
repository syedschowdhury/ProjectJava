package homeWorkStatic;

public class TestOffice {
    public static void main(String[] args) {

        Office off = new Office();
        off.setOfficeName("Microsoft");
        System.out.println(off.officeName);
        System.out.println(off.city);
        System.out.println();

        Office off2 = new Office("Facebook");
        System.out.println(off2.city);
        System.out.println();

        Office off3 = new Office("Instagram",11421);
        System.out.println(off3.city);
        off3.desk();
        off3.printers();








    }
}
