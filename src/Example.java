import java.util.ArrayList;
import  java.util.Scanner;

public class Example {
    public void sortArray(ArrayList<Integer>nums){
        nums.sort(null);
    }
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        ArrayList<Integer>nums=ArrayInit.initArray(input);
        nums.sort(null);
        System.out.println(nums);
    }
}
