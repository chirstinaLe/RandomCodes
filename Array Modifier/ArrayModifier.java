import java.util.*;

public class ArrayModifier {

    private static Scanner scan = new Scanner(System.in);

    private ArrayList<Integer> a;

    public ArrayModifier(){
        a = new ArrayList<Integer>(); 
        arrayMaker();
        System.out.println("ended");

    }

    public int getMin(){
        int min=a.get(0);
        for(int i=1;i<a.size();i++){
            if(min>a.get(i)){
                min=a.get(i);
            }
        }
        return min;
    }

    public int getMax(){
        int min=a.get(0);
        for(int i=1;i<a.size();i++){
            if(min<a.get(i)){
                min=a.get(i);
            }
        }
        return min;
    }

    public int getSum(){
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
        }
        return sum;
    }

    private void arrayMaker(){
        while(true){
            try{
                addToArray(enterInt());
            }
            catch(Exception e){
                break;
            }
        }
    }

    private int enterInt(){
        System.out.println("Enter an int: ");
        return scan.nextInt();
    }

    private void addToArray(int i){
        a.add(i);
    }


    public static void main(String[] args){
        ArrayModifier r = new ArrayModifier();
        System.out.println(r.getSum());
    }
    
}

