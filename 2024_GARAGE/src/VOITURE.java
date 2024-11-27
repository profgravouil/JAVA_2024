
public class VOITURE extends VEHICULE{

public VOITURE(int km, String marque, float prix, String imat, boolean famille) {
		super(km, marque, prix, imat);
		this.famille = famille;
	}

private boolean famille;

public boolean isFamille() {
	return famille;
}

public void setFamille(boolean famille) {
	this.famille = famille;
}



}
