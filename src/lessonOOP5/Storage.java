package lessonOOP5;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

    List<T> listElement;

    public Storage() {
        this.listElement = new ArrayList<>();
    }

    public void add(T item){
        listElement.add(item);
    }

    public T get(int index){
        return listElement.get(index);
    }

    public void remove(int index){
        listElement.remove(index);
    }

    public int size(){
        return listElement.size();
    }
}
