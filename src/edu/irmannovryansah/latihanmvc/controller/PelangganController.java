/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irmannovryansah.latihanmvc.controller;

import edu.irmannovryansah.latihanmvc.model.PelangganModel;
import edu.irmannovryansah.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;




/**
 *
 * @author Irman Novryansah
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
  public void resetForm(PelangganView view){
      
   String nama  = view.getTextNama().getText();
   String email = view.getTextEmail().getText();
   String noTlp = view.getTextTelp().getText();
   
  if(nama.equals("") && email.equals("") && noTlp.equals("")){
            
        } else {
            model.resetForm();
        }
    }
  
  public void simpanFrom(PelangganView view){
  
   String nama  = view.getTextNama().getText();
   String email = view.getTextEmail().getText();
   String noTlp = view.getTextTelp().getText();
   
         if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        } else {
            model.simpanForm();
        }
    }
    
}



  

