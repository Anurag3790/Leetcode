import java.util.*;

public class Intersection_of_Two_Arrays_II {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int hash[] = new int[1001];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                int ele = nums1[i];
                hash[ele] = hash[ele] +1;
            }
            for(int j=0;j<nums2.length;j++){
                int elem=nums2[j];
                if(hash[elem]>0){
                    hash[elem] = hash[elem] - 1;
                    list.add(elem);
                }
            }
            int[] ans = new int[list.size()];
            for(int i=0;i<list.size();i++){
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
