import java.util.ArrayList;

public class main {
	static ArrayList <VEHICULE> lstv = new ArrayList <VEHICULE>();
	public static void main(String[] args) {


		MOTO m= new MOTO(100,"Harley",10000,"AA012C",2,200);
		UTILITAIRE u= new UTILITAIRE(10,"camion",5000,"AB512C",50);
		UTILITAIRE u2= new UTILITAIRE(100000,"camion2",2000,"CC512C",20);
		VOITURE v= new VOITURE(50000,"Clio",12000,"EE012C",false);

		lstv.add(m);
		lstv.add(u);
		lstv.add(u2);
		lstv.add(v);
		int nbmoto=0;
		int nbvoiture=0;
		int nbutil=0;

		for(VEHICULE unV : lstv) 
		{

			if (unV instanceof MOTO)
			{
				nbmoto=nbmoto+1;
			}
			else if (unV instanceof UTILITAIRE)
			{
				nbutil=nbutil+1;
			}
			else if (unV instanceof VOITURE)
			{
				nbvoiture=nbvoiture+1;
			}

		}
		float pourcentage = (float)nbmoto/lstv.size()*100;
		System.out.println("stat moto = "+pourcentage+"%");
		pourcentage = (float)nbutil/lstv.size()*100;
		System.out.println("stat utilitaire = "+pourcentage+"%");
		pourcentage = (float)nbvoiture/lstv.size()*100;
		System.out.println("stat voiture = "+pourcentage+"%");
		float total=0;
		for(VEHICULE unV : lstv) 
		{
			total=total+unV.getPrix();
		}
		System.out.println("prix moyen = "+ (total/lstv.size())+" €");
		System.out.println("nb sup à 1000 : "+nbprixsup(1000));
		System.out.println("nb sup à 3000 : "+nbprixsup(3000));
		System.out.println("nb sup à 10000 : "+nbprixsup(10000));
		System.out.println("nb sup à 15000 : "+nbprixsup(15000));

	}

	public static int nbprixsup (float montant)
	{
		int total=0;
		/*
		for(VEHICULE unV : lstv) 
		{
			if(unV.getPrix()>montant)
				total=total+1;
		}*/
		for(int i=0 ; i!=lstv.size();i++) 
		{
			if(lstv.get(i).getPrix()>montant)
				total=total+1;
		}
		return total;
	}
}
