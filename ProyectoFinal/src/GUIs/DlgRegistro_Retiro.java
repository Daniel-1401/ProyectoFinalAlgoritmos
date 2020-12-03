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
<<<<<<< HEAD
	private JTextField txtNumeroMatricula;
=======
	private JTextField txtNumMatricula;
	private JTextField txtCodCurso;
>>>>>>> master
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
<<<<<<< HEAD
	private JLabel label;
	private JButton btnCerrar;
	private JLabel lblCodigoCurso;
	private JTextField txtCodCurso;
	
=======
>>>>>>> master
	

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
		
<<<<<<< HEAD
		txtNumeroRetiro.setEditable(false);		
		soloNumeros(txtNumeroRetiro);
		
		txtNumeroMatricula = new JTextField();
		txtNumeroMatricula.addKeyListener(this);
		txtNumeroMatricula.setColumns(10);
		txtNumeroMatricula.setBounds(141, 70, 220, 20);
		contentPanel.add(txtNumeroMatricula);
		soloNumeros(txtNumeroMatricula);
		soloNumeros(txtNumeroMatricula);
		
=======
>>>>>>> master
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
		modelo.addColumn("NumNúmero");
		modelo.addColumn("NumMatrícula");
		modelo.addColumn("Fecha");
		modelo.addColumn("Hora");
		tblRetiro.setModel(modelo);
		
<<<<<<< HEAD
		lblCodigoCurso = new JLabel("Codigo curso");
		lblCodigoCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoCurso.setBounds(10, 117, 110, 20);
		contentPanel.add(lblCodigoCurso);
=======
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
>>>>>>> master
		
		txtCodCurso = new JTextField();
		txtCodCurso.setEditable(false);
		txtCodCurso.setColumns(10);
<<<<<<< HEAD
		txtCodCurso.setBounds(141, 120, 86, 20);
		contentPanel.add(txtCodCurso);
		
=======
		txtCodCurso.setBounds(141, 100, 86, 20);
		contentPanel.add(txtCodCurso);
		
		cboNumeroRetiro.setVisible(false);
		cboCodCurso.setVisible(false);
		cboNumMatricula.setVisible(false);
>>>>>>> master
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
<<<<<<< HEAD
	//ACEPTAR
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		int numeroRetiro = leerNumeroRetiro();
		try{
			int numeroMatricula = leerNumeroMatricula();
			if(btnAdicionar.isEnabled() == false){
				Matricula m = am.buscar(numeroMatricula);
				if(m != null){
						Retiro nuevo = new Retiro(numeroRetiro, numeroMatricula, Fecha.fechaActual(), Fecha.horaActual());
						ar.adicionar(nuevo);
						btnAdicionar.setEnabled(true);
						Alumno a = aa.buscar(m.getcodAlumno());
						a.setEstado(2);
						am.actualizarArchivo();
						aa.actualizarArchivo();						
						btnAdicionar.setEnabled(true);
				}
			}
			if(btnModificar.isEnabled()==false){
				Retiro r = ar.buscar(numeroRetiro);
				Matricula m = am.buscar(leerNumeroMatricula());
				Alumno a = aa.buscar(m.getcodAlumno());
				if (a.getEstado() == 2) {
					m.setcodCurso(leerCodigoCurso());
					am.actualizarArchivo();
					habilitarEntradas(false);
					btnModificar.setEnabled(true);
				}
					
			}
			listar();
			habilitarEntradas(false);
		}
		catch(Exception e){
			error("Ingrese un NÚMERO válido", txtNumeroMatricula);
		}
	}
	private int leerCodigoCurso() {
		return Integer.parseInt(txtCodCurso.getText());
	}
	//ADICIONAR
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		habilitarBotones(true);
		habilitarEntradas(true);
		habilitarBusqueda(false);
		btnAdicionar.setEnabled(false);
		txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		limpiar();
		txtNumeroMatricula.requestFocus();
