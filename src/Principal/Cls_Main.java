package Principal;

import Variables.VariablesConfig;
import ficherotxt.Interface.Network;


public class Cls_Main {
    
    
    private static Network nw;
    private static VariablesConfig vc;
    
    
    public static void main(String[] args) {
        
        nw = new Network();
        nw.setVisible(true);
        //vc = new VariablesConfig();
        vc.Lectura(nw);
        
        
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
            java.util.logging.Logger.getLogger(Network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Network().setVisible(true);
            }
            
        });
        
    /*
        nw.jtf_UserDDBB.setText(vc.UserDDBB);
        nw.jtf_PassDDBB.setText(vc.PassDDBB);
        nw.jtf_LocalServer.setText(vc.LocalServer);
        nw.jtf_RemoteServer.setText(vc.RemoteServer);
        nw.jtf_RemoteServer2.setText(vc.RemoteServer2);
        nw.jtf_DDBB.setText(vc.DDBB);
        nw.jtf_Puerto.setText(vc.Puerto);
*/

    }
}




