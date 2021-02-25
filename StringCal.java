import java.util.Scanner;

public class StringCal

{
    
    public static void main (String [] args)
    {

        Scanner sc =new Scanner(System.in);
        String InputNumbers=sc.nextLine();
        int finaltot = add(InputNumbers);
        System.out.println(finaltot);
        sc.close();    
    }
    public static int add (String numbers)
    {
         if(numbers.equals(""))
         {
             return 0;
         }
         else
         {
             String comma=",";
             String numList[] = splitnum(numbers, comma + "|\n");
             return sum(numList);
         }
    }
    public static String[] splitnum(String numbers,String div) {
        return numbers.split(div);
        
    }

    public static int toInt(String number)
    {
        return Integer.parseInt(number);
    }
    
    public static int sum(String[] numbers)
    {
        int total = 0;
        String temp="";

        for(String number: numbers)
        {
            if(toInt(number)<0)
            {
                if(temp.equals(""))
                {
                    temp=numbers.toString();
                }
                else
                {
                    temp+=(","+ number);
                }
            }
            if(toInt(number)<1000)
            {
                total += toInt(number);
            }
        }
            if(!temp.equals(""))
            {
                throw new IllegalArgumentException("Error in input numbers "+temp );
            }

            return total;
        

    }


}