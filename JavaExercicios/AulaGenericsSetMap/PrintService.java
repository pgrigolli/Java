import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {


    public PrintService(){
    }



    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }
    
    public T first(){
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        for(T e: list){
            System.out.print(e + ", ");
        }
            
            
        System.out.print("\b]");
    }



}
