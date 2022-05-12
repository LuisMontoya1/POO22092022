package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame{
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    
    public VentanaSwing() throws HeadlessException{
        setTitle("Conversion de °C a °F");
        setSize(400,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+"\\src\\ico\\fes\\swing\\Cel.png");
        
        boton = new JButton(icono);
        boton.setBackground(Color.pink);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir en °F");
        resultado = new JLabel("°f");
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            } 
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celcius = 0.0f;
                try {
                    celcius = Float.parseFloat(cuadro.getText());
                    gradosFarenheit = (celcius * (9.0f/5.0f))+32.0f;
                    resultado.setText(gradosFarenheit+" °F");
                } catch (Exception ex){
                    System.out.println(ex.toString());
                        JOptionPane.showMessageDialog(null, "Introduce un valor correcto", 
                                "Error de catura", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        
    }
}
