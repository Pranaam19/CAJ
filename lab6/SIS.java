package lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SIS {
    private static BufferedReader br = null;
    private static BufferedReader br1 = null;
    private static BufferedWriter bw1 = null;
    private static Scanner sc = new Scanner(System.in);

    public static void initStream(){
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Prana\\IdeaProjects\\CAJ\\src\\lab7\\login.txt"));
            br1 = new BufferedReader(new FileReader("C:\\Users\\Prana\\IdeaProjects\\CAJ\\src\\lab7\\student_details.txt"));
            bw1 = new BufferedWriter(new FileWriter("C:\\Users\\Prana\\IdeaProjects\\CAJ\\src\\lab7\\student_details.txt",true));
        }
        catch (FileNotFoundException e){
//            throw  new RuntimeException(e);
            System.out.println(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        }

    }

    public static boolean authenticate(){
        System.out.println("Enter username");
        String user = sc.next();
        System.out.println("Enter password");
        String password = sc.next();



        try{
            String credentails  = br.readLine();
            while(credentails!=null){
                String[] profile = credentails.split(" ");
                if(profile[0].equals(user) && profile[1].equals(password))
                    return true;
                credentails =br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        return false;
    }
    public static void insertRecord(){
        System.out.println("Enter Registration Nummber");
        String regno = sc.next();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter place");
        String place = sc.next();
        String insertRecord = regno+" "+name+" "+place;
        try {
            bw1.write(insertRecord);
            bw1.newLine();
            bw1.flush();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
    public static void updateRecord(){
        System.out.println("Enter Registration Nummber");
        String regno = sc.next();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter place");


    }
//    public static void deleteRecord(){
//        System.out.println("Enter Registration Nummber");
//        String regno = sc.next();
//        while(regno!=null){
//            if()
//        }
//    }
public static void deleteRecord(){
    System.out.println("Enter Registration Nummber");
    String regno = sc.next();

    ArrayList<String> Keep = new java.util.ArrayList<>();

    try {
        String line;
        while ((line = br1.readLine()) != null) {
            String[] profile = line.split(" ");
            if (profile.length > 0 && !profile[0].equals(regno)) {
                Keep.add(line);
            }
        }
        for (String record : Keep) {
            bw1.write(record);
            bw1.newLine();
        }
        bw1.flush();

        System.out.println("Record deleted successfully.");

    } catch (IOException e) {
        System.out.println(e);
    }
}

    public static void closeStream(){

    }
//    public static void display(){
//
//    }
public static void display(){
    try {
        System.out.println("--- Student Records ---");
        String line;
        // Read and print every line from the file
        while ((line = br1.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println(e);
    }
}



    static void main(String[] args) {
        initStream();
//        if(authenticate()){
            System.out.println("Valid Username and password");
            System.out.println("SIP APP");
            int choice =0;
            do{
                System.out.println("1. Insert Record");
                System.out.println("2. Delete Record");
                System.out.println("3. Update Record");
                System.out.println("4. Display Records");

                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        insertRecord();
                        break;
                    case 2:
                        deleteRecord();
                        break;
                    case 3:
                        updateRecord();
                        break;
                    case 4:
                        display();
                        break;
                }
            }while (choice != 5);
//        }
//        else{
//            System.out.println("Invalid Username and password");
//        }
        closeStream();

    }

}



