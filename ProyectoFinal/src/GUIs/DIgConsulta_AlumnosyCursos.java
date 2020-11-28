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
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class DIgConsulta_AlumnosyCursos extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTable Tbt_ConsultaAlumnos;
	private JTable Tbt_ConsultaCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DIgConsulta_AlumnosyCursos dialog = new DIgConsulta_AlumnosyCursos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DIgConsulta_AlumnosyCursos() {
		setSize(812,565);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			JLabel lblAlumno = new JLabel("ALUMNO");
			lblAlumno.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblAlumno.setBounds(103, 13, 79, 21);
			getContentPane().add(lblAlumno);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("CODIGO:");
			lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_1.setBounds(29, 65, 78, 19);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(111, 65, 102, 20);
			getContentPane().add(textField);
		}
		{
			JLabel lblCurso = new JLabel("CURSO");
			lblCurso.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblCurso.setBounds(514, 13, 60, 21);
			getContentPane().add(lblCurso);
		}
		{
			JLabel lblNewLabel_1_1 = new JLabel("CODIGO:");
			lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(429, 69, 78, 19);
			getContentPane().add(lblNewLabel_1_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(511, 66, 102, 20);
			getContentPane().add(textField_1);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 108, 772, 191);
			getContentPane().add(scrollPane);
			{
				Tbt_ConsultaAlumnos = new JTable();
				Tbt_ConsultaAlumnos.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					}
				));
				scrollPane.setViewportView(Tbt_ConsultaAlumnos);
				Tbt_ConsultaAlumnos.setFillsViewportHeight(true);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 332, 772, 190);
			getContentPane().add(scrollPane);
			{
				Tbt_ConsultaCurso = new JTable();
				Tbt_ConsultaCurso.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					}
				));
				scrollPane.setViewportView(Tbt_ConsultaCurso);
				Tbt_ConsultaCurso.setFillsViewportHeight(true);
			}
		}
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
		btnConsultar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnConsultar.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnConsultar.setBounds(240, 49, 110, 40);
		getContentPane().add(btnConsultar);
		
		JButton btnConsultar_1 = new JButton("CONSULTAR");
		btnConsultar_1.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
		btnConsultar_1.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnConsultar_1.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnConsultar_1.setBounds(650, 44, 110, 40);
		getContentPane().add(btnConsultar_1);
	}
}
