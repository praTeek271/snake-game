import javax.swing.JFrame;

// import javax.swing.JFrame;

public class gameFrame extends JFrame{
    gameFrame(){
        this.add(new gamePAnel());
        this.setTitle("Snake-Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
}
