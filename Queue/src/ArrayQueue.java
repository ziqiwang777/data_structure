public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;


    public ArrayQueue(){
        array = new Array<>();
    }



    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }


    @Override
    public void enqueue(E e) {
        array.addlast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();

    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    public int getCapacity(){
        return array.getCapacity();
    }


    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , Capacioty = %d\n", array.getSize(), getCapacity()));
        res.append("front [");
        for (int i = 0; i<array.getSize();i++){
            res.append(array.get(i));
            if(i != array.getSize() -1){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
