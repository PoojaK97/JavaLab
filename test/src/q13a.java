import java.util.*;

abstract class Reservation{
	public abstract boolean reserve(int s, char t);
	public abstract int getSeats();
}

class bus extends Reservation{
	int first = 20;
	int second = 20;
	public boolean reserve(int s, char t) {
		if(t=='f') {
			if(s<=first)
				first -= s;
			else
				return(false);
		}
		else {
			if(s<=second)
				second -= s;
			else
				return(false);
		}
		return(true);
	}
	public int getSeats() {
		return (first+second);
	}
}

class train extends Reservation{
	int first = 20;
	int second = 20;
	public boolean reserve(int s, char t) {
		if(t=='f') {
			if(s<=first)
				first -= s;
			else
				return(false);
		}
		else {
			if(s<=second)
				second -= s;
			else
				return(false);
		}
		return(true);
	}
	public int getSeats() {
		return (first+second);
	}
}

public class q13a {
public static void main(String[] args) {
	train t = new train();
	System.out.println(t.reserve(5,'s'));
	System.out.println(t.getSeats());
	System.out.println(t.reserve(10,'s'));
	System.out.println(t.getSeats());
	System.out.println(t.reserve(6,'s'));
	System.out.println(t.getSeats());
}
}