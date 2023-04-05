public class array_sum_avg {
    public static void main(String[] args) {
        int sum=0;
        int [] arr = {1,2,3,4,5};
        int length = arr.length;
    for(int i=0;i<arr.length;i++){
        sum += arr[i];
        
    }
    double avg = sum/ length;
    System.out.println("the average of given array is " +avg);
    
}
}
