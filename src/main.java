import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>(10);
        doubleArrayList.add(1.2d);
        doubleArrayList.add(1.4d);
        doubleArrayList.add(1.9d);
        doubleArrayList.add(1.8d);
        System.out.println("các phần tử có trong doubleArrayList:");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator = doubleArrayList.iterator();
        System.out.println("các phần tử có trong doubleArrayList:");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        ListIterator<Double> listIterator = doubleArrayList.listIterator();
        System.out.println("các phần tử có trong doubleArrayList:");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t");
        }

        doubleArrayList.remove(2);
        System.out.println("sau khi xoa");
        System.out.println(doubleArrayList);

        Object[] arr = doubleArrayList.toArray();
        System.out.println(arr);
        for (int i= 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for (double i:doubleArrayList
             ) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("phan tu co index = 1 la:");
        System.out.println(doubleArrayList.get(1));
        System.out.println("sau khi cap nhat gia tri:");
        doubleArrayList.set(1,2.5d);
        System.out.println(doubleArrayList.get(1));

        boolean resultCheck = doubleArrayList.contains(2.5d);
        if (resultCheck){
            System.out.println("co ton tai phan tu 2.5d");
        }else {
            System.out.println("khong ton tai phan tu 2.5d");
        }
        System.out.println("tim kiem vi tri xuat hien dau tien cua phan tu");
        int position = doubleArrayList.indexOf(1.8d);
        System.out.println(position);
        //neu khong tim thay thi tra ve -1
        position = doubleArrayList.indexOf(2.0d);
        System.out.println(position);

        doubleArrayList.add(1.8d);

        System.out.println(doubleArrayList);
        System.out.println("tim kiem vi tri xuat hien cuoi cung cua phan tu");
        position = doubleArrayList.lastIndexOf(1.8d);
        System.out.println(position);
        //neu khong tim thay tra ve -1
        position = doubleArrayList.lastIndexOf(2.0d);
        System.out.println(position);
    }


}
