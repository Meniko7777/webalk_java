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
@Table(name="Olvaso")
public class Olvaso {

	@Id
	@Column(name="okod", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int okod;
	@Column(name="nev")
	@NotEmpty
	private String nev;
	@Column(name="lakcim")
	@NotEmpty
	private String lakcim;
		
	protected Olvaso() {
		
	}

	public Olvaso(int okod, String nev, String lakcim) {
		super();
		this.okod = okod;
		this.nev = nev;
		this.lakcim = lakcim;
	}

	public int getOkod() {
		return okod;
	}

	public void setOkod(int okod) {
		this.okod = okod;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getLakcim() {
		return lakcim;
	}

	public void setLakcim(String lakcim) {
		this.lakcim = lakcim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lakcim == null) ? 0 : lakcim.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + okod;
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
		Olvaso other = (Olvaso) obj;
		if (lakcim == null) {
			if (other.lakcim != null)
				return false;
		} else if (!lakcim.equals(other.lakcim))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (okod != other.okod)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Olvaso [okod=" + okod + ", nev=" + nev + ", lakcim=" + lakcim + "]";
	}
	
	
}
