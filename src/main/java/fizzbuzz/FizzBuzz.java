package fizzbuzz;

public class FizzBuzz {
    public String printNumber() {
        String num = "";
        for(int i=0; i<100; i++){
            if(i % 3 == 0)
                num += "Fizz";
            if(i % 5 == 0)
                num += "Buzz";
            if(i % 5 == 0 && i % 3 == 0)
                num += "FizzBuzz";
        }
        return num;
    }
   }
