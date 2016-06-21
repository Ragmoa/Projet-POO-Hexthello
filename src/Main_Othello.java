import java.util.Scanner;


public class Main_Othello{
	public static void Sim_Othello(Joueur J1,Joueur J2)
	{
	vect pos = new vect();
	Scanner sc=new Scanner(System.in);
	int cases_inva=sc.nextInt();
	sc.close();
	Plateau_Othello P = new Plateau_Othello(cases_inva);
	Pion_Othello pion = new Pion_Othello();
	Joueur Jcourant=J1;
	Joueur gagnant;
	int nb;
	int nbBlanc=2;
	int nbNoir=2;
	int rejouer=0;
	int tourImpossible=0;
	int typeJeu=0;
	
	do
	{
		do
		{
			//if(typeJeu==1)  ===>> VS JOUEUR
			//{
				if( pion.coup_possible(P, Jcourant)==0)
				{
					tourImpossible++;
				}
				else
				{	
					do
					{			
					//pos = mousel
					}while(pion.coup_pas_valide(P,Jcourant,pos));
					if(Jcourant.color=="Blanc")
					{
						
						nb=pion.nb_pion_retourne(P,Jcourant,pos);
						P.pion[pos.x][pos.y].val=1;
						pion.retourne_all(P,Jcourant,pos);
						nbBlanc=nbBlanc+nb+1;
						nbNoir=nbNoir-nb;
						tourImpossible=0;
						Jcourant=J2;
					}
					else if(Jcourant.color=="Noir")
					{
						nb=pion.nb_pion_retourne(P,Jcourant,pos);
						P.pion[pos.x][pos.y].val=2;
						pion.retourne_all(P,Jcourant,pos);
						nbNoir=nbNoir+nb+1;
						nbBlanc=nbBlanc-nb;
						tourImpossible=0;
						Jcourant=J1;
					}
				}			
			
			  
			/*  else if(typeJeu==2) ====>> VS IA
				if(pion.coup_possible(P,J)==0)
				{
					tourImpossible++;
				}
				else
				{
					if(Jcourant.color=="Blanc")
					{	
						do
						{			
							//pos = mousel
						}while(pion.coup_pas_valide(P,Jcourant,pos));
						
						nb=pion.nb_pion_retourne(P,Jcourant,pos);
						P.pion[pos.x][pos.y].val=1;
						pion.retourne_all(P,Jcourant,pos);
						nbBlanc=nbBlanc+nb+1;
						nbNoir=nbNoir-nb;
						tourImpossible=0;
						Jcourant=J2;
					}	
					else if(Jcourant.color=="Noir")
					{
						wait(1000);
						pos=pion.meilleur_coup_possible(P,Jcourant);
						nb=pion.nb_pion_retourne(P,Jcourant,pos);
						P.pion[pos.x][pos.y].val=2;
						pion.retourne_all(P,Jcourant,pos);
						nbNoir=nbNoir+nb+1;
						nbBlanc=nbBlanc-nb;
						tourImpossible=0;
						Jcourant=J1;
					}
				}
			}*/
						
								
		
		}while( ((nbBlanc+nbNoir+cases_inva)!=64) && tourImpossible<2);
		if(nbBlanc>nbNoir)	
		{
			gagnant=J1;
			
		}
		else if(nbNoir>nbBlanc)
		{
			gagnant=J2;
		}
		//rejouer=choix_rejouer(); ===> ici faire une fct qui demande à l'utilisateur s'il veut rejouer
	
		nbBlanc=2;
		nbNoir=2;
		//J=J1;
	}while(rejouer==1);
	
	}
}

