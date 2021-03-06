//inicia el programa lector 
import java.io.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Lectortxt extends javax.swing.JFrame {

    private FileNameExtensionFilter extension=new FileNameExtensionFilter(".txt","txt");
    ArrayList<Integer> AUX = new ArrayList<>();
    public String ruta;
    public Lectortxt() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Exportar txt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\elias\\Desktop\\JavaApplication36\\src\\txtlector.png")); // NOI18N

        jButton2.setText("Documentacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Procesar");

        jMenuItem3.setText("Ordenar ascendente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Ordenar descendente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))

        );

        pack();
        }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
       
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            //Leer Archivo
            FileReader leerArchivo;
            leerArchivo = new FileReader(ruta);
            BufferedReader textoArchivo = new BufferedReader(leerArchivo);
            //Fin Leer Archivo
            
            //Guardar info en ArrayList
            String linea;
            
            try {
                while ((linea=textoArchivo.readLine())!=null) {
                    int numero;
                    numero = Integer.parseInt(linea);
                    AUX.add(numero);
                }
            } catch (IOException ex) {
                Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
            }//Guardar info en ArrayList
        
            //Ordenar de Menor a Mayor
            for(int i = 0; i < AUX.size(); i++){
                for(int j=0; j < AUX.size(); j++){
                    if(AUX.get(i)<AUX.get(j)){
                    int menor=AUX.get(i);
                    int mayor=AUX.get(j);
                    AUX.set(j, menor);
                    AUX.set(i, mayor);
                    }//Fin if
                }//Fin for 2
            }//Ordenar de Menor a Mayor
            JOptionPane.showMessageDialog(null, "Datos ordenados exitosamente",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            //Leer Archivo
            FileReader leerArchivo;
            leerArchivo = new FileReader(ruta);
            BufferedReader textoArchivo = new BufferedReader(leerArchivo);
            //Fin Leer Archivo
            
            //Guardar info en ArrayList
            String linea;

            try {
                while ((linea=textoArchivo.readLine())!=null) {
                    int numero;
                    numero = Integer.parseInt(linea);
                    AUX.add(numero);
                }
            } catch (IOException ex) {
                Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
            }//Guardar info en ArrayList
        
            //Ordenar de Mayor a Menor
            for(int i = 0; i < AUX.size(); i++){
                for(int j=0; j < AUX.size(); j++){
                    if(AUX.get(i)>AUX.get(j)){
                    int menor=AUX.get(i);
                    int mayor=AUX.get(j);
                    AUX.set(j, menor);
                    AUX.set(i, mayor); 
                    }//Fin if
                }//Fin for 2
            }//Ordenar de Mayor a Menor
            JOptionPane.showMessageDialog(null, "Datos ordenados exitosamente",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
    }                                          
  // boton exportar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
JFileChooser File = new JFileChooser();
        File.setFileFilter(extension);
        int aprobado = File.showOpenDialog(this);
        if(aprobado==JFileChooser.APPROVE_OPTION){
            //Obtener la ruta
            String ruta=File.getSelectedFile().toString();
            this.ruta=ruta;
            File f = new File(ruta);
            FileWriter fw = null;
    try {
        fw = new FileWriter(f);
    } catch (IOException ex) {
        Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
    }
    try (BufferedWriter escritura = new BufferedWriter(fw)) {
        for(int i=0;i<AUX.size();i++){
            escritura.write(Integer.toString(AUX.get(i)));
            escritura.newLine();
            
        }
    } catch (IOException ex) {
        Logger.getLogger(Lectortxt.class.getName()).log(Level.SEVERE, null, ex);
    }
            JOptionPane.showMessageDialog(null, "Archivo exportado con éxito",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        }   
 
 
    }                                        
// fin boton exportar
// inicio boton hipervinculo
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    try {
                Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start https://drive.google.com/file/d/17Dh8EsC5J-XeD6amTBardvrxpPgTKIYO/view?usp=sharing");
            } catch (IOException ex) {
                Logger.getLogger(hipervinculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                        
    //  fin boton hipervinculo
        //Inicio botón Open File
        private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            JFileChooser File = new JFileChooser();
            File.setFileFilter(extension);
            int aprobado = File.showOpenDialog(this);
            if(aprobado==JFileChooser.APPROVE_OPTION){
                //Obtener la ruta
                String ruta=File.getSelectedFile().toString();
                this.ruta=ruta;
                JOptionPane.showMessageDialog(null, "Archivo importado con éxito",
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE);
            }//Fin if
        }//Fin boton Open File
        public static void main(String args[]) {
      
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Lectortxt().setVisible(true);
                }      
            });
        }
    
        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JMenuItem jMenuItem2;
        private javax.swing.JMenuItem jMenuItem3;
        private javax.swing.JMenuItem jMenuItem5;
        // End of variables declaration                   
    
        private static class hipervinculo {
    
            public hipervinculo() {
            }
        }
    }