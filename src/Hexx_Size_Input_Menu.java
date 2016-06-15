import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.GroupLayout.DEFAULT_SIZE;
import static javax.swing.GroupLayout.PREFERRED_SIZE;

public class Hexx_Size_Input_Menu extends JFrame {

    int size;
    private JSpinner size_input;

    int max_size=6, min_size=3;
    public Hexx_Size_Input_Menu(){

        InitUI();
    }
    public void InitUI(){
        JPanel panel =new JPanel();

        GroupLayout g_layout= new GroupLayout(panel);
        panel.setLayout(g_layout);
        add(panel,BorderLayout.CENTER);


        JButton submit = new JButton ("OK");
        //TODO: MAKE A BUTTON THAT RETURNS AND EXITS THIS WINDOW.

        size_input = new JSpinner();
        size_input.setValue(3);
        size_input.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if ( ((int) size_input.getValue())< min_size)
                {
                  size_input.setValue(min_size);
                }
                if ( ((int) size_input.getValue())> max_size)
                {
                     size_input.setValue(max_size); //Je sais pas si c'est la taille max du tableau Hexxagon
                }

                }
        });

        //TODO: MAKE THIS FUCKING MENU ALIGN IN THE CENTER OF THE WINDOW!
        g_layout.setAutoCreateContainerGaps(true);

        g_layout.setHorizontalGroup(g_layout.createSequentialGroup()
                     .addGroup(g_layout.createParallelGroup(CENTER)

                          .addComponent(submit)
                          .addComponent(size_input, DEFAULT_SIZE,
                                  DEFAULT_SIZE, PREFERRED_SIZE))

        );

        g_layout.setVerticalGroup(g_layout.createSequentialGroup()
                        .addGap(10)
                        .addComponent(size_input, DEFAULT_SIZE,
                                DEFAULT_SIZE, PREFERRED_SIZE)
                        .addGap(30)
                        .addComponent(submit)
        );

        pack();

        setTitle("Enter the size of the grid");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }
    //** Only for testing :/ **
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Hexx_Size_Input_Menu ml = new Hexx_Size_Input_Menu();
                ml.setVisible(true);
            }
        });
    }
}
