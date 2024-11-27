
abstract class VEHICULE {
	private int km;
	private String marque;
	private float prix;
	private String imat;
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getImat() {
		return imat;
	}
	public void setImat(String imat) {
		this.imat = imat;
	}
	public VEHICULE(int km, String marque, float prix, String imat) {
		super();
		this.km = km;
		this.marque = marque;
		this.prix = prix;
		this.imat = imat;
	}


}
