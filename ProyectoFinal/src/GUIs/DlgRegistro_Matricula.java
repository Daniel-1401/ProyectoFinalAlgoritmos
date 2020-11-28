package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTable;

import Arreglos.ArregloMatricula;
import Arreglos.ArregloAlumno;
import Arreglos.ArregloCurso;
import Clases.Alumno;
import Clases.Curso;
import Clases.Matricula;
import FuncionGenerales.FuncionesGenerales;
import Libreria.Fecha;

public class DlgRegistro_Matricula extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTable tblMatricula;
	private DefaultTableModel modelo;
	private JTextField txtNumMatricula;
	private JTextField txtCodigoCurso;
	private JButton btnAceptar;
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnCerrar;
	private JButton btnBuscar;
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JComboBox <String> cboCodAlumno;
	private JComboBox <String> cboCodCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRegistro_Matricula dialog = new DlgRegistro_Matricula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRegistro_Matricula() {
		setUndecorated(true);
		setTitle("Registro | Matricula");
		setSize(700,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.addActionListener(this);
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
		btnConsultar.setBounds(566, 43, 110, 40);
		contentPanel.add(btnConsultar);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnAdicionar.setBounds(566, 93, 110, 40);
		contentPanel.add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(this);
		btnModificar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnModificar.setBounds(566, 143, 110, 40);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(this);
		btnEliminar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnEliminar.setBounds(566, 193, 110, 40);
		contentPanel.add(btnEliminar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setPressedIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
		btnBuscar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_AME_2.png"));
		btnBuscar.setIcon(new ImageIcon("imagenes\\BOTON_AME_1.png"));
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
		btnBuscar.setBounds(196, 28, 110, 40);
		contentPanel.add(btnBuscar);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setRolloverIcon(new ImageIcon("imagenes\\BotonAceptar2.png"));
		btnAceptar.setPressedIcon(new ImageIcon("imagenes\\BotonAceptar1.png"));
		btnAceptar.setIcon(new ImageIcon("imagenes\\BotonAceptar1.png"));
		btnAceptar.addActionListener(this);
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
		btnAceptar.setBounds(196, 108, 110, 110);
		contentPanel.add(btnAceptar);
		
		btnCerrar = new JButton("");
		btnCerrar.addActionListener(this);
		btnCerrar.setPressedIcon(new ImageIcon("imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setRolloverIcon(new ImageIcon("imagenes\\BOTON_CERRAR_2.png"));
		btnCerrar.setIcon(new ImageIcon("imagenes\\BOTON_CERRAR_1.png"));
		btnCerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setBounds(662, 6, 28, 28);
		contentPanel.add(btnCerrar);

		JLabel lblNewLabel = new JLabel("MANTENIMIENO | MATRICULA");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 5, 252, 20);
		contentPanel.add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("CODIGO: ");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 43, 64, 20);
		contentPanel.add(lblCodigo);
		
		JLabel lblCodigoAlumno = new JLabel("CODIGO DE ALUMNO:");
		lblCodigoAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoAlumno.setBounds(10, 82, 143, 17);
		contentPanel.add(lblCodigoAlumno);
		
		JLabel lblCodigoDeCurso = new JLabel("CODIGO DE CURSO:");
		lblCodigoDeCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDeCurso.setBounds(10, 166, 132, 17);
		contentPanel.add(lblCodigoDeCurso);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 249, 673, 240);
		contentPanel.add(scrollPane);	
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNumMatricula.setBounds(84, 43, 102, 20);
		contentPanel.add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		cboCodAlumno = new JComboBox <String>();
		cboCodAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodAlumno.setEditable(false);
		cboCodAlumno.setBounds(51, 109, 102, 20);
		contentPanel.add(cboCodAlumno);
		obtenerAlumnos();
		
		cboCodCurso = new JComboBox <String>();
		cboCodCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboCodCurso.setEditable(false);
		cboCodCurso.setBounds(51, 200, 102, 20);
		contentPanel.add(cboCodCurso);
		obtenerCursos();
		
		JLabel lblImgCurso = new JLabel("");
		lblImgCurso.setBounds(366, 57, 155, 155);
		contentPanel.add(lblImgCurso);
		JTextArea txtResultado = new JTextArea();
		
		tblMatricula = new JTable();
		scrollPane.setViewportView(tblMatricula);
		tblMatricula.setFillsViewportHeight(true);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("numMatricula");
		modelo.addColumn("codAlumno");
		modelo.addColumn("codCurso");
		modelo.addColumn("fecha");
		modelo.addColumn("hora");
		tblMatricula.setModel(modelo);
		txtNumMatricula.setEditable(false);
		cboCodAlumno.setEnabled(false);
		cboCodCurso.setEnabled(false);
		listar();
		editarFila();
	}
	
	void obtenerAlumnos() {
		ArregloAlumno arregloAlumno = new ArregloAlumno();
		Alumno a;
		for (int i = 0; i < arregloAlumno.tamaño(); i++) {
			a = arregloAlumno.obtener(i);
			if (a.getEstado() == 0) {
				cboCodAlumno.addItem("" + a.getCodAlumno());
			}
		}
	}
	
	void obtenerCursos() {
		ArregloCurso arregloCurso = new ArregloCurso();
		Curso c;
		for (int i = 0; i < arregloCurso.tamaño(); i++) {
			c = arregloCurso.obtener(i);
			cboCodCurso.addItem("" + c.getCodCurso());
		}
	}
	
	ArregloMatricula arregloMatricula = new ArregloMatricula();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			ACEPTAR(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			BUSCAR(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			CERRAR(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			ELIMINAR(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			MODIFICAR(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			ADICIONAR(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			CONSULTAR(arg0);
		}
	}
	protected void CONSULTAR(ActionEvent arg0) {
	}
	protected void ADICIONAR(ActionEvent arg0) {
		FuncionesGenerales.HabilitarBotones(true, btnAceptar, btnConsultar, btnEliminar, btnModificar, btnAdicionar, btnAceptar);
		btnAdicionar.setEnabled(false);
		habilitarEntradas(true);

	}
	protected void MODIFICAR(ActionEvent arg0) {
	}
	protected void ELIMINAR(ActionEvent arg0) {
	}
	protected void CERRAR(ActionEvent arg0) {
		this.dispose();
	}
	protected void BUSCAR(ActionEvent arg0) {
	}
	protected void ACEPTAR(ActionEvent arg0) {
		int numMatricula = leerNumMatricula();
		int codAlumno	 = Integer.parseInt(leerCodAlumno());
		int codCurso	 = Integer.parseInt(leerCodCurso());
		if (btnAdicionar.isEnabled() == false) {
			Matricula nuevo = new Matricula(numMatricula, codAlumno, codCurso, Fecha.fechaActual(), Fecha.horaActual());
			arregloMatricula.adicionar(nuevo);
			btnAdicionar.setEnabled(true);
		}
		if (btnModificar.isEnabled() == false) {
			Matricula matricula = arregloMatricula.buscar(numMatricula);
			matricula.setcodCurdo(codCurso);
			arregloMatricula.actualizarArchivo();
			btnModificar.setEnabled(true);
		}
	}
	
	private void listar() {
		int posFila = 0;
		if (modelo.getRowCount() > 0)
			posFila = tblMatricula.getSelectedRow();
		if (modelo.getRowCount() == arregloMatricula.tamaño() - 1)
			posFila = arregloMatricula.tamaño() - 1;
		if (posFila == arregloMatricula.tamaño())
			posFila --;
		modelo.setRowCount(0);
		Matricula m;
		for (int i = 0; i < arregloMatricula.tamaño(); i++) {
			m = arregloMatricula.obtener(i);
			Object[] fila = {
					m.getnumMatricula(),
					m.getcodAlumno(),
					m.getcodCurso(),
					m.getFecha(),
					m.getHora()
			};
			modelo.addRow(fila);
		}
		if (arregloMatricula.tamaño() == 0) {
			tblMatricula.getSelectionModel().setSelectionInterval(posFila, posFila);
		}
	}
	
	void editarFila() {
		txtNumMatricula.setText("" + arregloMatricula.codigoCorrelativo());
	}
	
	int leerNumMatricula() {
		return Integer.parseInt(txtNumMatricula.getText());
	}
	String leerCodAlumno() {
		return cboCodAlumno.getItemAt(cboCodAlumno.getSelectedIndex());
	}
	String leerCodCurso() {
		return cboCodCurso.getItemAt(cboCodCurso.getSelectedIndex());
	}

	void habilitarEntradas(boolean X) {
		cboCodAlumno.setEnabled(X);
		cboCodCurso.setEnabled(X);
	}
}





















