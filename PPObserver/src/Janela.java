import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import interfaces.Observador;
import objetosconcretos.LabelObservador;
import objetosconcretos.TextBoxObservavel;

public class Janela {
    private JFrame frame;
	private JLabel label1;
    private JLabel label2;
	private JTextField conteudoJTextField;
	private JCheckBox checkBoxLabel1;
	private JCheckBox checkBoxLabel2;	

    List<Observador> listaDeObservadores = new ArrayList<>();
    TextBoxObservavel textBoxObservavel = new TextBoxObservavel();
	LabelObservador label1Observador = new LabelObservador();
	LabelObservador label2Observador = new LabelObservador();



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);        


		textBoxObservavel.setConteudoJTextField(new JTextField());
        conteudoJTextField = textBoxObservavel.getConteudoJTextField();
		conteudoJTextField.setBounds(10, 11, 127, 20);
		frame.getContentPane().add(conteudoJTextField);
		conteudoJTextField.setColumns(10);

		checkBoxLabel1 = new JCheckBox("Label 1");
		checkBoxLabel1.setBounds(10, 37, 127, 20);
		frame.getContentPane().add(checkBoxLabel1);
		checkBoxLabel1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					listaDeObservadores.add(label1Observador);
					textBoxObservavel.adicionar(listaDeObservadores);
				}else{
					textBoxObservavel.remover(label1Observador);
				}                
            }
        });		

		checkBoxLabel2 = new JCheckBox("Label 2");
		checkBoxLabel2.setBounds(10, 63, 127, 20);
		frame.getContentPane().add(checkBoxLabel2);
		checkBoxLabel2.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					listaDeObservadores.add(label2Observador);
					textBoxObservavel.adicionar(listaDeObservadores);
				}else{

					textBoxObservavel.remover(label2Observador);
				}                
            }
		});

        label1 = label1Observador.getConteudoLabel();
		label1.setText("Texto de Exemplo 1");
		label1.setBounds(10, 100, 300, 14);
		frame.getContentPane().add(label1);

        label2 = label2Observador.getConteudoLabel();
		label2.setText("Texto de Exemplo 2");
		label2.setBounds(10, 137, 300, 14);
		frame.getContentPane().add(label2);
		
        conteudoJTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {			  
				textBoxObservavel.notificar();			  
			}
		});		
	};
}
