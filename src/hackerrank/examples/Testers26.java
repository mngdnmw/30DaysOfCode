package hackerrank.examples;

import java.util.Random;

/**
 *
 * @author meng
 */
public class Testers26
{
    //Random integers
    public static int rndInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min)-1)+min;
    } 
    
    //Random binary search trees
    public static Tree22 rndTree(int count){
        if (count ==0){
            return new EmptyBST22();
        }else{
            return rndTree(count-1).add(rndInt(0,50));
        }
    }
    
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
    
    public static void checkAddMemberCardinality(Tree22 t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        //1. Either something was added->the cardinality increased by 1
        if(nT==(t.cardinality()+1)){
            if(t.member(x)){
                throw new Exception("The cardinality increased by 1, but the thing that was added was already a member of the tree");
            }
//            else {
//                System.out.println("All is good, our cardinality increased and the thing wasn't in the tree");
//            }
        }
        //2. Or the thing that was added was already there and therefore not really added
        //so the cardinality remained the same
        else if(nT == t.cardinality()){
            if(!t.member(x)){
                throw new Exception("The cardinality didn't increase by 1, but we added a new thing");
            }
//            else {
//                System.out.println("All is good, the thing was in the tree and our cardinality didn't increase");
//            }
        }
        
        else{
            throw new Exception("Something is wrong with our program!");
        }
    }
}
