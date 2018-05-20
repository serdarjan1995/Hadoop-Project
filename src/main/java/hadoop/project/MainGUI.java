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
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.jobcontrol.JobControl;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.jobcontrol.ControlledJob;
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
        jTextFieldCountryF2 = new javax.swing.JTextField();
        jTextFieldDistrictF2 = new javax.swing.JTextField();
        jTextFieldTownF2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButtonMaxMinAvgPrice = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCountryF3 = new javax.swing.JTextField();
        jTextFieldYearF3 = new javax.swing.JTextField();
        jTextFieldMonthF3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButtonMostSales = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        averagePriceOfType.setText("Average price of type");
        averagePriceOfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averagePriceOfTypeActionPerformed(evt);
            }
        });

        propertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D = Detached", "S = Semi-Detached", "T = Terraced", "F = Flats/Maisonettes", "O = Other" }));

        jTextFieldCountryF2.setText("GREATER LONDON");

        jTextFieldDistrictF2.setText("BARNET");

        jTextFieldTownF2.setText("LONDON");

        jLabel1.setText("Property Type:");

        jLabel2.setText("Town:");

        jToggleButtonMaxMinAvgPrice.setText("Max Min Avg - price");
        jToggleButtonMaxMinAvgPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMaxMinAvgPriceActionPerformed(evt);
            }
        });

        jLabel3.setText("Country:");

        jTextFieldCountryF3.setText("GREATER LONDON");

        jTextFieldYearF3.setText("1995");

        jTextFieldMonthF3.setText("07");

        jLabel4.setText("District:");

        jLabel5.setText("Country:");

        jLabel6.setText("Year:");

        jLabel7.setText("Month:");

        jToggleButtonMostSales.setText("Which Town has most sales");
        jToggleButtonMostSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMostSalesActionPerformed(evt);
            }
        });

        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldTownF2)
                                            .addComponent(jTextFieldDistrictF2)
                                            .addComponent(jTextFieldCountryF2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(propertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jToggleButtonMaxMinAvgPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(averagePriceOfType)))
                                .addGap(43, 43, 43))
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMonthF3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldYearF3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(jToggleButtonMostSales))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCountryF3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(averagePriceOfType))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(propertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTownF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDistrictF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonMaxMinAvgPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCountryF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCountryF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldYearF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonMostSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldMonthF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

    private void jToggleButtonMostSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMostSalesActionPerformed
        // TODO add your handling code here:
        MostSales driver = new MostSales();
        int exitCode = 0;
        try {
            exitCode = ToolRunner.run(driver, argsG);
        } catch (Exception ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Finish");
        //jToggleButtonMostSales.getModel().setPressed(false);
    }//GEN-LAST:event_jToggleButtonMostSalesActionPerformed

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
        job.setJobName("AveragePriceOfProperty");
        job.setJarByClass(AveragePriceOfPropertyType.class);
        job.setMapperClass(TokenizerMapperAveragePropertyType.class);
        //job.setCombinerClass(IntSumReducerPropertyType.class);
        job.setReducerClass(IntSumReducerPropertyType.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        Path output = new Path("/data/outputPropertyType");
        FileSystem hdfs = FileSystem.get(conf);
        if (hdfs.exists(output)) {
            hdfs.delete(output, true);
        }
        FileInputFormat.addInputPath(job, new Path("/data/new.csv"));
        FileOutputFormat.setOutputPath(job, output);
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
        job.setJobName("MaxMinAvgCountry");
        job.setJarByClass(MaxMinAvgCountry.class);
        job.setMapperClass(TokenizerMapperCountryDistrictTown.class);
        job.setReducerClass(ReducerCountryDistrictTown.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        Path output = new Path("/data/outputCountryDistrictTown");
        FileSystem hdfs = FileSystem.get(conf);
        if (hdfs.exists(output)) {
            hdfs.delete(output, true);
        }
        FileInputFormat.addInputPath(job, new Path("/data/new.csv"));
        FileOutputFormat.setOutputPath(job, output);
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

    public class MostSales extends Configured implements Tool{
            @Override
            
        public int run(String[] args) throws Exception  {
        Configuration conf = new Configuration();
        conf.set("Country", getValueCountryTextMostSales());
        conf.set("YearMonth", getValueYearTextMostSales()+"-"+getValueMonthTextMostSales());
        
        
        Job job1 = Job.getInstance(conf, "MostSales");
        job1.setJobName("MostSales");
        job1.setJarByClass(MostSales.class);
        job1.setMapperClass(TokenizerMapperMostSales.class);
        job1.setReducerClass(ReducerMostSales.class);
        job1.setOutputKeyClass(Text.class);
        job1.setOutputValueClass(IntWritable.class);
        Path output = new Path("/data/outputMostSalesTemp");
        FileSystem hdfs = FileSystem.get(conf);
        if (hdfs.exists(output)) {
            hdfs.delete(output, true);
        }
        FileInputFormat.addInputPath(job1, new Path("/data/new.csv"));
        FileOutputFormat.setOutputPath(job1, output);
                 
        ControlledJob cJob1 = new ControlledJob(conf);
        cJob1.setJob(job1);
         
        Job job2 =  Job.getInstance(conf, "MostSales");
        job2.setJobName("MostSales2");
        job2.setJarByClass(MostSales.class);
        job2.setMapperClass(MapperJob2MostSales.class);
        job2.setReducerClass(ReducerJob2MostSales.class);
        job2.setOutputKeyClass(Text.class);
        job2.setOutputValueClass(Text.class);
        
        output = new Path("/data/outputMostSales");
        if (hdfs.exists(output)) {
            hdfs.delete(output, true);
        }
        FileInputFormat.addInputPath(job2, new Path("/data/outputMostSalesTemp/part*"));
        FileOutputFormat.setOutputPath(job2, output);
        
        
        ControlledJob cJob2 = new ControlledJob(conf);
        cJob2.setJob(job2);
        
        JobControl jobctrl = new JobControl("JobController");
        jobctrl.addJob(cJob1);
        jobctrl.addJob(cJob2);
        cJob2.addDependingJob(cJob1);
        
        Thread runJControl = new Thread(jobctrl);
        runJControl.start();
        while (!jobctrl.allFinished()) {
            //System.out.println("Still running...");
            Thread.sleep(3000);
        }
        if(jobctrl.getFailedJobList().size()>0){
            for(ControlledJob job: jobctrl.getFailedJobList()){
                System.out.println(job.getJobName()+" failed");
            }
        }
        else{
            System.out.println("Jobs Finished with Success..");
        }
        jobctrl.stop();
        boolean success = jobctrl.allFinished();
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
        String ss = jTextFieldCountryF2.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    
    public String getValueDistrictText(){
        String ss = jTextFieldDistrictF2.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    public String getValueTownText(){
        String ss = jTextFieldTownF2.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    
    public String getValueCountryTextMostSales(){
        String ss = jTextFieldCountryF3.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    
    public String getValueYearTextMostSales(){
        String ss = jTextFieldYearF3.getText();
        if(ss.isEmpty()){
            return "";
        }else{
            return ss;
        }
    }
    public String getValueMonthTextMostSales(){
        String ss = jTextFieldMonthF3.getText();
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldCountryF2;
    private javax.swing.JTextField jTextFieldCountryF3;
    private javax.swing.JTextField jTextFieldDistrictF2;
    private javax.swing.JTextField jTextFieldMonthF3;
    private javax.swing.JTextField jTextFieldTownF2;
    private javax.swing.JTextField jTextFieldYearF3;
    private javax.swing.JToggleButton jToggleButtonMaxMinAvgPrice;
    private javax.swing.JToggleButton jToggleButtonMostSales;
    private javax.swing.JComboBox<String> propertyType;
    // End of variables declaration//GEN-END:variables
}
