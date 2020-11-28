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

public class DlgReporte_Matricula_Pendiente extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_Matricula_Pendiente dialog = new DlgReporte_Matricula_Pendiente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_Matricula_Pendiente() {
		setTitle("Reporte | Pendiente");
		setSize(800,500);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alumnos con matr\u00EDcula pendiente ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(34, 12, 329, 22);
		contentPanel.add(lblNewLabel);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnListar.setBounds(373, 11, 89, 23);
		contentPanel.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 52, 724, 384);
		contentPanel.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}

}
