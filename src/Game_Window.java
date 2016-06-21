import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Game_Window extends JPanel {
    Plateau game_board;
    Joueur players[];

    public Game_Window(Plateau gb, Joueur player[]){
        //System.out.print("I am here");
        game_board=gb;
        players=player;
        InitUI();
    }

    public void InitUI(){
        JLabel p_label = null;
        BufferedImage plateau=null;
        //setSize(1280,720);
        //setName("Hexthello");
        if (game_board.form_case==4)
        {
            //Partie spécifique a Othello
        }
        else if (game_board.form_case==6)
        {
            //Partie spécifique a Hexxagon
            if (game_board.larg==3)
            {
                try {
                    plateau = ImageIO.read(new File("HEXA/4x4/hexa-4x4.png"));
                }catch (IOException ex){
                    //Je sais pas quoi foutre, ce langage est merdique!
                }
            }
            if (game_board.larg==4)
            {
                try {
                    plateau = ImageIO.read(new File("HEXA/4x4/hexa-4x4.png"));
                }catch (IOException ex){
                    //Je sais pas quoi foutre, ce langage est merdique!
                }

            }
            if (game_board.larg==5)
            {
                try {
                    plateau = ImageIO.read(new File("HEXA/5x5/hexa-5x5.png"));
                }catch (IOException ex){
                    //Je sais pas quoi foutre, ce langage est merdique!
                }

            }
            if (game_board.larg==6)
            {
                try {
                    plateau = ImageIO.read(new File("HEXA/6x6/hexa-6x6.png"));
                }catch (IOException ex){
                    //Je sais pas quoi foutre, ce langage est merdique!
                }

            }
            if (game_board.larg==7)
            {
                try {
                    plateau = ImageIO.read(new File("HEXA/7x7/hexa-7x7.png"));
                }catch (IOException ex){
                    //Je sais pas quoi foutre, ce langage est merdique!
                }
            }
            Image dimg = plateau.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
            BufferedImage bimage = new BufferedImage(dimg.getWidth(null), dimg.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGr = bimage.createGraphics();
            bGr.drawImage(dimg, 0, 0, null);
            bGr.dispose();
            p_label= new JLabel(new ImageIcon(bimage));
            add(p_label);
        }
    }
}
