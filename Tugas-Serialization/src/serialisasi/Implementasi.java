/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisasi;

/**
 *
 * @author Yanuar Ardani N
 */
public class Implementasi {
    public static void main(String[] args) {
        //jika masih dalam satu package dapat memanggil kelas lain
        //namun terdapat perbedaan tampilan antara Implementasi.java dengan MainForm.java
        MainForm mf = new MainForm();
        mf.setVisible(true);
    }
    
}
