public class Plateau_Hexagon extends Plateau {
	
	public Plateau_Hexagon(int size){
		
		larg = size ;
		longu = size ;
		form_case = ;
		form_plat = ;
		
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
}