=======

	protected void ACEPTAR(ActionEvent arg0) {
		
	}

	protected void ADICIONAR(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnAdicionar, btnConsultar, btnModificar, btnAceptar, btnAdicionar);
		btnAdicionar.setEnabled(false);
		txtNumMatricula.setVisible(false);
		cboNumMatricula.setVisible(true);
		editarFila();
>>>>>>> master
	}

	protected void CERRAR(ActionEvent arg0) {
		this.dispose();
	}
<<<<<<< HEAD
	//MODIFICAR
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnBuscar, btnAdicionar, btnConsultar, btnEliminar, btnModificar);
		btnModificar.setEnabled(false);
		btnBuscar.setEnabled(false);
		if (ar.tamaño() == 0) {
			btnAceptar.setEnabled(false);
			habilitarEntradas(false);
			FuncionesGenerales.error("No existen retiros");
			btnModificar.setEnabled(true);
		}else {
			editarFila();
			txtCodCurso.setEditable(true);
		}
=======

	protected void MODIFICAR(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnAdicionar, btnConsultar, btnModificar, btnAceptar, btnAdicionar);
		btnModificar.setEnabled(false);
		txtCodCurso.setVisible(false);
		cboCodCurso.setVisible(true);
>>>>>>> master
	}	

	protected void CONSULTAR(ActionEvent arg0) {
		
	}
<<<<<<< HEAD
	//BUSCAR
	protected void actionPerformedBtnBuscar(ActionEvent arg0) {
		try{
			int numeroRetiro = leerNumeroRetiro();
			Retiro r = ar.buscar(numeroRetiro);
			Matricula m = am.buscar(r.getNumMatricula());
			Curso c = ac.buscar(m.getcodCurso());
			Alumno a = aa.buscar(m.getcodAlumno());
			if(btnModificar.isEnabled() == false){
				if(r != null){
					txtNumeroMatricula.setText("" + r.getNumMatricula());
					habilitarEntradas(true);
					txtNumeroMatricula.setEditable(false);
					btnModificar.setEnabled(false);
					habilitarBusqueda(false);
				}
			}
			else{
				if(r != null){
					txtNumeroMatricula.setText("" + r.getNumMatricula());
					habilitarEntradas(false);
					habilitarBotones(true);
					habilitarBusqueda(false);
				}
			}
		}
		catch (Exception e){
			error("Ingrese número válido", txtNumeroRetiro);
		}		
=======

	protected void ELIMINAR(ActionEvent arg0) {
		
	}
	
	protected void BUSCAR(ActionEvent arg0) {
		
>>>>>>> master
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
<<<<<<< HEAD
	protected void mouseClickedTblRetiro(MouseEvent e) {
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == txtNumeroMatricula) {
			keyPressedTxtNumeroMatricula(e);
		}
		if (e.getSource() == tblRetiro) {
			keyPressedTblRetiro(e);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tblRetiro) {
			mouseClickedTblRetiro(e);
		}
	}

	protected void keyPressedTxtNumeroMatricula(KeyEvent e) {
	}
	protected void keyPressedTxtNumeroRetiro(KeyEvent e) {
	}
	
	//METODOS QUE VALIDEN LOS CARACTERES QUE SE INGRESEN	
	public void soloNumeros(JTextField a){
		a.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				char c=e.getKeyChar();
				if(!Character.isDigit(c)){
					e.consume();
				}
			}
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == txtNumeroRetiro) {
					keyPressedTxtNumeroRetiro(e);
				}
			}
		});
	}
	
	protected void keyTypedTxtNumeroRetiro(KeyEvent arg0) {
		if(txtNumeroRetiro.getText().length() >= 6){
			arg0.consume();
		}
	}
	
	protected void keyTypedTxtNumeroMatricula(KeyEvent arg0) {
		if(txtNumeroMatricula.getText().length() >= 6){
			arg0.consume();
		}
	}
	
	protected void keyTypedTxtCodigoCurso(KeyEvent arg0) {
		arg0.consume();
	}

	//METODO MOSTRAR MENSAJE
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s, "Información", 0);
	}
	//METODO MOSTRAR ERROR
	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	//METODO HABILITAR
	void habilitarEntradas(boolean sino) {
		btnAceptar.setEnabled(sino);
		txtNumeroMatricula.setEditable(sino);
	}
	//
	void habilitarBotones(boolean sino) {
		btnAdicionar.setEnabled(sino);
		btnModificar.setEnabled(sino);
		btnConsultar.setEnabled(sino);
	}
	//
	void habilitarBusqueda(boolean sino){
		btnBuscar.setEnabled(sino);
		txtNumeroRetiro.setEditable(sino);
	}
	
	//METODO LISTAR
