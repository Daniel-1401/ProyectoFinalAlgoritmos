package GUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;

public class DlgReporte_Matricula_Vigente extends JDialog {

	private final JPanel contentPanel = new JPanel();

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
		
		JButton btnListar = new JButton("Listar");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBounds(371, 11, 89, 23);
		contentPanel.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 52, 724, 384);
		contentPanel.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}

}
