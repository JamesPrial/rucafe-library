package cs213.jpsr.util;

import java.util.HashMap;

import cs213.jpsr.interfaces.MenuItem;
import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableMap<T extends RUCafeObject> implements RUCafeObject {
    private HashMap<Integer, T> map;
    public CustomizableMap(){
        this.map = new HashMap<Integer, T>();
    }

    public boolean add(T obj){
        int hash = obj.hashCode();
        if(!map.containsKey(hash)){
            map.put(hash, obj);
            return true;
        }else if(obj instanceof MenuItem){
            ((MenuItem)map.get(hash)).incrementQuantity();
            return true;
        }
        return false;
    }

    public boolean remove(T obj){
        int hash = obj.hashCode();
        if(map.containsKey(hash)){
            if(obj instanceof MenuItem && ((MenuItem)obj).itemQuantity() > 1){
                ((MenuItem)map.get(hash)).decrementQuantity();
            }else{
                map.remove(hash);
            }
            return true;
            
        }
        return false;
    }
}
