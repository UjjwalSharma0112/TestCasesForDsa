import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayInit {
    private final ArrayList<Integer> input;
    private final ArrayList<Integer> output;
    ArrayInit(String ip,String op){
        input=initArray(ip);
        output=initArray(op);
    }
    static ArrayList<Integer> initArray(String data){
        ArrayList<Integer> nums=new ArrayList<Integer>();
        if(data.startsWith("[")&&data.endsWith("]")){
            data=data.substring(1,data.length()-1);
        }
        String []element=data.split(",");
        for(String elem:element){
            nums.add(Integer.parseInt(elem.trim()));
        }
        return nums;
    }
    boolean result(Consumer<ArrayList<Integer>>func){
        //put the function call here
        func.accept(input);
        return input.equals(output);
    }

}
