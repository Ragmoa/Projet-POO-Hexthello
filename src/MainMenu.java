import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame{

    public MainMenu(){
        InitUI();
    }

    private void InitUI(){
        createMenuBar();
        setTitle("Hexthello");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {
        //              --- Creation of meunubar, submenus and stuff ---
        JMenuBar menuBar = new JMenuBar();
        //->menubar
        JMenu new_game = new JMenu("New Game");
            //-->New Game
            JMenu hexxagon = new JMenu("Hexxagon");
                //--->Hexxagon
                JMenuItem h_pvp = new JMenuItem("Player vs Player");
                JMenuItem h_pve = new JMenuItem("Player vs IA");
            //-->New Game
            JMenu othello = new JMenu("Othello");
                //--->Othello
                JMenuItem o_pvp = new JMenuItem("Player vs Player");
                JMenuItem o_pve = new JMenuItem("Player vs IA");
        //->menubar
        JMenu leaderboard = new JMenu("Leaderbords");
            //-->Leaderboard
            JMenu l_show= new JMenu("Show");
                //--->Show
                JMenuItem l_hexxagon = new JMenuItem("Hexxagon Leaderboards");
                JMenuItem l_othello = new JMenuItem("Othello Leaderboards");
            //-->Leaderboard
            JMenu l_reset = new JMenu("Reset");
                //--->Reset
                JMenuItem r_hexxagon = new JMenuItem("Hexxagon Leaderboards");
                JMenuItem r_othello = new JMenuItem("Othello Leaderboards");
        //->menubar
        JMenuItem exit_button = new JMenuItem("Quit");

        //              --- Building Menu Architecture ---
        //->menubar
        menuBar.add(new_game);
            //-->New Game
            new_game.add(hexxagon);
                //--->Hexxagon
                hexxagon.add(h_pve);
                hexxagon.add(h_pvp);
            //-->New Game
            new_game.add(othello);
                //--->Othello
                othello.add(o_pve);
                othello.add(o_pvp);
        //->menubar
        menuBar.add(leaderboard);
            //-->Leaderboard
            leaderboard.add(l_show);
                //--->Show
                l_show.add(l_hexxagon);
                l_show.add(l_othello);
            //-->Leaderboard
            leaderboard.add(l_reset);
                //--->Rest
                l_reset.add(r_hexxagon);
                l_reset.add(r_othello);
        //->menubar (For the quit button to be on the right end of the menu bar)
        menuBar.add(Box.createHorizontalGlue());
        //->menubar
        menuBar.add(exit_button);

        //                  --- Making the buttons actually do stuff ---
        //TODO: NOT WORKING YET... :/
        h_pve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p_size=get_spinner("Entrez la taille du tableau",3,6);
            }
        });
        //TODO: LA SUITE





        //->menubar
        exit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        //                  --- Build command ---
        setJMenuBar(menuBar);
    }

    public static void main (String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu start_here = new MainMenu();
                start_here.setVisible(true);
            }
        });
    }
    public int get_spinner(String message, int min, int max){//Displays a spinner to select a value between min and max, with the question message.
        JOptionPane input_size= new JOptionPane();
        JSpinner spinner = new JSpinner();
        spinner.setValue(((max-min)/2)+min);
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if ((int) spinner.getValue() > max) {
                    spinner.setValue(max);
                }
                if ((int) spinner.getValue() < min) {
                    spinner.setValue(min);
                }
            }
        });

        int lel=input_size.showOptionDialog(null,spinner,message,JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (lel== JOptionPane.CANCEL_OPTION){
            lel=0;
        }
        else
        {
            lel=(int)spinner.getValue();
        }
        return lel;

    }

}

