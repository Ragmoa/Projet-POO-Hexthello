public class Plateau_Othello extends Plateau {

	public Pion_Othello[][] pion;
	
	public Plateau_Othello(int cases_inva){
		
		larg = 8;
		longu = 8;
		int cases_invalides=cases_inva;
		
		pion = new Pion_Othello[larg][longu] ;

		init_plateau(cases_invalides);

	}
	
	void init_plateau (int nb_cases)
	{
		
		int i,j;
		int c_cases=0;
		int l_cases=0;
		for(i=0;i<8;i++)
		{
		    for(j=0;j<8;j++)
		    {
		        pion[i][j].val=0;
		    }
		}
	
		pion[3][3].val=1;
		pion[3][4].val=2;
		pion[4][3].val=2;
		pion[4][4].val=1;
	
		for(i=0;i<nb_cases;i++)
		{
			do
			{
				c_cases=(int)( Math.random()*( 7 - 0 )+0 ); // Math random renvoie un nombre entre 0 et 1 pour avoir le nombre
				l_cases=(int)( Math.random()*( 7 - 0 )+0 ); // dans l'intervalle voulu il faut le multiplier par le max enlever le min comme suit
			}while((l_cases==4 && c_cases==4) || (l_cases==4 && c_cases==3)||(l_cases==3 && c_cases==4)||(l_cases==3 && c_cases==3));
			pion[l_cases][c_cases].val=-1;
		}
	}

	
}
