//package hackerrank.challenges;
//
//import java.util.*;
//
//public class Day10 {
//
//    public static void main(String[] args) {
//        
////        int[] binaryArrayList = new int[20];
////        int i = 0;
////        int[] binaryArrayListCorrected = new int[binaryArrayList.length];
////
////        while (n > 0) {
////            binaryArrayList[i] = n % 2;
////            n = n / 2;
////            i++;
////        }
////        
////        System.out.println(Arrays.toString(binaryArrayList));
////        
////        for (int j = binaryArrayList.length-1; j >=0; j--) { //reversing the array
////            binaryArrayListCorrected[binaryArrayList.length-j-1] = binaryArrayList[j];
////            //System.out.println(Arrays.toString(binaryArrayListCorrected));
////            
////        }
////        System.out.println(Arrays.toString(binaryArrayListCorrected));
//        
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        
//        int remainder=0, sum=0, max=0;
//        while (n > 0) {
//            remainder = n % 2; //this part keep ths decimal/remainder.
//            n = n / 2;//and this keeps the integer because this is integer division, so it can't keep the decimals. 
//            if(remainder==1)
//            {
//                sum=sum+1;
//                if(sum>=max){
//                    max=sum;
//                }
//                else{
//                    sum=0;
//                }
//            }
//            System.out.print(max);   
//        }
//    }
//}
