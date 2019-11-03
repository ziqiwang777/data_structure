public class ArrayStack<Element> implements Stack<Element> {


    Array<Element> array;

    public ArrayStack(int capacity){
        array = new Array<Element>(capacity);
    }

    public ArrayStack(){
        array = new Array<Element>();

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
    public void push(Element e) {
        array.addlast(e);
    }

    @Override
    public Element pop() {
        return array.removeLast();
    }

    @Override
    public Element peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for(int i = 0; i<array.getSize();i++){
            res.append(array.get(i));
            if(i != array.getSize()-1){
                res.append(",");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
