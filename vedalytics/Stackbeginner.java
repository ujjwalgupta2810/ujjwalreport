package vedalytics;
import java.util.Stack;
public class Stackbeginner {

	public static void main(String[] args) {
Stack <Integer> st = new Stack <>();
st.push(10);
System.out.println(st.peek());
st.push(20);
st.push(30);
st.push(140);
st.push(107);
st.push(108);
st.push(10);
st.push(109);
System.out.println(st.peek());
Stack <Integer> rt = new Stack<>();
while(st.size()>0) {
	int x = st.peek();
	rt.push(x);
	st.pop();
	
}
System.out.println(rt);
	}

}
