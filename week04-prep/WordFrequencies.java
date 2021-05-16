import java.util.Scanner;

public class WordFrequencies {

   public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
      int freqOfWord = 0;
      int j;   
      
      for (j = 0; j < listSize; ++j) {
         if (wordsList[j].equals(currWord)) {
            freqOfWord += 1;
         }
      }
      return freqOfWord;
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] listWords = new String[20];
      int[] wordFreq = new int[20];
      int numElements;
      int i;
      
      numElements = scnr.nextInt();
      
      
      for (i = 0; i < numElements; ++i) {
         listWords[i] = scnr.next();
      }
      
      for (i = 0; i < numElements; ++i) {
         wordFreq[i] = getFrequencyOfWord(listWords, numElements, listWords[i]);
      }
      
      for (i = 0; i < numElements; ++i) {
         System.out.println(listWords[i] + " " + wordFreq[i]);
      }
   }
}