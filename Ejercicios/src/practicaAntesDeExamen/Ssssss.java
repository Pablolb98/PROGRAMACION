package practicaAntesDeExamen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Ssssss {

	private JFrame frame;
	private JTextField txtSdjfsdjfhfshjdfjfhsjdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ssssss window = new Ssssss();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ssssss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblid = new JLabel("id");
		GridBagConstraints gbc_lblid = new GridBagConstraints();
		gbc_lblid.insets = new Insets(0, 0, 5, 5);
		gbc_lblid.anchor = GridBagConstraints.EAST;
		gbc_lblid.gridx = 0;
		gbc_lblid.gridy = 0;
		frame.getContentPane().add(lblid, gbc_lblid);
		
		txtSdjfsdjfhfshjdfjfhsjdf = new JTextField();
		txtSdjfsdjfhfshjdfjfhsjdf.setText("sdjfsdjfhfshjdfjfhsjdf");
		GridBagConstraints gbc_txtSdjfsdjfhfshjdfjfhsjdf = new GridBagConstraints();
		gbc_txtSdjfsdjfhfshjdfjfhsjdf.gridwidth = 2;
		gbc_txtSdjfsdjfhfshjdfjfhsjdf.insets = new Insets(0, 0, 5, 0);
		gbc_txtSdjfsdjfhfshjdfjfhsjdf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSdjfsdjfhfshjdfjfhsjdf.gridx = 1;
		gbc_txtSdjfsdjfhfshjdfjfhsjdf.gridy = 0;
		frame.getContentPane().add(txtSdjfsdjfhfshjdfjfhsjdf, gbc_txtSdjfsdjfhfshjdfjfhsjdf);
		txtSdjfsdjfhfshjdfjfhsjdf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
	}

}
