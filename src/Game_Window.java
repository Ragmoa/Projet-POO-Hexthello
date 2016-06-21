import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Game_Window extends JPanel {
    Plateau game_board;
    Joueur players[];

    public Game_Window(Plateau gb, Joueur player[]){
        game_board=gb;
        players=player;
        InitUI();
    }

    public void InitUI(){
        setSize(1280,720);
        setName("Hexthello");
        if (game_board.form_case==4)
        {
            //Partie spécifique a Othello
        }
        else if (game_board.form_case==6)
        {
            //Partie spécifique a Hexxagon
        }



    }
}
