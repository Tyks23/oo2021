import org.junit.*;
import static org.junit.Assert.*;
public class KalkulaatoriTestid{
	KalkulaatoriLiides k=new Kalkulaator();
	@Before
	public void puhasta(){
		k.vajutus("C");
	}
	@Test
	public void sisestus1(){
		assertEquals("0", k.kuvatav());
		k.vajutus("2");
		assertEquals("2", k.kuvatav());
	}
	@Test
	public void sisestus2(){
		k.vajutus("3");
		k.vajutus("5");
		assertEquals("35", k.kuvatav());
	}
	@Test
    public void sisestus3() {
        k.vajutus("2");
        k.vajutus("0");
        k.vajutus("0");
        k.vajutus("5");
        assertEquals("2005", k.kuvatav());
		k.vajutus("C");
		assertEquals("0", k.kuvatav());
    }
	@Test
	public void arvutus1(){
		k.vajutus("3");
        k.vajutus("+");
		assertEquals("3", k.kuvatav());
        k.vajutus("2");
		assertEquals("2", k.kuvatav());
        k.vajutus("=");
		assertEquals("5", k.kuvatav());
	}
	@Test
	public void arvutus2(){
		k.vajutus("5");
		k.vajutus("0");
        k.vajutus("-");
		assertEquals("50", k.kuvatav());
        k.vajutus("2");
		k.vajutus("5");
		//System.out.println(k.kuvatav());
	
		assertEquals("25", k.kuvatav());
        k.vajutus("=");
		assertEquals("25", k.kuvatav());
	}
	@Test
	public void arvutus3(){
		k.vajutus("1");
		k.vajutus("0");
		assertEquals("10", k.kuvatav());
        k.vajutus("*");
		assertEquals("10", k.kuvatav());
        k.vajutus("2");
		k.vajutus("0");
		assertEquals("20", k.kuvatav());
        k.vajutus("=");
		assertEquals("200", k.kuvatav());
	}
	@Test
	public void arvutus4(){
		k.vajutus("1");
		k.vajutus("0");
		assertEquals("10", k.kuvatav());
        k.vajutus("/");
		assertEquals("10", k.kuvatav());
        k.vajutus("4");
		
		assertEquals("4", k.kuvatav());
        k.vajutus("=");
		assertEquals("2.5", k.kuvatav());
	}
	@Test
	public void arvutus5(){
		k.vajutus("1");
		k.vajutus("0");
		assertEquals("10", k.kuvatav());
        k.vajutus("m+");
		assertEquals("10", k.kuvatav());
        k.vajutus("4");
		assertEquals("4", k.kuvatav());
		k.vajutus("C");
		assertEquals("0", k.kuvatav());
		k.vajutus("3");
		k.vajutus("+");
		k.vajutus("mr");
		assertEquals("10", k.kuvatav());
        k.vajutus("=");
		assertEquals("13", k.kuvatav());
		
	}
	@Test
	public void sisestus4(){
		k.vajutus("2");
		k.vajutus("0");
		assertEquals("20", k.kuvatav());
        k.vajutus("m+");
		assertEquals("20", k.kuvatav());
        k.vajutus("mc");
		assertEquals("20", k.kuvatav());
		k.vajutus("mr");
		assertEquals("0", k.kuvatav());
		
		
	}
	@Test
	public void sisestus5(){
		k.vajutus("2");
		k.vajutus("0");
		assertEquals("20", k.kuvatav());
        k.vajutus("m+");
		k.vajutus("1");
		k.vajutus("0");
		assertEquals("10", k.kuvatav());
        k.vajutus("m+");
		assertEquals("10", k.kuvatav());
		k.vajutus("mr");
		assertEquals("30", k.kuvatav());
		
		
	}
}