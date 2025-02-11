public class reverseArray{
public static void main(String[] args){
int [] arr = {1,5,8,7,6,9};
int start = 0;
int temp;
int last = arr.length-1;
for(int i=0; i<arr.length; i++){
 if(start<last){
 temp = arr[start]; 
arr[start] = arr[last];
arr[last] = temp;
 start++;
last--;
}
}
for(int a : arr){
System.out.println(a);
}
}
}