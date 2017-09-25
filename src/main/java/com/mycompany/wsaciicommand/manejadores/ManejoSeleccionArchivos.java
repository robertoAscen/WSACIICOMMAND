/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsaciicommand.manejadores;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Esta clase maneja los comportamientos del JFileChoose
 * @author Roberto
 * @version alfa 1.0
 */
public class ManejoSeleccionArchivos extends JFrame
{
	//atributos de la clase
	private JPanel panelChoose;
	private JFileChooser chooser;
	private File archivoChooser;
	private String rutaChooser;
	
	/**
	 * Método utilizado para seleccionar un archivo en x directorio del equipo de computo.
	 * @return regresa un String con el url de la ubicación del archivo que se desea abrir
	 */
	public String abrirChoose()
	{
		chooser = new JFileChooser();
		chooser.showOpenDialog(panelChoose);
		archivoChooser = chooser.getSelectedFile();
		rutaChooser = archivoChooser.getAbsolutePath();
		
		return rutaChooser;
	}
	
	/**
	 * Método para seleccionar la ruta en donde se desea guardar el archivo.	
	 * @return regresa un string con el url de la ubicación donde se guardara el archivo.
	 */	
	public String guardarChoose()
	{
		chooser = new JFileChooser();
		chooser.showSaveDialog(panelChoose);
		//archivoChooser = chooser.getSelectedFile();
		//archivoChooser = chooser.getName();
		//rutaChooser = archivoChooser.getAbsolutePath();
		rutaChooser = chooser.getSelectedFile().getAbsolutePath();
		//System.out.println(rutaChooser);
		return rutaChooser;
	}
}
