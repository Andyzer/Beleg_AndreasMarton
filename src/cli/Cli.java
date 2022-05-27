//package cli;
//
//
//import admin.Admin;
//import mediaDB.*;
//import mediaDB.implementations.AudioImpl;
//import mediaDB.implementations.UploaderImpl;
//import mediaDB.implementations.VideoImpl;
//
//import java.math.BigDecimal;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.UUID;
//
///**
// * proto cli
// */
//public class Cli {
//
//    ArrayList<Content> contentList = new ArrayList<>();
//    ArrayList<Uploader> uploaderList = new ArrayList<>();
//    public String name;
//    Admin admin = new Admin();
//
//    /**
//     * Prints out a very basic command line "menu" to choose from
//     * It's just a prototype, it will get better
//     */
//    public void cli() {
//        System.out.println("Welcome.");
//        System.out.println("Please select one of the following options: \n");
//        System.out.println("1. Create Producer \n" +
//                "2. Create a new Audio File \n" +
//                "3. Create new Video File \n" +
//                "6. Delete a File \n\n" +
//                "Option 4-5 will be updated, as of now they are just there a as placeholder\n\n" +
//                "4. Show all files \n" +
//                "5. Update File Access Count \n" +
//                "Enter any other number to quit the programm.\n\n" +
//                "Please type a number: ");
//
//
//    }
///*
//    public int userInput() {
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();
//    }
//*/
//
//    /**
//     * Runs CLI and accepts commands in order to manage the DBMS
//     * or at least it should
//     */
//
//    public void run() {
//        String userName;
//        BigDecimal bitrate;
//        BigDecimal size;
//        Duration length = null;
//        UUID address;
//        int resolutin;
//        int samplingRate;
//
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if (i >= 1 && i <= 3) {
//
///**
//* CLI Deleted because it sucked, TODO: Cli implementation
// */
//
//        } else {
//            System.out.println("Good bye.");
//        }
//    }
//}