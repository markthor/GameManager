import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class View {
	private int height, width;
	private String[] columnNames = {"Name","Elo" ,"W/L ratio","Games played"};
	private Object[][] testInput = {{"Underliv", (int)1210, (double)0.5, (int)2000}, {"Altid Basked", (int)870, (double)0.125, (int)8700}};
	private JFrame frame;
	private Container contentPane;
	private JRadioButton OnePlayerRB, TwoPlayerRB;
	private JLabel OnePlayerL, TwoPlayerL;
	private JTabbedPane tabbedPane;
	private JComponent MRPanel, PlayerPanel;
	private JRadioButton[] mapPoolRB;
	private GUITableModel tableModel;
	
	public View()
	{
		initialize();
	}
	private void initialize()
	{
		width = 500;
		height = 500;
		frame = new JFrame("Car reservation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setSize(width, height);
		createContent();
		frame.setVisible(true);
		
	}
	
	private void createContent()
	{
		contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout());
		createMRContent();
		createPlayerContent();
		
	}
	
	private void createPlayerContent()
	{
		JPanel reportPanel = new JPanel();
		reportPanel.setMinimumSize(new Dimension(400, 300));
		reportPanel.setLayout(new BorderLayout());
		JFormattedTextField player1Box = new JFormattedTextField();
		JFormattedTextField player2Box = new JFormattedTextField();
		reportPanel.add(player1Box);
		reportPanel.add(player2Box);
		int korruption;
		JComponent playerPanel = new JPanel();
		playerPanel.setLayout(new BoxLayout(playerPanel, BoxLayout.PAGE_AXIS));
		tabbedPane.addTab("Players", playerPanel);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		tableModel = new GUITableModel(columnNames, testInput);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		playerPanel.add(reportPanel);
		playerPanel.add(scrollPane);
		
		contentPane.add(tabbedPane);
	}
	
	private void createMapPoolRB()
	{
		int i = 3;
		mapPoolRB = new JRadioButton[i];
		for(int k = 0; k < i; k++)
		{
			mapPoolRB[k] = new JRadioButton();
		}
		
	}
	
	private void createMRContent()
	{
		GridBagLayout layout = new GridBagLayout();
		//layout.setConstraints(comp, constraints)
		tabbedPane = new JTabbedPane();
		JComponent MRPanel = new JPanel();
		MRPanel.setLayout(new GridLayout());
		tabbedPane.addTab("Randomizer", MRPanel);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		OnePlayerRB = new JRadioButton();
		TwoPlayerRB = new JRadioButton();
		OnePlayerL = new JLabel("1v1");
		TwoPlayerL = new JLabel("2v2");
		ButtonGroup BG = new ButtonGroup();
		BG.add(OnePlayerRB);
		BG.add(TwoPlayerRB);
		
		
		MRPanel.add(OnePlayerL);
		MRPanel.add(OnePlayerRB);
		MRPanel.add(TwoPlayerL);
		MRPanel.add(TwoPlayerRB);
	}
	
	private void createConstraints()
	{
		GridBagConstraints upperLeftConstraints = new GridBagConstraints();
		upperLeftConstraints.gridx = 0;
		upperLeftConstraints.gridy = 0;
		upperLeftConstraints.gridheight = GridBagConstraints.REMAINDER;
		upperLeftConstraints.weighty = 1.0;
		upperLeftConstraints.fill = GridBagConstraints.VERTICAL;
		upperLeftConstraints.insets = new Insets(0, 0, 0, 2);
	}
	
	public void updateTable(Object[][] data)
	{
		tableModel.updateTable(data);
	}
	
	
	
}
