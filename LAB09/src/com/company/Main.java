package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    //Attributes
    private  static  String name;
    private static char gender;
    private static int year;

    public static void main(String[] args) throws Exception {
        // Part Is
        try {
            String s;
            Scanner in = new Scanner(System.in);
            System.out.println("Part I\nPlease enter a directory:");
            s = in.nextLine();
            int numFiles = new File(s).listFiles().length;
            System.out.println("The directory has: " + numFiles + " files");
        } catch (Exception e){
            System.out.println("An error occurred!");
        }
        // Part II
        try {
            findFile();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
        }
        //Part III
        Main obj = new Main();
        int rankMain = genderRank();
        if(rankMain > 0 && rankMain <= 1000)
        {
            System.out.println("");
            System.out.println(obj.getName() + " is ranked #" + rankMain);
            System.out.println("\n");
        }
        else {
            System.out.println("\nThe name " + obj.getName() +" is not ranked ");
        }
        //Part IV
    }

    private static boolean letter(char c) {
        return(c >= 'A' && c <= 'Z');
    }

    public static void findFile() throws FileNotFoundException {
        System.out.println("\nPart II");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fileName = in.nextLine();
        File file = new File(fileName);
        if(!file.exists())
        {
            System.out.println("File doesn't exist");
        }
        int[] c = new int[26];
        String s;
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            s = scan.nextLine();
            for(char ch: s.toCharArray()) {
                ch = Character.toUpperCase(ch);
                if(letter(ch)) {
                    c[ch-'A']++;
                }
            }
        }
        for(int i = 0; i < c.length; i++)
        {
            System.out.println("Number of " + (char)(i + 'A') + "'s: " + c[i]);
        }
    }
    //Getters
    String getName(){
        return name;
    }
    int getYear(){
        return year;
    }
    //Method Gender Rank
    public static int genderRank() throws FileNotFoundException {
        String rank;
        int bRank;
        int gRank;
        Scanner in = new Scanner(System.in);
        System.out.println("\nPart III");
        System.out.println("Year: ");
        year = in.nextInt();
        File file = new File("Babynamesranking" + year +".txt");
        System.out.println("Gender: ");
        gender = in.next().charAt(0);
        System.out.println("Name: ");
        name = in.next();
        try {
            Scanner scan = new Scanner(file);
            String babyBoyName, babyGirlName;
            while(scan.hasNext())
            {
                rank = scan.next();
                babyBoyName = scan.next();
                scan.next();
                babyGirlName = scan.next();
                scan.next();
                //String to integer
                if(gender == 'M' && babyBoyName.equals(gender)) {
                    bRank = Integer.parseInt(rank);
                    return bRank;
                }
                if(gender == 'F' && babyGirlName.equals(name))
                {
                    gRank = Integer.parseInt(rank);
                    return gRank;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.print("File doesn't exist");
        }
        return 0;
    }
    //Table mathod
}

        //Testing Files
        /*
        File file = new java.io.File("image/us.gif");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " +
                new java.util.Date(file.lastModified()));
         */