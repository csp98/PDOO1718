//     ___            _            _            _   
//    / _ \   _   _  | |_    ___  | |_    ___  | |_ 
//   | | | | | | | | | __|  / _ \ | __|  / _ \ | __|
//   | |_| | | |_| | | |_  |  __/ | |_  |  __/ | |_ 
//    \__\_\  \__, |  \__|  \___|  \__|  \___|  \__|
//            |___/                                 
package QytetetGUI;

/**
 *
 * @author csp98
 */
public class VistaCartaSorpresa extends javax.swing.JPanel {

    /**
     * Creates new form VistaCartaSorpresa
     */
    public VistaCartaSorpresa() {
        initComponents();
    }

    public void actualizar(String descripcionCasilla) {
        this.jtTextoCartaSorpresa.setText(descripcionCasilla);
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
        jtTextoCartaSorpresa = new javax.swing.JTextArea();

        jtTextoCartaSorpresa.setEditable(false);
        jtTextoCartaSorpresa.setColumns(20);
        jtTextoCartaSorpresa.setRows(5);
        jScrollPane1.setViewportView(jtTextoCartaSorpresa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtTextoCartaSorpresa;
    // End of variables declaration//GEN-END:variables
}
