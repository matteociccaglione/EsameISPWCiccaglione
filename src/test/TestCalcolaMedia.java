package test;

import org.junit.Test;

import logic.CalcolaMedia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
public class TestCalcolaMedia {
	@Test
	public void testMediaListaException() {
		CalcolaMedia foo=new CalcolaMedia();
		List<Integer> example=new ArrayList<>();
		example.add(23);
		assertThrows(IndexOutOfBoundsException.class, ()->foo.mediaLista(example, 2));
	}
	@Test
	public void testMediaListaException2() {
		CalcolaMedia foo=new CalcolaMedia();
		List<Integer> example=new ArrayList<>();
		example.add(42);
		assertThrows(IndexOutOfBoundsException.class, ()->foo.mediaLista(example, -1));
	}
	@Test
	public void testMediaListaException3() {
		CalcolaMedia foo=new CalcolaMedia();
		List<Integer> example=new ArrayList<>();
		example.add(10);
		assertThrows(IndexOutOfBoundsException.class, ()->foo.mediaLista(example, 1));
	}
	@Test
	public void testMediaListaCorrect() {
		CalcolaMedia foo=new CalcolaMedia();
		List<Integer> example=new ArrayList<>();
		example.add(42);
		example.add(51);
		example.add(92);
		assertEquals(93.0/2,foo.mediaLista(example, 1),0.05);
	}
}
