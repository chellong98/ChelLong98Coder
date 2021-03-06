package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuestionUI extends JFrame {
	JButton btnYes, btnNo;
	
	public QuestionUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		
		btnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NoUI ui = new NoUI("");
				ui.showWindow();
				ImageIcon icon = new ImageIcon("images//two_hearts.png");
				int rs = JOptionPane.showConfirmDialog(null, "Không rảnh ha? :))" + "\n" + "Vậy khi nào rảnh mình cưới nhau nhé! hihi", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
				if(rs == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Đùa đấy, giờ lấy nhau 2 đứa đi ăn xin à :v");
				} else {
					JOptionPane.showMessageDialog(null, "Chọn Yes đi mà! ^^");
				}
			}
		});
		
		btnYes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NoUI ui = new NoUI("");
				ui.showWindow();
				ImageIcon icon = new ImageIcon("images//two_hearts.png");
				int rs = JOptionPane.showConfirmDialog(null, "rảnh ha? :))" + "\n" + "Vậy tết về mình cưới luôn nha, Lốp yêu Cún! hihi", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
				if(rs == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Đùa đấy, giờ lấy nhau 2 đứa đi ăn xin à :v");
				} else {
					JOptionPane.showMessageDialog(null, "Chọn Yes đi mà! ^^");
				}
			}
		});
	}

	

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel pnTitle = new JPanel();
		pnTitle.setLayout(new FlowLayout());
		JLabel lblImage = new JLabel(new ImageIcon("images//love.jpg"));
		JLabel lblTitle = new JLabel("Bây giờ mi có rảnh không? :)");
		lblTitle.setFont(new Font("times new roman", Font.ITALIC, 20));
		pnTitle.add(lblImage);
		pnTitle.add(lblTitle);
		con.add(pnTitle);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnYes = new JButton("Có rảnh", new ImageIcon("images//yes1.gif"));
		btnNo = new JButton("Không rảnh", new ImageIcon("images//no.gif"));
		pnButton.add(btnYes);
		pnButton.add(btnNo);
		con.add(pnButton);
	}
	
	public void showWindow() {
		this.setSize(400, 200);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
