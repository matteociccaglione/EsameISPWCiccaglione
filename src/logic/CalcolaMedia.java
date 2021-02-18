package logic;

import java.util.List;

public class CalcolaMedia {
	public Double mediaLista(List<Integer> l, Integer i) throws IndexOutOfBoundsException{
		if(i==l.size()) {
			l.add(0);
		}
		Double num=0.0;
		for(int c=0;c<=i;c++) {
			num+=l.get(c);
		}
		if(i<0)
			throw new IndexOutOfBoundsException();
		return num/(i+1);
	}
}
