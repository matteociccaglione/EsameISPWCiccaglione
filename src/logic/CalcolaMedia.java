package logic;

import java.util.List;

public class CalcolaMedia {
	public Integer mediaLista(List<Integer> l, Integer i) throws IndexOutOfBoundsException{
		if(i==l.size()) {
			l.add(0);
		}
		Integer num=0;
		for(int c=0;c<=i;c++) {
			num+=l.get(c);
		}
		if(i<0)
			throw new IndexOutOfBoundsException();
		return num/(i+1);
	}
}
