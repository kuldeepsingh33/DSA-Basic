import java.io.*;
import java.util.*;

public class Main {

  public static class MedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    private void redistribute(){
        int lsize = left.size();
        int rsize = right.size();
        if( (int)Math.abs(lsize-rsize) >=2){
            PriorityQueue<Integer> big = left.size()>right.size() ? left : right;
            PriorityQueue<Integer> small = left.size()>right.size() ? right : left;
            small.add(big.remove());

        }
    }

    public void add(int val) {
      // write your code here
      if(right.size()==0){
        left.add(val);
      }else{
        
        if(right.peek() < val) right.add(val);
        else left.add(val);
      }
      redistribute();


    }

    public int remove() {
      // write your code here
      if((right.size()+left.size()) == 0 ){
        System.out.println("Underflow");
        return -1;
      }
      if(left.size()==right.size()){
        return left.remove();
      }
      PriorityQueue<Integer> big = left.size()>right.size() ? left : right;
      return big.remove();
    }

    public int peek() {
      // write your code hereif(left.size()==right.size()){
      if((right.size()+left.size() )== 0 ){
        System.out.println("Underflow");
        return -1;
      }

      if(left.size()==right.size()){
        return left.peek();
      }
      PriorityQueue<Integer> big = left.size()>right.size() ? left : right;
      return big.peek();
    }

    public int size() {
      // write your code here
      return left.size() + right.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MedianPriorityQueue qu = new MedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
