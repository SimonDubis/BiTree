import java.util.Scanner;

public class Main {

    static Tree tree = new Tree();

    public static void search(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (tree.contains(n)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        tree.add(8);
        tree.add(3);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(10);
        tree.add(14);
        search();
        tree.forwardTraversal();
        tree.delete(6);
        tree.delete(10);
        tree.forwardTraversal();
        tree.simmetricTraversal();
        tree.backwardTraversal();
    }
}