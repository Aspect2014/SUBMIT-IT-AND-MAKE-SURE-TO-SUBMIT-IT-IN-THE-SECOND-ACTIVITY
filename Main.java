import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of elements in the list: ");
        int n= sc.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        System.out.println("enter the "+n+" Integers: ");
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());

        }
        ArrayList<Integer> Answer=reverse(al);
        System.out.println("Reversed List: "+Answer);


    }
    static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> Answer=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            Answer.add(list.get(i));
        }
        return Answer;
    }
}