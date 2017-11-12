package hackerrank.examples;

/**
 *
 * @author meng
 */
public class BinarySearchTree22
{
    public static void main(String[] args) throws Exception
    {
        EmptyBST22 e = new EmptyBST22();
        NonEmptyBST22 n = new NonEmptyBST22(5);
        
        //Testers26.checkIsEmpty(e);
        //Testers26.checkIsEmpty(n);
        
        Testers26.checkAddMemberCardinality(e, 5);
        Testers26.checkAddMemberCardinality(n, 5);
        Testers26.checkAddMemberCardinality(n, 6);
        
        int tests = 1000;
        for (int i = 0; i < tests; i++)
        {
            Tree22 t;
            if(i%10==0){
                t=Testers26.rndTree(0);
            }else {
                t=Testers26.rndTree(10);
            }
            Testers26.checkAddMemberCardinality(t, i);
                    
            
        }
    }
    
}
