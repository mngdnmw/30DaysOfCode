package hackerrank.examples;

/**
 *
 * @author meng
 */
class NonEmptyBST22<D extends Comparable> implements Tree22<D>
{
    D data; //root
    Tree22 <D>left;
    Tree22 <D>right;
    
    public NonEmptyBST22(D elt){
        data = elt;
        left = new EmptyBST22();
        right = new EmptyBST22();
    }
    
    public NonEmptyBST22(D elt, Tree22<D> leftTree, Tree22<D> rightTree){
        data = elt;
        left =leftTree;
        right = rightTree;
    }
    public boolean isEmpty(){
        return false;
    }
    
    public int cardinality(){
        return 1+left.cardinality()+right.cardinality();
    }
    
    public boolean member(D elt){
        if (data==elt){
            return true;
        } else {
            if (elt.compareTo(data)<0){
                return left.member(elt);
            } else{
                return right.member(elt);
            }
        }
    }
    public NonEmptyBST22<D> add(D elt){
        if (data==elt){
            return this;
        }
        else{
            if(elt.compareTo(data)<0){
                return new NonEmptyBST22(data, left.add(elt), right);
            } else {
                return new NonEmptyBST22(data, left, right.add(elt));
            }
        }
    }
}
