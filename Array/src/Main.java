import sun.lwawt.macosx.CSystemTray;

public class Main {

    public static void main(String[] args) {

        /*the use of array
        */

//        int[] arr = new int[10];
//        for(int i = 0 ; i < args.length ; i++){
//            arr[i] = i;
//        }
//        int[] scores = new int[]{100,99,66};
//
//        for (int i =0 ; i< scores.length;i++){
//            System.out.println(scores[i]);
//        }
//
//        for(int score : scores){
//            System.out.println(score);
//        }

        Array arr = new Array(20);
        for (int i = 0;i < 10; i++){
            arr.addlast(i);
        }
        arr.addlast(4);
        arr.set(2,4);

        System.out.println(arr);


        System.out.println(arr.find(4));
//        System.out.println(arr);

        int[] a = arr.findAll(11);


        for(int i : a){
            System.out.println(i);
        }
//        System.out.println(arr);

        arr.removeAllElement(4);
        System.out.println(arr);
//        arr.removeElement(4);
//        System.out.println(arr);



    }
}
