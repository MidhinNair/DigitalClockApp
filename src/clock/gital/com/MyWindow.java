package clock.gital.com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class MyWindow extends JFrame {
   private JLabel timeLabel;
   private  JLabel dateLabel;
   public MyWindow() {
       setTitle("Digital Clock");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setSize(400, 600);
       setLocationRelativeTo(null);
       getContentPane().setBackground(Color.darkGray);

       // Set the layout manager to BoxLayout
       setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
       getContentPane().setBackground(Color.darkGray);

       JLabel titleLabel = new JLabel("Time Now");
       titleLabel.setFont(new Font("montserrat", Font.ROMAN_BASELINE, 40));
       titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
       titleLabel.setForeground(Color.WHITE);
       titleLabel.setBorder(new EmptyBorder(80, 0, 0, 0)); // Add some padding to the footer label
       add(titleLabel);
       // Add some vertical space between the titleLabel and timeLabel
       add(Box.createVerticalStrut(10));

       timeLabel = new JLabel();
       timeLabel.setFont(new Font("montserrat", Font.BOLD, 65));
       timeLabel.setForeground(Color.WHITE);
       timeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
       timeLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
       add(timeLabel);



       dateLabel = new JLabel();
       dateLabel.setFont(new Font("montserrat",Font.BOLD, 15));
       dateLabel.setForeground(Color.WHITE);
       dateLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
       dateLabel.setBorder(new EmptyBorder(0,0,0,0));
       add(dateLabel);

       JLabel dtitleLabel = new JLabel("'Time you enjoy wasting is not wasted time'");
       dtitleLabel.setFont(new Font("montserrat", Font.ITALIC, 15));
       dtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
       dtitleLabel.setForeground(Color.GREEN);
       dtitleLabel.setBorder(new EmptyBorder(8, 0, 0, 0)); // Add some padding to the footer label
       add(dtitleLabel);

       add(Box.createVerticalStrut(250));

       JLabel footerLabel = new JLabel("developedByMidhin-CodeYotta");
       footerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
       footerLabel.setForeground(Color.BLACK);
       footerLabel.setBorder(new EmptyBorder(0, 0, 100, 0)); // Add some padding to the footer label
       add(footerLabel);




       Timer time = new Timer(1000, e -> updateTime());
       time.start();



   }

    private void updateTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        Date currentTime = new Date();
        String formattedTime = timeFormat.format(currentTime);
        timeLabel.setText(formattedTime);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentdate = new Date();
        String formattedDate = dateFormat.format(currentdate);
        dateLabel.setText(formattedDate);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            MyWindow clock = new MyWindow();
            clock.setVisible(true);
        });
    }


}
