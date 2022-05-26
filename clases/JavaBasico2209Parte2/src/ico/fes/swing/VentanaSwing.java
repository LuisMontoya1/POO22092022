package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;

    public VentanaSwing() throws HeadlessException {
        setTitle("Conversion de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);

        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\Cel.png");

        boton = new JButton(icono);
        boton.setBackground(Color.pink);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir en °F");
        resultado = new JLabel("°f");
        lista = new JComboBox();
        texto = new JTextArea(5, 20);
//        lista.addItem("   ");
//        lista.addItem("Ingenieria");
//        lista.addItem("Derecho");
//        lista.addItem("Periodismo");
//        lista.addItem("Arquitectura");
        modelo = new ModeloPersonaCombo();
        modelo.consultarBaseDatos();
        lista.setModel(modelo);

        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("evento..." + ie.getItem());
                texto.setText( ie.getItem()+ "\n");
            }
        });

        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celcius = 0.0f;
                try {
                    celcius = Float.parseFloat(cuadro.getText());
                    gradosFarenheit = (celcius * (9.0f / 5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + " °F");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto",
                            "Error de catura", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

    }
}
