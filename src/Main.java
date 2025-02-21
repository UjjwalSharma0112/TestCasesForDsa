import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Example ob=new Example();
        System.out.println("Enter the testcase");
        String data=sc.nextLine();
        System.out.println("Enter the result");
        String res=sc.nextLine();
        ArrayInit ujjwal=new ArrayInit(data,res);
        System.out.println(ujjwal.result(ob.myFunc(ArrayInit.initArray(data))));
    }
}
// TODD
/*
1.Figure out sending functions as params
2.GUI Design
3.How will the code work (on clicking run the code should automatically)
* */