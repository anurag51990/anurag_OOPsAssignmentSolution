import model.departments.AdminDepartment;
import model.departments.HRDepartment;
import model.departments.SuperDepartment;
import model.departments.TechDepartment;

import java.security.spec.RSAOtherPrimeInfo;

public class Driver {
    public static void main(String[] args){
        SuperDepartment adminDepartment = new AdminDepartment();
        printFunctionalitiesOfDepartment(adminDepartment);
        System.out.println();

        SuperDepartment HrDepartment = new HRDepartment();
        printFunctionalitiesOfDepartment(HrDepartment);
        System.out.println();

        SuperDepartment techDepartment = new TechDepartment();
        printFunctionalitiesOfDepartment(techDepartment);
        System.out.println();



    }
//    To avoid the Repeat of the step to print we will pass the object and call respective methods
    public static void printFunctionalitiesOfDepartment(SuperDepartment departmentObject){
        System.out.println("Welcome to "+ departmentObject.departmentName());
        System.out.println(departmentObject.getTodaysWork());
        System.out.println(departmentObject.getWorkDeadline());
        System.out.println(departmentObject.isTodayAHoliday());

    }
}
