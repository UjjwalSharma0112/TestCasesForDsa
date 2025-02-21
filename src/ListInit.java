import java.util.LinkedList;


public class ListInit {
    private final LinkedList<Integer> input;
    private final LinkedList<Integer>output;
    ListInit(String ip,String op){
        input=initList(ip);
        output=initList(op);
    }
    static LinkedList<Integer> initList(String data){
        LinkedList<Integer>list=new LinkedList<>();
        if(data.startsWith("[")&&data.endsWith("]")){
            data=data.substring(1,data.length()-1);
        }
        String []element=data.split(",");
        for(String elem:element){
            list.add(Integer.parseInt(elem.trim()));
        }
        return list;
    }
    boolean result (){
        return(input.equals(output));
    }

}
