package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.funcionarioDAO;
import DTO.funcionarioDTO;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumero_funcionario;
	private JTextField txtnome_funcionario;
	private JLabel lblNewLabel;
	private JTextField txtendereco_funcionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastro frame = new frmCadastro();
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
	public frmCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lbl_nome = new JLabel("Nome");
		GridBagConstraints gbc_lbl_nome = new GridBagConstraints();
		gbc_lbl_nome.anchor = GridBagConstraints.WEST;
		gbc_lbl_nome.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_nome.gridx = 0;
		gbc_lbl_nome.gridy = 0;
		contentPane.add(lbl_nome, gbc_lbl_nome);

		txtnome_funcionario = new JTextField();
		GridBagConstraints gbc_txtnome_funcionario = new GridBagConstraints();
		gbc_txtnome_funcionario.anchor = GridBagConstraints.WEST;
		gbc_txtnome_funcionario.insets = new Insets(0, 0, 5, 0);
		gbc_txtnome_funcionario.gridx = 0;
		gbc_txtnome_funcionario.gridy = 1;
		contentPane.add(txtnome_funcionario, gbc_txtnome_funcionario);
		txtnome_funcionario.setColumns(10);

		JLabel lbl_numero = new JLabel("Numero");
		GridBagConstraints gbc_lbl_numero = new GridBagConstraints();
		gbc_lbl_numero.anchor = GridBagConstraints.WEST;
		gbc_lbl_numero.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_numero.gridx = 0;
		gbc_lbl_numero.gridy = 2;
		contentPane.add(lbl_numero, gbc_lbl_numero);

		txtnumero_funcionario = new JTextField();
		GridBagConstraints gbc_txtnumero_funcionario = new GridBagConstraints();
		gbc_txtnumero_funcionario.anchor = GridBagConstraints.WEST;
		gbc_txtnumero_funcionario.insets = new Insets(0, 0, 5, 0);
		gbc_txtnumero_funcionario.gridx = 0;
		gbc_txtnumero_funcionario.gridy = 3;
		contentPane.add(txtnumero_funcionario, gbc_txtnumero_funcionario);
		txtnumero_funcionario.setColumns(10);

		lblNewLabel = new JLabel("Endereco");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		txtendereco_funcionario = new JTextField();
		GridBagConstraints gbc_txtendereco_funcionario = new GridBagConstraints();
		gbc_txtendereco_funcionario.anchor = GridBagConstraints.WEST;
		gbc_txtendereco_funcionario.insets = new Insets(0, 0, 5, 0);
		gbc_txtendereco_funcionario.gridx = 0;
		gbc_txtendereco_funcionario.gridy = 5;
		contentPane.add(txtendereco_funcionario, gbc_txtendereco_funcionario);
		txtendereco_funcionario.setColumns(10);

		JButton btnconfirmar = new JButton("Confirmar");
		btnconfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				confirm();

			}

			private void confirm() {

				try {

					String nome_func, endereco_func, numero_func;

					nome_func = txtnome_funcionario.getText();
					endereco_func = txtendereco_funcionario.getText();
					numero_func = txtnumero_funcionario.getText();

					funcionarioDTO objfunc = new funcionarioDTO();

					objfunc.setNome_funcionario(nome_func);
					objfunc.setEndereco_funcionario(endereco_func);
					objfunc.setNumero_funcionario(numero_func);

					funcionarioDAO objfuncDAO = new funcionarioDAO();

					ResultSet resultfunc = objfuncDAO.cadastroUsuario(objfunc);

					if (resultfunc.next()) {
						
						JOptionPane.showMessageDialog(null, "USUARIO INSERIDO COM SUCESSO");

					}

					else {
						
						JOptionPane.showMessageDialog(null, "Ocorreu um erro");

					}

				} catch (SQLException e) {
					
					JOptionPane.showMessageDialog(null, "erro" + e);

				}

			}
		});
		GridBagConstraints gbc_btnconfirmar = new GridBagConstraints();
		gbc_btnconfirmar.anchor = GridBagConstraints.WEST;
		gbc_btnconfirmar.insets = new Insets(0, 0, 5, 0);
		gbc_btnconfirmar.gridx = 0;
		gbc_btnconfirmar.gridy = 7;
		contentPane.add(btnconfirmar, gbc_btnconfirmar);
	}

}
