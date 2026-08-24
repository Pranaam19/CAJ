package Lab3;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EIS {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee>db = new ArrayList<>();
//        System.out.println("Enter the number of employees");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            System.out.println("Enter the eid of employee"+i+1);
//            int id = sc.nextInt();
//            System.out.println("Enter the name of employee"+i+1);
//            String name = sc.next();
//            System.out.println("Enter the Designation of employee"+i+1);
//            String designation = sc.next();
//            System.out.println("Enter the salary of employee"+i+1);
//            double salary = sc.nextDouble();
//
//            db.add(new Employee(name,id,designation,salary));
//
//        }
//        for(Employee e:db){
//                System.out.println(e);
//            }


        do {
                System.out.println("Employee Menu");
                System.out.println("Enter your choice");
                System.out.println("1. Salary increment");
                System.out.println("2. Search Employee");
                System.out.println("3. Add Employee");
            System.out.println("4. Remove Employee");
                System.out.println("Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:{
                        System.out.println("Enter the employee ID");
                        int id1 = sc.nextInt();
                        for(Employee e:db){
                            if(e.searchemployee(id1)){
                                e.incr();
                                System.out.println(e);
                                break;
                            }
                            System.out.println("Employee "+id1+" not found");
                        }
                        break;



                    }
                    case 2:{
                        System.out.println("Enter the employee ID");
                        int id = sc.nextInt();
                        for(Employee e:db){
                            if(e.getEid()==id){
                                System.out.println("Enter the employee found"+e);
                            }
                            System.out.println("Employee Not found"+e);
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Enter the eid of employee");
                        int id2 = sc.nextInt();
                        System.out.println("Enter the name of employee");
                        String name = sc.next();
                        System.out.println("Enter the Designation of employee");
                        String designation = sc.next();
                        System.out.println("Enter the salary of employee");
                        double salary = sc.nextDouble();
                        db.add(new Employee(name,id2,designation,salary));
                        System.out.println("Employees List:");
                        for(Employee e:db){
                            System.out.println(e);
                        }
                        break;


                    }
                    case 4:{
                        System.out.println("Enter the employee ID");
                        int id = sc.nextInt();
                        for(Employee e:db){
                            if(e.getEid()==id){
                                db.remove(e);
                                break;
                            }
                            System.out.println("Employee "+id+" not found");
                        }
                        for(Employee e:db){
                            System.out.println(e);
                        }
                        break;
                    }
                }

            }
            while(true);


//        db.add(new Employee("Rajesh",132,"Developer",45000));
//        db.add(new Employee("Alok",142,"QA Tester",42000));

    }
}
