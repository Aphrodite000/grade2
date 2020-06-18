import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            int n=Integer.parseInt(sc.nextLine());
            if(n==0){
                break;
            }
            String s=sc.nextLine();
            String[] str=s.split(" ");
            int[] a=new int[str.length];
            for(int i=0;i<str.length;i++){
                a[i]=Integer.parseInt(str[i]);
            }
            int grade=Integer.parseInt(sc.nextLine());
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<a.length;i++){
                int c=map.getOrDefault(a[i],0);
                map.put(a[i],c+1);
            }
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                if(e.getKey()== grade){
                    System.out.println(e.getValue());
                }
            }
        }
    }
}