=======
	public void mouseClicked(MouseEvent e) {
	}
	void habilitarEntradas(boolean X) {
		btnAceptar.setEnabled(X);
		cboCodCurso.setEnabled(X);
		cboNumeroRetiro.setEnabled(X);
	}
>>>>>>> master
	void listar(){
		int posFila = 0;
		if (modelo.getRowCount() > 0)
			posFila = tblRetiro.getSelectedRow();
		if (modelo.getRowCount() == ar.tamaño() - 1)
			posFila = ar.tamaño() - 1;
		if (posFila == ar.tamaño())
			posFila --;
		modelo.setRowCount(0);
		Retiro r;
		for (int j=0; j<ar.tamaño(); j++) {
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
		if (ar.tamaño() > 0)
			tblRetiro.getSelectionModel().setSelectionInterval(posFila, posFila);
	}
	void editarFila(){
		if (ar.tamaño() == 0)
			limpiar();
		else {
			Retiro r = ar.obtener(tblRetiro.getSelectedRow());
			txtNumeroRetiro.setText("" + r.getNumRetiro());
<<<<<<< HEAD
			txtNumeroMatricula.setText("" + r.getNumMatricula());
		}
	}
	//METODO LIMPIAR
	void limpiar() {
		txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		txtNumeroMatricula.setText("");
		txtCodCurso.setText("");
	}
		
	//METODO PARA OBTENER DATO DEL ALUMNO
=======
			txtNumMatricula.setText("" + r.getNumMatricula());
		}
	}
	void limpiar(){
		txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		txtNumMatricula.setText("");
		txtCodCurso.setText("");
	}
>>>>>>> master
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
<<<<<<< HEAD
	//MÉTODOS QUE RETORNAN VALOR (CONFIRMAR)
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
=======
	int leerCodigoCurso(){
		return Integer.parseInt(txtCodCurso.getText().trim());
	}
	protected void COLOCAR_NUMERO_RETIRO(ActionEvent arg0) {
		txtNumeroRetiro.setText("" + cboNumeroRetiro.getSelectedItem());
>>>>>>> master
	}
	protected void COLOCAR_CODIGO_CURSO(ActionEvent arg0) {
		txtCodCurso.setText("" + cboCodCurso.getSelectedItem());
	}
	public void obtenerNumeroRetiro() {
		Retiro r;
		cboNumeroRetiro.removeAllItems();
		if (am.tamaño() == 0) {
			cboNumeroRetiro.addItem("NO HAY");
		}else {
			for (int i = 0; i < ar.tamaño(); i++) {
				r = ar.obtener(i);
				cboNumeroRetiro.addItem("" + r.getNumMatricula());
			}
		}
	}
	public void obtenerCodigoCurso() {
		Curso c;
		for (int i = 0; i < ac.tamaño(); i++) {
			c = ac.obtener(i);
			cboCodCurso.addItem("" + c.getCodCurso());
		}
	}
	public void obtenerNumMatricula() {
		Matricula m;
		for (int i = 0; i < am.tamaño(); i++) {
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
