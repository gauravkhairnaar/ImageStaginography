 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Coding;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author gaurav
 */
public class Encode_Frame extends javax.swing.JFrame {

   BufferedImage sourceImage = null, EmbeddedImage = null;  
    private File file;
   
   
    public Encode_Frame() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMessage1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelSourceimage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelEmbedded = new javax.swing.JLabel();
        jButtonEmbed = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Messege"));

        jTextMessage.setColumns(20);
        jTextMessage.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        jTextMessage1.setColumns(20);
        jTextMessage1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextMessage1.setRows(5);
        jTextMessage1.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        jScrollPane2.setViewportView(jTextMessage1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(330, 330, 330))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Sourceimage"));

        jLabelSourceimage.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSourceimage, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSourceimage, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Embeddedimage"));

        jLabelEmbedded.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmbedded, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelEmbedded, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonEmbed.setText("Embed");
        jButtonEmbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmbedActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonOpen.setText("Open");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButtonEmbed, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEmbed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private File showFileDialog(final boolean open){
           JFileChooser fc = new JFileChooser("open an image");
           FileFilter filefilter = new FileFilter(){
               @Override
               public boolean accept(File file) {
                String name = file.getName().toLowerCase();
                if(open)
                    return file.isDirectory() || name.endsWith(".jpg") || name.endsWith(".jpeg")
                            || name.endsWith(".png") || name.endsWith(".bmg");
                return file.isDirectory() || name.endsWith(".png") || name.endsWith(".bmg");
                
                       
                   
               }
               @Override
               public String getDescription(){
                   if (open)
                       return "Image (*.jpg, *.jpeg, *.png, *.bmp)";
                   return "Image (*.png, *.bmp)";
                     
             }
           };
           fc.setAcceptAllFileFilterUsed(false);
           fc.addChoosableFileFilter(filefilter);
           
                   
           File file = null;
            if(fc.showOpenDialog(this)== JFileChooser.APPROVE_OPTION && open)
               file = fc.getSelectedFile();
           else if(!open && fc.showSaveDialog(this)== fc.APPROVE_OPTION)
               file = fc.getSelectedFile();
               return file;
               
               
           
       }
    
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
            jTextMessage.setText(""); 
            sourceImage = null;
            EmbeddedImage = null;
            jLabelSourceimage.setIcon(null);
            jLabelEmbedded.setIcon(null);
            
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if(EmbeddedImage == null){
         JOptionPane.showMessageDialog(this,"No message has been embedded","Nothing to save",JOptionPane.ERROR_MESSAGE);
        }
        else{
            File file = showFileDialog(false); // if value is true then u will see open instead of save
            if (file == null)
                return;

        String name = file.getName();
       String Extention = name.substring(name.lastIndexOf(",")+1).toLowerCase();
       
      if(!Extention.equals("png") && !Extention.equals("bmp")){
          Extention = "png";
         file = new File(file.getAbsolutePath()+".png"); 
      }
      if(file.exists()) file.delete();
            try {
                ImageIO.write(EmbeddedImage, Extention.toUpperCase(), file);
            } catch (IOException ex) {
                Logger.getLogger(Encode_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
      
      
      
        }
        
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        File file = showFileDialog(true);
        if(file == null) {
            return; 
         
        }
           
       try {
           sourceImage = ImageIO.read(file);
           System.out.println("comes here before setIcon?");
           jLabelSourceimage.setIcon(new ImageIcon(sourceImage));
           System.out.println("comes here?");
           this.validate();
           System.out.println("comes here?");
           
           
       } catch (IOException ex) {
           
       }
  
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonEmbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmbedActionPerformed
      if(jTextMessage.getText().length()== 0 || sourceImage == null ||  jTextMessage1.getText().length()==  0 ){
          JOptionPane.showMessageDialog(this, "No message has been embedded",
                  "No Picture or Message, or password Found", JOptionPane.ERROR_MESSAGE);
          return;
          
          
      }
      String Message = jTextMessage.getText();
      String Password = jTextMessage1.getText();
      
      System.out.println("Password is" +  Password);
//encrypt the message with password - encyptedMessage
     System.out.println("Message is" +  Message.length());
     String encryptedMessage = AES.encrypt(Message, Password) ;
      System.out.println("encrypted Message is" + encryptedMessage);
      EmbeddedImage = sourceImage.getSubimage(0, 0, 
              sourceImage.getWidth(),sourceImage.getHeight());
      embeddedMessage(EmbeddedImage, encryptedMessage);
//      embeddedMessage(EmbeddedImage, encyptedMessage);
      
      jLabelEmbedded.setIcon(new ImageIcon(EmbeddedImage));
      this.validate();
     
    }//GEN-LAST:event_jButtonEmbedActionPerformed
   
    private void embeddedMessage(BufferedImage img, String mess){
      int messageLength = mess.length();
      System.out.println("messageLength:"+messageLength);
      int imageWidth = img.getWidth(), imageHeight = img.getHeight(),
              imageSize = imageWidth * imageHeight;
      
      
//      32 is number of bits for integer representing message length
      if(messageLength * 8 + 32 > imageSize){
          JOptionPane.showMessageDialog(this,"Message is too long for this Image",
                  "Message Too Long!", JOptionPane.ERROR_MESSAGE);
          
          return;
      }
      else{
//    
//          step 1 - Embed Lenght of the message
          embedInteger(img, messageLength, 0, 0);
//          step 2 - Embed actual message
//comment second part completely.
          byte b[] = mess.getBytes();
          for(int i=0; i<b.length; i++)
              embedByte(img, b[i], i*8+32, 0);
          
          
      }
      
  }
  
  
    private void embedInteger(BufferedImage img, int n, int start, int storageBit){
     int maxX = img.getWidth(), maxY = img.getHeight(),
        startX = start/maxY, startY = start - startX*maxY, count = 0;
      System.out.println("startX:"+startX);
//     print startX, startY, maxX, maxY, count, start
       for(int i =startX; i<maxX && count < 32; i++){
           for(int j=startY; j<maxY && count<32; j++){ 
               int rgb = img.getRGB(i, j), bit = getBitvalue(n, count);
//               print rgb, bit also print them in binary.. before
//               rgb(i,j) = rgb.... Binary of rgb(i,j)= 010001010101
               rgb = setBitValue(rgb, storageBit, bit);
//               print rgb normal and binary
               img.setRGB(i, j, rgb);
               count++;
               
           }
       }
     
    }
    
    private void embedByte(BufferedImage img, byte b, int start, int storageBit) {
            int maxX = img.getWidth(), maxY = img.getHeight(),
                    startX = start/maxY, startY = start - startX*maxY, count=0;
                for(int i = startX; i<maxX && count <8; i++){
                    for(int j = startY; j<maxX && count <8; j++){
                        int rgb = img.getRGB(i, j), bit = getBitvalue(b, count);
                        rgb = setBitValue(rgb,storageBit, bit);
                        img.setRGB(i, j, rgb);
                        count++;
                        
                    }
                }           
        }
             
    
    private int getBitvalue(int n, int location) {
           int v = (int) (n & Math.round(Math.pow(2, location)));
           return v == 0?0:1;
           
       }
       
            
    private int setBitValue(int n, int location, int bit){
           int toggle = (int) Math.pow(2, location),  bv = getBitvalue(n, location);
           if(bv == bit)
               return n;
           if(bv == 0 && bit ==1)
               n |= toggle;
           else if(bv == 1 && bit == 0)
               n ^= toggle;
           return n;
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
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encode_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmbed;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelEmbedded;
    private javax.swing.JLabel jLabelSourceimage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextMessage;
    private javax.swing.JTextArea jTextMessage1;
    // End of variables declaration//GEN-END:variables

}
