package Controlador;

import Modelos.Usuarios;
import Vistas.frmInicioSesion;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ctrlInicio implements MouseListener  {
    Usuarios Modelos; 
    frmInicioSesion Vistas; 
    
    public ctrlInicio (Usuarios Modelo, frmInicioSesion Vista) {
        this.Modelos = Modelo;
        this.Vistas = Vista;
        Vista.btnIniciar.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vistas.btnIniciar) {
            Modelos.setCorreo(Vistas.txtCorreo.getText());
            Modelos.setContraseña(Modelos.convertirSHA256(Vistas.txtContraseña.getText()));          
            boolean set = Modelos.iniciarSesion();  
            if (set == true) {
                JOptionPane.showMessageDialog(Vistas,"¡Bienvenido a DLPH!");
                

            } else {
                JOptionPane.showMessageDialog(Vistas, "Correo o contraseña incorrecta, intente nuevamente");

            }
                   if(e.getSource() == Vistas.btnIniciar){
            Vistas.frmMenu.initbtnIniciar();
            Vistas.dispose();
            }
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
   
}
