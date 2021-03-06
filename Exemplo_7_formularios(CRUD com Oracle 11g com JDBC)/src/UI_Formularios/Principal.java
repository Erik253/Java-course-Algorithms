package UI_Formularios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.GroupLayout;



public class Principal extends javax.swing.JFrame {

    
    //Atributos da classe
    private javax.swing.JMenuBar  jmMenuSuperior;
    private javax.swing.JMenu     OpcMenuSair;
    private javax.swing.JMenu     jmOpcCadastros;
    private javax.swing.JMenuItem jmOpcEstado;
    private JLabel lblModelView;
    
    
    
    
    //Construtor
    public Principal() {
    	
        initComponents();
      
    }

    
    
    
    //Inicializando e adicionando os componentes na Janela. 
    //Lembrando que a classe "Calculadora" eh de fato uma janela pois esta herdando as caracteristicas com  extends JFrame
    private void initComponents() {

    	
    	
		//----Definir caracteristicas da janela, adicionar elementos, definir metodos----/
    	setTitle("Sistema de Vendas");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JLabel lblNewLabel = new JLabel("Crud com Formul\u00E1rios com Oracle Database 11g Express Edition");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        JLabel lblNewLabel_1 = new JLabel("Feito em Camadas(MVC)");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        lblModelView = new JLabel("Model - View - Controller");
        lblModelView.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(110)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblModelView, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_1))))
        			.addContainerGap(5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblNewLabel_1)
        			.addGap(32)
        			.addComponent(lblModelView, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(92, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        setSize( new Dimension(439, 264) ); //Tamaho da janeja
        setLocationRelativeTo(null);//Dizendo que a janela vai aparecer no meio da tela
    	
    	
        //-------Elementos da Janela----------------//
    	
        jmMenuSuperior = new javax.swing.JMenuBar();
        
        jmOpcCadastros = new javax.swing.JMenu();
        jmOpcCadastros.setText("Cadastros");
        
              
        jmOpcEstado    = new javax.swing.JMenuItem();
        jmOpcEstado.setText("Estados");
        jmOpcEstado.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		abreFormularioDeEstado();

        	}
        });
        
        OpcMenuSair     = new javax.swing.JMenu();
        OpcMenuSair.setText("Sair");
        OpcMenuSair.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		
                
                //Encerrando a execucao
                System.exit(0);
        	}
        });
        

        
        jmOpcCadastros.add(jmOpcEstado);
        jmMenuSuperior.add(jmOpcCadastros);
        jmMenuSuperior.add(OpcMenuSair);
        setJMenuBar(jmMenuSuperior);

        

        
    }//initComponents

    
    
    
    public void abreFormularioDeEstado(){
    	
    	
		//Desabilitar a janela
		//setEnabled(false);
		
	    //Criando um objeto do tipo "FormularioDeEstados" que criei
		FormularioDeEstados formularioDeEstados = new FormularioDeEstados();
		
		
        //Mostrando o formulario
		formularioDeEstados.setVisible(true);
    	
    	
    }//abreFormularioDeEstado
}//class
