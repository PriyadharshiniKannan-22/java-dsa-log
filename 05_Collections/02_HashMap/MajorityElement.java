import java.util.HashMap;
class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int k = arr.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                 map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(int i:arr){
            if(map.get(i)>=k){
                System.out.println(i);
                return;
            }
        }
    }   
}
