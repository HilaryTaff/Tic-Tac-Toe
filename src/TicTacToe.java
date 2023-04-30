import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame{
    private JPanel MainPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn4;
    private JButton btn5;
    private JButton btn3;
    private JButton btn6;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JPanel SubPanel;
    private JLabel lblTac;
    boolean firstPlayer;
    int count;
    Random random = new Random();
    public TicTacToe() {
    ImageIcon icon = new ImageIcon("tic-tac-toe.png");
    setIconImage(icon.getImage());
    setTitle("Tit-Tac-Toe.");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,400);
    setContentPane(MainPanel);
    setVisible(true);
    setLocationRelativeTo(null);



    player1_turn();

    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            if (firstPlayer){
                btn1.setBackground(new Color(255,0,0));
                firstPlayer=false;
                btn1.setText("x");
                lblTac.setText("O's turn(Green)");
                btn1.setEnabled(false);

                checkWinner();
                checkTie();
            }
            else {
                btn1.setBackground(new Color(0,255,0));
                firstPlayer=true;
                lblTac.setText("X's turn(Red)");
                btn1.setText("o");
                btn1.setEnabled(false);

                checkWinner();
                checkTie();
            }

        }
    });
    btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn2.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn2.setText("x");
                    btn2.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn2.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn2.setText("o");
                    btn2.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn3.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn3.setText("x");
                    btn3.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn3.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn3.setText("o");
                    btn3.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn4.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn4.setText("x");
                    btn4.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn4.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn4.setText("o");
                    btn4.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn5.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn5.setText("x");
                    btn5.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn5.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn5.setText("o");
                    btn5.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn6.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn6.setText("x");
                    btn6.setEnabled(false);

                    checkWinner();
                    checkTie();                }
                else {
                    btn6.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn6.setText("o");
                    btn6.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn7.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn7.setText("x");
                    btn7.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn7.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn7.setText("o");
                    btn7.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn8.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    btn8.setText("x");
                    btn8.setEnabled(false);
                    lblTac.setText("0's turn(Green)");

                    checkWinner();
                    checkTie();
                }
                else {
                    btn8.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    btn8.setText("o");
                    btn8.setEnabled(false);
                    lblTac.setText("X's turn(Red)");

                    checkWinner();
                    checkTie();
                }
            }
        });
    btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (firstPlayer){
                    btn9.setBackground(new Color(255,0,0));
                    firstPlayer=false;
                    lblTac.setText("0's turn(Green)");
                    btn9.setText("x");
                    btn9.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
                else {
                    btn9.setBackground(new Color(0,255,0));
                    firstPlayer=true;
                    lblTac.setText("X's turn(Red)");
                    btn9.setText("o");
                    btn9.setEnabled(false);

                    checkWinner();
                    checkTie();
                }
            }
        });




    }
    public boolean checkWinner(){
        boolean isWinner=false;

        if(btn1.getText()=="x"&&btn2.getText()=="x"&&btn3.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
                return !isWinner;
        }
        else if(btn1.getText()=="o"&&btn2.getText()=="o"&&btn3.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn4.getText().equals("x") &&btn5.getText()=="x"&&btn6.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
                return !isWinner;
        }
        else if(btn4.getText()=="o"&&btn5.getText()=="o"&&btn6.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn7.getText()=="x"&&btn8.getText()=="x"&&btn9.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
                return !isWinner;
        }
        else if(btn7.getText()=="o"&&btn8.getText()=="o"&&btn9.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn3.getText()=="x"&&btn5.getText()=="x"&&btn7.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
            return !isWinner;
        }
        else if(btn3.getText()=="o"&&btn5.getText()=="o"&&btn7.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn1.getText()=="x"&&btn5.getText()=="x"&&btn9.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
            return !isWinner;
        }
        else if(btn1.getText()=="o"&&btn5.getText()=="o"&&btn9.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn1.getText()=="x"&&btn4.getText()=="x"&&btn7.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
            return !isWinner;
        }
        else if(btn1.getText()=="o"&&btn4.getText()=="o"&&btn7.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn2.getText()=="x"&&btn5.getText()=="x"&&btn8.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
            return !isWinner;
        }
        else if(btn2.getText()=="o"&&btn5.getText()=="o"&&btn8.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
        if(btn3.getText()=="x"&&btn6.getText()=="x"&&btn9.getText()=="x"){
                lblTac.setText("Player 1 is the winner!");
            return !isWinner;
        }
        else if(btn3.getText()=="o"&&btn6.getText()=="o"&&btn9.getText()=="o"){
            lblTac.setText("Player 2 is the winner!");
            return !isWinner;
        }
            return isWinner;
    }



    public void checkTie(){
        if(!checkWinner() &&count==9){
            lblTac.setText("It's a tie");
        }

    }
    public void player1_turn(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (random.nextInt(2)+1==1){
            firstPlayer=true;
            lblTac.setText("Player 1 : X(Red)");
        }
        else{
            firstPlayer=false;
            lblTac.setText("Player 2 : O(Green)");
        }
    }

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();

    }
}
