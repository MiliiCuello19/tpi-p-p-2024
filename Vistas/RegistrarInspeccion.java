package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrarInspeccion extends JFrame {
    private JPanel pnlRegistrarInspeccion;
    private JList<String> lstElementos;
    private JButton btnPrueba;
    private JTextField txtFrenometro;
    private JTextField txtBancoDesusPension;
    private JTextField txtAlineacion;
    private JTextField txtDefectosVisuales;
    private JTextField txtPatente;
    private JLabel lblFechaHora;

    public RegistrarInspeccion() {
        setTitle("Registrar Inspección Técnica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout principal
        pnlRegistrarInspeccion = new JPanel();
        pnlRegistrarInspeccion.setLayout(new BorderLayout());
        pnlRegistrarInspeccion.setBackground(new Color(245, 245, 220)); // Fondo beige claro
        setContentPane(pnlRegistrarInspeccion);

        // Panel superior con el logo
        JLabel lblImagen = new JLabel(new ImageIcon("C:/Users/Usuario/Downloads/applus.png"));
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        pnlRegistrarInspeccion.add(lblImagen, BorderLayout.NORTH);

        // Panel central para los campos y lista
        JPanel pnlCentral = new JPanel(new GridLayout(1, 2, 20, 10));
        pnlCentral.setBackground(new Color(245, 245, 220));
        pnlCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Panel para los campos de entrada
        JPanel pnlCampos = new JPanel(new GridLayout(6, 2, 10, 10));
        pnlCampos.setBackground(new Color(245, 245, 220));

        // Crear etiquetas y campos de texto
        pnlCampos.add(new JLabel("Patente:", JLabel.RIGHT));
        txtPatente = new JTextField();
        pnlCampos.add(txtPatente);

        pnlCampos.add(new JLabel("Banco de Suspensión:", JLabel.RIGHT));
        txtBancoDesusPension = new JTextField();
        pnlCampos.add(txtBancoDesusPension);

        pnlCampos.add(new JLabel("Frenómetro:", JLabel.RIGHT));
        txtFrenometro = new JTextField();
        pnlCampos.add(txtFrenometro);

        pnlCampos.add(new JLabel("Alineación:", JLabel.RIGHT));
        txtAlineacion = new JTextField();
        pnlCampos.add(txtAlineacion);

        pnlCampos.add(new JLabel("Defectos Visuales:", JLabel.RIGHT));
        txtDefectosVisuales = new JTextField();
        pnlCampos.add(txtDefectosVisuales);

        pnlCampos.add(new JLabel("")); // Espaciador
        btnPrueba = new JButton("Continuar");
        pnlCampos.add(btnPrueba);

        pnlCentral.add(pnlCampos);

        // Panel para la lista de elementos
        lstElementos = new JList<>(new DefaultListModel<>());
        JScrollPane scrollPane = new JScrollPane(lstElementos);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Detalles de la Inspección"));
        pnlCentral.add(scrollPane);

        pnlRegistrarInspeccion.add(pnlCentral, BorderLayout.CENTER);

        // Panel inferior para mostrar fecha y hora
        JPanel pnlInferior = new JPanel(new BorderLayout());
        pnlInferior.setBackground(new Color(245, 245, 220));

        lblFechaHora = new JLabel();
        lblFechaHora.setHorizontalAlignment(SwingConstants.RIGHT);
        lblFechaHora.setFont(new Font("Arial", Font.PLAIN, 12));
        lblFechaHora.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        actualizarFechaHora();
        pnlInferior.add(lblFechaHora, BorderLayout.EAST);

        pnlRegistrarInspeccion.add(pnlInferior, BorderLayout.SOUTH);

        // Actualizar fecha y hora cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarFechaHora();
            }
        });
        timer.start();

        // Acciones del botón
        btnPrueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> modelo = (DefaultListModel<String>) lstElementos.getModel();
                if (!txtPatente.getText().isEmpty()) {
                    modelo.addElement("Patente: " + txtPatente.getText());
                    txtPatente.setText("");
                }
                if (!txtBancoDesusPension.getText().isEmpty()) {
                    modelo.addElement("Banco de Suspensión: " + txtBancoDesusPension.getText());
                    txtBancoDesusPension.setText("");
                }
                if (!txtFrenometro.getText().isEmpty()) {
                    modelo.addElement("Frenómetro: " + txtFrenometro.getText());
                    txtFrenometro.setText("");
                }
                if (!txtAlineacion.getText().isEmpty()) {
                    modelo.addElement("Alineación: " + txtAlineacion.getText());
                    txtAlineacion.setText("");
                }
                if (!txtDefectosVisuales.getText().isEmpty()) {
                    modelo.addElement("Defectos Visuales: " + txtDefectosVisuales.getText());
                    txtDefectosVisuales.setText("");
                }
            }
        });
    }

    private void actualizarFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
        lblFechaHora.setText(sdf.format(new Date()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrarInspeccion frame = new RegistrarInspeccion();
            frame.setVisible(true);
        });
    }
}
