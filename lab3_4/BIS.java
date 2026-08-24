package lab3_4;

import Lab3.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BIS {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bookshop> bks = new ArrayList<>();


        do{
            System.out.println("Book Inventory");
            System.out.println("1. Sale Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add Books");
            System.out.println("4.Book Details");

            int choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter Book Title");
                    String title = sc.next();
                    System.out.println("Enter Author Name");
                    String author = sc.next();
                    for(Bookshop bk:bks){
                        if(bk.getTitle().equals(title) && bk.getAuthor().equals(author)){
                            System.out.println(bk);
                            int copy=bk.getCopy();
                            int sv=--copy;
                            bk.setCopy(sv);
                            System.out.println("Sold Book");
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter Book Title");
                    String title = sc.next();
                    System.out.println("Enter Author Name");
                    String author = sc.next();
                    for(Bookshop bk:bks){
                        if(bk.getTitle().equals(title) && bk.getAuthor().equals(author)){
                            bks.remove(bk);
                            break;
                        }
                        System.out.println("The book is not available");
                    }
                    for(Bookshop bk:bks){
                        System.out.println(bk);
                    }

                    break;
                }
                case 3:{
                    System.out.println("Enter Book id");
                    int id = sc.nextInt();
                    System.out.println("Enter Book Title");
                    String title = sc.next();
                    System.out.println("Enter Author Name");
                    String author = sc.next();
                    System.out.println("Enter publisher");
                    String publisher = sc.next();
                    System.out.println("Enter Rate");
                    int rate = sc.nextInt();
                    System.out.println("Enter Copy");
                    int copy = sc.nextInt();
                    bks.add(new Bookshop(id,author,title,publisher,copy,rate));
                    for(Bookshop bk:bks){
                        System.out.println(bk);
                    }
                    break;
                }
                case 4:{
                    for(Bookshop bk:bks){
                        System.out.println(bk);
                    }
                    break;
                }
            }
        }while(true);
    }
}
