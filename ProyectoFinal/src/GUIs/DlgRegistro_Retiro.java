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
//IMPORTES
import Clases.Alumno;
import Clases.Curso;
import Clases.Matricula;
import Clases.Retiro;
import Libreria.Fecha;

public class DlgRegistro_Retiro extends JDialog implements ActionListener, KeyListener, MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumeroRetiro;
	private JTextField txtNumeroMatricula;
	private JTextField txtCodigoCurso;
	private JTextField txtAlumno;
	private JTextField txtAsignatura;
	private JButton btnAceptar;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnBuscar;
	private JTable tblRetiro;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo;
	

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
	
	// CREO E INICIALIZO LOS OBJETOS DE LAS CLASES ARREGLO
	ArregloRetiro ar = new ArregloRetiro(); 
	ArregloMatricula am = new ArregloMatricula();
	ArregloAlumno aa = new ArregloAlumno();
	ArregloCurso ac = new ArregloCurso();
	private JLabel label;
	private JButton btnCerrar;
	
	

	/**
	 * Create the dialog.
	 */
	public DlgRegistro_Retiro() {
		setUndecorated(true);
		setTitle("REGISTRO | RETIRO");
		setSize(700,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMantenimienoRetiro = new JLabel("MANTENIMIENO | RETIRO");
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
		btnConsultar.setBounds(557, 133, 110, 40);
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
		btnAdicionar.setBounds(557, 31, 110, 40);
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
		btnModificar.setBounds(557, 82, 110, 40);
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
		
		JLabel lblcodigoCurso = new JLabel("C\u00D3DIGO CURSO");
		lblcodigoCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblcodigoCurso.setBounds(10, 98, 121, 20);
		contentPanel.add(lblcodigoCurso);
		
		txtNumeroRetiro = new JTextField();
		txtNumeroRetiro.setBounds(141, 36, 86, 20);
		contentPanel.add(txtNumeroRetiro);
		txtNumeroRetiro.setColumns(10);
		
		txtNumeroRetiro.setEditable(false);		
		soloNumeros(txtNumeroRetiro);
		
		txtNumeroMatricula = new JTextField();
		txtNumeroMatricula.addKeyListener(this);
		txtNumeroMatricula.setColumns(10);
		txtNumeroMatricula.setBounds(141, 70, 220, 20);
		contentPanel.add(txtNumeroMatricula);
		soloNumeros(txtNumeroMatricula);
		

		txtCodigoCurso = new JTextField();
		txtCodigoCurso.addKeyListener(this);
		txtCodigoCurso.setColumns(10);
		txtCodigoCurso.setBounds(141, 100, 220, 20);
		contentPanel.add(txtCodigoCurso);
		soloNumeros(txtNumeroMatricula);
		
		txtAlumno = new JTextField();
		txtAlumno.setColumns(10);
		txtAlumno.setBounds(141, 130, 86, 20);
		contentPanel.add(txtAlumno);
		
		JLabel lblAlumno = new JLabel("ALUMNO");
		lblAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlumno.setBounds(10, 129, 64, 20);
		contentPanel.add(lblAlumno);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setColumns(10);
		txtAsignatura.setBounds(141, 161, 86, 20);
		contentPanel.add(txtAsignatura);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setPressedIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_1.png"));
		btnBuscar.setRolloverIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BOTON_AME_2.png"));
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
		btnBuscar.setBounds(307, 27, 110, 40);
		contentPanel.add(btnBuscar);
		
		JLabel lblAsignatura = new JLabel("ASIGNATURA");
		lblAsignatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAsignatura.setBounds(10, 160, 110, 20);
		contentPanel.add(lblAsignatura);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(this);
		btnAceptar.setPressedIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar1.png"));
		btnAceptar.setRolloverIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar2.png"));
		btnAceptar.setIcon(new ImageIcon("C:\\Users\\Adonias\\Desktop\\ProyectoFinalAlgoritmos\\ProyectoFinal\\imagenes\\BotonAceptar2.png"));
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
		btnAceptar.setBounds(307, 131, 110, 110);
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
		modelo.addColumn("Número");
		modelo.addColumn("Matrícula");
		modelo.addColumn("Alumno");
		modelo.addColumn("Asignatura");
		modelo.addColumn("Fecha");
		modelo.addColumn("Hora");
		tblRetiro.setModel(modelo);
		
		habilitarEntradas(false);
		listar();
		editarFila();
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	//ACEPTAR
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		int numeroRetiro = leerNumeroRetiro();
		try{
			int numeroMatricula = leerNumeroMatricula();
			if(btnAdicionar.isEnabled() == false){
				Matricula m = am.buscar(numeroMatricula);
				if(m != null){
					int ok=confirmar(obtenerDatosAlumno() + "\n\n" + obtenerDatosCurso(), "¿ Desea retirar al alumno ?");
					if(ok == 0){
						Retiro nuevo = new Retiro(numeroRetiro, numeroMatricula, Fecha.fechaActual(), Fecha.horaActual());
						ar.adicionar(nuevo);
						btnAdicionar.setEnabled(true);
						//MATRICULA SE DESACTIVA

						am.actualizarArchivo();
						//SE CAMBIA EL ESTADO A RETIRADO
						Alumno a = aa.buscar(m.getcodAlumno());
						a.setEstado(2);
						aa.actualizarArchivo();
						listar();
						habilitarEntradas(false);
					}
					limpiar();
					btnAdicionar.setEnabled(true);
				}
			}
			if(btnModificar.isEnabled()==false){
				Curso c = ac.buscar(leerCodigoCurso());
				if(c != null){
					Matricula m = am.buscar(numeroMatricula);
					m.setcodCurso(leerCodigoCurso());
					txtAsignatura.setText("" + c.getAsignatura());
					am.actualizarArchivo();
					habilitarEntradas(false);
					btnModificar.setEnabled(true);
				}
				else{
					error("Ingrese código de curso válido",txtCodigoCurso);
					btnModificar.setEnabled(false);
				}
			}
			listar();
		}
		catch(Exception e){
			error("Ingrese un NÚMERO válido", txtNumeroMatricula);
		}
	}
	//ADICIONAR
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		habilitarBotones(true);
		habilitarEntradas(true);
		habilitarBusqueda(false);
		btnAdicionar.setEnabled(false);
		txtCodigoCurso.setEditable(false);
		txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		limpiar();
		txtNumeroMatricula.requestFocus();
	}
	//CERRAR
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.dispose();
	}
	//MODIFICAR
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		habilitarBotones(true);
		btnBuscar.setEnabled(false);
		btnModificar.setEnabled(false);
		if (ar.tamaño() == 0) {
			btnAceptar.setEnabled(false);
			habilitarEntradas(false);
			mensaje("No existen retiros");	
		}
		else {
			habilitarBotones(true);
			habilitarEntradas(false);
			habilitarBusqueda(true);
			btnModificar.setEnabled(false);
			limpiar();
			txtNumeroRetiro.setText("");
			txtNumeroRetiro.requestFocus();
		}
	}	
	//CONSULTAR
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		habilitarBotones(true);
		habilitarEntradas(false);
		habilitarBusqueda(true);
		btnConsultar.setEnabled(false);
		limpiar();
		txtNumeroRetiro.setText("");
		txtNumeroRetiro.requestFocus();	
	}
	//ELIMINAR
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		habilitarBotones(true);
		habilitarBusqueda(true);
		btnAceptar.setEnabled(false);
		if(ar.tamaño()==0)
			mensaje("No hay registro de retiros");
		else{
			habilitarEntradas(false);
			try{
				int numeroRetiro = leerNumeroRetiro();
				Retiro r = ar.buscar(numeroRetiro);
				Matricula m = am.buscar(r.getNumMatricula());
				Alumno a = aa.buscar(m.getcodAlumno());
				if (a.getEstado() == 2){
					int ok = confirmar("¿Desea eliminar el registro?");
					if(ok == 0){
						ar.eliminar(ar.buscar(leerNumeroRetiro()));

						am.actualizarArchivo();
						a.setEstado(1);
						aa.actualizarArchivo();
						listar();
						limpiar();
						habilitarBusqueda(false);
						editarFila();
					}
				}
				else{
					mensaje("El alumno no está retirado");
				}
				txtNumeroRetiro.setText("");
			}
			catch(Exception e){
				txtNumeroRetiro.setText("");
				txtNumeroRetiro.requestFocus();
			}
		}		
	}
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
					txtCodigoCurso.setText("" + m.getcodCurso());
					txtAlumno.setText("" + a.getNombre()+" "+ a.getApellidos());
					txtAsignatura.setText("" + c.getAsignatura());
					habilitarEntradas(true);
					txtNumeroMatricula.setEditable(false);
					btnModificar.setEnabled(false);
					habilitarBusqueda(false);
				}
			}
			else{
				if(r != null){
					txtNumeroMatricula.setText("" + r.getNumMatricula());
					txtCodigoCurso.setText("" + m.getcodCurso());
					txtAlumno.setText("" + a.getNombre()+" "+ a.getApellidos());
					txtAsignatura.setText("" + c.getAsignatura());
					habilitarEntradas(false);
					habilitarBotones(true);
					habilitarBusqueda(false);
				}
			}
		}
		catch (Exception e){
			error("Ingrese número válido", txtNumeroRetiro);
		}		
	}
	
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	protected void keyPressedTblRetiro(KeyEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTblRetiro(MouseEvent e) {
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == txtCodigoCurso) {
			keyPressedTxtCodigoCurso(e);
		}
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
	protected void keyPressedTxtCodigoCurso(KeyEvent e) {
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
		if(txtCodigoCurso.getText().length() >= 4){
			arg0.consume();
		}
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
		txtCodigoCurso.setEditable(sino);
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
					          a.getNombre()+" "+a.getApellidos(),
					          c.getAsignatura(),
					          r.getFecha(),
					          r.getHora()};
								
			modelo.addRow(fila);
		}
		if (ar.tamaño() > 0)
			tblRetiro.getSelectionModel().setSelectionInterval(posFila, posFila);
	}
	//METODO EDITAR FILA
	void editarFila(){
		if (ar.tamaño() == 0)
			txtNumeroRetiro.setText("" + ar.codigoCorrelativo());
		else {
			Retiro r = ar.obtener(tblRetiro.getSelectedRow());
			Matricula m = am.buscar(r.getNumMatricula());
			Alumno a = aa.buscar(m.getcodAlumno());
			Curso c = ac.buscar(m.getcodCurso());
			txtNumeroRetiro.setText("" + r.getNumRetiro());
			txtNumeroMatricula.setText("" + r.getNumMatricula());
			txtCodigoCurso.setText("" + m.getcodCurso());
			txtAlumno.setText("" + a.getNombre()+" "+a.getApellidos());
			txtAsignatura.setText(""+c.getAsignatura());
		}
	}
	//METODO LIMPIAR
	void limpiar(){
		txtNumeroMatricula.setText("");
		txtCodigoCurso.setText("");
		txtAlumno.setText("");
		txtAsignatura.setText("");
	}

	//METODO PARA OBTENER DATO DEL ALUMNO
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
	
	//METODO LEER NUMERO RETIRO
	int leerNumeroRetiro(){
		return Integer.parseInt(txtNumeroRetiro.getText().trim());
	}
	//MÉTODO LEER NUMERO DE MATRICULA
	int leerNumeroMatricula(){
		return Integer.parseInt(txtNumeroMatricula.getText().trim());
	}
	//MÉTODO LEER CODIGO CURSO
	int leerCodigoCurso(){
		return Integer.parseInt(txtCodigoCurso.getText().trim());
	}
	//MÉTODOS QUE RETORNAN VALOR (CONFIRMAR)
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
	
	int confirmar(String s1, String s2) {
		return JOptionPane.showConfirmDialog(this, s1, s2, 0, 1, null);
	}
		

}
