package Package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLayeredPane;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panels extends JFrame {

	private JPanel contentPane;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private final JPanel Main_pnl = new JPanel();
	private final JPanel ListSelector_pnl = new JPanel();
	private final JPanel Prompts_pnl = new JPanel();
	private final JPanel ListCreator_pnl = new JPanel();
	private final JLabel MainTitle_lbl = new JLabel("Prompt Generator!");
	private final JButton PromptGen_btn = new JButton("Generate Prompts");
	private final JButton CreateList_btn = new JButton("Create Lists");
	private final JLabel ListSelector_lbl = new JLabel("List Selector");
	private final JButton List1_btn = new JButton("Empty");
	private final JButton List2_btn = new JButton("Empty");
	private final JButton List3_btn = new JButton("Empty");
	private final JButton List4_btn = new JButton("Empty");
	private final JButton List5_btn = new JButton("Empty");
	private final JLabel ListCreater_lbl = new JLabel("Create A List!");
	private final JLabel NameList_lbl = new JLabel("Name your list:");
	private final JTextField ListName_txt = new JTextField();
	private final JLabel Prompt_lbl = new JLabel("Write your prompt:");
	private final JTextField Prompt_txt = new JTextField();
	private final JLabel PromptHelp_lbl = new JLabel("Press enter to write a new prompt");
	private final JButton Submit_btn = new JButton("Create");

	private final JButton BackCreate_btn = new JButton("Back");
	private final JButton BackSelector_btn = new JButton("Back");
	private final JButton BackPrompts_btn = new JButton("Back");
	private ListMaker List = new ListMaker();
	private Lists ListStorer = new Lists();
	private Randomizer Random = new Randomizer();
	private final JLabel Prompt1_lbl = new JLabel("New label");
	private final JLabel Prompt2_lbl = new JLabel("New label");
	private final JLabel Prompt3_lbl = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panels frame = new Panels();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Creates the function which changes panel
	public void switchpanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	/**
	 * Create the frame.
	 */
	public Panels() {
		ListName_txt.setForeground(Color.BLACK);
		ListName_txt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListName_txt.setColumns(10);
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		//Creating layered pane
		GridBagConstraints gbc_layeredPane = new GridBagConstraints();
		gbc_layeredPane.fill = GridBagConstraints.BOTH;
		gbc_layeredPane.gridx = 0;
		gbc_layeredPane.gridy = 0;
		contentPane.add(layeredPane, gbc_layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		Main_pnl.setBackground(new Color(255, 102, 153)); // Colour handpicked by a kid
		
		
		// Main screen code
		layeredPane.add(Main_pnl, "name_258137188773400");
		GridBagLayout gbl_Main_pnl = new GridBagLayout();
		gbl_Main_pnl.columnWidths = new int[]{0, 0};
		gbl_Main_pnl.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Main_pnl.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Main_pnl.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Main_pnl.setLayout(gbl_Main_pnl);
		
		GridBagConstraints gbc_MainTitle_lbl = new GridBagConstraints();
		gbc_MainTitle_lbl.insets = new Insets(25, 0, 5, 0);
		gbc_MainTitle_lbl.gridx = 0;
		gbc_MainTitle_lbl.gridy = 0;
		MainTitle_lbl.setForeground(Color.BLACK);
		MainTitle_lbl.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Main_pnl.add(MainTitle_lbl, gbc_MainTitle_lbl);
		
		GridBagConstraints gbc_PromptGen_btn = new GridBagConstraints();
		gbc_PromptGen_btn.insets = new Insets(75, 0, 5, 0);
		gbc_PromptGen_btn.gridx = 0;
		gbc_PromptGen_btn.gridy = 4;
		PromptGen_btn.setForeground(Color.BLACK);
		PromptGen_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(ListSelector_pnl);
			}
		});
		PromptGen_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Main_pnl.add(PromptGen_btn, gbc_PromptGen_btn);
		
		GridBagConstraints gbc_CreateList_btn = new GridBagConstraints();
		gbc_CreateList_btn.insets = new Insets(50, 0, 5, 0);
		gbc_CreateList_btn.gridx = 0;
		gbc_CreateList_btn.gridy = 7;
		CreateList_btn.setForeground(Color.BLACK);
		CreateList_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(ListCreator_pnl);
			}
			
		});
		CreateList_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Main_pnl.add(CreateList_btn, gbc_CreateList_btn);
		
		//List Selector
		ListSelector_pnl.setBackground(new Color(255, 102, 153));
		layeredPane.add(ListSelector_pnl, "name_258243735011300");
		GridBagLayout gbl_ListSelector_pnl = new GridBagLayout();
		gbl_ListSelector_pnl.columnWidths = new int[]{256, 214, 0};
		gbl_ListSelector_pnl.rowHeights = new int[]{49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ListSelector_pnl.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_ListSelector_pnl.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ListSelector_pnl.setLayout(gbl_ListSelector_pnl);
		ListSelector_lbl.setForeground(Color.BLACK);
		ListSelector_lbl.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		GridBagConstraints gbc_ListSelector_lbl = new GridBagConstraints();
		gbc_ListSelector_lbl.insets = new Insets(0, 0, 5, 0);
		gbc_ListSelector_lbl.anchor = GridBagConstraints.NORTHWEST;
		gbc_ListSelector_lbl.gridx = 1;
		gbc_ListSelector_lbl.gridy = 0;
		ListSelector_pnl.add(ListSelector_lbl, gbc_ListSelector_lbl);
		
		GridBagConstraints gbc_List1_btn = new GridBagConstraints();
		gbc_List1_btn.insets = new Insets(0, 0, 5, 0);
		gbc_List1_btn.gridx = 1;
		gbc_List1_btn.gridy = 2;
		List1_btn.setForeground(Color.BLACK);
		List1_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random.SetList(ListStorer.getArray1());
				Random.Randomize();
				String P1 = Random.getPrompt1();
				String P2 = Random.getPrompt2();
				String P3 = Random.getPrompt3();
				Prompt1_lbl.setText(P1);
				Prompt2_lbl.setText(P2);
				Prompt3_lbl.setText(P3);
				switchpanel(Prompts_pnl);
				
			}
		});
		List1_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListSelector_pnl.add(List1_btn, gbc_List1_btn);
		
		GridBagConstraints gbc_List2_btn = new GridBagConstraints();
		gbc_List2_btn.insets = new Insets(0, 0, 5, 0);
		gbc_List2_btn.gridx = 1;
		gbc_List2_btn.gridy = 3;
		List2_btn.setForeground(Color.BLACK);
		List2_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random.SetList(ListStorer.getArray2());
				Random.Randomize();
				String P1 = Random.getPrompt1();
				String P2 = Random.getPrompt2();
				String P3 = Random.getPrompt3();
				Prompt1_lbl.setText(P1);
				Prompt2_lbl.setText(P2);
				Prompt3_lbl.setText(P3);
				switchpanel(Prompts_pnl);
				
			}
		});
		List2_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListSelector_pnl.add(List2_btn, gbc_List2_btn);
		
		GridBagConstraints gbc_List3_btn = new GridBagConstraints();
		gbc_List3_btn.insets = new Insets(0, 0, 5, 0);
		gbc_List3_btn.gridx = 1;
		gbc_List3_btn.gridy = 4;
		List3_btn.setForeground(Color.BLACK);
		List3_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random.SetList(ListStorer.getArray3());
				Random.Randomize();
				String P1 = Random.getPrompt1();
				String P2 = Random.getPrompt2();
				String P3 = Random.getPrompt3();
				Prompt1_lbl.setText(P1);
				Prompt2_lbl.setText(P2);
				Prompt3_lbl.setText(P3);
				switchpanel(Prompts_pnl);
				
			}
		});
		List3_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListSelector_pnl.add(List3_btn, gbc_List3_btn);
		
		GridBagConstraints gbc_List4_btn = new GridBagConstraints();
		gbc_List4_btn.insets = new Insets(0, 0, 5, 0);
		gbc_List4_btn.gridx = 1;
		gbc_List4_btn.gridy = 5;
		List4_btn.setForeground(Color.BLACK);
		List4_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random.SetList(ListStorer.getArray4());
				Random.Randomize();
				String P1 = Random.getPrompt1();
				String P2 = Random.getPrompt2();
				String P3 = Random.getPrompt3();
				Prompt1_lbl.setText(P1);
				Prompt2_lbl.setText(P2);
				Prompt3_lbl.setText(P3);
				switchpanel(Prompts_pnl);
				
			}
		});
		List4_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListSelector_pnl.add(List4_btn, gbc_List4_btn);
		
		GridBagConstraints gbc_List5_btn = new GridBagConstraints();
		gbc_List5_btn.insets = new Insets(0, 0, 5, 0);
		gbc_List5_btn.gridx = 1;
		gbc_List5_btn.gridy = 6;
		List5_btn.setForeground(Color.BLACK);
		List5_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random.SetList(ListStorer.getArray5());
				Random.Randomize();
				String P1 = Random.getPrompt1();
				String P2 = Random.getPrompt2();
				String P3 = Random.getPrompt3();
				Prompt1_lbl.setText(P1);
				Prompt2_lbl.setText(P2);
				Prompt3_lbl.setText(P3);
				switchpanel(Prompts_pnl);
				
			}
		});
		List5_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListSelector_pnl.add(List5_btn, gbc_List5_btn);
		
		GridBagConstraints gbc_BackSelector_btn = new GridBagConstraints();
		gbc_BackSelector_btn.insets = new Insets(0, 0, 0, 5);
		gbc_BackSelector_btn.gridx = 0;
		gbc_BackSelector_btn.gridy = 9;
		BackSelector_btn.setForeground(Color.BLACK);
		BackSelector_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(Main_pnl);
			}
		});
		BackSelector_btn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ListSelector_pnl.add(BackSelector_btn, gbc_BackSelector_btn);
		
		//Prompts screen
		Prompts_pnl.setBackground(new Color(255, 102, 153));
		layeredPane.add(Prompts_pnl, "name_258287682441200");
		GridBagLayout gbl_Prompts_pnl = new GridBagLayout();
		gbl_Prompts_pnl.columnWidths = new int[]{0, 0, 0, 0};
		gbl_Prompts_pnl.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Prompts_pnl.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_Prompts_pnl.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Prompts_pnl.setLayout(gbl_Prompts_pnl);
		
		GridBagConstraints gbc_BackPrompts_btn = new GridBagConstraints();
		gbc_BackPrompts_btn.insets = new Insets(50, 0, 0, 5);
		gbc_BackPrompts_btn.gridx = 1;
		gbc_BackPrompts_btn.gridy = 13;
		BackPrompts_btn.setForeground(Color.BLACK);
		BackPrompts_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(Main_pnl);
			}
		});
		
		GridBagConstraints gbc_Prompt1_lbl = new GridBagConstraints();
		gbc_Prompt1_lbl.gridwidth = 3;
		gbc_Prompt1_lbl.insets = new Insets(25, 0, 5, 0);
		gbc_Prompt1_lbl.gridx = 0;
		gbc_Prompt1_lbl.gridy = 1;
		Prompt1_lbl.setForeground(Color.BLACK);
		Prompt1_lbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Prompts_pnl.add(Prompt1_lbl, gbc_Prompt1_lbl);
		
		GridBagConstraints gbc_Prompt2_lbl = new GridBagConstraints();
		gbc_Prompt2_lbl.gridwidth = 3;
		gbc_Prompt2_lbl.insets = new Insets(50, 0, 5, 0);
		gbc_Prompt2_lbl.gridx = 0;
		gbc_Prompt2_lbl.gridy = 2;
		Prompt2_lbl.setForeground(Color.BLACK);
		Prompt2_lbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Prompts_pnl.add(Prompt2_lbl, gbc_Prompt2_lbl);
		
		GridBagConstraints gbc_Prompt3_lbl = new GridBagConstraints();
		gbc_Prompt3_lbl.gridwidth = 3;
		gbc_Prompt3_lbl.insets = new Insets(50, 0, 5, 0);
		gbc_Prompt3_lbl.gridx = 0;
		gbc_Prompt3_lbl.gridy = 3;
		Prompt3_lbl.setForeground(Color.BLACK);
		Prompt3_lbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Prompts_pnl.add(Prompt3_lbl, gbc_Prompt3_lbl);
		BackPrompts_btn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Prompts_pnl.add(BackPrompts_btn, gbc_BackPrompts_btn);
		
		
		//List Creator
		ListCreator_pnl.setBackground(new Color(255, 102, 153));
		layeredPane.add(ListCreator_pnl, "name_258322239138100");
		GridBagLayout gbl_ListCreator_pnl = new GridBagLayout();
		gbl_ListCreator_pnl.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ListCreator_pnl.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ListCreator_pnl.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_ListCreator_pnl.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ListCreator_pnl.setLayout(gbl_ListCreator_pnl);
		
		GridBagConstraints gbc_ListCreater_lbl = new GridBagConstraints();
		gbc_ListCreater_lbl.insets = new Insets(0, 0, 5, 0);
		gbc_ListCreater_lbl.gridwidth = 12;
		gbc_ListCreater_lbl.gridx = 0;
		gbc_ListCreater_lbl.gridy = 0;
		ListCreater_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		ListCreater_lbl.setForeground(Color.BLACK);
		ListCreater_lbl.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ListCreator_pnl.add(ListCreater_lbl, gbc_ListCreater_lbl);
		
		GridBagConstraints gbc_NameList_lbl = new GridBagConstraints();
		gbc_NameList_lbl.insets = new Insets(0, 0, 5, 0);
		gbc_NameList_lbl.gridwidth = 12;
		gbc_NameList_lbl.gridx = 0;
		gbc_NameList_lbl.gridy = 1;
		NameList_lbl.setForeground(Color.BLACK);
		NameList_lbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListCreator_pnl.add(NameList_lbl, gbc_NameList_lbl);
		
		GridBagConstraints gbc_ListName_txt = new GridBagConstraints();
		gbc_ListName_txt.gridwidth = 12;
		gbc_ListName_txt.insets = new Insets(0, 0, 5, 5);
		gbc_ListName_txt.gridx = 0;
		gbc_ListName_txt.gridy = 2;
		ListCreator_pnl.add(ListName_txt, gbc_ListName_txt);
		
		GridBagConstraints gbc_Prompt_lbl = new GridBagConstraints();
		gbc_Prompt_lbl.insets = new Insets(0, 0, 5, 0);
		gbc_Prompt_lbl.gridwidth = 12;
		gbc_Prompt_lbl.gridx = 0;
		gbc_Prompt_lbl.gridy = 3;
		Prompt_lbl.setForeground(Color.BLACK);
		Prompt_lbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListCreator_pnl.add(Prompt_lbl, gbc_Prompt_lbl);
		
		GridBagConstraints gbc_Prompt_txt = new GridBagConstraints();
		gbc_Prompt_txt.gridwidth = 12;
		gbc_Prompt_txt.insets = new Insets(0, 0, 5, 5);
		gbc_Prompt_txt.gridx = 0;
		gbc_Prompt_txt.gridy = 4;
		Prompt_txt.setForeground(Color.BLACK);
		Prompt_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
			    if (key == KeyEvent.VK_ENTER) {
			    	String content = Prompt_txt.getText();
			    	List.AddColl(content);
			    	Prompt_txt.setText("");
			    }
			}
		});
		Prompt_txt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Prompt_txt.setColumns(10);
		ListCreator_pnl.add(Prompt_txt, gbc_Prompt_txt);
		
		GridBagConstraints gbc_PromptHelp_lbl = new GridBagConstraints();
		gbc_PromptHelp_lbl.insets = new Insets(0, 0, 5, 0);
		gbc_PromptHelp_lbl.gridwidth = 12;
		gbc_PromptHelp_lbl.gridx = 0;
		gbc_PromptHelp_lbl.gridy = 5;
		PromptHelp_lbl.setForeground(Color.BLACK);
		PromptHelp_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ListCreator_pnl.add(PromptHelp_lbl, gbc_PromptHelp_lbl);
		
		GridBagConstraints gbc_Submit_btn = new GridBagConstraints();
		gbc_Submit_btn.insets = new Insets(0, 0, 5, 0);
		gbc_Submit_btn.gridwidth = 12;
		gbc_Submit_btn.gridx = 0;
		gbc_Submit_btn.gridy = 7;
		Submit_btn.setForeground(Color.BLACK);
		Submit_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				if(List1_btn.getText().equals("Empty")) {
					List1_btn.setText(ListName_txt.getText());
				} else if(List2_btn.getText().equals("Empty")) {
					List2_btn.setText(ListName_txt.getText());
				} else if(List3_btn.getText().equals("Empty")) {
					List3_btn.setText(ListName_txt.getText());
				} else if(List4_btn.getText().equals("Empty")) {
					List4_btn.setText(ListName_txt.getText());
				} else if(List5_btn.getText().equals("Empty")) {
					List5_btn.setText(ListName_txt.getText());
				}
				ArrayList<String> NewList = List.getX();
				ListStorer.SetList(NewList);
				ListName_txt.setText("");
			
			}
		});
		Submit_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ListCreator_pnl.add(Submit_btn, gbc_Submit_btn);
		
		GridBagConstraints gbc_BackCreate_btn = new GridBagConstraints();
		gbc_BackCreate_btn.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_BackCreate_btn.insets = new Insets(0, 0, 0, 5);
		gbc_BackCreate_btn.gridx = 0;
		gbc_BackCreate_btn.gridy = 10;
		BackCreate_btn.setBackground(new Color(204, 255, 255));
		BackCreate_btn.setForeground(Color.BLACK);
		BackCreate_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(Main_pnl);
			}
		});
		BackCreate_btn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ListCreator_pnl.add(BackCreate_btn, gbc_BackCreate_btn);
		
		//New
	}
	
}
