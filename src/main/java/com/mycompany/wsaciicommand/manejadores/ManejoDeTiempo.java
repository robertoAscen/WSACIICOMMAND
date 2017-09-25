/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsaciicommand.manejadores;

/**
 * Esta clase fue diseñada para tener delays de distintos tiempos, utilizados en el envio de
 * comandos.
 * @author Roberto
 * @version alfa 1.0
 */

public class ManejoDeTiempo 
{
	// Atributos de la clase
	private static final int _1_SEGUNDO = 1000;
	private static final int _2_SEGUNDO = 2000;
	private static final int _5_SEGUNDO = 5000;
	private Thread tiempo;
	
	/**
	 * Método diseñado para tener un delay de 1 segundo
	 */
	public void dormir1Segundo()
	{
		try 
		{
			tiempo.sleep(_1_SEGUNDO);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/**
	 * Método diseñado para tener un delay de 2 segundos
	 */
	public void dormir2Segundo()
	{
		try 
		{
			tiempo.sleep(_2_SEGUNDO);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/**
	 * Método diseñado para tener un delay de 5 segundos
	 */
	public void dormir5Segundo()
	{
		try 
		{
			tiempo.sleep(_5_SEGUNDO);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

