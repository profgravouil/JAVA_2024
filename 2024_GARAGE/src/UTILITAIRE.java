
public class UTILITAIRE extends VEHICULE{
private int volume;

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}

public UTILITAIRE(int km, String marque, float prix, String imat, int volume) {
	super(km, marque, prix, imat);
	this.volume = volume;
}


}
