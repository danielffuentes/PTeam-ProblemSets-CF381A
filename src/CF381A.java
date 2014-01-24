/**
 * Created by Daniel on 1/23/14.
 */
import java.util.Scanner;
public class CF381A
{
    public static int getHighestIndex(int[] array)
    {
        int greatestIndex = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(greatestIndex < array[i])
            {
                greatestIndex = i;
            }
        }
        return greatestIndex;
    }
      public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
          //System.out.println("number of cards: ");
          int[] array = new int[input.nextInt()];
          int greatestIndex = 0;
          for(int i = 0; i< array.length; i++)
          {
              //System.out.println("Input " + i + " ");
              array[i] = input.nextInt();
          }
          int serejaScore = 0;
          int dimaScore = 0;
          int cards = array.length;
          while(cards > 0)
          {
              greatestIndex = getHighestIndex(array);
              int value = array[greatestIndex];
              serejaScore += value;
              array[greatestIndex] = 0;
              cards--;
              if(cards > 0)
              {
                  greatestIndex = getHighestIndex(array);
                  value = array[greatestIndex];
                  dimaScore += value;
                  array[greatestIndex] = 0;
                  cards--;
              }
          }
          input.close();
          System.out.print(serejaScore + " " + dimaScore);
      }
}
