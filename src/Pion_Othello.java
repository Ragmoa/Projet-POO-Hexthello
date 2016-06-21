public class Pion_Othello extends Pion
{
	public Pion_Othello()
		{
			val=0;
		}
	// J'ai vu que Ryckaert et Pablo ont utilisé des vecteurs pour dire où on a cliqué je fais alors de même
		boolean est_debut_coup_valide (Plateau_Othello P,Joueur J,vect pos)
		{
		    return (
		    (pos.x >= 0) && (pos.x < 8) &&
		    (pos.y >= 0) && (pos.y < 8) &&
		    (P.pion[pos.x][pos.y].val == 0)&&
		    ((P.pion[pos.x+1][pos.y].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x+1][pos.y].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x+1][pos.y+1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x+1][pos.y+1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x+1][pos.y-1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x+1][pos.y-1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x][pos.y+1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y+1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x][pos.y-1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y-1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x-1][pos.y-1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x-1][pos.y-1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x-1][pos.y+1].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x-1][pos.y+1].val == 2 && J.Couleur=="Blanc"))&&
		    ((P.pion[pos.x-1][pos.y].val== 1 && J.Couleur=="Noir")||( P.pion[pos.x-1][pos.y].val == 2 && J.Couleur=="Blanc"))
		   		 );
		}
		
		int haut_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x+i][pos.y].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x+i][pos.y].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int haut_droite_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x+i][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y+i].val == 2 && J.Couleur=="Blanc"));


		    if ( P.pion[pos.x+i][pos.y+i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int droite_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y+i].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x][pos.y+i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int bas_droite_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x-i][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y+i].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x-i][pos.y+i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int bas_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x-i][pos.y].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x-i][pos.y].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int bas_gauche_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x-i][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y-i].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x-i][pos.y-i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int gauche_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y-i].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x][pos.y-i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}

		int haut_gauche_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i=0;
		    do
		    {
		   	 i++;
		    }while((P.pion[pos.x+i][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y-i].val == 2 && J.Couleur=="Blanc"));

		    if ( P.pion[pos.x+i][pos.y-i].val==0)
		    {
		   	 return i;
		    }
		    else
		    return 0;

		}
		
		int est_coup_valide(Plateau_Othello P, Joueur J, vect pos)
		{
		    int i,j,k,l,m,n,o,p;
		    
		   		 i=haut_valide(P,J,pos);
		   		 j=haut_droite_valide(P,J,pos);
		   		 k=droite_valide(P,J,pos);
		   		 l=bas_droite_valide(P,J,pos);
		   		 m=bas_valide(P,J,pos);
		   		 n=bas_gauche_valide(P,J,pos);
		   		 o=gauche_valide(P,J,pos);
		   		 p=haut_gauche_valide(P,J,pos);
		   		 
		   	if(i+j+k+l+m+n+o+p!=0)
		   		 return i+j+k+l+m+n+o+p;
		   	 

		    else return 0;
		}
		
		void haut_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x+i][pos.y].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y].val == 2 && J.Couleur=="Blanc"))
		    {
		        if(P.pion[pos.x+i][pos.y].val==1)
		        	P.pion[pos.x+i][pos.y].val=2;
		        else
		        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void haut_droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		    while((P.pion[pos.x+i][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y+i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	if(P.pion[pos.x+i][pos.y].val==1)
		        	P.pion[pos.x+i][pos.y].val=2;
		        else
		        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		    while((P.pion[pos.x][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y+i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	if(P.pion[pos.x+i][pos.y].val==1)
		        	P.pion[pos.x+i][pos.y].val=2;
		        else
		        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void bas_droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x-i][pos.y+i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y+i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	  if(P.pion[pos.x+i][pos.y].val==1)
			        	P.pion[pos.x+i][pos.y].val=2;
			        else
			        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void bas_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x-i][pos.y].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y].val == 2 && J.Couleur=="Blanc"))
		    {
		    	  if(P.pion[pos.x+i][pos.y].val==1)
			        	P.pion[pos.x+i][pos.y].val=2;
			        else
			        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void bas_gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x-i][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x-i][pos.y-i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	  if(P.pion[pos.x+i][pos.y].val==1)
			        	P.pion[pos.x+i][pos.y].val=2;
			        else
			        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x][pos.y-i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	  if(P.pion[pos.x+i][pos.y].val==1)
			        	P.pion[pos.x+i][pos.y].val=2;
			        else
			        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void haut_gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		      int i=1;
		      while((P.pion[pos.x+i][pos.y-i].val==1 && J.Couleur=="Noir")||( P.pion[pos.x+i][pos.y-i].val == 2 && J.Couleur=="Blanc"))
		    {
		    	  if(P.pion[pos.x+i][pos.y].val==1)
			        	P.pion[pos.x+i][pos.y].val=2;
			        else
			        	P.pion[pos.x+i][pos.y].val=1;
		   	 i++;
		    }

		}

		void retourne_all(Plateau_Othello P,Joueur J, vect pos)
		{
		    haut_retourne(P, J,pos);
		    haut_droite_retourne(P, J,pos);
		    droite_retourne(P, J,pos);
		    bas_droite_retourne(P, J,pos);
		    bas_retourne(P, J,pos);
		    bas_gauche_retourne(P, J,pos);
		    gauche_retourne(P, J,pos);
		    haut_gauche_retourne(P, J,pos);

		}
		
		
		int coup_possible(Plateau_Othello P,Joueur J)
		{
		    vect pos = new vect();
		    int nbcoup=0;
		    for(pos.x=0;pos.x<8;pos.x++)
		    {
		        for(pos.y=0;pos.y<8;pos.y++)
		        {
		            if(est_debut_coup_valide(P,J,pos) && est_coup_valide(P,J,pos)!=0 )
		            {
		                nbcoup++;
		            }
		
		        }
		    }
		    return nbcoup;
		}
		
		vect meilleur_coup_possible(Plateau_Othello P,Joueur J)
		{
			vect pos = new vect();
			vect posMax = new vect();
		    int max=0;
		    for(pos.x=0;pos.x<8;pos.x++)
		    {
		        for(pos.y=0;pos.y<8;pos.y++)
		        {
		            if(est_debut_coup_valide(P,J,pos) && est_coup_valide(P,J,pos)>max )
		            {
		                max=est_coup_valide(P,J,pos);
		                posMax.x=pos.x;
		                posMax.y=pos.y;
		            }
		        }
		    }
		    return posMax;
		}

}
