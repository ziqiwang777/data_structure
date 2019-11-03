import apple.laf.JRSUIConstants;

import java.time.chrono.MinguoDate;
import java.util.Arrays;
import java.util.Objects;

public class Array<Element> {

    private Element[] data;
    private int size;

    // input the capacity of the Array
    public Array(int capacity){
        data =(Element[]) new Object[capacity];
        size = 0;
    }

    // constructe with out param, defualt capacity = 10
    public Array(){
        this(10);
    }

    //get size of the Array
    public int getSize() {
        return size;
    }

    //get Capacity of the Array
    public int getCapacity(){
        return data.length;
    }

    //return if the array is empty
    public boolean isEmpty(){
        return size==0;
    }

    //add a int to the last of array
    public void addlast(Element e){
        add(size,e);
    }

    //add a int to the first of array
    public void addfirst(Element e){
        add(0,e);
    }

    // insert the int: e to int: index location
    public void add(int index, Element e){

        if(size == data.length){
            //need to extend the array
            resize(2*data.length);
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("AddLast failed. Array is full");
        } else {
            for (int i = size - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            size++;
        }


    }

    //get the element in specific position
    public Element  get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    public Element getLast(){
        return get(size-1);
    }

    public Element getFirst(){
        return get(0);
    }
    //change the element in specific position
    public void set(int index,Element e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }else{
            data[index] = e;
        }
    }

    // check if this Array contians element e
    public boolean contains(Element e){
        for(int i = 0; i<size; i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    // get the index of the input element
    public int find(Element e){
        for(int i = 0; i<size; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

//    // get the All index of the input element
//    public int[] findAll(Element e){
//        Element[] removeindex =(Element[])new Object[data.length];
//        removeindex[0] = -1;
//        int subscript =0;
//        for(int i = 0; i<size; i++){
//            if(data[i].equals(e)){
//                removeindex[subscript] = i;
//                subscript++;
//            }
//        }
//        int[] newremoveindex;
//        if (removeindex[0] == -1){
//            newremoveindex = Arrays.copyOfRange(removeindex, 0, 1);
//        }else{
//            newremoveindex = Arrays.copyOfRange(removeindex, 0, subscript);
//        }
//        return newremoveindex;
//
//    }


    // remove the first element in the Array
    public Element removeFirst(){
        return remove(0);
    }

    // remove the Last element in the Array
    public Element removeLast(){
        return remove(size-1);
    }

    // remove the element in the specific position
    public Element remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }else{
            Element ret = data[index];
            for(int i = index; i < size-1; i++){
                data[i] = data[i+1];
            }
            size--;
            data[size] = null;
            if(size == data.length/4 && data.length/2 != 0){
                resize(data.length/2);
            }
            return ret;
        }
    }

    // delete the input element in the Array
    public void removeElement(Element e){
        int index = find(e);

        if(index != -1){
            remove(index);
        }
    }

//    // get the remove all the input element in the Array
//    public void removeAllElement(int e){
//        int[] newdata = new int[data.length];
//        int subscript = 0;
//        for(int i = 0;i<size;i++){
//            if(data[i] != e){
//                newdata[subscript] = data[i];
//                subscript ++;
//            }
//        }
//        data = newdata;
//        size = subscript;
//
//    }





    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , Capacioty = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i<size;i++){
            res.append(data[i]);
            if(i != size -1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }




    private void resize(int newcapacity){
        Element[] newdata = (Element[]) new Object[newcapacity];

        for(int i = 0;i<size;i++){
            newdata[i] = data[i];

        }
        data = newdata;
    }
}


