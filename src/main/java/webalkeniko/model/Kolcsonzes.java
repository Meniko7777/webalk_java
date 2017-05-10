package webalkeniko.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Kolcsonzes")
public class Kolcsonzes {

	@Id
	@Column(name="kolcsonzesID", nullable = false)
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int kolcsonzesID;
	@Column(name="db")
	@Min(value=1)
	private int db;
	@Column(name="datum")
	@NotNull
	private Date datum;
	@ManyToOne(optional = false)
	@JoinColumn(name="olvaso_id", nullable = false)
	private Olvaso olvaso;
	@OneToMany(cascade = CascadeType.DETACH)
	private List<Konyv> konyvek;

	
	protected Kolcsonzes() {
		
	}

	public Kolcsonzes(int kolcsonzesID, int db, Date datum, Olvaso olvaso, List<Konyv> konyvek) {
		super();
		this.kolcsonzesID = kolcsonzesID;
		this.db = db;
		this.datum = datum;
		this.olvaso = olvaso;
		this.konyvek = konyvek;
	}


	public int getKolcsonzesID() {
		return kolcsonzesID;
	}


	public void setKolcsonzesID(int kolcsonzesID) {
		this.kolcsonzesID = kolcsonzesID;
	}


	public int getDb() {
		return db;
	}


	public void setDb(int db) {
		this.db = db;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public Olvaso getOlvaso() {
		return olvaso;
	}


	public void setOlvaso(Olvaso olvaso) {
		this.olvaso = olvaso;
	}


	public List<Konyv> getKonyvek() {
		return konyvek;
	}


	public void setKonyvek(List<Konyv> konyvek) {
		this.konyvek = konyvek;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + db;
		result = prime * result + kolcsonzesID;
		result = prime * result + ((konyvek == null) ? 0 : konyvek.hashCode());
		result = prime * result + ((olvaso == null) ? 0 : olvaso.hashCode());
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
		Kolcsonzes other = (Kolcsonzes) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (db != other.db)
			return false;
		if (kolcsonzesID != other.kolcsonzesID)
			return false;
		if (konyvek == null) {
			if (other.konyvek != null)
				return false;
		} else if (!konyvek.equals(other.konyvek))
			return false;
		if (olvaso == null) {
			if (other.olvaso != null)
				return false;
		} else if (!olvaso.equals(other.olvaso))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Kolcsonzes [kolcsonzesID=" + kolcsonzesID + ", db=" + db + ", datum=" + datum + ", olvaso=" + olvaso
				+ ", konyvek=" + konyvek + "]";
	}
	
	
}
