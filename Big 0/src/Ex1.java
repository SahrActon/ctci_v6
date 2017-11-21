/**
 * Created by tommyacton on 21/11/2017.
 */
public class Ex1 {

    public int sum (int n){
        if (n <= 0 ){
            return 0;
        }

        return n + sum (n-1);
    }

    public static void main (String[] args){
       Ex1 ex1 =  new Ex1();
        //ex1.sum(3);
        System.out.print(ex1.sum(5));
    }
}
