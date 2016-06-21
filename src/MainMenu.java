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
               // hexxagon.add(h_pve);
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
        /*h_pve.addActionListener(new ActionListener() {  //Hexxagon PVE
            @Override
            public void actionPerformed(ActionEvent e) {
                start_h_game(true);

            }
        });*/

        h_pvp.addActionListener(new ActionListener() {  //Hexxagon PVP
            @Override
            public void actionPerformed(ActionEvent e) {
                start_h_game(false);
            }
        });
        o_pve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //Othello PVE
                start_o_game(true);
            }
        });
        o_pvp.addActionListener(new ActionListener() { //Othello PVP
            @Override
            public void actionPerformed(ActionEvent e) {
                start_o_game(false);
            }
        });
        //TODO: LEADERBOARDS





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
    public String get_string(String message, String def){
        JOptionPane string_input = new JOptionPane();
        Object obj;
        obj= string_input.showInputDialog(null, message,message,JOptionPane.QUESTION_MESSAGE,null,null,def);

        if (obj!=null) {
            return obj.toString();
        }
        else
        {
            return "\n";
        }
    }

    public void start_h_game(boolean j2ai)//to prepare an hexxagon game
    {
        if (j2ai) {
            /*int p_size = get_spinner("Entrez la taille du tableau", 3,7 );

            if (p_size != 0) {
                String j1_name=get_string("Entrez le nom du Joueur 1","Orangylux");
                if (j1_name!="\n") {
                    String c1 =color_selector(j1_name,0);
                    Joueur j1 = new Joueur(false, j1_name, 0, c1);
                    Joueur j2 = new Joueur(true, "Granolax", 0, "Bleu");
                    while (j1.color==j2.color)
                    {
                        j1.color=color_selector(j1_name,0);
                    }
                    //NO AI!
                    System.out.print("Lauuuuuuuunch!");
                    dispose();

                }
            }
            else
            {
                //LEAVE EMPTY
            }*/
        }
        else
        {
            int p_size = get_spinner("Entrez la taille du tableau", 3, 7);
            if (p_size != 0)
            {
                  String j1_name= get_string("Entrez le nom du Joueur 1","Orangylux");
                if (j1_name!="\n")
                {
                    String c1 =color_selector(j1_name,0);
                    Joueur j1 = new Joueur(false, j1_name, 0, c1);
                    String j2_name = get_string("Entrez le nom du Joueur 2", "Granolax");
                    if (j2_name!="\n")
                    {
                        String c2 =color_selector(j2_name,1);
                        Joueur j2 = new Joueur(false, j2_name, 0, c2);
                        while (j1.color==j2.color) {
                            j1.color = color_selector(j1_name, 0);
                            j2.color = color_selector(j2_name, 1);
                        }
                        //TODO: LAUNCH GAME
                    }
                }
            }
        }
    }
    public void start_o_game(boolean j2ai)
    {
        if (j2ai)
        {
            String j1_name=get_string("Entrez le nom du Joueur 1", "Orangylux");
            if (j1_name!="\n")
            {
                Joueur j1= new Joueur(false,j1_name,0,"Blanc");
                Joueur j2= new Joueur(true,"Granolax",0,"Noir");
                //TODO: LAUNCH GAME
            }
        }
        else
        {
            String j1_name=get_string("Entrez le nom du Joueur 1", "Orangylux");
            if (j1_name!="\n")
            {
                Joueur j1 = new Joueur(false, j1_name, 0, "Blanc");
                String j2_name= get_string("Entrez le nom du Joueur 2", "Granolax");
                if (j2_name!="\n")
                {
                    Joueur j2 = new Joueur(false, j2_name,0,"Noir");
                    //TODO:LAUNCH GAME
                }
            }

        }

    }
    public String color_selector(String titre, int i)
    {
        JOptionPane selector= new JOptionPane();
        String options[]={"Rouge","Bleu","Vert","Rose","Violet"};
        int retour= selector.showOptionDialog(this,"Choisissez votre couleur de pion","Couleur-"+ titre,1,3,null,options,options[i]);
        System.out.print(retour);
        if (retour == -1)
        {
            return options[i];
        }
        else
        {
            return options[retour];
        }
    }

}

