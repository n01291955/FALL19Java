/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaypatel_fileoccurences;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author Jay
 */
public class JayPatel_FileOccurences 
{
    private static int BYear;
    private static String BName;
    private static char BGen;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    
    ////////////////////////MAIN METHOD//////////////////////////////
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Directory Path: ");
        String str = sc.nextLine();
        System.out.println(new File(str).listFiles().length);
        
        FileFind();
        System.out.println("\n");
        JayPatel_FileOccurences f2 = new JayPatel_FileOccurences();
        
 
        int r2 = GenderRank(); 
        if(r2 > 0 && r2 <= 1000)
        {       
            System.out.println("\n");
            System.out.print(f2.getBName()+" is ranked #"+r2);
            System.out.println("\n");
        }
        
        else
        {
            System.out.print("The name " +f2.getBName() +"is not ranked ");
            System.out.println("\n");
        }
        
        rankingTable();
    }    
    
    
    
    //////////////////////METHOD 2///////////////////////
    public static void FileFind() throws FileNotFoundException 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.print("Enter file name: ");
        String filename = input.nextLine();
        File ff = new File(filename);   //Accessing a File
        if(!ff.exists())
        {
            System.out.println("NO FILE!!\n\n");
            System.exit(1);
        }
        String s; 
        int[] counter = new int[26];
        Scanner sc4 = new Scanner(ff);
           
            while(sc4.hasNext())
            {
                s = sc4.nextLine();
                for(char MyChar: s.toCharArray()) //String to Char 
                {
                    MyChar = Character.toUpperCase(MyChar); //Becomes Uppercase
                    if(MethodLetter(MyChar))
                    {
                        counter[MyChar-'A']++;
                    }
                }
            }
           
        for(int i = 0; i < counter.length; i++)
        {
            System.out.println("Number of " +(char)(i + 'A') +"'s: " +counter[i]);          
        }
    }
    
    

    ////////////////////////METHOD 3//////////////////////
    public static boolean MethodLetter(char c)
    {
        //True or False condition
        return(c >= 'A' && c <= 'Z');
    }
    
    
   
   
    
    
    ////////////////////////METHOD 4//////////////////////
    int getBYear()
    {
        return BYear;
    }
    
    ////////////////////////METHOD 5///////////////////////
    String getBName()
    {
        return BName;
    }
    

    
    /////////////////////METHOD 6///////////////////////////
   public static int GenderRank()
    {
        String R;
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        BYear = sc.nextInt();
        File F = new File("Babynamesranking" +BYear +".txt");
        System.out.print("Gender: ");
        BGen = sc.next().charAt(0);
        System.out.print("Name: ");
        BName = sc.next();
       
        try
        {
            Scanner SOBJ2 = new Scanner(F);
            String BBName, GBName;
            
            while(SOBJ2.hasNext())
            {
                //Read & Initalize variables from file
                //R = SOBJ2.nextInt();
                R = SOBJ2.next();
                BBName = SOBJ2.next();
                SOBJ2.next();
                GBName = SOBJ2.next();
                SOBJ2.next();
                
                if(BGen == 'M' && BBName.equals(BName))
                {  
                    return Integer.parseInt(R);                   
                }
                
                if(BGen == 'F' && GBName.equals(BName))
                {                    
                    return Integer.parseInt(R);      
                }
                
                
            }
        }
        
        catch(FileNotFoundException e)
        {
            System.out.print("File is nonexistent");
        }
        
        return -1;
    }
    
   
   
   
   
    ////////////////////METHOD 7////////////////////////////
    public static void rankingTable() throws FileNotFoundException
    {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("  Year    Rank 1     Rank 2       Rank 3      Rank 4      Rank 5       Rank 1       Rank 2      Rank 3      Rank 4      Rank 5      ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------"); 
        
        String [][][] ranks = new String[10][2][5];
        for(int y = 2010; y >= 2001; y--)
        {
            System.out.print("\n" +y +"\t");
            String fpath = "C:/Users/Babynamesranking" + y +".txt";
            File f2 = new File(fpath);
            Scanner sc5 = new Scanner(f2);
            int c = 0;
            while(sc5.hasNext() && c < 5)
            {
                String line2 =  sc5.nextLine();
                String str[] = line2.split("\t");
                ranks[2010-y][0][c] = str[3].trim();    //Females
                ranks[2010-y][1][c] = str[1].trim();    //Males
                c++;               
            }
            
                for(int i = 0; i < ranks[2010-y][0].length; i++)
                {
                    System.out.print(String.format("%-12s",ranks[2010-y][0][i]));
                }
                for(int i = 0; i < ranks[2010-y][1].length; i++)
                {
                    System.out.print(String.format("%-12s",ranks[2010-y][1][i]));
                }
             
        }
            System.out.println("\n");
    }
    
    
}
        
        
        
        
        
        
        
        
        
        
        
        
        

    
    
       
    
    
    
    
    
    
    

                                        

