
public class MOTO extends VEHICULE{

private int nbroue;
private int cm;
public int getNbroue() {
	return nbroue;
}
public void setNbroue(int nbroue) {
	this.nbroue = nbroue;
}
public int getCm() {
	return cm;
}
public void setCm(int cm) {
	this.cm = cm;
}
public MOTO(int km, String marque, float prix, String imat, int nbroue, int cm) {
	super(km, marque, prix, imat);
	this.nbroue = nbroue;
	this.cm = cm;
}



}
