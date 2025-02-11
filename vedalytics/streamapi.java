package vedalytics;
import java.util.*;
import java.util.stream.Collectors;
public class streamapi {

	public static void main(String[] args) {
List<Integer> list = Arrays.asList(5,10,15,35,20);
List<Integer> filterlist = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
System.out.print(filterlist);
	}

}
