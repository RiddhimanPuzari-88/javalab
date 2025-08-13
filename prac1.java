import java.util.Scanner;
class prac1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double a=sc.nextDouble();
        System.out.println("Enter the second number : ");
        double b=sc.nextDouble();
        double sum=a+b;
        double difference=a-b;
        double product=a*b;
        System.out.println("sum is : " + sum);
        System.out.println("difference is : " + difference);
        System.out.println("Product is : "+ product);
        double quotient;
        if(b!=0){
            quotient=a/b;
            System.out.println("quotient is : " + quotient);
        }else{
            System.out.println("Div by 0 is not alllowed");
        }

    }
    }