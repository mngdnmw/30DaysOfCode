package hackerrank.examples;

/**
 *
 * @author meng
 */
public interface Tree22<D extends Comparable>
{
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST22<D> add(D elt);
}
