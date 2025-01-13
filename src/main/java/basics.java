import java.util.*;

public class basics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("here is your number "+n);

        ArrayList li = new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println("line 14"+ li.subList(0,1));
        System.out.println(li);
        li.remove(li.get(1));
        System.out.println(li);
        li.set(0,10);
        li.add(1);
        Set s = new HashSet();
        Collections.reverse(li);
        String str = li.toString();
        System.out.println(str);


    }
}
