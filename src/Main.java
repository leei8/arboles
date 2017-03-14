import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxArboles;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel titulo = new JLabel("ARBOLES");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(new Color(85, 107, 47));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		comboBoxArboles = new JComboBox();
		
		JButton buttonInsertarArbol = new JButton("INSERTAR ARBOL");
		buttonInsertarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirFormularioArbol();
			}
		});
		
		JButton buttonEliminarArbol = new JButton("ELIMINAR ARBOL");
		buttonEliminarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = comboBoxArboles.getSelectedIndex();
				comboBoxArboles.removeItemAt(indice);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(141, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addGap(130))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(buttonEliminarArbol, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonInsertarArbol, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(147))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBoxArboles, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(comboBoxArboles, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(buttonInsertarArbol)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonEliminarArbol)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void abrirFormularioArbol(){
		FormularioArbol formulario = new FormularioArbol(this,"Formulario árbol", true);
		formulario.setVisible(true);
	}
	
	public void aniadirArbol (Arbol arbol){
		this.comboBoxArboles.addItem(arbol.getNombre() + " - " + arbol.getZona() + " - " + arbol.getAltura());
	}
}

