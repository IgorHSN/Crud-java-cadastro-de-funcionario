package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class frmTela extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTela frame = new frmTela();
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
	public frmTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 89, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{113, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA UMA OP\u00C7\u00C3O:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btncadastrar = new JButton("CADASTRAR");
		GridBagConstraints gbc_btncadastrar = new GridBagConstraints();
		gbc_btncadastrar.anchor = GridBagConstraints.WEST;
		gbc_btncadastrar.insets = new Insets(0, 0, 0, 5);
		gbc_btncadastrar.gridx = 0;
		gbc_btncadastrar.gridy = 1;
		getContentPane().add(btncadastrar, gbc_btncadastrar);
		
		JButton btnconsultar = new JButton("CONSULTAR");
		GridBagConstraints gbc_btnconsultar = new GridBagConstraints();
		gbc_btnconsultar.insets = new Insets(0, 0, 0, 5);
		gbc_btnconsultar.anchor = GridBagConstraints.WEST;
		gbc_btnconsultar.gridx = 1;
		gbc_btnconsultar.gridy = 1;
		getContentPane().add(btnconsultar, gbc_btnconsultar);
		
		JButton btndeletar = new JButton("DELETAR");
		GridBagConstraints gbc_btndeletar = new GridBagConstraints();
		gbc_btndeletar.gridx = 3;
		gbc_btndeletar.gridy = 1;
		getContentPane().add(btndeletar, gbc_btndeletar);
	}

}
