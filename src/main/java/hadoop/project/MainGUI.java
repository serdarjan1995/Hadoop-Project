/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadoop.project;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
/**
 *
 * @author hadoop
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
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

        averagePriceOfType = new javax.swing.JButton();
        propertyType = new javax.swing.JComboBox<>();
        jTextFieldCountry = new javax.swing.JTextField();
        jTextFieldDistrict = new javax.swing.JTextField();
        jTextFieldTown = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButtonMaxMinAvgPrice = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        averagePriceOfType.setText("Average price of type");
        averagePriceOfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averagePriceOfTypeActionPerformed(evt);
            }
        });

        propertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D = Detached", "S = Semi-Detached", "T = Terraced", "F = Flats/Maisonettes", "O = Other" }));

        jLabel1.setText("Property Type:");

        jLabel2.setText("Country/District/Town:");

        jToggleButtonMaxMinAvgPrice.setText("Max Min Avg - price");
        jToggleButtonMaxMinAvgPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMaxMinAvgPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDistrict))
                    .addComponent(propertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(averagePriceOfType)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTown, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonMaxMinAvgPrice)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averagePriceOfType)
                    .addComponent(propertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jToggleButtonMaxMinAvgPrice))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void averagePriceOfTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averagePriceOfTypeActionPerformed
        // TODO add your handling code here:
        AveragePriceOfPropertyType driver = new AveragePriceOfPropertyType();
        int exitCode = 0;
        try {
            exitCode = ToolRunner.run(driver, argsG);
        } catch (Exception ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_averagePriceOfTypeActionPerformed

    private void jToggleButtonMaxMinAvgPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMaxMinAvgPriceActionPerformed
        // TODO add your handling code here:
        MaxMinAvgCountry driver = new MaxMinAvgCountry();
        int exitCode = 0;
        try {
            exitCode = ToolRunner.run(driver, argsG);
        } catch (Exception ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonMaxMinAvgPriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        argsG = args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    
    public class AveragePriceOfPropertyType implements Tool{
            @Override
            
        public int run(String[] args) throws Exception  {
        Configuration conf = new Configuration();
        conf.set("PropertyType", getValueFromCBPrType());
        Job job = Job.getInstance(conf, "AveragePriceOfProperty");
        job.setJarByClass(AveragePriceOfPropertyType.class);
        job.setMapperClass(TokenizerMapperAveragePropertyType.class);
        //job.setCombinerClass(IntSumReducerPropertyType.class);
        job.setReducerClass(IntSumReducerPropertyType.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        //FileInputFormat.addInputPath(job, new Path(args[0]));
        //FileOutputFormat.setOutputPath(job, new Path(args[1]));
        FileInputFormat.addInputPath(job, new Path("/data/new.csv"));
        FileOutputFormat.setOutputPath(job, new Path("/data/outputPropertyType"));
        boolean success = job.waitForCompletion(true);
        return success ? 0 : 1;

        }

        @Override
        public void setConf(Configuration c) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Configuration getConf() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return null;
        }
    }
    
    public class MaxMinAvgCountry implements Tool{
            @Override
            
        public int run(String[] args) throws Exception  {
        Configuration conf = new Configuration();
        conf.set("Country", getValueCountryText());
        conf.set("District", getValueDistrictText());
        conf.set("Town", getValueTownText());
        Job job = Job.getInstance(conf, "MaxMinAvgCountry");
        job.setJarByClass(MaxMinAvgCountry.class);
        job.setMapperClass(TokenizerMapperCountryDistrictTown.class);
        job.setReducerClass(ReducerCountryDistrictTown.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path("/data/new.csv"));
        FileOutputFormat.setOutputPath(job, new Path("/data/outputCountryDistrictTown"));
        boolean success = job.waitForCompletion(true);
        return success ? 0 : 1;

        }

        @Override
        public void setConf(Configuration c) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Configuration getConf() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return null;
        }
    }
    
    public String getValueFromCBPrType(){
        return ""+propertyType.getSelectedItem().toString().charAt(0);
    }
    
    public String getValueCountryText(){
        String ss = jTextFieldCountry.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    
    public String getValueDistrictText(){
        String ss = jTextFieldDistrict.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    public String getValueTownText(){
        String ss = jTextFieldTown.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    
    private static String argsG[];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton averagePriceOfType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldDistrict;
    private javax.swing.JTextField jTextFieldTown;
    private javax.swing.JToggleButton jToggleButtonMaxMinAvgPrice;
    private javax.swing.JComboBox<String> propertyType;
    // End of variables declaration//GEN-END:variables
}