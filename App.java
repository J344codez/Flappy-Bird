import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //game window
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("FlappyBird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack(); //does not include title bar in dimensions
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
