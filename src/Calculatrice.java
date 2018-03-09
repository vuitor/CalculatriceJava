import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculatrice extends JFrame implements ActionListener
{
	private float nb1, nb2, result;
	private char operateur;
	private boolean egal = false;
	private boolean point = false;
	
	private JTextField txtCalcul = new JTextField();
	private JButton btUn = new JButton("1");
	private JButton btDeux = new JButton("2");
	private JButton btTrois = new JButton("3");
	private JButton btQuatre = new JButton("4");
	private JButton btCinq = new JButton("5");
	private JButton btSix = new JButton("6");
	private JButton btSept = new JButton("7");
	private JButton btHuit = new JButton("8");
	private JButton btNeuf = new JButton("9");
	private JButton btZero = new JButton("0");
	private JButton btPlus = new JButton("+");
	private JButton btSous = new JButton("-");
	private JButton btDivise = new JButton("/");
	private JButton btMult = new JButton("*");
	private JButton btInverse = new JButton("1/x");
	private JButton btPourcent = new JButton("%");
	private JButton btPoint = new JButton(".");
	private JButton btEgal = new JButton("=");
	private JButton btR = new JButton("R");
	private JButton btAc = new JButton("AC");
	private JButton btQuitter = new JButton("Quitter");
	
	public Calculatrice() // Constructeur
	{
		this.setTitle("Ma Calculatrice");
		this.setBounds(200, 200, 320, 470);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.blue);
		
		this.setLayout(null);
		
		this.txtCalcul.setBounds(50, 20, 200, 40);
		this.add(this.txtCalcul);
		
		this.btSept.setBounds(20, 100, 50, 50);
		this.add(this.btSept);
		this.btHuit.setBounds(70, 100, 50, 50);
		this.add(this.btHuit);
		this.btNeuf.setBounds(120, 100, 50, 50);
		this.add(this.btNeuf);
		this.btDivise.setBounds(180, 100, 50, 50);
		this.add(this.btDivise);
		this.btPourcent.setBounds(240, 100, 50, 50);
		this.add(this.btPourcent);
		
		this.btQuatre.setBounds(20, 150, 50, 50);
		this.add(this.btQuatre);
		this.btCinq.setBounds(70, 150, 50, 50);
		this.add(this.btCinq);
		this.btSix.setBounds(120, 150, 50, 50);
		this.add(this.btSix);
		this.btMult.setBounds(180, 150, 50, 50);
		this.add(this.btMult);
		this.btInverse.setBounds(240, 150, 50, 50);
		this.add(this.btInverse);
		
		this.btUn.setBounds(20, 200, 50, 50);
		this.add(this.btUn);
		this.btDeux.setBounds(70, 200, 50, 50);
		this.add(this.btDeux);
		this.btTrois.setBounds(120, 200, 50, 50);
		this.add(this.btTrois);
		this.btSous.setBounds(180, 200, 50, 50);
		this.add(this.btSous);
		this.btEgal.setBounds(240, 200, 50, 100);
		this.add(this.btEgal);
		
		this.btZero.setBounds(20, 250, 100, 50);
		this.add(this.btZero);
		this.btPoint.setBounds(120, 250, 50, 50);
		this.add(this.btPoint);
		this.btPlus.setBounds(180, 250, 50, 50);
		this.add(this.btPlus);
		this.btAc.setBounds(20, 320, 150, 40);
		this.add(this.btAc);
		this.btR.setBounds(180, 320, 110, 40);
		this.add(this.btR);
		this.btQuitter.setBounds(20, 380, 270, 50);
		this.add(this.btQuitter);
		
		//Rendre les boutons cliquables
		this.btUn.addActionListener(this);
		this.btDeux.addActionListener(this);
		this.btTrois.addActionListener(this);
		this.btQuatre.addActionListener(this);
		this.btCinq.addActionListener(this);
		this.btSix.addActionListener(this);
		this.btSept.addActionListener(this);
		this.btHuit.addActionListener(this);
		this.btNeuf.addActionListener(this);
		this.btZero.addActionListener(this);
		this.btSous.addActionListener(this);
		this.btPlus.addActionListener(this);
		this.btMult.addActionListener(this);
		this.btDivise.addActionListener(this);
		this.btInverse.addActionListener(this);
		this.btR.addActionListener(this);
		this.btAc.addActionListener(this);
		this.btEgal.addActionListener(this);
		this.btPoint.addActionListener(this);
		this.btPourcent.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		// Empecher la saisie dans le champ de texte
		this.txtCalcul.setEditable(false);
		
		// Rendre la fenêtre visible
		this.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Calculatrice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "AC" : this.txtCalcul.setText("");
			this.result = 0;
			this.btPoint.setEnabled(true);
			this.point = true;
			break;
			
			case "Quitter" : this.dispose(); break;
			
			case "1" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("1");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "1");
				}
				break;
			case "2" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("2");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "2");
				}
				break;
			case "3" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("3");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "3");
				}
				break;
			case "4" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("4");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "4");
				}
				break;
			case "5" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("5");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "5");
				}
				break;
			case "6" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("6");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "6");
				}
				break;
			case "7" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("7");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "7");
				}
				break;
			case "8" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("8");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "8");
				}
				break;
			case "9" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("9");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "9");
				}
				break;
			case "0" :
				if(this.egal == true)
				{
					this.egal = false;
					this.txtCalcul.setText("0");
				}
				else
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + "0");
				}
				break;
			case "+" :
				try {
					this.nb1 = Float.parseFloat(this.txtCalcul.getText());
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this, "Erreur du format du nombre");
					this.nb1 = 0;
				}
				this.txtCalcul.setText("");
				this.operateur = '+';
				
				this.btPoint.setEnabled(true);
				this.point = false;
				break;
			case "-" :
				try {
					this.nb1 = Float.parseFloat(this.txtCalcul.getText());
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this, "Erreur du format du nombre");
					this.nb1 = 0;
				}
				this.txtCalcul.setText("");
				this.operateur = '-';
				
				this.btPoint.setEnabled(true);
				this.point = false;
				break;
			case "*" :
				try {
					this.nb1 = Float.parseFloat(this.txtCalcul.getText());
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this, "Erreur du format du nombre");
					this.nb1 = 0;
				}
				this.txtCalcul.setText("");
				this.operateur = '*';
				
				this.btPoint.setEnabled(true);
				this.point = false;
				break;
			case "/" :
				try {
					this.nb1 = Float.parseFloat(this.txtCalcul.getText());
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this, "Erreur du format du nombre");
					this.nb1 = 0;
				}
				this.txtCalcul.setText("");
				this.operateur = '/';
				
				this.btPoint.setEnabled(true);
				this.point = false;
				break;
			case "=" :
				try {
					this.nb2 = Float.parseFloat(this.txtCalcul.getText());
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this, "Erreur du format du nombre");
					this.nb2 = 0;
				}
				switch(this.operateur)
				{
					case '+' : this.result = this.nb1 + this.nb2;
					break;
					case '-' : this.result = this.nb1 - this.nb2;
					break;
					case '*' : this.result = this.nb1 * this.nb2;
					break;
					case '/' :
						if(this.nb2 == 0)
						{
							JOptionPane.showMessageDialog(this, "INF");
							this.result = 0;
						}else {
							this.result = this.nb1 / this.nb2;
						}
					break;
				}
				this.txtCalcul.setText(this.result + "");
				this.egal = true;
				
				this.btPoint.setEnabled(true);
				this.point = false;
				break;
			case "." :
				if(this.point == false)
				{
					this.txtCalcul.setText(this.txtCalcul.getText() + ".");
					this.btPoint.setEnabled(false);
					this.point = true;
				}
				break;
		}
		
	}
}
