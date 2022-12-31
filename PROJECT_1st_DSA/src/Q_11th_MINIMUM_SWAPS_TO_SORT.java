import java.util.Arrays;
import java.util.HashMap;

public class Q_11th_MINIMUM_SWAPS_TO_SORT	{
    public static int minSwaps(int[] nums)
    {
        int len = nums.length;
        HashMap<Integer, Integer> hM = new HashMap<>();
        for(int i=0;i<len;i++){
            hM.put(nums[i], i);
        }
             
        Arrays.sort(nums);  
         
        // To keep track of visited elements. Initialize all elements as not visited or false.
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);
         
          // Initialize result
        int ans = 0;
        for(int i=0;i<len;i++) {
            // already swapped and corrected or already present at correct pos
            if(visited[i] || hM.get(nums[i]) == i){
                continue;
            }
                    
            int j = i, cycle_size = 0;
            while(!visited[j]) {
                visited[j] = true;
                    
                // move to next node
                j = hM.get(nums[j]);
                cycle_size++;
            }
                
            // Update answer by adding current cycle.
            if(cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int []a = {1, 5, 4, 3, 2};
        System.out.println(minSwaps(a));
        int []b = {8, 9, 16, 15};
        System.out.println(minSwaps(b));
    }
}

		