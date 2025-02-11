package cadastrocliente;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

import cadastrocliente.Model.Cliente;
import cadastrocliente.dao.ClienteDAO;

public class TelaInicial extends JFrame {
	
	private ClienteDAO clientes;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TFNome;
	private JTextField TFTelefone;
	private JTextField TFEndereco;
	private JTextField TFCidade;
	private JLabel lblNewLabel_2_3;
	private JTextField TFCpf;
	private JLabel lblNewLabel;
	private JLabel lblNumero;
	private JTextField TFNumero;
	private JLabel lblEstado;
	private JTextField TFEstado;
	private JTable table;
	private DefaultTableModel valoresTabela;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaInicial frame = new TelaInicial();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		
		this.clientes = new ClienteDAO();
		
		setResizable(false);
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1620, 855);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(100, 30, 53, 22);
		contentPane.add(lblNewLabel_2);
		
		TFNome = new JTextField();
		TFNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFNome.setBounds(160, 30, 320, 25);
		contentPane.add(TFNome);
		TFNome.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefone:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(77, 63, 81, 22);
		contentPane.add(lblNewLabel_2_1);
		
		TFTelefone = new JTextField();
		TFTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFTelefone.setColumns(10);
		TFTelefone.setBounds(160, 63, 320, 25);
		contentPane.add(TFTelefone);
		
		JLabel lblNewLabel_2_2 = new JLabel("Endereço:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(72, 96, 81, 22);
		contentPane.add(lblNewLabel_2_2);
		
		TFEndereco = new JTextField();
		TFEndereco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFEndereco.setColumns(10);
		TFEndereco.setBounds(160, 96, 320, 25);
		contentPane.add(TFEndereco);
		
		TFCidade = new JTextField();
		TFCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFCidade.setColumns(10);
		TFCidade.setBounds(160, 129, 320, 25);
		contentPane.add(TFCidade);
		
		lblNewLabel_2_3 = new JLabel("Cidade:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(92, 129, 61, 22);
		contentPane.add(lblNewLabel_2_3);
		
		TFCpf = new JTextField();
		TFCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFCpf.setColumns(10);
		TFCpf.setBounds(702, 30, 320, 25);
		contentPane.add(TFCpf);
		
		lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(658, 30, 37, 22);
		contentPane.add(lblNewLabel);
		
		lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumero.setBounds(625, 96, 70, 22);
		contentPane.add(lblNumero);
		
		TFNumero = new JTextField();
		TFNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFNumero.setColumns(10);
		TFNumero.setBounds(702, 96, 320, 25);
		contentPane.add(TFNumero);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEstado.setBounds(633, 129, 61, 22);
		contentPane.add(lblEstado);
		
		TFEstado = new JTextField();
		TFEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFEstado.setColumns(10);
		TFEstado.setBounds(702, 129, 320, 25);
		contentPane.add(TFEstado);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(255, 255, 255));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setBounds(77, 234, 100, 35);
		contentPane.add(btnLimpar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setBounds(187, 234, 100, 35);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirCliente();
				atualizarTabela();
			}
		});
		contentPane.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAtualizar.setBackground(Color.WHITE);
		btnAtualizar.setBounds(297, 234, 110, 35);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarCliente();
				atualizarTabela();
			}
		});
		contentPane.add(btnAtualizar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
				atualizarTabela();
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(417, 234, 100, 35);
		contentPane.add(btnSalvar);
		
		valoresTabela = new DefaultTableModel() {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		 
		 valoresTabela.addColumn("Nome");
		 valoresTabela.addColumn("CPF");
		 valoresTabela.addColumn("Telefone");
		 valoresTabela.addColumn("Endereço");

		table = new JTable(valoresTabela);
		
		table.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        if (e.getClickCount() == 2) { 
		            int linhaSelecionada = table.getSelectedRow();
		            if (linhaSelecionada != -1) { 
		                String cpf = table.getValueAt(linhaSelecionada, 1).toString();
		                
		                Cliente cliente = clientes.consultar(Long.valueOf(cpf.trim()));

		                TFNome.setText(cliente.getNome());
		                TFCpf.setText(String.valueOf(cliente.getCpf()));
		                TFTelefone.setText(String.valueOf(cliente.getTel()));
		                TFEndereco.setText(cliente.getEndereco());
		                TFNumero.setText(String.valueOf(cliente.getNumeroEndereco()));
		                TFCidade.setText(cliente.getCidade());
		                TFEstado.setText(cliente.getEstado());
		            }
		        }
		    }
		});
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 280, 1586, 527);
		contentPane.add(scrollPane);
		
		atualizarTabela();
		
	}
	
	public void limparCampos() {
		this.TFNome.setText("");
		this.TFCpf.setText("");
		this.TFTelefone.setText("");
		this.TFEndereco.setText("");
		this.TFNumero.setText("");
		this.TFCidade.setText("");
		this.TFEstado.setText("");
	}
	
	public void excluirCliente() {
		if(this.TFCpf.getText() == null || this.TFCpf.getText().isEmpty()) {
			return;
		}
		this.clientes.excluir(Long.valueOf(this.TFCpf.getText().trim()));
	}
	
	public void atualizarCliente() {
		
		if(this.TFNome.getText().isEmpty() ||
		this.TFCpf.getText().isEmpty() ||
		this.TFTelefone.getText().isEmpty() ||
		this.TFEndereco.getText().isEmpty() ||
		this.TFNumero.getText().isEmpty() ||
		this.TFCidade.getText().isEmpty() ||
		this.TFEstado.getText().isEmpty()) {
			return;
		}
		
		Cliente cliente = new Cliente(
				this.TFNome.getText(),
				Long.valueOf(this.TFCpf.getText().trim()) ,
				Long.valueOf(this.TFTelefone.getText().trim()),
				this.TFEndereco.getText(),
				Integer.valueOf(this.TFNumero.getText().trim()),
				this.TFCidade.getText(),
				this.TFEstado.getText()
				);
		
		this.clientes.alterar(cliente);
		
	}
	
	
	public void cadastrarCliente() {
		if(this.TFNome.getText().isEmpty() ||
		this.TFCpf.getText().isEmpty() ||
		this.TFTelefone.getText().isEmpty() ||
		this.TFEndereco.getText().isEmpty() ||
		this.TFNumero.getText().isEmpty() ||
		this.TFCidade.getText().isEmpty() ||
		this.TFEstado.getText().isEmpty()) {
			return;
		}
		Cliente cliente = new Cliente(
				this.TFNome.getText(),
				Long.valueOf(this.TFCpf.getText().trim()) ,
				Long.valueOf(this.TFTelefone.getText().trim()),
				this.TFEndereco.getText(),
				Integer.valueOf(this.TFNumero.getText().trim()),
				this.TFCidade.getText(),
				this.TFEstado.getText()
				);
		
		
		this.clientes.cadastrar(cliente);
	}
	
	public void atualizarTabela() {
		this.valoresTabela.setRowCount(0);
		String[] clientes = new String[4];
		
		for (Cliente cliente : this.clientes.buscarTodos()) {
			clientes[0] = cliente.getNome();
			clientes[1] = String.valueOf(cliente.getCpf());
			clientes[2] = String.valueOf(cliente.getTel());
			clientes[3] = cliente.getEndereco();

			this.valoresTabela.addRow(clientes);
		}
	}
}
