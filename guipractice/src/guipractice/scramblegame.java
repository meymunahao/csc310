/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guipractice;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Meymunah
 */
public class scramblegame extends javax.swing.JFrame {
    String[][] word = {
         {"Abundant", "Existing or available in large quantities"},
        {"Benevolent", "Kind and generous"},
        {"Catalyst", "Something that causes change or action"},
        {"Divergent", "Moving or extending in different directions"},
        {"Ephemeral", "Lasting for a very short time"},
        {"Facetious", "Treating serious issues with inappropriate humor"},
        {"Gargantuan", "Enormous or gigantic in size"},
        {"Hapless", "Unlucky or unfortunate"},
        {"Iconoclast", "A person who attacks cherished beliefs or institutions"},
        {"Juxtapose", "To place side by side for comparison"},
        {"Kindle", "To ignite or inspire"},
        {"Labyrinth", "A complex and confusing network of passages"},
        {"Meticulous", "Showing great attention to detail"},
        {"Nebulous", "Unclear, vague, or ill-defined"},
        {"Ostracize", "To exclude or banish from a group or society"},
        {"Pernicious", "Causing harm or ruin; deadly"},
        {"Quixotic", "Unrealistic and impractical"},
        {"Resilient", "Able to recover quickly from difficult conditions"},
        {"Serendipity", "The occurrence of events by chance in a happy or beneficial way"},
        {"Tenacious", "Holding fast, persistent, stubborn"},
        {"Ubiquitous", "Present, appearing, or found everywhere"},
        {"Vicarious", "Experienced in the imagination through the feelings or actions of another person"},
        {"Whimsical", "Playfully quaint or fanciful in an appealing way"},
        {"Xenophobia", "Fear or hatred of foreigners or strangers"},
        {"Yearn", "To have an intense longing or desire"},
        {"Zenith", "The highest point or peak"},
        {"Altruistic", "Showing a selfless concern for the well-being of others"},
        {"Belligerent", "Hostile and aggressive"},
        {"Conundrum", "A confusing and difficult problem or question"},
        {"Deleterious", "Causing harm or damage"},
        {"Enigma", "A person or thing that is mysterious, puzzling, or difficult to understand"},
        {"Fluctuate", "To vary or change irregularly"},
        {"Garrulous", "Excessively talkative, especially on trivial matters"},
        {"Hackneyed", "Lacking significance due to overuse or repetition"},
        {"Ineffable", "Too great or extreme to be expressed or described in words"},
        {"Juxtaposition", "The fact of two things being seen or placed close together with contrasting effect"},
        {"Kindle", "To light or set on fire"},
        {"Languid", "Displaying or having a disinclination for physical exertion or effort"},
        {"Mellifluous", "Sweet or musical; pleasant to hear"},
        {"Nonchalant", "Feeling or appearing casually calm and relaxed"},
        {"Obfuscate", "To deliberately make something unclear or confusing"},
        {"Pernicious", "Having a harmful effect, especially in a gradual or subtle way"},
        {"Querulous", "Complaining in a petulant or whining manner"},
        {"Reticent", "Not revealing one's thoughts or feelings readily"},
        {"Salient", "Most noticeable or important"},
        {"Taciturn", "Reserved or uncommunicative in speech; saying little"},
        {"Unanimous", "Fully in agreement or showing complete agreement"},
        {"Vacillate", "To waver in decision or opinion"},
        {"Wistful", "Having or showing a feeling of vague or regretful longing"},
        {"Xenial", "Friendly, relating to hospitality"},
        {"Yearning", "A feeling of intense longing for something"},
        {"Zen", "A state of calm attentiveness in which one's actions are guided by intuition rather than by conscious effort"},
        {"Abate", "To lessen or reduce in intensity"},
        {"Benevolent", "Showing kindness and goodwill"},
        {"Cacophony", "A harsh, discordant mixture of sounds"},
        {"Debilitate", "To weaken or enfeeble"},
        {"Eclectic", "Deriving ideas or style from a broad range of sources"},
        {"Facade", "The front of a building, or a superficial appearance"},
        {"Garrulous", "Excessively talkative, especially on trivial matters"},
        {"Halcyon", "Denoting a period of time in the past that was idyllically happy"},
        {"Idiosyncrasy", "A mode of behavior or way of thought peculiar to an individual"},
        {"Juxtapose", "To place side by side for contrast"},
        {"Kinetic", "Relating to or resulting from motion"},
        {"Laconic", "Using very few words"},
        {"Mellifluous", "Sweet or musical; pleasant to hear"},
        {"Nefarious", "Wicked or criminal"},
        {"Ostentatious", "Showy; designed to impress"},
        {"Paradigm", "A typical example or pattern of something"},
        {"Quixotic", "Exceedingly idealistic; unrealistic and impractical"},
        {"Recalcitrant", "Having an obstinately uncooperative attitude"},
        {"Sanguine", "Optimistic or positive, especially in a bad situation"},
        {"Taciturn", "Reserved or uncommunicative in speech"},
        {"Ubiquitous", "Present, appearing, or found everywhere"},
        {"Vicarious", "Experienced in the imagination through the feelings of another"},
        {"Wizened", "Shriveled or wrinkled with age"},
        {"Xenophobia", "Dislike of or prejudice against people from other countries"},
        {"Yoke", "To join together; a wooden crosspiece for oxen"},
        {"Zephyr", "A gentle, mild breeze"},
        {"Aesthetic", "Concerned with beauty or the appreciation of beauty"},
        {"Belligerent", "Hostile and aggressive"},
        {"Capricious", "Given to sudden changes of mood or behavior"},
        {"Deleterious", "Causing harm or damage"},
        {"Ephemeral", "Lasting for a very short time"},
        {"Furtive", "Attempting to avoid notice or attention; secretive"}
     };
    
    int index=0;
    int score=0;
    /**
     * Creates new form scramblegame
     */
    public scramblegame() {
        initComponents();
        jLabel4.setText(scramble(word[index][0].toLowerCase()));
        timer one=new timer();
        Thread t1=new Thread(one);
        t1.start();
        blink two=new blink();
        Thread t2=new Thread(two);
        t2.start();
        
       
    }
       
    public String scramble(String text){
        char[] letters = text.toCharArray();
        Random random = new Random();
        for (int i = 0; i < letters.length; i++){
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("Scrambled Word Game");

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel2.setText("Scrambled Word");

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel3.setText("Your Guess");

        jButton1.setText("Guess");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hint");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setText("jTextField2");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("to display the hint");

        jButton5.setText("Reshuffle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Hint:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String guess=jTextField2.getText().toLowerCase();
         if(guess.equalsIgnoreCase(word[index][0].toLowerCase())){
             JOptionPane.showMessageDialog(rootPane, "Good Job");
             index++;    
             jLabel4.setText(word[index][0]);
             jLabel4.setText(scramble(word[index][0].toLowerCase()));
             jLabel5.setText("");        
             jTextField2.setText(""); 
         }else{
         JOptionPane.showMessageDialog(rootPane, "Wrong!!! Try Again");
         }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(word.length==index+1){
        JOptionPane.showMessageDialog(rootPane, "This is the last word");
        }else{
        index++;   
        jLabel4.setText(word[index][0]);
        jLabel4.setText(scramble(word[index][0].toLowerCase()));
        jLabel5.setText("");        
        jTextField2.setText(" "); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel5.setText(word[index][1].toLowerCase());   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabel4.setText(scramble(word[index][0].toLowerCase()));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(scramblegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scramblegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scramblegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scramblegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scramblegame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
