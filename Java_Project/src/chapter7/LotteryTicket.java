package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGHT =6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers()
    {
        int[] ticket = new int[LENGHT];

        Random random = new Random();

        for (int i=0; i<LENGHT;i++)
        {
            int randomNumber;
            do {
               randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket,randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static void printTicket(int ticket[])
    {
        for (int i=0; i<LENGHT; i++)
        {
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to Search
     * @param numberToSerchfor Value to Search for
     * @return true if found, false if not
     */
    public static boolean search(int [] array,int numberToSerchfor)
    {
         // This is called enhanced loop.
         for (int value: array){
             if (value==numberToSerchfor)
             {
                 return true;
             }
         }

                 return false;
    }

    public static boolean binarySearch(int [] array,int numberToSearchFor)
    {
        //aray must be sorted first
        Arrays.sort(array);

      int index =  Arrays.binarySearch(array,numberToSearchFor);

      if (index >=0)
      {
          return true;
      }
          return false;

    }


}
