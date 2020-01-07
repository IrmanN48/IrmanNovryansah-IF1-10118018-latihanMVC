/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irmannovryansah.latihanmvc.model;

import edu.irmannovryansah.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Irman Novryansah
 */
public class PelangganModel {
    
  private String nama;
  private String email;
  private String noTelp;
  
  private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    } 

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
           
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }

    
    protected void fireOnChange(){
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        }
    }
    
   public void resetForm(){
       setNama("");
       setEmail("");
       setNoTelp("");
       
   }
    
   public void simpanForm() {
       JOptionPane.showMessageDialog(null, "Berhasil DiSimpan");
       resetForm();
       
   }

    public void setText(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
