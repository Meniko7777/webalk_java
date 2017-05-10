package webalkeniko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Konyv")
public class Konyv {

	@Id
	@Column(name="kkod", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int kkod;
	@Column(name="szerzo")
	@NotEmpty
	private String szerzo;
	@Column(name="cim")
	@NotEmpty
	private String cim;
	
	protected Konyv()  {
		
	}

	public Konyv(int kkod, String szerzo, String cim) {
		super();
		this.kkod = kkod;
		this.szerzo = szerzo;
		this.cim = cim;
	}

	public int getKkod() {
		return kkod;
	}

	public void setKkod(int kkod) {
		this.kkod = kkod;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cim == null) ? 0 : cim.hashCode());
		result = prime * result + kkod;
		result = prime * result + ((szerzo == null) ? 0 : szerzo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konyv other = (Konyv) obj;
		if (cim == null) {
			if (other.cim != null)
				return false;
		} else if (!cim.equals(other.cim))
			return false;
		if (kkod != other.kkod)
			return false;
		if (szerzo == null) {
			if (other.szerzo != null)
				return false;
		} else if (!szerzo.equals(other.szerzo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Könyv kódja: " + kkod + ", szerzője: " + szerzo + ", címe: " + cim;
	}
	
	
}
