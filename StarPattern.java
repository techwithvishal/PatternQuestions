
//  --------Right Triangle ------

//public class StarPattern{
//    public static void main(String[] args) {
//         // number of rows
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//-------Reverse Right Triangle-----------------------------------------------------------------------------------

//public  class StarPattern {
//    public static void main(String[] args){
//
//        for(int i= 1; i<=5; i++){
//
//            for(int j=5; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}

//-------------- dono ka combination half right triangle + half reverse triangle

public class StarPattern {
    public static void main (String[] args) {
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j= 4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}