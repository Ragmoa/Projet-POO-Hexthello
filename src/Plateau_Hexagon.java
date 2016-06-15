public class Plateau_Hexagon extends Plateau {

	public hexaPawn[][] pion;
	
	public Plateau_Hexagon(int size){
		
		larg = size ;
		longu = size ;
		form_case = 6;
		form_plat = 4;
		
		pion = new hexaPawn[larg][longu] ;

		init_plateau() ;

	}
	
	private void init_plateau(){
		int i, j, k;

		for(i=0;i<larg;i++){
              		for(j=0;j<larg;j++){
                        	pion[i][j].val=0;
                        	for(k=0;k<6;k++)
                                	pion[i][j].neighbords[k]=null;
                	}   
        	}           
        	for(j=0;j<larg-1;j++){
                	for(i=0;i<larg-1;i++){
                        	pion[i][j].neighbords[1]=pion[i+1][j+1];
                        	pion[i][j].neighbords[3]=pion[i][j+1];
                        	pion[i][j].neighbords[4]=pion[i+1][j];
                	}   
                	pion[i][j].neighbords[3]=pion[i][j+1];
        	}   

        	j=larg-1;
        	for(i=0;i<larg-1;i++){
                	pion[i][j].neighbords[4]=pion[i+1][j];
        	}   

        	for(j=larg-1;j>0;j--){
                	for(i=larg-1;i>0;i--){
                        	pion[i][j].neighbords[0]=pion[i-1][j-1];
                        	pion[i][j].neighbords[5]=pion[i-1][j];
                        	pion[i][j].neighbords[2]=pion[i][j-1];
                	}   
                	pion[i][j].neighbords[2]=pion[i][j-1];
        	}   

        	j=0;
        	for(i=larg-1;i>0;i--){
                	pion[i][j].neighbords[5]=pion[i-1][j];
        	}	
		
	}


	public int isGameEnd(){ //return 0 Both can play ; 1 player 1 can't play ; 2 player 2 can't play ; 3 Both can't play
		int i, j;
	
		int res=0;
	
		vect pos = new vect();
			
		boolean pl1=false, pl2=false;

		for(i=0 ; i<larg ;i++){
			for(j=0; j<larg; j++){
				pos.x = i;
				pos.y = j;
				if(pion[i][j].val==1)
					pl1 = pl1 || pion[i][j].IsAlive(pos ,this) ;
				else if(pion[i][j].val==2)
					pl2 = pl2 || pion[i][j].IsAlive(pos, this) ;
			}
		}	
			
		if(!pl1&&pl2)
			res=1;
		else if(pl1&&!pl2)
			res=2;
		else if(!pl1&&!pl2)
			res=3;

		return res;

	}
}







