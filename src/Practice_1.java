import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        /*
        //Solutio of Question 1
        Scanner input= new Scanner(System.in);
        String name=input.nextLine();
        input.close();
        System.out.println("Welcome, "+name+"!");

         */
        //Solution of Question 2
        /*
        Scanner input= new Scanner(System.in);
        String name=input.nextLine();
        input.close();
        String[] list=name.split(" ",5);
        System.out.println(list[0]+" University "+list[1]);

         */
        //Solution of Question 3
        /*
        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int dev=num1/num2;
        System.out.println(num1+"+"+num2+"="+sum);
        System.out.println(num1+"-"+num2+"="+sub);
        System.out.println(num1+"*"+num2+"="+mul);
        System.out.println(num1+"/"+num2+"="+dev);
        input.close();

         */
        //Solution of Question 4
        /*
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if(number<0){
            System.out.println("negetive");
        }
        else if(number>0){
            System.out.println("positive");
        }
        else{
            System.out.println("zero");
        }

         */
        //Solution of question 6
        Scanner input = new Scanner(System.in);
        char ch1 = input.next().charAt(0);             //char ch=input.findInLine(".").charAt(0);
        char ch2 = input.next().charAt(0);
        if (ch1 > ch2)
            System.out.println(ch2 + " " + ch1);
        else
            System.out.println(ch1 + " " + ch2);
        input.close();

    }
}
