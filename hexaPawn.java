public class hexaPawn extends Pion{
		
	public hexaPawn[] neighbords;

	public hexaPawn(int own){
		neighbords = new hexaPawn[6];
		val = own ;
	}

	public int ValidMove(vect start, vect end, Plateau_Hexagon board){                                                            
        	vect dpl = new vect(); 
        	int Res;                                                                                               
       		int normSquare;                                                                                         

        	dpl.x=end.x-start.x;
        	dpl.y=end.y-start.y;                                                                                    

        	if(end.x>=0 && end.x<board.larg && end.y>=0 && end.y<board.larg && board.pion[end.x][end.y].val==0){
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
		int mvt = ValidMove(start, end, board);

        	if(mvt==2){
                	board.pion[end.x][end.y].val = val;
        	}

        	else if(mvt==1){
                	board.pion[end.x][end.y].val = val;
                	board.pion[start.x][start.y].val = 0;
        	}

        	if(mvt==1 || mvt==2){
                	for(i=0; i<6 ; i++){
                        	if(board.pion[end.x][end.y].neighbords[i]!=null){
                                	if(board.pion[end.x][end.y].neighbords[i].val!=val && (board.pion[end.x][end.y].neighbords[i].val==2 || board.pion[end.x][end.y].neighbords[i].val==1) ){
                                        	board.pion[end.x][end.y].neighbords[i].val=val; 
                                	}
                        	}
                	}
        	}
	} 


	public boolean IsAlive(vect pos, Plateau_Hexagon board){
        	int i=0, j=0;
		boolean res = false;

        	for(i=pos.x-2 ; i<=pos.x ; i++){
                	for(j=pos.y-2 ; j<=pos.y ; j++){
                        	if(j>=0 && i>=0 && j<board.larg && i<board.larg){
                                	if(board.pion[i][j].val==0){
                                        	res = true;
                                	}
                        	}
                	}
        	}

        	for(i=pos.x ; i<=pos.x+2 ; i++){
                	for(j=pos.y ; j<=pos.y+2 ; j++){
                        	if(j>=0 && i>=0 && j<board.larg && i<board.larg){
                                	if(board.pion[i][j].val==0){
                                        	res = true;
                                	}
                        	}
                	}	
        	}

        	i=pos.x+1;
        	j=pos.y-1;
       		if(j>=0 && i>=0 && j<board.larg && i<board.larg){
                	if(board.pion[i][j].val==0){
                        	        res = true;
                	}
        	}

       		i=pos.x-1;
        	j=pos.y+1;
        	if(j>=0 && i>=0 && j<board.larg && i<board.larg){
                	if(board.pion[i][j].val==0){
                        	        res = true;
                	}
        	}
	        return res;
	}
	
}

