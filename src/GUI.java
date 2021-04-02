
import static Algorithms.Algoritmos.bubbleSort;
import static Algorithms.Algoritmos.insertionSort;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class GUI extends javax.swing.JFrame {

    
    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        lblInput = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        bubbleSort = new javax.swing.JRadioButton();
        insertionSort = new javax.swing.JRadioButton();
        selectionSort = new javax.swing.JRadioButton();
        countingSort = new javax.swing.JRadioButton();
        lblAlgoritmo = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorting Algorithm");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panel.setBackground(new java.awt.Color(153, 204, 255));

        lblInput.setFont(new java.awt.Font("Piximisa", 0, 18)); // NOI18N
        lblInput.setForeground(new java.awt.Color(65, 64, 64));
        lblInput.setText("Insira um conjunto de números: ");

        input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        input.setCaretColor(new java.awt.Color(153, 153, 153));

        bubbleSort.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup.add(bubbleSort);
        bubbleSort.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        bubbleSort.setForeground(new java.awt.Color(65, 64, 64));
        bubbleSort.setText("Bubble Sort");
        bubbleSort.setToolTipText("");
        bubbleSort.setBorder(null);
        bubbleSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        insertionSort.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup.add(insertionSort);
        insertionSort.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        insertionSort.setForeground(new java.awt.Color(65, 64, 64));
        insertionSort.setText("iNSERTION SORT");
        insertionSort.setToolTipText("");
        insertionSort.setBorder(null);
        insertionSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        selectionSort.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup.add(selectionSort);
        selectionSort.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        selectionSort.setForeground(new java.awt.Color(65, 64, 64));
        selectionSort.setText("Selection sort");
        selectionSort.setToolTipText("");
        selectionSort.setBorder(null);
        selectionSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        countingSort.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup.add(countingSort);
        countingSort.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        countingSort.setForeground(new java.awt.Color(65, 64, 64));
        countingSort.setText("Counting sort");
        countingSort.setToolTipText("");
        countingSort.setBorder(null);
        countingSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblAlgoritmo.setFont(new java.awt.Font("Piximisa", 0, 18)); // NOI18N
        lblAlgoritmo.setForeground(new java.awt.Color(65, 64, 64));
        lblAlgoritmo.setText("aLGORITMO:");

        lblResultado.setFont(new java.awt.Font("Piximisa", 0, 12)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(65, 64, 64));
        lblResultado.setText("resultado: ");

        lblSaida.setFont(new java.awt.Font("Piximisa", 0, 18)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(65, 64, 64));

        btnLimpar.setBackground(new java.awt.Color(35, 35, 35));
        btnLimpar.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(204, 204, 204));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(null);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnOrdenar.setBackground(new java.awt.Color(35, 35, 35));
        btnOrdenar.setFont(new java.awt.Font("Piximisa", 0, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(204, 204, 204));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(null);
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        tempo.setFont(new java.awt.Font("Piximisa", 0, 12)); // NOI18N
        tempo.setForeground(new java.awt.Color(65, 64, 64));
        tempo.setText("Tempo (ns) : ");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bubbleSort, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countingSort, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAlgoritmo)
                .addGap(10, 10, 10)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bubbleSort)
                    .addComponent(selectionSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countingSort)
                    .addComponent(insertionSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(lblSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(tempo)
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        input.setText(null);
        lblSaida.setText(null);
        buttonGroup.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed

        if(input.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Campo vazio, favor insira os dados");
        }
        else if(buttonGroup.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Selecione uma das opções.");
        }
        else{
            if(bubbleSort.isSelected()){
                lblSaida.setText(Arrays.toString(bubbleSort(pegarDados())));
            }
            if(insertionSort.isSelected()){
                lblSaida.setText(Arrays.toString(insertionSort(pegarDados())));
            }
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    public int[] pegarDados(){
        String dados = input.getText(); //Pega os dados do input
        String[] vetor = dados.split(","); //Armazena os dados em um vetor de String
        
        int[] num = new int[vetor.length]; //Armazena e transforma os dados em inteiro
        for (int i = 0; i < vetor.length; i++) {
            num[i] = Integer.parseInt(vetor[i]);
        }
            
        return num;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JRadioButton bubbleSort;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton countingSort;
    private javax.swing.JTextField input;
    private javax.swing.JRadioButton insertionSort;
    private javax.swing.JLabel lblAlgoritmo;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton selectionSort;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
