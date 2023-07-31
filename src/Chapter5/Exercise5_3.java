package Chapter5;

public class Exercise5_3 {
    public static void main(String[] args) {
        Exercise5_3 num = new Exercise5_3();
        num.sums();


    }
    /*Write a Java statement or a set of Java statements to accomplish each of the following tasks:
    a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
    variables sum and count have been declared.
            b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
    c) Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
    that the variable i has been declared, but not initialized. Print only five integers per line.
            [Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline
            character; otherwise, print a tab character. Assume that this code is an application. Use
    the System.out.println() method to output the newline character, and use the Sys-
            tem.out.print('\t') method to output the tab character.]
    d) Repeat part (c), using a for statement.*/
    public void sums(){
        float oddAverage = 0;
        int oddNum = 0;
        int oddSum =0;
        for( int num = 1; num < 99; num++){
              if ( num % 2 != 0){
                  oddSum = oddSum + num;
                  oddNum++;

              }

              oddAverage = (float)oddSum / oddNum;


            }
        System.out.println(oddSum);
        System.out.println(oddAverage);
        int number = (int)Math.pow(2.5,3);
        System.out.println(number);


        int i;
          i = 1;
        while ( i <= 20){
            System.out.print(i);
            if ( i % 5 == 0){
                System.out.println();
            }
            else{
                System.out.print("\t");
            }
            i++;

        }




    }



    }


