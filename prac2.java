import java.util.Scanner;

class prac2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter the length : ");
        float length = a.nextFloat(); 
System.out.println("Enter the width : ");
float width=a.nextFloat();

float area=length*width;
System.out.println("the area is "+area);
    float perimeter=2*(length+width);
    System.out.println("the perimeter is "+perimeter);
    }
}
