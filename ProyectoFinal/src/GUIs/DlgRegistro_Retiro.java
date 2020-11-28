package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class DlgRegistro_Retiro extends JDialog {

	private final JPanel txtResultado = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRegistro_Retiro dialog = new DlgRegistro_Retiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRegistro_Retiro() {
		setUndecorated(true);
		setTitle("REGISTRO | RETIRO");
		setSize(700,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		txtResultado.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(txtResultado, BorderLayout.CENTER);
		txtResultado.setLayout(null);
		
		JLabel lblMantenimienoRetiro = new JLabel("MANTENIMIENO | RETIRO");
		lblMantenimienoRetiro.setForeground(Color.DARK_GRAY);
		lblMantenimienoRetiro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMantenimienoRetiro.setBounds(10, 5, 220, 20);
		txtResultado.add(lblMantenimienoRetiro);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnConsultar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
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
		btnConsultar.setBounds(557, 41, 110, 40);
		txtResultado.add(btnConsultar);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnAdicionar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnAdicionar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnAdicionar.setVerticalTextPosition(SwingConstants.CENTER);
		btnAdicionar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdicionar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnAdicionar.setFocusable(false);
		btnAdicionar.setFocusTraversalKeysEnabled(false);
		btnAdicionar.setFocusPainted(false);
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setBorder(null);
		btnAdicionar.setBackground(Color.LIGHT_GRAY);
		btnAdicionar.setBounds(557, 91, 110, 40);
		txtResultado.add(btnAdicionar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnModificar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnModificar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnModificar.setVerticalTextPosition(SwingConstants.CENTER);
		btnModificar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnModificar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnModificar.setFocusable(false);
		btnModificar.setFocusTraversalKeysEnabled(false);
		btnModificar.setFocusPainted(false);
		btnModificar.setContentAreaFilled(false);
		btnModificar.setBorderPainted(false);
		btnModificar.setBorder(null);
		btnModificar.setBackground(Color.LIGHT_GRAY);
		btnModificar.setBounds(557, 141, 110, 40);
		txtResultado.add(btnModificar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnEliminar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnEliminar.setVerticalTextPosition(SwingConstants.CENTER);
		btnEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEliminar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnEliminar.setFocusable(false);
		btnEliminar.setFocusTraversalKeysEnabled(false);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setBounds(557, 191, 110, 40);
		txtResultado.add(btnEliminar);
		
		JLabel lblCodigo = new JLabel("CODIGO: ");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 38, 64, 20);
		txtResultado.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("NOMBRES:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(10, 68, 70, 20);
		txtResultado.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 98, 78, 20);
		txtResultado.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(10, 128, 30, 20);
		txtResultado.add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(101, 36, 86, 20);
		txtResultado.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 70, 220, 20);
		txtResultado.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 100, 220, 20);
		txtResultado.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 130, 86, 20);
		txtResultado.add(textField_3);
		
		JLabel lblCurso = new JLabel("CURSO:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurso.setBounds(10, 158, 64, 20);
		txtResultado.add(lblCurso);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(101, 161, 86, 20);
		txtResultado.add(textField_4);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnBuscar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnBuscar.setVerticalTextPosition(SwingConstants.CENTER);
		btnBuscar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBuscar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnBuscar.setFocusable(false);
		btnBuscar.setFocusTraversalKeysEnabled(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setEnabled(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBorder(null);
		btnBuscar.setBackground(Color.LIGHT_GRAY);
		btnBuscar.setBounds(240, 24, 110, 40);
		txtResultado.add(btnBuscar);
		
		JLabel lblEstado = new JLabel("ESTADO:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setBounds(10, 188, 64, 20);
		txtResultado.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"REGISTRADO", "MATRICULADO", "RETIRADO"}));
		comboBox.setBounds(101, 191, 110, 22);
		txtResultado.add(comboBox);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBounds(10, 249, 673, 240);
		txtResultado.add(table);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar1.png"));
		btnAceptar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar2.png"));
		btnAceptar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar1.png"));
		btnAceptar.setVerticalTextPosition(SwingConstants.CENTER);
		btnAceptar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAceptar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnAceptar.setFocusable(false);
		btnAceptar.setFocusTraversalKeysEnabled(false);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setEnabled(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(null);
		btnAceptar.setBackground(Color.LIGHT_GRAY);
		btnAceptar.setBounds(221, 129, 110, 110);
		txtResultado.add(btnAceptar);
		
		JButton btnCerrar = new JButton("");
		btnCerrar.setPressedIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setRolloverIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_CERRAR_2.png"));
		btnCerrar.setIcon(new ImageIcon("C:\\Users\\PCRUIZ\\Desktop\\FinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setBounds(662, 5, 28, 28);
		txtResultado.add(btnCerrar);
	}
}
