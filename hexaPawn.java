public class hexaPawn extends Pion
		
	public hexaPawn[] neighbords;

	public hexaPawn(int own){
		neighbords = new hexaPawn[6];
		val = own ;
	}

	public int ValidMove(vect start, vect end, Plateau_Hexagon board){                                                            
        	vect dpl; 
        	move Res;                                                                                               
       		int normSquare;                                                                                         

        	dpl.x=end.x-start.x;
        	dpl.y=end.y-start.y;                                                                                    

        	if(end.x>=0 && end.x<board.size && end.y>=0 && end.y<board.size && board.pion[end.x][end.y].val==0){
                	normSquare=(dpl.x*dpl.x)+(dpl.y*dpl.y);                                                         

                	if(dpl.x*dpl.y>=0){                                                                             
                        	if(normSquare>=4 && normSquare<=8)                                                      
                                	Res=1;                                                                       
                        	else if(normSquare<=2)                                                                  
                                	Res=2;                                                                  
                        	else                                                                                    
                                	Res=3;                                                                   
                	}

                	else{
                        	if(normSquare==2)                                                                       
                                	Res=1;                                                                       
                        	else                                                                                    
                                	Res=3;                                                                   
                	}
        	}
       		else                                                                                                    
               		Res=3;                                                                                   

        	return Res;                                                                                             
	}


	public void playMove(Plateau_Hexagon board, vect start, vect end){
        	int i=0;

        	if(mvt==DUPLICATE){
                	board.pion[end.x][end.y].val = val;
        	}

        	else if(mvt==JUMP){
                	board.pion[end.x][end.y].val = val;
                	board.pion[start.x][start.y].val = EMPTY;
        	}

        	if(mvt==JUMP || mvt==DUPLICATE){
                	for(i=0; i<6 ; i++){
                        	if(board.pion[end.x][end.y].neighbords[i]!=null){
                                	if(board.pion[end.x][end.y].neighbords[i].val!=val && (board.pion[end.x][end.y].neighbords[i].val==2 || board.pion[end.x][end.y].neighbords[i].val==1) ){
                                        	board.pion[end.x][end.y].neighbords[i].val=val; 
                                	}
                        	}
                	}
        	}
	} 


	
}

