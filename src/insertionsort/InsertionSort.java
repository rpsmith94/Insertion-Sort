/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Ryan Remer
 */
public class InsertionSort
{

    /**
     * @param args the command line arguments
     * 
     * Sorts array pages into alphabetical order 
     */
    public static void main(String[] args) 
    {

           String[] pages = {"Q", "B", "Z", "D", "E", "F","T"};

        int item1;
        String pivot;
        int item2;
       
        for(item1=1;item1<pages.length;item1++)
        {
            pivot=pages[item1];
            for(item2=item1-1;(item2>=0)&&(pivot.compareTo(pages[item2])>0);item2--)
            {
                pages[item2+1]=pages[item2];
            }
            pages[item2+1]=pivot;
        }
        
        for(String item:pages)
           {
               System.out.println(item);   
           }

    

    
        
}
    /*
       Function to swap two item in an array 
       takes in array and swaps item at position pos2 with item at pos1
    */
public void swap(String[] array,int pos1,int pos2)
    {
        String temp;
       temp=array[pos2];
       array[pos2]=array[pos1];
       array[pos1]=temp;
        
    }
}
