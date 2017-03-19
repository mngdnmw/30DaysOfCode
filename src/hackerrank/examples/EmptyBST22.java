package hackerrank.examples;

/**
 *
 * @author meng
 */
public class EmptyBST22<D extends Comparable> implements Tree22<D>
{
    public EmptyBST22(){
        
    }
    
    public boolean isEmpty(){
        return true;
    }
    
    public int cardinality(){
        return 0;
    }
    
    public boolean member(D elt){
        return false;
    }
    
    public NonEmptyBST22<D> add(D elt){
    return new NonEmptyBST22<D>(elt);
}
}
