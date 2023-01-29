
package radixsortimplementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usman_Aslam
 */
public class RadixSortImplementation {
    
    static ArrayList<String>input;
    static String[] sort;
    static String[] spilt;
    static int size ;
    
    public RadixSortImplementation()
    {
        input = new ArrayList<String>();
        sort = new String[5];
        spilt = new String[5];
        
        
        for(int i=0; i<5; i++)
        {
            sort[i] = "";
            spilt[i] = "";
        }
    }
    static public void mySort()
    {
       
        for(int j =1; j>= 0; j--)
        {
            for(int i=0; i<size; i++)
            {
                switch(input.get(i).charAt(j))
                {
                    case '0':
                        sort[0] += "," + input.get(i);
                        break;
                    case '1':
                        sort[1] += "," + input.get(i);
                        break;
                    case '2':
                        sort[2] += "," + input.get(i);
                        break;
                    case '3':
                        sort[3] += "," + input.get(i);
                        break;
                    case '4':
                        sort[4] += "," + input.get(i);
                        break;
                    case '5':
                        sort[5] += "," + input.get(i);
                        break;
                    case '6':
                        sort[6] += "," + input.get(i);
                        break;
                    case '7':
                        sort[7] += "," + input.get(i);
                        break;

                    case '8':
                        sort[8] += "," +input.get(i);
                        break;
                    case '9':
                        sort[9] += "," + input.get(i);
                        break;

                }
            }
            
        }
        for(int i=0; i<size; i++)
        {
            spilt = sort[i].split(",");
            int k = 0;
            while(!spilt[k].equals(""))
            {
                System.out.println("Enter " + spilt[k]);
                input.set(i, spilt[k]);
                k++;
            }
            
        }
    }
    public static void main(String[] args) {
        RadixSortImplementation oobj = new RadixSortImplementation();
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Enter Size: ");
        size = cin.nextInt();
        cin.nextLine();
        
        for(int i = 0; i<size; i++)
        {
            System.out.println("Enter Number: ");
            input.add(cin.nextLine()); 
        }
        
        mySort();
        for(int i = 0; i<size; i++)
        {
            System.out.println(input.get(i));
        }
    }
    
}
