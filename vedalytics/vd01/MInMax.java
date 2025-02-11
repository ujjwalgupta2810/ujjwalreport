import java.util.*;
public class MinMax{
public static void main(String[] args){
int max  =Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
int []arr = {2,5,23,5,24,65,24};
for(int i=0; i<arr.length; i++){
if(min> arr[i]){
min = arr[i];
}

if (max<arr[i]){
max = arr[i];
}
}
System.out.println(min);
System.out.println(max);
}
}