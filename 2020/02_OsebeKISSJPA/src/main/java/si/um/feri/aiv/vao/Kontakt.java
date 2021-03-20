package si.um.feri.aiv.vao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kontakt {
	
	public Kontakt() {
		this("Neznan","");
	}
	
	public Kontakt(String tip, String naziv) {
		this.tip = tip;
		this.naziv = naziv;
		this.urejanje=true;
	}

	@Id
	@GeneratedValue
	private int id;
	private String tip;
	private String naziv;
	private boolean urejanje;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isUrejanje() {
		return urejanje;
	}

	public void setUrejanje(boolean urejanje) {
		this.urejanje = urejanje;
	}
	
}
