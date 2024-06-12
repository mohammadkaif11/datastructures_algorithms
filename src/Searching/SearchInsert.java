package Searching;

public class SearchInsert {

    //Seraching | finding insert location
    public int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int Index=0;
        while (start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid]<target){
                Index=mid+1;
            }

            if (arr[mid] == target)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < target)
                start = mid + 1;

                // If x is smaller, ignore right half
            else
                end = mid - 1;

        }


        return Index;

    }

}
