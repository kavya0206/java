package arraysum;
import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
private static ArrayList<Integer> num=new ArrayList<>();

public   Swap(ArrayList<Integer> Probablity) {
    num=Probablity;
    sort_select();


}
public static void sort_select() {

    for(int i=0;i<num.size();i++) {
        int min=num.get(i);
        int min_index=i;
     for(int j=i+1;j<num.size();j++) {
            if(num.get(j)<min) {
                min=num.get(j);
                min_index=j;

            }
        }
        if(i!=min_index) {
           exchange(i,min_index);
        }
    }
    System.out.println("Sorted list are : ");
    for(int x:num) {
        System.out.print(x+" ");
    }
}

public static void exchange(int current_elem,int new_min) {
    int temp=num.get(current_elem);
    num.set(current_elem, num.get(new_min));
    num.set(new_min, temp);

}

public static void main(String[] args) {
    System.out.println("Enter size of list");
    Scanner in=new Scanner(System.in);
    int num_count=in.nextInt();
    System.out.println("Enter the numbers in list");
    ArrayList<Integer> userlist=new ArrayList<>();

    for(int i=0;i<num_count;i++) {
        userlist.add(in.nextInt());
    }
    Swap s=new Swap(userlist);

}
}