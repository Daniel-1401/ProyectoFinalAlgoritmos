package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloAlumno;
import Arreglos.ArregloCurso;
import Arreglos.ArregloMatricula;
import Clases.Alumno;
import Clases.Curso;
import Clases.Matricula;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class DlgReporte_Matricula_Curso extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnListar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_Matricula_Curso dialog = new DlgReporte_Matricula_Curso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_Matricula_Curso() {
		setTitle("Reporte | Curso");
		setSize(800,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alumnos matriculados por curso ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(31, 15, 329, 22);
		contentPanel.add(lblNewLabel);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnListar.setBounds(370, 14, 89, 23);
		contentPanel.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 55, 724, 384);
		contentPanel.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
		
		void listar() {
			
			
		
		ArregloAlumno arregloAlumno = new ArregloAlumno();
		ArregloCurso arregloCurso = new ArregloCurso();
		ArregloMatricula arregloMatricula = new ArregloMatricula();
		
		txtResultado.append("CODALUMNO" + "\t" + 
				"NOMBRE"+ "\t" +
				"APELLIDOS"+ "\t\t" +
				"CODCURSO" + "\t" +
				"ASIGNATURA"+ "\n");	
		
			for (int j = 0; j < arregloMatricula.tamaño(); j++) {
				Matricula matricula = arregloMatricula.obtener(j);
			Alumno alumno = arregloAlumno.buscar(matricula.getcodAlumno());
			Curso curso = arregloCurso.buscar(matricula.getcodCurso());
			
			txtResultado.append(alumno.getCodAlumno() + "\t" + 
					alumno.getNombre()+ "\t" +
					alumno.getApellidos()+ "\t\t" +
					curso.getCodCurso() + "\t" +
					curso.getAsignatura()+ "\n");
			
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
