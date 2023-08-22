
public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Mustermann");
		p1.setVorname ("Max");
		
		Person p2 = new Person();
		p2.setName("Musterfrau");
		p2.setVorname("Maxime");
		
		System.out.println ("Name Person p1: "+p1.getName());
		System.out.println ("Vorname Person p1: "+p1.getVorname());
					
		System.out.println ("Name Person p2: "+p2.getName());
		
	}

}
