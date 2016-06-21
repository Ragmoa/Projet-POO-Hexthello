public class Pion_Othello extends Pion
{
	
		public Pion_Othello()
		{
			val=0;
		}
	// J'ai vu que Ryckaert et Pablo ont utilisé des vecteurs pour dire où on a cliqué je fais alors de même
		boolean coup_pas_valide (Plateau_Othello P,Joueur J,vect pos)
		{
		    return ((verif_haut(P,J,pos)==0 && verif_bas(P,J,pos)==0 && verif_gauche(P,J,pos)==0 && verif_droite(P,J,pos)==0 && verif_hd(P,J,pos)==0 && verif_hg(P,J,pos)==0 && verif_bd(P,J,pos)==0 && verif_bg(P,J,pos)==0) || P.pion[pos.x][pos.y].val!=0);
		}
		
		int nb_pion_retourne(Plateau_Othello P,Joueur J,vect pos)
		{
			
			int a,b,c,d,e,f,g,h,somme;
			
			a=verif_haut(P,J,pos);
			b=verif_bas(P,J,pos);
			c=verif_gauche(P,J,pos);
			d=verif_droite(P,J,pos);
			e=verif_bd(P,J,pos);
			f=verif_bg(P,J,pos);
			g=verif_hd(P,J,pos);
			h=verif_hg(P,J,pos);
			
			somme=a+b+c+d+e+f+g+h;
			if (somme==0)
			{
				return -1;
			}
			else
			
				return somme;
			 
		}
		
		int verif_haut(Plateau_Othello P,Joueur J,vect pos)
		{
			if(pos.y>0)
			{
				int i=1;
				if((P.pion[pos.x][pos.y-i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x][pos.y-i].val==2 && pos.y-i>0)
					{
						i++;
					}
					if (P.pion[pos.x][pos.y-i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x][pos.y-i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x][pos.y-i].val==1 && pos.y-i>0)
					{
						i++;
					}
					if (P.pion[pos.x][pos.y-i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}

		int verif_bas(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
				if(pos.y <7)
				{
				if((P.pion[pos.x][pos.y+i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x][pos.y+i].val==2 && pos.y+i<7)
					{
						i++;
					}
					if (P.pion[pos.x][pos.y+i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x][pos.y+i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x][pos.y+i].val==1 && pos.y+i<7)
					{
						i++;
					}
					if (P.pion[pos.x][pos.y+i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}

		int verif_gauche(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.x>0)
			{
				if((P.pion[pos.x-i][pos.y].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x-i][pos.y].val==2 && pos.x-i>0)
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x-i][pos.y].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x-i][pos.y].val==1 && pos.x-i>0)
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}

		int verif_droite(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.x<7)
			{
				if((P.pion[pos.x+i][pos.y].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x+i][pos.y].val==2 && pos.x+i<7)
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x+i][pos.y].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x+i][pos.y].val==1 && pos.x+i<7)
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}

		int verif_hd(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.y>0 && pos.x<7)
			{
				if((P.pion[pos.x+i][pos.y-i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x+i][pos.y-i].val==2 && (pos.x+i<7 && pos.y-i>0) )
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y-i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x+i][pos.y-i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x+i][pos.y-i].val==1 && (pos.x+i<7 && pos.y-i>0) )
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y-i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0; 


		}

		int verif_hg(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.y>0 && pos.x>0)
			{
				if((P.pion[pos.x-i][pos.y-i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x-i][pos.y-i].val==2 && (pos.x-i>0 && pos.y-i>0) )
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y-i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x-i][pos.y-i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x-i][pos.y-i].val==1 && (pos.x-i>0 && pos.y-i>0) )
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y-i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}


		int verif_bg(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.y<7 && pos.x>0)
			{
				if((P.pion[pos.x-i][pos.y+i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x-i][pos.y+i].val==2 && (pos.x-i>0 && pos.y+i<7) )
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y+i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x-i][pos.y+i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x-i][pos.y+i].val==1 && (pos.x-i>0 && pos.y+i<7) )
					{
						i++;
					}
					if (P.pion[pos.x-i][pos.y+i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}


		int verif_bd(Plateau_Othello P,Joueur J,vect pos)
		{
			int i=1;
			if(pos.y<7 && pos.x<7)
			{
				if((P.pion[pos.x+i][pos.y+i].val==2) && (J.color=="Blanc"))
				{
					while (P.pion[pos.x+i][pos.y+i].val==2 && (pos.x+i<7 && pos.y+i<7))
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y+i].val==1)
					{
						return (i-1);
					}
					else return 0;
				}
				else if((P.pion[pos.x+i][pos.y+i].val==1) && (J.color=="Noir"))
				{
					while (P.pion[pos.x+i][pos.y+i].val==1 && (pos.x+i<7 && pos.y+i<7) )
					{
						i++;
					}
					if (P.pion[pos.x+i][pos.y+i].val==2)
					{
						return (i-1);
					}
					else return 0;
				}
				else return 0;
			}
			else return 0;


		}

		void haut_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_haut(P,J,pos)!=0)
		   {
			if((P.pion[pos.x][pos.y-i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x][pos.y-i].val==2)
				{
					P.pion[pos.x][pos.y-i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x][pos.y-i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x][pos.y-i].val==1)
				{
					P.pion[pos.x][pos.y-i].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void haut_droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_hd(P,J,pos)!=0)
		   {
			if((P.pion[pos.x+i][pos.y-i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x+i][pos.y-i].val==2)
				{
					P.pion[pos.x+i][pos.y-i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x+i][pos.y-i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x+i][pos.y-i].val==1)
				{
					P.pion[pos.x+i][pos.y-i].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_droite(P,J,pos)!=0)
		   {
			if((P.pion[pos.x+i][pos.y].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x+i][pos.y].val==2)
				{
					P.pion[pos.x+i][pos.y].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x+i][pos.y].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x+i][pos.y].val==1)
				{
					P.pion[pos.x+i][pos.y].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void bas_droite_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_bd(P,J,pos)!=0)
		   {
			if((P.pion[pos.x+i][pos.y+i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x+i][pos.y+i].val==2)
				{
					P.pion[pos.x+i][pos.y+i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x+i][pos.y+i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x+i][pos.y+i].val==1)
				{
					P.pion[pos.x+i][pos.y+i].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void bas_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_bas(P,J,pos)!=0)
		   {
			if((P.pion[pos.x][pos.y+i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x][pos.y+i].val==2)
				{
					P.pion[pos.x][pos.y+i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x][pos.y+i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x][pos.y+i].val==1)
				{
					P.pion[pos.x][pos.y+i].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void bas_gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_bg(P,J,pos)!=0)
		   {
			if((P.pion[pos.x-i][pos.y+i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x-i][pos.y+i].val==2)
				{
					P.pion[pos.x-i][pos.y+i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x-i][pos.y+i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x-i][pos.y+i].val==1)
				{
					P.pion[pos.x-i][pos.y+i].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_gauche(P,J,pos)!=0)
		   {
			if((P.pion[pos.x-i][pos.y].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x-i][pos.y].val==2)
				{
					P.pion[pos.x-i][pos.y].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x-i][pos.y].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x-i][pos.y].val==1)
				{
					P.pion[pos.x-i][pos.y].val=2;
					i++;
				}
			
			}
		}
		 
		}

		void haut_gauche_retourne(Plateau_Othello P, Joueur J, vect pos)
		{
		   int i=1;
		   if(verif_hg(P,J,pos)!=0)
		   {
			if((P.pion[pos.x-i][pos.y-i].val==2) && (J.color=="Blanc"))
			{
				while (P.pion[pos.x-i][pos.y-i].val==2)
				{
					P.pion[pos.x-i][pos.y-i].val=1;
					i++;
				}
			}
			else if((P.pion[pos.x-i][pos.y-i].val==1) && (J.color=="Noir"))
			{
				while (P.pion[pos.x-i][pos.y-i].val==1)
				{
					P.pion[pos.x-i][pos.y-i].val=2;
					i++;
				}
			
			}
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
		            if( !coup_pas_valide(P,J,pos) )
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
		            if(!coup_pas_valide(P,J,pos) && nb_pion_retourne(P,J,pos)>max )
		            {
		                max=nb_pion_retourne(P,J,pos);
		                posMax.x=pos.x;
		                posMax.y=pos.y;
		            }
		        }
		    }
		    return posMax;
		}


}


