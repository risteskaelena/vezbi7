package zadaca3;

public class SportskiKlub implements Comparable <SportskiKlub> {

	private String klub;
	private String sport;
	private int clenovi;
	
	public String getKlub() {
		return klub;
	}
	public void setKlub(String klub) {
		this.klub = klub;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public int getClenovi() {
		return clenovi;
	}
	public void setClenovi(int clenovi) {
		this.clenovi = clenovi;
	}
	
	public SportskiKlub(String klub, String sport, int clenovi) {
		this.klub = klub;
		this.sport = sport;
		this.clenovi = clenovi;
	}
	
	public int compareTo(SportskiKlub objekt) {
		SportskiKlub x = (SportskiKlub) objekt;
		if(this.klub.equals(x.klub)) {
			return 0;
		}
		else {
			return this.klub.compareTo(x.klub);
		}
	}
	
}
