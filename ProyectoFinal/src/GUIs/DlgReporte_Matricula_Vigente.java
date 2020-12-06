package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloAlumno;
import Arreglos.ArregloMatricula;
import Clases.Alumno;
import Clases.Matricula;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgReporte_Matricula_Vigente extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnListar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_Matricula_Vigente dialog = new DlgReporte_Matricula_Vigente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_Matricula_Vigente() {
		setTitle("Reporte | Vigente");
		setSize(800,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAlumnosConMatrcula = new JLabel("Alumnos con matr\u00EDcula vigente");
		lblAlumnosConMatrcula.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAlumnosConMatrcula.setBounds(32, 12, 329, 22);
		contentPanel.add(lblAlumnosConMatrcula);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBounds(371, 11, 89, 23);
		contentPanel.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 52, 724, 384);
		contentPanel.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
	
	void listar() {
		
		ArregloAlumno arregloAlumno = new ArregloAlumno();
		ArregloMatricula arregloMatricula = new ArregloMatricula();
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		for(int i =0; i < arregloAlumno.tamaño(); i++) {
			Alumno alumno = arregloAlumno.obtener(i);
			boolean existenMatricula = false;                                   // indicador
			
			for (int j = 0; j < arregloMatricula.tamaño(); j++) {
				Matricula matricula = arregloMatricula.obtener(j);
				if(alumno.getCodAlumno() == matricula.getcodAlumno()) {
					existenMatricula = true;
				}
				
			}
			
			if(existenMatricula) {
				alumnos.add(alumno);
			}
			
		}
		
		txtResultado.append("CODALUMNO" + "\t" + 
				"NOMBRE"+ "\t" +
				"APELLIDOS"+ "\t" +
				"DNI"+ "\t" +
				"EDAD"+ "\t" +
				"CELULAR"+ "\t" +
				"ESTADO"+ "\n");
		
		for(int i = 0; i < alumnos.size(); i++) {
			Alumno alumno = alumnos.get(i);
			txtResultado.append(alumno.getCodAlumno() + "\t" + 
					alumno.getNombre()+ "\t" +
					alumno.getApellidos()+ "\t" +
					alumno.getDni()+ "\t" +
					alumno.getEdad()+ "\t" +
					alumno.getCelular()+ "\t" +
					alumno.getEstado()+ "\n");
		}
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		listar();
	}

}
