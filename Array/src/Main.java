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

        Array<Integer> arr = new Array<Integer>(20);
        System.out.println(arr);

        for (int i = 0;i < 10; i++){
            arr.addlast(i);
        }
        System.out.println(arr);

        arr.addlast(4);
        System.out.println(arr);

        arr.set(2,4);
        System.out.println(arr);


        System.out.println(arr);


        System.out.println(arr.find(4));

//        int[] a = arr.findAll(11);


//        for(int i : a){
//            System.out.println(i);
//        }

//        arr.removeAllElement(4);
        System.out.println(arr);




    }
}
