package zadaca1;

public class Main {
	public static void main(String[] args) {
		Covek c = new Covek ();
		c.setIme("Klaudija");
		c.setPrezime("Kondovska");
		c.setEmbg("14100024150353");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());
	}

}

