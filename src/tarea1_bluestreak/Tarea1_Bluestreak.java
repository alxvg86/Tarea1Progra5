
package tarea1_bluestreak;

/**
 *
 * @authores Ronald
 * @authores 
 * @authores 
 */


import com.jcraft.jsch.JSchException;
import java.io.IOException;
import clases.SSHConnector;

public class Tarea1_Bluestreak {

 
 
    private static final String USERNAME = "";
    private static final String HOST = "";
    private static final int PORT = 22;
    private static final String PASSWORD = "";
 
    public static void main(String[] args) {
 
        try {
            SSHConnector sshConnector = new SSHConnector();
             
             
            sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
            String result = sshConnector.executeCommand("ls -l");
            sshConnector.disconnect();
             
            System.out.println(result);
        } catch (JSchException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        }
    }
}
