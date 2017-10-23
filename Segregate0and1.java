//http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/

public class Segregate0and1 {
    public static int solution(int[] arr) 
    {

        int left = 0, right = arr.length - 1, count=0;
 
        while (left < right) 
        {

            while (arr[left] == 0 && left < right)
               left++;

            while (arr[right] == 1 && left < right)
                right--;
 

            if (left < right) 
            {
                arr[left] = 0;
                arr[right] = 1;
                count++;
                left++;
                right--;
            }
           
        }
        return count;
    }
    public static void main(String args[]) {
        int[] arr = {1,0,1,0,1};
        System.out.println(solution(arr));
    }
}
