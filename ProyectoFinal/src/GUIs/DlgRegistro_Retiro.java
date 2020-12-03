package GUIs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import Arreglos.ArregloAlumno;
import Arreglos.ArregloCurso;
import Arreglos.ArregloMatricula;
import Arreglos.ArregloRetiro;

import Clases.Alumno;
import Clases.Curso;
import Clases.Matricula;
import Clases.Retiro;
import FuncionGenerales.FuncionesGenerales;
import Libreria.Fecha;
import FuncionGenerales.FuncionesGenerales;
import javax.swing.JComboBox;


public class DlgRegistro_Retiro extends JDialog implements ActionListener, KeyListener, MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumeroRetiro;
	private JTextField txtNumMatricula;
	private JTextField txtCodCurso;
	private JButton btnAceptar;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnBuscar;
	private JTable tblRetiro;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo;
	private JButton btnCerrar;
	private JComboBox<String> cboNumeroRetiro;
	private JComboBox<String> cboCodCurso;
	private JComboBox<String> cboNumMatricula;

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
	
	ArregloRetiro ar = new ArregloRetiro(); 
	ArregloMatricula am = new ArregloMatricula();
	ArregloAlumno aa = new ArregloAlumno();
	ArregloCurso ac = new ArregloCurso();
	

	/**
	 * Create the dialog.
	 */
	public DlgRegistro_Retiro() {
		setUndecorated(true);
		setResizable(false);
		setTitle("REGISTRO | RETIRO");
		setBounds(100,100,700,500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMantenimienoRetiro = new JLabel("REGISTRO | RETIRO");
		lblMantenimienoRetiro.setForeground(Color.DARK_GRAY);
		lblMantenimienoRetiro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMantenimienoRetiro.setBounds(10, 5, 220, 20);
		contentPanel.add(lblMantenimienoRetiro);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.addActionListener(this);
		btnConsultar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
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
		btnConsultar.setBounds(557, 29, 110, 40);
		contentPanel.add(btnConsultar);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnAdicionar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnAdicionar.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnAdicionar.setBounds(557, 79, 110, 40);
		contentPanel.add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(this);
		btnModificar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnModificar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnModificar.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnModificar.setBounds(557, 130, 110, 40);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(this);
		btnEliminar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnEliminar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnEliminar.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnEliminar.setBounds(557, 180, 110, 40);
		contentPanel.add(btnEliminar);
		
		JLabel lblNumeroRetiro = new JLabel("N\u00B0 DE RETIRO");
		lblNumeroRetiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroRetiro.setBounds(10, 38, 110, 20);
		contentPanel.add(lblNumeroRetiro);
		
		JLabel lnlNumeroMatricula = new JLabel("N\u00B0 MATR\u00CDCULA");
		lnlNumeroMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lnlNumeroMatricula.setBounds(10, 68, 110, 20);
		contentPanel.add(lnlNumeroMatricula);
		
		txtNumeroRetiro = new JTextField();
		txtNumeroRetiro.setBounds(141, 35, 86, 20);
		contentPanel.add(txtNumeroRetiro);
		txtNumeroRetiro.setColumns(10);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
		btnBuscar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnBuscar.setIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
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
		btnBuscar.setBounds(141, 168, 110, 40);
		contentPanel.add(btnBuscar);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(this);
		btnAceptar.setPressedIcon(new ImageIcon("imagenes\\BotonAceptar1.png"));
		btnAceptar.setRolloverIcon(new ImageIcon("imagenes\\BotonAceptar2.png"));
		btnAceptar.setIcon(new ImageIcon("imagenes\\BotonAceptar1.png"));
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
		btnAceptar.setBounds(10, 133, 110, 110);
		contentPanel.add(btnAceptar);
		
		btnCerrar = new JButton("");
		btnCerrar.addActionListener(this);
		btnCerrar.setPressedIcon(new ImageIcon("imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_CERRAR_2.png"));
		btnCerrar.setIcon(new ImageIcon("imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setBounds(662, 5, 28, 28);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 253, 680, 243);
		contentPanel.add(scrollPane);
		
		tblRetiro = new JTable();
		tblRetiro.addMouseListener(this);
		tblRetiro.addKeyListener(this);
		
		tblRetiro.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblRetiro);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("NumN�mero");
		modelo.addColumn("NumMatr�cula");
		modelo.addColumn("Fecha");
		modelo.addColumn("Hora");
		tblRetiro.setModel(modelo);
		
		cboNumeroRetiro = new JComboBox<String>();
		cboNumeroRetiro.addActionListener(this);
		cboNumeroRetiro.setBounds(142, 35, 110, 20);
		contentPanel.add(cboNumeroRetiro);
		obtenerNumeroRetiro();
		
		cboCodCurso = new JComboBox<String>();
		cboCodCurso.setBounds(141, 100, 111, 20);
		contentPanel.add(cboCodCurso);
		obtenerCodigoCurso();
		
		cboNumMatricula = new JComboBox<String>();
		cboNumMatricula.setBounds(141, 68, 112, 20);
		contentPanel.add(cboNumMatricula);
		obtenerNumMatricula();
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setEditable(false);
		txtNumMatricula.setColumns(10);
		txtNumMatricula.setBounds(141, 68, 86, 20);
		contentPanel.add(txtNumMatricula);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setEditable(false);
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(141, 100, 86, 20);
		contentPanel.add(txtCodCurso);
		
		cboNumeroRetiro.setVisible(false);
		cboCodCurso.setVisible(false);
		cboNumMatricula.setVisible(false);
		habilitarEntradas(false);
		listar();
		editarFila();
		txtNumeroRetiro.setEditable(false);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboNumeroRetiro) {
			COLOCAR_NUMERO_RETIRO(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			CERRAR(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			BUSCAR(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			ELIMINAR(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			CONSULTAR(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			MODIFICAR(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			ADICIONAR(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			ACEPTAR(arg0);
		}
	}

	protected void ACEPTAR(ActionEvent arg0) {
		
	}

	protected void ADICIONAR(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnAdicionar, btnConsultar, btnModificar, btnAceptar, btnAdicionar);
		btnAdicionar.setEnabled(false);
		txtNumMatricula.setVisible(false);
		cboNumMatricula.setVisible(true);
		editarFila();
	}

	protected void CERRAR(ActionEvent arg0) {
		this.dispose();
	}

	protected void MODIFICAR(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnAdicionar, btnConsultar, btnModificar, btnAceptar, btnAdicionar);
		btnModificar.setEnabled(false);
		txtCodCurso.setVisible(false);
		cboCodCurso.setVisible(true);
	}	

	protected void CONSULTAR(ActionEvent arg0) {
		
	}

	protected void ELIMINAR(ActionEvent arg0) {
		
	}
	
	protected void BUSCAR(ActionEvent arg0) {
		
	}
	
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
	}
	void habilitarEntradas(boolean X) {
		btnAceptar.setEnabled(X);
		cboCodCurso.setEnabled(X);
		cboNumeroRetiro.setEnabled(X);
	}
	void listar(){
		int posFila = 0;
		if (modelo.getRowCount() > 0)
			posFila = tblRetiro.getSelectedRow();
		if (modelo.getRowCount() == ar.tama�o() - 1)
			posFila = ar.tama�o() - 1;
		if (posFila == ar.tama�o())
			posFila --;
		modelo.setRowCount(0);
		Retiro r;
		for (int j=0; j<ar.tama�o(); j++) {
			r = ar.obtener(j);
			Matricula m = am.buscar(r.getNumMatricula());
			Alumno a = aa.buscar(m.getcodAlumno());
			Curso c = ac.buscar(m.getcodCurso());
			Object[] fila = { r.getNumRetiro(),
					          r.getNumMatricula(),
					          r.getFecha(),
					          r.getHora()};
								
			modelo.addRow(fila);
		}
		if (ar.tama�o() > 0)
			tblRetiro.getSelectionModel().setSelectionInterval(posFila, posFila);
	}
	void editarFila(){
		if (ar.tama�o() == 0)
			limpiar();
		else {
			Retiro r = ar.obtener(tblRetiro.getSelectedRow());
			txtNumeroRetiro.setText("" + r.getNumRetiro());
			txtNumMatricula.setText("" + r.getNumMatricula());
		}
	}
	void limpiar(){
		txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		txtNumMatricula.setText("");
		txtCodCurso.setText("");
	}
	String obtenerDatosAlumno() {
		Matricula m = am.buscar(leerNumeroMatricula());
	    Alumno a = aa.buscar(m.getcodAlumno());
	    return "Nombres :  " + a.getNombre() + "\n" +
		       "Apellidos :  " + a.getApellidos();
	}
	String obtenerDatosCurso() {
		Matricula m = am.buscar(leerNumeroMatricula());
	    Curso c = ac.buscar(m.getcodAlumno());
	    return "Asignatura :  " + c.getAsignatura();
	}
	int leerNumeroRetiro(){
		return Integer.parseInt(txtNumeroRetiro.getText().trim());
	}
	int leerNumeroMatricula(){
		return Integer.parseInt(txtNumMatricula.getText().trim());
	}
	int leerCodigoCurso(){
		return Integer.parseInt(txtCodCurso.getText().trim());
	}
	protected void COLOCAR_NUMERO_RETIRO(ActionEvent arg0) {
		txtNumeroRetiro.setText("" + cboNumeroRetiro.getSelectedItem());
	}
	protected void COLOCAR_CODIGO_CURSO(ActionEvent arg0) {
		txtCodCurso.setText("" + cboCodCurso.getSelectedItem());
	}
	public void obtenerNumeroRetiro() {
		Retiro r;
		cboNumeroRetiro.removeAllItems();
		if (am.tama�o() == 0) {
			cboNumeroRetiro.addItem("NO HAY");
		}else {
			for (int i = 0; i < ar.tama�o(); i++) {
				r = ar.obtener(i);
				cboNumeroRetiro.addItem("" + r.getNumMatricula());
			}
		}
	}
	public void obtenerCodigoCurso() {
		Curso c;
		for (int i = 0; i < ac.tama�o(); i++) {
			c = ac.obtener(i);
			cboCodCurso.addItem("" + c.getCodCurso());
		}
	}
	public void obtenerNumMatricula() {
		Matricula m;
		for (int i = 0; i < am.tama�o(); i++) {
			m = am.obtener(i);
			cboNumMatricula.addItem("" + m.getnumMatricula());
		}
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == tblRetiro) {
			keyPressedTblRetiro(e);
		}
	}
	protected void keyPressedTblRetiro(KeyEvent e) {
		e.consume();
		editarFila();
	}
}
