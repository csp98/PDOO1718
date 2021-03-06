//     ___            _            _            _   
//    / _ \   _   _  | |_    ___  | |_    ___  | |_ 
//   | | | | | | | | | __|  / _ \ | __|  / _ \ | __|
//   | |_| | | |_| | | |_  |  __/ | |_  |  __/ | |_ 
//    \__\_\  \__, |  \__|  \___|  \__|  \___|  \__|
//            |___/                                 
package QytetetGUI;

import java.util.ArrayList;
import modeloqytetet.Jugador;
import modeloqytetet.Qytetet;

/**
 *
 * @author csp98
 */
public class SaldoJugadores extends javax.swing.JPanel {

    /**
     * Creates new form SaldoJugadores
     */
    public SaldoJugadores() {
        initComponents();
    }

    public void actualizarSaldo(Qytetet juego) {
        ArrayList<Jugador> jugadores = juego.getJugadores();
        String texto = "\n \n";
        for (Jugador j : jugadores) {
            texto += "            Jugador " + j.getNombre() + ": " + j.getSaldo() + " €.\n";
        }
        this.Texto.setText(texto);
        this.repaint();
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();

        Texto.setBackground(new java.awt.Color(124, 153, 254));
        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);
        Texto.getAccessibleContext().setAccessibleParent(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Texto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
