import javax.swing.*;
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
        JMenuBar menuBar = new JMenuBar();
        JMenu new_game = new JMenu();
        JMenu leaderboard = new JMenu();
        JButton exit_button = new JButton();

        menuBar.add(new_game);
        menuBar.add(leaderboard);
        menuBar.add(exit_button);

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

}
