package POO;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class VentanaNBA extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public VentanaNBA(Draft draft) {
        // ventana
        setTitle("Menu");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel principal
        JPanel panelPrincipal = new JPanel(new GridLayout(6, 1));

        // Botones y bucle para los jugadores
        JButton botonPrincipal = new JButton("Jugadores Recomendados:");
        panelPrincipal.add(botonPrincipal);

        botonPrincipal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaPresentacion();

            }

        });

        for (Jugador jugador : draft.getRecomendados().get("Ronda 1")) {
            JButton jugadorNuevo = new JButton(jugador.toString());
            panelPrincipal.add(jugadorNuevo);

            // ActionListener para abrir una ventana nueva al pulsar el botón del jugador
            jugadorNuevo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    abrirVentanaJugador(jugador);
                }
            });
        }

        // panel principal a la ventana
        getContentPane().add(panelPrincipal);

        setVisible(true);
    }

    private void abrirVentanaJugador(Jugador jugador) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame ventanaJugador = new JFrame("Ventana de " + jugador);
                ventanaJugador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaJugador.setSize(400, 300);

                // Panel principal
                JPanel panelPrincipal = new JPanel(new GridLayout(5, 1));

                // Primera fila
                JPanel fila1 = new JPanel(new GridLayout(1, 2));
                JLabel labelNombre = new JLabel("Nombre: " + jugador.getNombre());
                JLabel labelEdad = new JLabel("Edad: " + jugador.getEdad());
                fila1.add(labelNombre);
                fila1.add(labelEdad);

                // Segunda fila
                JPanel fila2 = new JPanel(new GridLayout(1, 2));
                JLabel labelProcedencia = new JLabel("Procedencia: " + jugador.getProcedencia());
                JLabel labelImpacto = new JLabel("Impacto: " + jugador.getImpacto());
                fila2.add(labelProcedencia);
                fila2.add(labelImpacto);

                // Tercera fila
                JPanel fila3 = new JPanel(new GridLayout(1, 2));
                JLabel labelAltura = new JLabel("Altura: " + jugador.getAltura());
                JLabel labelPeso = new JLabel("Peso: " + jugador.getPeso());
                fila3.add(labelAltura);
                fila3.add(labelPeso);

                // Cuarta fila
                JPanel fila4 = new JPanel();
                JButton botonEstadisticas = new JButton("Estadísticas");
                fila4.add(botonEstadisticas);
                botonEstadisticas.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        abrirVentanaEstadisticas(jugador);
                    }
                });

                // Quinta fila
                JPanel fila5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                JLabel labelFichar = new JLabel("Fichar: ");
                JRadioButton radioButton1 = new JRadioButton("Si");
                JRadioButton radioButton2 = new JRadioButton("No");
                JRadioButton radioButton3 = new JRadioButton("Seguimiento");
                ButtonGroup buttonGroup = new ButtonGroup();
                buttonGroup.add(radioButton1);
                buttonGroup.add(radioButton2);
                buttonGroup.add(radioButton3);
                fila5.add(labelFichar);
                fila5.add(radioButton1);
                fila5.add(radioButton2);
                fila5.add(radioButton3);

                // Final
                panelPrincipal.add(fila1);
                panelPrincipal.add(fila2);
                panelPrincipal.add(fila3);
                panelPrincipal.add(fila4);
                panelPrincipal.add(fila5);

                ventanaJugador.getContentPane().add(panelPrincipal);
                ventanaJugador.setVisible(true);
            }
        });
    }

    private void abrirVentanaEstadisticas(Jugador jugador) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame ventanaEstadisticas = new JFrame("Estadisticas de " + jugador);
                ventanaEstadisticas.setSize(600, 200);
                ventanaEstadisticas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Panel de estadisticas
                JPanel panelPrincipal = new JPanel(new GridLayout(2, 1));
                JPanel panelArriba = new JPanel(new FlowLayout(FlowLayout.CENTER));
                JPanel panelAbajo = new JPanel();

                // Labels de estadisticas y texto
                JLabel PPP = new JLabel("Puntos PP: " + jugador.getPpp());
                JLabel APP = new JLabel("Asistencias PP: " + jugador.getApp());
                JLabel RPP = new JLabel("Rebotes PP: " + jugador.getRpp());

                DecimalFormat dosDecimales = new DecimalFormat("#.##");

                JLabel texto = new JLabel("<html>Estas son las estadisticas de la ultima temporada de " + jugador
                        + " <br>en la siguiente liga: " + jugador.getProcedencia()
                        + ". Estas estadisticas hacen que " + jugador + " <br>tenga un valor de "
                        + dosDecimales.format(jugador.valorDraft()) + " sobre 16,5.");
                panelArriba.add(PPP);
                panelArriba.add(APP);
                panelArriba.add(RPP);
                panelAbajo.add(texto);

                panelPrincipal.add(panelArriba);
                panelPrincipal.add(panelAbajo);
                ventanaEstadisticas.getContentPane().add(panelPrincipal);
                ventanaEstadisticas.setVisible(true);
            }
        });
    }

    private void abrirVentanaPresentacion() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame presentacion = new JFrame("Presentación");
                presentacion.setSize(700, 250);
                presentacion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                JPanel panelPrincipal = new JPanel(new GridLayout(2, 1));
                JPanel panelArriba = new JPanel(new FlowLayout(FlowLayout.CENTER));
                JPanel panelAbajo = new JPanel(new FlowLayout(FlowLayout.CENTER));

                JLabel bienvenida = new JLabel("<html>Bienvenido a tu pantalla de recomendados:");
                JLabel textoAbajo = new JLabel("<html>En esta pantalla te apareceran los jugadores que segun este programa deberias"
                        + " <br>escoger en la primera ronda de este draft para cubrir los puntos debiles "
                        + " <br>de tu equipo. Para ello se recopilan las estadisticas de la temporada de tu equipo"
                        + " <br>y se crean unas necesidades. Si algun jugador de el draft cumple esas necesidades, sera recomendado"
                        + " <br> y añadido a la lista.");
                panelArriba.add(bienvenida);
                panelAbajo.add(textoAbajo);
                panelPrincipal.add(panelArriba);
                panelPrincipal.add(panelAbajo);

                presentacion.getContentPane().add(panelPrincipal);
                presentacion.setVisible(true);
            }
        });
    }
}
