import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    // prob 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter non-negative number to add, negative to stop"); 

    int sum = 0; 
    int userinput = 0; 

    while(userinput != -1)
    {
      userinput = sc.nextInt();
      sum += userinput; 

    }

    
    // 
    // sum++;
    //   // when user enters -1, it adds to the sum, so we do ++1 to add it back 
    // System.out.println(sum);

    // Prob 2 
    System.out.println("how many numbers do you want to enter?");
    
    int N; 
    N = sc.nextInt();

    int max = 0;

    int counter = 0; 
    

   

    while(counter < N)
    {
      userinput = sc.nextInt();
      if (userinput >= max)
      {
       max = userinput;
      }

      counter++; 
    }
    System.out.println("The max is " + max);




    System.out.println("enter a word");
    String word; 
    word = sc.nextInt();

    int index = 0; 

    while (index < word.length)
    {
      String currentLetter = word.substring(index, index+2);
      if (index MOD 2)



      index++;
    }








  }
}
