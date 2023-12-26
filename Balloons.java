import java.util.*;
public class Balloons {
    public static void main(String[] args) {
        String s="Rsupppraa";
        s=s.toLowerCase();
        char arr[]=s.toCharArray();

        if(OddBalloons(arr)!=0){
            System.out.println(OddBalloons(arr));
        }else{
            System.out.println("all even");
        }
    }

    public static char OddBalloons(char arr[]) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        System.out.println("Map: " + map);

        //find first odd freq
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])%2!=0){
                return arr[i];
            }
        }
        return 0;
    }
}
