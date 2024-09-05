package cs213.jpsr.interfaces;

public interface RUCafeObject extends Comparable<Object> {
    boolean equals(Object obj);
    default int compareTo(Object o) {
        if(o instanceof RUCafeObject){
            if(this.equals(o)){
                return 0;
            }
            return 1;
        }
        throw new UnsupportedOperationException("Cannot compare RUCafeObjects to non-RUCafeObjects");
    }
    
    
}
