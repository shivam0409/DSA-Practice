package Clone;
import java.util.*;
public class ShalllowCopyvsDeepCopy{

    //primitive copy with clone
    public static void primtiveArrayClone(){
    int[] arr=new int[]{4,9,17,23,47,32};
    int[] arreCopy=arr.clone();
    arreCopy[2]=27;
    System.out.println("Primitive Copied Array with clone >> "+arreCopy[2]);
    System.out.println("Original Array after clone updates >> "+arr[2]);
    }

     //primitive copy with copyOf
    public static void primtiveArrayCopyOf(){
    int[] arr=new int[]{4,9,17,23,47,32};
    int[] arreCopy=Arrays.copyOf(arr, arr.length);
    arreCopy[2]=27;
    System.out.println("Primitive Copied Array with copyOf >> "+arreCopy[2]);
    System.out.println("Original Array after copyOf updates >> "+arr[2]);
    }

    //primitive copy with System 

    public static void primtiveArraysystemarraycopy(){
    int[] arr=new int[]{4,9,17,23,47,32};
    int[] arreCopy=new int[arr.length];
    System.arraycopy(arr,0,arreCopy,0,arr.length);
    arreCopy[2]=27;
    System.out.println("Primitive Copied Array with System.arraycopy >> "+arreCopy[2]);
    System.out.println("Original Array after System.arraycopy updates >> "+arr[2]);
    }

     //String 

     //string copy with clone
    public static void stringArrayClone(){
    String[] arr=new String[]{"Shivam","Mayank","Rohit"};
    String[] arreCopy=arr.clone();
    arreCopy[2]="Ragahav";
    System.out.println("Primitive Copied Array with clone >> "+arreCopy[2]);
    System.out.println("Original Array after clone updates >> "+arr[2]);
    }

    //Wrapper class of primitives
    public static void IntegeArrayClone(){
    Integer[] arr=new Integer[]{23,46,78,89,95};
    Integer[] arreCopy=arr.clone();
    arreCopy[2]=87;
    System.out.println("Primitive Copied Array with clone >> "+arreCopy[2]);
    System.out.println("Original Array after clone updates >> "+arr[2]);
    }

    //Object Copy
    public static void ObjectClone(){
        Person p1=new Person("Shivam", 29, "D A V Public School");
        Person p2=p1.clone();
        p2.name="Daivik";
        System.out.println("Cloned updates   >>>>"+p2.name);
         System.out.println("Initial Object   >>>>"+p1.name);
    }

    //Object Arrays
    public static void ObjectArrayClone(){
    Person p1=new Person("Shivam", 29, "D A V Public School");
    Person p2=new Person("Rohan", 38, "D A V Public School");
    Person p3=new Person("Mohan", 75, "D A V Public School");
    Person p4=new Person("Sohan", 28, "D A V Public School");
    Person p5=new Person("Rajeev", 49, "D A V Public School");
    Person p6=new Person("Giriyappa", 69, "D A V Public School");
    Person[] pr = new Person[]{p1, p2, p3, p4, p5, p6};
    Person[] prclone = pr.clone();
    prclone[0].name="Manav";
    System.out.println("Primitive Copied Array with clone >> "+prclone[0].name);//object modified
    System.out.println("Original Array after clone updates >> "+pr[0].name);//object modified
    }

    public static void ObjectArrayCopyConstructor(){
    Person p1=new Person("Shivam", 29, "D A V Public School");
    Person p2=new Person("Rohan", 38, "D A V Public School");
    Person p3=new Person("Mohan", 75, "D A V Public School");
    Person p4=new Person("Sohan", 28, "D A V Public School");
    Person p5=new Person("Rajeev", 49, "D A V Public School");
    Person p6=new Person("Giriyappa", 69, "D A V Public School");
    Person[] pr = new Person[]{p1, p2, p3, p4, p5, p6};
    Person[] prcopy=new Person[pr.length];
    for(int i=0;i<pr.length;i++){
        prcopy[i]=new Person(pr[i]);
    }
    prcopy[0].name="Manav";
    System.out.println("Primitive Copied Array with clone >> "+prcopy[0].name);//object modified
    System.out.println("Original Array after clone updates >> "+pr[0].name);//object modified
    }

    public static void main(String [] args){
        primtiveArrayClone();
        primtiveArrayCopyOf();
        primtiveArraysystemarraycopy();
        stringArrayClone();
        IntegeArrayClone();
        ObjectArrayClone();
        ObjectArrayCopyConstructor();
        ObjectArrayCopyConstructor();
        ObjectClone();
    }
}
