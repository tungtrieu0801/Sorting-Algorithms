import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int[]arr = {8,2,4,3,1,5,7,12};
        mergeSort(arr);
        for(int i = 0; i<arr.length;i++) {
        	System.out.println(arr[i]+ " ");
        }
    }
	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length;
		if(length <=1) return;
		int middle = length/2;
		int [] leftarr = new int [middle];
		int [] rightarr = new int [length-middle];
		int i = 0; //left arr
		int j = 0; //;eft arr
		for(;i<length;i++) {
			if(i<middle) {
				leftarr[i] = arr [i];
			}else {
				rightarr[j] = arr[i];
				j++;
			}
		}
		mergeSort(leftarr);
		mergeSort(rightarr);
		merge(leftarr, rightarr, arr);
	}
	private static void merge(int []leftarr, int []rightarr, int [] arr) {
		int leftsize = arr.length/2;
		int rightsize = arr.length-leftsize;
		int i = 0, l=0,r=0;
		while(l<leftsize && r<rightsize) {
			if(leftarr[l]< rightarr[r]) {
				arr[i] = leftarr[l];
				i++;
				l++;
			}else {
				arr[i] = rightarr[r];
				i++;
				r++;
			}
		}
		while(l<leftsize) {
			arr[i] = leftarr[l];
			i++;
			l++;
		}
		while(r<rightsize) {
			arr[i] = rightarr[r];
			i++;
			r++;
		}
	}
}

