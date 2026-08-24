package lab3_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CarSale {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        do{
            System.out.println("Car Sales Menu");
            System.out.println("1. Order Car");
            System.out.println("2. Add Car");
            System.out.println("3. Display Cars");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Enter car's name: ");
                    String name = sc.next();
                    System.out.println("Enter car id");
                    int id = sc.nextInt();
                    for(Car c : cars){
                        if(name.equals(c.getName())&&id==c.getId()){
                            System.out.println(c);
                            cars.remove(c);
                            break;
                        }
                        else
                            System.out.println("Car Not found");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter car's name: ");
                    String name = sc.next();
                    System.out.println("Enter car id");
                    int id2 = sc.nextInt();
                    System.out.println("Enter car purchase date: ");
                    String pDate = sc.next();
                    LocalDate date = LocalDate.parse(pDate);
                    System.out.println("Car color");
                    String color = sc.next();
                    System.out.println("Enter car price: ");
                    int  price = sc.nextInt();
                    cars.add(new Car(id2,name,date,color,price));
                    break;
                }
                case 3:{
                    for(Car c : cars){
                        System.out.println(c);
                    }
                    break;
                }
                case 4:{
                    break;
                }
            }
            
        }while(true);
    }
}
