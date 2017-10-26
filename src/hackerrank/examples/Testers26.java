package hackerrank.examples;

/**
 *
 * @author meng
 */
public class Testers26
{
    public static void checkIsEmpty(Tree22 t) throws Exception
    {
        //If the tree t is an instance of EmptyBST--> t.isEmpty --> true
        if(t instanceof EmptyBST22 ){
//            if (t.isEmpty()){
//                System.out.println("All is good, the tree is a EmptyBST and it is empty");
//            }
              if(!t.isEmpty()){
                  throw new Exception("All is not good, the tree is a EmptyBST and it is not empty");
              } 
        }
        //If the tree t is an instance of NonBST--> t.isEmpty --> false
        if(t instanceof NonEmptyBST22 ){
//            if (!t.isEmpty()){
//                System.out.println("All is good, the tree is a NonEmptyBST and it is not empty");
//            }
              if(t.isEmpty()){
                  throw new Exception("All is not good, the tree is a NonEmptyBST and it is empty");
              } 

        }
    }
}
