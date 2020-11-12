import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;

    public void push(Object object){
        list.add(object);
        currentIndex++;
    }

    public Object pop(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }

    public Object peek(){
        return list.get(currentIndex);
    }
}
