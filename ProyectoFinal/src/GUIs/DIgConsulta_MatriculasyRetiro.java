package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class DIgConsulta_MatriculasyRetiro extends JDialog implements KeyListener, MouseListener {
	private JLabel lblMatricula;
	private JLabel lblNewLabel_1;
	private JTextField Txt_NumeroMatricula;
	private JLabel lblRetiro;
	private JLabel lblNewLabel_1_1;
	private JTextField Txt_NumeroRetiro;
	private JTable Tbt_ConsultaMatricula;
	private JScrollPane scrollPane;
	private JTable Tbt_ConsultaRetiro;
	private JScrollPane scrollPane_1;
	private JButton btnConsultar;
	private JButton btnConsultar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DIgConsulta_MatriculasyRetiro dialog = new DIgConsulta_MatriculasyRetiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DIgConsulta_MatriculasyRetiro() {
		setSize(800,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			lblMatricula = new JLabel("Matricula");
			lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblMatricula.setBounds(103, 13, 79, 21);
			getContentPane().add(lblMatricula);
		}
		{
			lblNewLabel_1 = new JLabel("NUMERO:");
			lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_1.setBounds(29, 65, 78, 19);
			getContentPane().add(lblNewLabel_1);
		}
		{
			Txt_NumeroMatricula = new JTextField();
			Txt_NumeroMatricula.setColumns(10);
			Txt_NumeroMatricula.setBounds(111, 65, 102, 20);
			getContentPane().add(Txt_NumeroMatricula);
		}
		{
			lblRetiro = new JLabel("Retiro");
			lblRetiro.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblRetiro.setBounds(514, 13, 52, 21);
			getContentPane().add(lblRetiro);
		}
		{
			lblNewLabel_1_1 = new JLabel("NUMERO:");
			lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(429, 69, 78, 19);
			getContentPane().add(lblNewLabel_1_1);
		}
		{
			Txt_NumeroRetiro = new JTextField();
			Txt_NumeroRetiro.setColumns(10);
			Txt_NumeroRetiro.setBounds(511, 66, 102, 20);
			getContentPane().add(Txt_NumeroRetiro);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 100, 774, 222);
			getContentPane().add(scrollPane);
			{
				Tbt_ConsultaMatricula = new JTable();
				Tbt_ConsultaMatricula.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"numMatricula", "codAlumno", "codCurso", "fecha", "hora"
					}
				));
				Tbt_ConsultaMatricula.addMouseListener(this);
				Tbt_ConsultaMatricula.addKeyListener(this);
				Tbt_ConsultaMatricula.setFillsViewportHeight(true);
				scrollPane.setViewportView(Tbt_ConsultaMatricula);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(12, 335, 774, 221);
			getContentPane().add(scrollPane_1);
			{
				Tbt_ConsultaRetiro = new JTable();
				Tbt_ConsultaRetiro.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"numRetiro", "numMatricula", "fecha", "hora"
					}
				));
				Tbt_ConsultaRetiro.setFillsViewportHeight(true);
				scrollPane_1.setViewportView(Tbt_ConsultaRetiro);
			}
		}
		{
			btnConsultar = new JButton("CONSULTAR");
			btnConsultar.setPressedIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
			btnConsultar.setRolloverIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
			btnConsultar.setIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
			btnConsultar.setVerticalTextPosition(SwingConstants.CENTER);
			btnConsultar.setHorizontalTextPosition(SwingConstants.CENTER);
			btnConsultar.setFont(new Font("Consolas", Font.BOLD, 16));
			btnConsultar.setFocusable(false);
			btnConsultar.setFocusTraversalKeysEnabled(false);
			btnConsultar.setFocusPainted(false);
			btnConsultar.setContentAreaFilled(false);
			btnConsultar.setBorderPainted(false);
			btnConsultar.setBorder(null);
			btnConsultar.setBackground(Color.LIGHT_GRAY);
			btnConsultar.setBounds(238, 44, 110, 40);
			getContentPane().add(btnConsultar);
		}
		{
			btnConsultar_1 = new JButton("CONSULTAR");
			btnConsultar_1.setPressedIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
			btnConsultar_1.setRolloverIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
			btnConsultar_1.setIcon(new ImageIcon("C:\\Users\\fmunozal\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
			btnConsultar_1.setVerticalTextPosition(SwingConstants.CENTER);
			btnConsultar_1.setHorizontalTextPosition(SwingConstants.CENTER);
			btnConsultar_1.setFont(new Font("Consolas", Font.BOLD, 16));
			btnConsultar_1.setFocusable(false);
			btnConsultar_1.setFocusTraversalKeysEnabled(false);
			btnConsultar_1.setFocusPainted(false);
			btnConsultar_1.setContentAreaFilled(false);
			btnConsultar_1.setBorderPainted(false);
			btnConsultar_1.setBorder(null);
			btnConsultar_1.setBackground(Color.LIGHT_GRAY);
			btnConsultar_1.setBounds(641, 44, 110, 40);
			getContentPane().add(btnConsultar_1);
		}
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == Tbt_ConsultaMatricula) {
			keyPressedTable(e);
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	protected void keyPressedTable(KeyEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == Tbt_ConsultaMatricula) {
			mouseClickedTable(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTable(MouseEvent e) {
	}
}
