package lab1.ch1;

public class Main {
    public void fizzBuzz(){
        for(int i=1;i<=100;i++){
            if (i%5==0 && i%3==0) {
                System.out.print("FizzBuzz ");
            }
            if(i%3==0){
                System.out.print("Fizz ");
            }
            else if (i%5==0) {
                System.out.print("Buzz ");
            }
            else if (i%7==0) {
                System.out.print("Rizz ");
            }
            else if (i%11==0) {
                System.out.print("Jazz ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Main x = new Main();
        x.fizzBuzz();
    }
}
