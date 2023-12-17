 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concepts;


 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 import java.util.stream.Collectors;

 /**
  *
  * @author jerome
  */

 public class Duration  implements TimedRange {

     // number of quintuple
     public int intValue;
     @Override
     public int intValue() {
         return intValue;
     }

     // La plus petite duree est une quintuple croche (numValue = 1)
     static int MIN_DURATION = 1 ;

     // tempo, MM à la noire
     static int DEFAULT_TEMPO = 120;
     static int tempo = DEFAULT_TEMPO;

     //------------------------------------------------------------------------------------------------------
     //
     // Useful constants and values

     public static final int QUINTUPLE = 1;
     public static final int QUADRUPLE = 2;
     public static final int TRIPLE = 4;
     public static final int DOUBLE = 8;
     public static final int CROCHE = 16;
     public static final int NOIRE = 32;
     public static final int BLANCHE = 64;
     public static final int RONDE = 128;

     // tempo/60 give the number of NOIRE in a second
     // the number of quintuple is 32 x the number of NOIRE
     public  static int second() { return tempo*NOIRE/60;};

     // for the lilypond string version : chord or piano
     public static final int STRING_CUBASE_STYLE = 1;
     public static final int PIANO_STYLE = 2;

     //-------------------------------------------------------------------------------------------------------

     // La valeur par défaut est une noire
     static int DEFAULT_DURATION = 32;

     public int DefaultIndex() {return DEFAULT_DURATION;}
     public void setDurationValue(int someInt){
          intValue = someInt;
     }

     private static final String[] rythmeValues = {"128","64","32","16","8","4","2","1"};
     private static List<Integer> decompositionInPowerOf2(int number){
         ArrayList<Integer> result = new ArrayList<>();

         int power = 0;
         int num = number;
         while ((num > 0) && (power <=6)) {
             if ((num & 1) == 1) {
                 result.add( 1);
             } else result.add(0);
             num >>= 1; // Right-shift the number by 1 bit
             power++;
         }
         if (number >= 128) {
             int quotient = number / 128;
             result.add(quotient);
         }
         return result;
     };
     public static String asString(int intValue, int style) {

         if (intValue<=0) throw new RuntimeException("bad duration for string conversion :"+String.valueOf(intValue));

         // Decomposition in power of 2, i.e in increasing elementary values
         List<Integer> decompositionL =decompositionInPowerOf2(intValue) ;
         Integer[] decompositionA = new Integer[decompositionL.size()];
         decompositionL.toArray(decompositionA);

         // Each non-zero decomposition is translated in string form and stored in a list
         List<String>  resultL = new ArrayList<>();
         for (int i = 0; i < decompositionA.length; i++) {
             for (int j = 0; j < decompositionA[i]; j++) {
                 resultL.add(rythmeValues[i]);
             }
         }

         // the list is reversed and folded with "~" for the piano style, whithout "~" for the string cubase style
         Collections.reverse(resultL);

         String delimiter;
         if (style == PIANO_STYLE) {
             delimiter = "~";}
         else delimiter = " ";

         return resultL.stream()
                     .collect(Collectors.joining(delimiter));

     }

     // here we convert the duration "intValue", beginning at "date" ,
     // following the style "style". Implicitly, the time signature is 4/4.
     public static String asStringWithTimeSignature(int intValue, int date, int style){

         String result = "";
         if (intValue<=0) throw new RuntimeException("bad duration for string conversion :"+String.valueOf(intValue));

         // the duration is split in two parts : to the next bar, and after.
         int nextBar ;
         if (date % 128 ==0) nextBar = date;
                 else nextBar = ((date / 128)+1)*128;
         int  toNextBar = nextBar-date;
         if (toNextBar >=  intValue)
             result = asString(intValue,style);
         else
             if (toNextBar==0)
                 result = asString(intValue-toNextBar,style);
             else
                 result = asString(toNextBar,style)+"~"+asString(intValue-toNextBar,style);
         return result;
     }


     public Duration(){intValue = DEFAULT_DURATION;}
     public Duration(int someint){intValue = someint;}

     public static void main(String[] args) {
         int num = 1000; // The integer to be decomposed
         System.out.println("Decomposition of " + num + " into powers of 2:");
         List<Integer> decomposition = decompositionInPowerOf2(num);
         for (int i = 0; i < decomposition.size(); i++) {
             System.out.println(" puissance : "+decomposition.get(i));
         }
          System.out.println(" string form :");
         System.out.println(asString(num, PIANO_STYLE));
     }


 }
