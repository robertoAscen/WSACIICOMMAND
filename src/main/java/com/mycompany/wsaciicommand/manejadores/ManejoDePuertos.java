/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsaciicommand.manejadores;

import javax.swing.JOptionPane;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 * Esta clase esta diseña para manejar los puertos serial.
 * @author Roberto
 * @version alfa 1.0
 */

public class ManejoDePuertos extends SerialPort
{
	//Atributos de la clase
	private SerialPort port = new SerialPort(getPortName());
	private String respuesta = null;

	/**
	 * El constructor de la clase requiere como parametro el nombre del puerto
	 * @param portName nombre del puerto con que se va a trabajar
	 */
	public ManejoDePuertos(String portName)
	{
		super(portName);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return regresa un String respuetas que se le asigna el valor de la respuesta
	 * del puerto serial
	 */
	public String respuestaComando()
	{		
		try 
		{
			respuesta = port.readString();
		} 
		catch (SerialPortException e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se obtuvo respuesta del puerto serial");
		}	
		return respuesta;
	}
	
	/**
	 * Método diseñado para enviar comandos por el puerto serial.
	 * @param comando es el String que se enviara por el puerto serial
	 */
	public void mandarComando(String comando)
	{		
		try 
		{
			port.writeString(comando);
			JOptionPane.showMessageDialog(null, "Comando Enviado!!!");
		} 
		catch (SerialPortException e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, " El Comando no pudo ser qEnviado!!!");
		}
	}
	
	/**
	 * Método diseñada para enviar más de un comando por el puerto serial.
	 * Este método elimina el mensaje de comando enviado.
	 * @param comando es el String que se enviara como comando por el puerto serial.
	 */
	public void mandarMultiComando(String comando)
	{		
		try 
		{
			port.writeString(comando);
		} 
		catch (SerialPortException e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "El envio de comandos fallo!!!");
		}
	}
	
	/**
	 * Método utilizado para cerrar el puerto.
	 */
	public void cerrarPuerto()
	{		
		try 
		{
			port.closePort();
			JOptionPane.showMessageDialog(null, "Puerto Cerrado");
		}
		catch (SerialPortException e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "El puerto no pudo ser cerrado");
		}
	}
	
	/**
	 * Método para Abrir el puerto seleccionado
	 */
	public void abrirPuerto()
	{
		try 
		{
			port.openPort();
			port.setParams(port.BAUDRATE_115200,
					 	   port.DATABITS_8,
					 	   port.STOPBITS_1,
					 	   port.PARITY_NONE);
			JOptionPane.showMessageDialog(null, "Puerto Abierto");
		} 
		catch (SerialPortException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
