package Unguided;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class test {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Udin", 2296 ,1250000);
        CommissionEmployee employee2 = new CommissionEmployee("Ucok", 2297, 4000000, 500000, 3);
        ProjectPlanner employee3 = new ProjectPlanner("Ujang", 2298, 5000000, 800000, 5);

        System.out.println("=============Data Karyawan 1=============");
        employee1.cetakInformasi();
        System.out.println("=============Data Karyawan 2=============");
        employee2.cetakInformasi();
        System.out.println("=============Data Karyawan 3=============");
        employee3.cetakInformasi();
    }
}
