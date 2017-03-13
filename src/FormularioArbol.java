import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioArbol extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldZona;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			FormularioArbol dialog = new FormularioArbol();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public FormularioArbol(javax.swing.JFrame parent,String titulo, boolean modal) {
		super(parent,titulo,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblDatosDelArbol = new JLabel("DATOS DEL ARBOL");
		lblDatosDelArbol.setForeground(new Color(85, 107, 47));
		lblDatosDelArbol.setFont(new Font("Tahoma", Font.BOLD, 27));
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(85, 107, 47));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		
		JLabel lblZona = new JLabel("Zona:");
		lblZona.setForeground(new Color(85, 107, 47));
		lblZona.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textFieldZona = new JTextField();
		textFieldZona.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(85, 107, 47));
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textFieldAltura = new JTextField();
		textFieldAltura.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap(88, Short.MAX_VALUE)
							.addComponent(lblDatosDelArbol))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(87)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblZona)
								.addComponent(lblAltura))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldZona, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(textFieldAltura, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
					.addGap(82))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDatosDelArbol)
					.addGap(25)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textFieldZona, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblZona, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAltura)
						.addComponent(textFieldAltura, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
		
						String nombre = textFieldNombre.getText();
						String zona = textFieldZona.getText();
						double altura = Double.parseDouble(textFieldNombre.getText());
						
						Arbol arbol = new Arbol(nombre,zona,altura);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		}
	}
}
