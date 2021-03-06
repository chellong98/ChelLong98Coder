package ChelLong.javaSwing.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJtextAreaUI extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	Button btnOK;
	public HocBorderVaJtextAreaUI(String title)
	{
		super(title);
		addControls();
		addEvents();
	}
	public void addControls()
	{
		Container con=getContentPane();
		JPanel pnMain=new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnThongTin=new JPanel();
		pnMain.add(pnThongTin);
		
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		JPanel pnTen=new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen=new JLabel("Nhập tên:");
		txtTen=new JTextField(20);
	
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);
		
		JPanel pnDiaChi=new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		JLabel lblDiaChi=new JLabel("Địa Chỉ:");
		txtDiaChi=new JTextArea(5, 19);
		
		txtDiaChi.setWrapStyleWord(true);
		txtDiaChi.setLineWrap(true);
		
		JScrollPane sc=new JScrollPane(txtDiaChi,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		pnThongTin.add(pnDiaChi);
		
		Border borderThongTin=BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder borderTitleThongtin=new TitledBorder(borderThongTin, "Thông tin:");
		pnThongTin.setBorder(borderTitleThongtin);
		borderTitleThongtin.setTitleColor(Color.RED);
		borderTitleThongtin.setTitleJustification(TitledBorder.RIGHT);
		
		
		JPanel pnOk=new JPanel();
		pnOk.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOK=new Button("OK");
		pnOk.add(btnOK);
		pnMain.add(pnOk);
		
		
		lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
	}
	public void addEvents()
	{
		
	}
	public void showWindow()
	{
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
