import java.util.Random;

public class Main {


    public static double testQueue(Queue q, int opcount){

        long starttime = System.nanoTime();

        Random random = new Random();

        for(int i = 0; i< opcount; i++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for(int i = 0; i< opcount; i++){
            q.dequeue();
        }


        long endtime = System.nanoTime();

        return (endtime-starttime)/1000000000.0;
    }

    public static void main(String[] args) {


        int opcount = 100000;
        ArrayQueue<Integer> arrayqueue = new ArrayQueue<>();
        LoopQueue<Integer> loopqueue = new LoopQueue<>();
        LinkedListQueue<Integer> linkedlistqueue = new LinkedListQueue<>();

        double arrayq_time = testQueue(arrayqueue,opcount);
        System.out.println("ArrayQueue: time: "+ arrayq_time + " S");



        double loopq_time = testQueue(loopqueue,opcount);
        System.out.println("LoopQueue: time: "+ loopq_time + " S");


        double linkedlistq_time = testQueue(linkedlistqueue,opcount);
        System.out.println("LinkedlistQueue: time: "+ linkedlistq_time + " S");

//        for (int i = 0; i<10; i++){
//            queue.enqueue(i);
//            System.out.println(queue);
//
//            if (i%3 == 2){
//                queue.dequeue();
//                System.out.println(queue);
//
//            }
//        }


//        System.out.println("===========================================================");
//        for (int i = 0; i<10; i++){
//            loopqueue.enqueue(i);
//            System.out.println(loopqueue);
//
//            if (i%3 == 2){
//                loopqueue.dequeue();
//                System.out.println(loopqueue);
//
//            }
//        }
//
//
//        System.out.println("===========================================================");
//        for (int i = 0; i<10; i++){
//            linkedlistqueue.enqueue(i);
//            System.out.println(linkedlistqueue);
//
//            if (i%3 == 2){
//                linkedlistqueue.dequeue();
//                System.out.println(linkedlistqueue);
//
//            }
//        }
    }

}
