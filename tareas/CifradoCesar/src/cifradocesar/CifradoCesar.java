package cifradocesar;

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
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class CifradoCesar extends JFrame {

    private JTextField cuadroTexto, cuadroNumero;
    private JButton boton;
    private JLabel resultado;
    private JLabel texto1, texto2;
    private JLabel separador;

    public CifradoCesar() throws HeadlessException {

        setTitle("Cifrado Cesar");
        setSize(400, 160);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        cuadroNumero = new JTextField(3);
        cuadroTexto = new JTextField(22);

        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "\\src\\cifradocesar\\Candado.png");

        boton = new JButton(icono);
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para cifrar");
        texto1 = new JLabel("Tipo de desplazamiento: ");
        texto2 = new JLabel("Ingresa un mensaje: ");
        resultado = new JLabel("Texto cifrado");
        separador = new JLabel("                                             ");

        this.getContentPane().add(texto1);
        this.getContentPane().add(cuadroNumero);
        this.getContentPane().add(separador);
        this.getContentPane().add(texto2);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto;
                float numero;
                StringBuilder resultado1 = new StringBuilder();
                try {
                    texto = cuadroTexto.getText();
                    numero = Float.parseFloat(cuadroNumero.getText());
                    for (int i = 0; i < texto.length(); i++) {
                        if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                            if ((texto.charAt(i) + numero) > 'z') {
                                resultado1.append((char) (texto.charAt(i) + numero - 26));
                            } else {
                                resultado1.append((char) (texto.charAt(i) + numero));
                            }
                        } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                            if ((texto.charAt(i) + numero) > 'Z') {
                                resultado1.append((char) (texto.charAt(i) + numero - 26));
                            } else {
                                resultado1.append((char) (texto.charAt(i) + numero));
                            }
                        }
                    }
                    resultado.setText(" Texto cifrado: " + resultado1);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

    }

}
