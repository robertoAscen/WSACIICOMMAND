/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsaciicommand.manejadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * En esta clase se lleva a cabo el manejo de archivos, tales como:
 * Guardar, y abrir; en este ultimo en la version alfa 1.0 se utilizara para validar 
 * los resultados, en la siguiente versión, se pretende hacer la validación con la comparación
 * de otro archivo con xml como plantilla.
 * @author Roberto Ascencio
 * @version alfa 1.0
 */

public class ManejoDeArchivos 
{
	// atributos de la clase
	private File archivo = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	private FileWriter fw = null;
	private PrintWriter pw;
	private ImageIcon imagenGood;
	private ImageIcon imagenFail;
	

	/**
	 * Método para guardar el arvhivo generado por la consola, impreso en jtaLog, a través
	 * de JFileChoose.
	 * @param ruta es el url en donde se guardara el archivo, que se optinete del JFileChoose
	 * @param write write es lo que se escribira en el archivo y se optiene del jtaLog.
	 */
	public void guardarArchivo(String ruta, String write)
	{
		try
		{
			fw = new FileWriter(ruta+".txt");
			pw = new PrintWriter(fw);
			pw.println(write);
			JOptionPane.showMessageDialog(null, "Archivo guardado Exitosamente!!!");
		}
		catch(Exception e)
		{
			//e.printStackTrace();		
			JOptionPane.showMessageDialog(null, "El Archivo no se guardo!!!");
		}
		finally
		{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try
	         {                    
	            if( null != fw )
	            {   
	               fw.close();    
	            }                  
	         }
	         catch (Exception e2)
	         { 
	            //e2.printStackTrace();
	        	 JOptionPane.showMessageDialog(null, "El archivo no pudo cerrarse!!!");
	         }
		}		
	}
	
	/**
	 * Este método se usa para valiar el resultado de las pruebas, y es comparado con una plantilla
	 * realizada dentro de este método, esto se hace en la versión alfa 1.0, lo cual pretende ser 
	 * eficientado en la siguiente versión.
	 * @param ruta es el url de donde se quiere comparar el archivo.
	 */
	public void leerArchivo(String ruta)
	{
		try
		{
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			int contadorLinea = 0;
			
			//variables para la comparación de archivos
			boolean caso_1 = false;
			boolean caso_2 = false;
			boolean caso_3 = false;
			boolean caso_4 = false;
			boolean caso_5 = false;
			boolean caso_6 = false;
			boolean caso_7 = false;
			boolean caso_8 = false;
			boolean caso_9 = false;
			boolean caso_10 = false;
			boolean caso_11 = false;
			boolean caso_12 = false;
			boolean caso_13 = false;
			boolean caso_14 = false;
			boolean caso_15 = false;
			boolean caso_16 = false;
			boolean caso_17 = false;
			boolean caso_18 = false;
			boolean caso_19 = false;
			boolean caso_20 = false;
			boolean caso_21 = false;
			boolean caso_22 = false;
			boolean caso_23 = false;
			boolean caso_24 = false;
			boolean caso_25 = false;
			boolean caso_26 = false;
			boolean caso_27 = false;
			boolean caso_28 = false;
			boolean caso_29 = false;
			boolean caso_30 = false;
			boolean caso_31 = false;
			boolean caso_32 = false;
			boolean caso_33 = false;
			boolean caso_34 = false;
			boolean caso_35 = false;
			boolean caso_36 = false;
			boolean caso_37 = false;
			boolean caso_38 = false;
			boolean caso_39 = false;
			boolean caso_40 = false;
			boolean caso_41 = false;
			boolean caso_42 = false;
			boolean caso_43 = false;
			boolean caso_44 = false;
			boolean caso_45 = false;
			boolean caso_46 = false;
			boolean caso_47 = false;
			boolean caso_48 = false;
			boolean caso_49 = false;
			boolean caso_50 = false;
			boolean caso_51 = false;
			boolean caso_52 = false;
			boolean caso_53 = false;
			boolean caso_54 = false;
			boolean caso_55 = false;
			boolean caso_56 = false;
			boolean caso_57 = false;
			boolean caso_58 = false;
			boolean caso_59 = false;
			boolean caso_60 = false;
			boolean caso_61 = false;
			boolean caso_62 = false;
			boolean caso_63 = false;
			boolean caso_64 = false;
			boolean caso_65 = false;
			boolean caso_66 = false;
			boolean caso_67 = false;
			boolean caso_68 = false;
			boolean caso_69 = false;
			boolean caso_70 = false;
			boolean caso_71 = false;
			boolean caso_72 = false;
			boolean caso_73 = false;
			boolean caso_74 = false;
			boolean caso_75 = false;
			boolean caso_76 = false;
			boolean caso_77 = false;
			boolean caso_78 = false;
			boolean caso_79 = false;
			boolean caso_80 = false;
			boolean caso_81 = false;
			boolean caso_82 = false;
			boolean caso_83 = false;
			boolean caso_84 = false;
			boolean caso_85 = false;
			boolean caso_86 = false;
			boolean caso_87 = false;
			boolean caso_88 = false;
			boolean caso_89 = false;
			boolean caso_90 = false;
			boolean caso_91 = false;
			boolean caso_92 = false;
			boolean caso_93 = false;
			boolean caso_94 = false;
			boolean caso_95 = false;
			boolean caso_96 = false;
			boolean caso_97 = false;
			boolean caso_98 = false;
			boolean caso_99 = false;
			boolean caso_100 = false;
			boolean caso_101 = false;
			boolean caso_102 = false;
			boolean caso_103 = false;
			boolean caso_104 = false;
			boolean caso_105 = false;
			boolean caso_106 = false;
			boolean caso_107 = false;
			boolean caso_108 = false;
			boolean caso_109 = false;
			boolean caso_110 = false;
			boolean caso_111 = false;
			boolean caso_112 = false;
			boolean caso_113 = false;
			boolean caso_114 = false;
			boolean caso_115 = false;
			boolean caso_116 = false;
			boolean caso_117 = false;
			boolean caso_118 = false;
			boolean caso_119 = false;
			boolean caso_120 = false;
			boolean caso_121 = false;
			boolean caso_122 = false;
			boolean caso_123 = false;
			boolean caso_124 = false;
			boolean caso_125 = false;
			boolean caso_126 = false;
			boolean caso_127 = false;
			boolean caso_128 = false;
			boolean caso_129 = false;
			boolean caso_130 = false;
			boolean caso_131 = false;
			boolean caso_132 = false;
			boolean caso_133 = false;
			boolean caso_134 = false;
			boolean caso_135 = false;
			boolean caso_136 = false;
			boolean caso_137 = false;
			boolean caso_138 = false;
			boolean caso_139 = false;
			boolean caso_140 = false;
			boolean caso_141 = false;
			boolean caso_142 = false;
			boolean caso_143 = false;
			boolean caso_144 = false;
			
			//en este ciclo se leen todas la lineas escritas en el archivo, lo cual se evalua
			//cada una de ellas en un switch para ver si el resultado obtenido es igual al esperado.
	        while((linea=br.readLine())!=null)
	        {
	        	if(linea == "")
	        	{
	        		linea.trim();
	        		continue;
	        	}
	        	else
	        	{
	        		contadorLinea++;
		        	switch(contadorLinea)
		        	{
		        		case 1:
		        			System.out.println(linea);
		        			caso_1 = linea.equals("system reset");
		        			break;	
		        		case 2:
		        			//System.out.println(linea.equals(""));
		        			caso_2 = linea.equals("");
		        			break;
		        		case 3:
		        			//System.out.println(linea.equals(""));
		        			caso_3 = linea.equals("");
		        			break;
		        		case 4:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Starting Reset Process"));
		        			caso_4 = linea.equals("wsacii-5.6.0-uat4> Starting Reset Process");
		        			break;
		        		case 5:
		        			//System.out.println(linea.equals(""));
		        			caso_5 = linea.equals("");
		        			break;
		        		case 6:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> "));
		        			caso_6 = linea.equals("wsacii-5.6.0-uat4> ");
		        			break;
		        		case 7:
		        			//System.out.println(linea.equals(""));
		        			caso_7 = linea.equals("");
		        			break;	
		        		case 8:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Shell (build: Aug  4 2016 09:18:13 )"));
		        			caso_8 = linea.equals("wsacii-5.6.0-uat4> Shell (build: Aug  4 2016 09:18:13 )");
		        			break;
		        		case 9:
		        			//System.out.println(linea.equals(""));
		        			caso_9 = linea.equals("");
		        			break;
		        		case 10:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Copyright (c) 2015 Eneri S.A de C.V."));
		        			caso_10 = linea.equals("wsacii-5.6.0-uat4> Copyright (c) 2015 Eneri S.A de C.V.");
		        			break;
		        		case 11:
		        			//System.out.println(linea.equals(""));
		        			caso_11 = linea.equals("");
		        			break;
		        		case 12:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> mac address: 24DAB60C00000014"));
		        			caso_12 = linea.equals("wsacii-5.6.0-uat4> mac address: 24DAB60C00000014");
		        			break;
		        		case 13:
		        			//System.out.println(linea.equals(""));
		        			caso_13 = linea.equals("");
		        			break;	
		        		case 14:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> zigbee get mac"));
		        			caso_14 = linea.equals("wsacii-5.6.0-uat4> zigbee get mac");
		        			break;
		        		case 15:
		        			//System.out.println(linea.equals(""));
		        			caso_15 = linea.equals("");
		        			break;
		        		case 16:
		        			//System.out.println(linea.equals(""));
		        			caso_16 = linea.equals("");
		        			break;
		        		case 17:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> mac address: 24DAB60C00000014"));
		        			caso_17 = linea.equals("wsacii-5.6.0-uat4> mac address: 24DAB60C00000014");
		        			break;
		        		case 18:
		        			//System.out.println(linea.equals(""));
		        			caso_18 = linea.equals("");
		        			break;
		        		case 19:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> zigbee get channel"));
		        			caso_19 = linea.equals("wsacii-5.6.0-uat4> zigbee get channel");
		        			break;	
		        		case 20:
		        			//System.out.println(linea.equals(""));
		        			caso_20 = linea.equals("");
		        			break;
		        		case 21:
		        			//System.out.println(linea.equals(""));
		        			caso_21 = linea.equals("");
		        			break;
		        		case 22:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> channel: 14"));
		        			caso_22 = linea.equals("wsacii-5.6.0-uat4> channel: 14");
		        			break;
		        		case 23:
		        			//System.out.println(linea.equals(""));
		        			caso_23 = linea.equals("");
		        			break;
		        		case 24:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> zigbee get panid"));
		        			caso_24 = linea.equals("wsacii-5.6.0-uat4> zigbee get panid");
		        			break;
		        		case 25:
		        			//System.out.println(linea.equals(""));
		        			caso_25 = linea.equals("");
		        			break;	
		        		case 26:
		        			//System.out.println(linea.equals(""));
		        			caso_26 = linea.equals("");
		        			break;
		        		case 27:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> pan id: 0508"));
		        			caso_27 = linea.equals("wsacii-5.6.0-uat4> pan id: 0508");
		        			break;
		        		case 28:
		        			//System.out.println(linea.equals(""));
		        			caso_28 = linea.equals("");
		        			break;
		        		case 29:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> zigbee get shortaddr"));
		        			caso_29 = linea.equals("wsacii-5.6.0-uat4> zigbee get shortaddr");
		        			break;
		        		case 30:
		        			//System.out.println(linea.equals(""));
		        			caso_30 = linea.equals("");
		        			break;
		        		case 31:
		        			//System.out.println(linea.equals(""));
		        			caso_31 = linea.equals("");
		        			break;	
		        		case 32:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> short address: 245F"));
		        			caso_32 = linea.equals("wsacii-5.6.0-uat4> short address: 245F");
		        			break;
		        		case 33:
		        			//System.out.println(linea.equals(""));
		        			caso_33 = linea.equals("");
		        			break;
		        		case 34:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> zigbee get expanid"));
		        			caso_34 = linea.equals("wsacii-5.6.0-uat4> zigbee get expanid");
		        			break;
		        		case 35:
		        			//System.out.println(linea.equals(""));
		        			caso_35 = linea.equals("");
		        			break;
		        		case 36:
		        			//System.out.println(linea.equals(""));
		        			caso_36 = linea.equals("");
		        			break;
		        		case 37:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> extended pan id: 24DAB60A02000708"));
		        			caso_37 = linea.equals("wsacii-5.6.0-uat4> extended pan id: 24DAB60A02000708");
		        			break;	
		        		case 38:
		        			//System.out.println(linea.equals(""));
		        			caso_38 = linea.equals("");
		        			break;
		        		case 39:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> modbus ping"));
		        			caso_39 = linea.equals("wsacii-5.6.0-uat4> modbus ping");
		        			break;
		        		case 40:
		        			//System.out.println(linea.equals(""));
		        			caso_40 = linea.equals("");
		        			break;
		        		case 41:
		        			//System.out.println(linea.equals(""));
		        			caso_41 = linea.equals("");
		        			break;
		        		case 42:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> sending ping"));
		        			caso_42 = linea.equals("wsacii-5.6.0-uat4> sending ping");
		        			break;
		        		case 43:
		        			//System.out.println(linea.equals(""));
		        			caso_43 = linea.equals("");
		        			break;	
		        		case 44:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> io get -all"));
		        			caso_44 = linea.equals("wsacii-5.6.0-uat4> io get -all");
		        			break;
		        		case 45:
		        			//System.out.println(linea.equals(""));
		        			caso_45 = linea.equals("");
		        			break;
		        		case 46:
		        			//System.out.println(linea.equals(""));
		        			caso_46 = linea.equals("");
		        			break;
		        		case 47:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> IO [-all] value: 01"));
		        			caso_47 = linea.equals("wsacii-5.6.0-uat4> IO [-all] value: 01");
		        			break;
		        		case 48:
		        			//System.out.println(linea.equals(""));
		        			caso_48 = linea.equals("");
		        			break;
		        		case 49:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering baptism off"));
		        			caso_49 = linea.equals("wsacii-5.6.0-uat4> metering baptism off");
		        			break;	
		        		case 50:
		        			//System.out.println(linea.equals(""));
		        			caso_50 = linea.equals("");
		        			break;
		        		case 51:
		        			//System.out.println(linea.equals(""));
		        			caso_51 = linea.equals("");
		        			break;
		        		case 52:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Baptism Mode was Disabled"));
		        			caso_52 = linea.equals("wsacii-5.6.0-uat4> Baptism Mode was Disabled");
		        			break;
		        		case 53:
		        			//System.out.println(linea.equals(""));
		        			caso_53 = linea.equals("");
		        			break;
		        		case 54:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Modbus Process Failured: Timeout expired"));
		        			caso_54 = linea.equals("wsacii-5.6.0-uat4> Modbus Process Failured: Timeout expired");
		        			break;
		        		case 55:
		        			//System.out.println(linea.equals(""));
		        			caso_55 = linea.equals("");
		        			break;	
		        		case 56:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering baptism on"));
		        			caso_56 = linea.equals("wsacii-5.6.0-uat4> metering baptism on");
		        			break;
		        		case 57:
		        			//System.out.println(linea.equals(""));
		        			caso_57 = linea.equals("");
		        			break;
		        		case 58:
		        			//System.out.println(linea.equals(""));
		        			caso_58 = linea.equals("");
		        			break;
		        		case 59:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Baptism Mode was Enabled"));
		        			caso_59 = linea.equals("wsacii-5.6.0-uat4> Baptism Mode was Enabled");
		        			break;
		        		case 60:
		        			//System.out.println(linea.equals(""));
		        			caso_60 = linea.equals("");
		        			break;
		        		case 61:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering autoread off"));
		        			caso_61 = linea.equals("wsacii-5.6.0-uat4> metering autoread off");
		        			break;	
		        		case 62:
		        			//System.out.println(linea.equals(""));
		        			caso_62 = linea.equals("");
		        			break;
		        		case 63:
		        			//System.out.println(linea.equals(""));
		        			caso_63 = linea.equals("");
		        			break;
		        		case 64:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Autoread Mode was Disabled"));
		        			caso_64 = linea.equals("wsacii-5.6.0-uat4> Autoread Mode was Disabled");
		        			break;
		        		case 65:
		        			//System.out.println(linea.equals(""));
		        			caso_65 = linea.equals("");
		        			break;
		        		case 66:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering autoread on"));
		        			caso_66 = linea.equals("wsacii-5.6.0-uat4> metering autoread on");
		        			break;
		        		case 67:
		        			//System.out.println(linea.equals(""));
		        			caso_67 = linea.equals("");
		        			break;	
		        		case 68:
		        			//System.out.println(linea.equals(""));
		        			caso_68 = linea.equals("");
		        			break;
		        		case 69:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Autoread Mode was Enabled"));
		        			caso_69 = linea.equals("wsacii-5.6.0-uat4> Autoread Mode was Enabled");
		        			break;
		        		case 70:
		        			//System.out.println(linea.equals(""));
		        			caso_70 = linea.equals("");
		        			break;
		        		case 71:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering show devices"));
		        			caso_71 = linea.equals("wsacii-5.6.0-uat4> metering show devices");
		        			break;
		        		case 72:
		        			//System.out.println(linea.equals(""));
		        			caso_72 = linea.equals("");
		        			break;
		        		case 73:
		        			//System.out.println(linea.equals(""));
		        			caso_73 = linea.equals("");
		        			break;	
		        		case 74:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Item	Sign	Type	ModbusId	Serial Number		MAC Display			LastMeasurementTime"));
		        			caso_74 = linea.equals("wsacii-5.6.0-uat4> Item	Sign	Type	ModbusId	Serial Number		MAC Display			LastMeasurementTime");
		        			break;
		        		case 75:
		        			//System.out.println(linea.equals(""));
		        			caso_75 = linea.equals("");
		        			break;
		        		case 76:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 0	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_76 = linea.equals("wsacii-5.6.0-uat4> 0	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 77:
		        			//System.out.println(linea.equals(""));
		        			caso_77 = linea.equals("");
		        			break;
		        		case 78:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 1	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_78 = linea.equals("wsacii-5.6.0-uat4> 1	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 79:
		        			//System.out.println(linea.equals(""));
		        			caso_79 = linea.equals("");
		        			break;	
		        		case 80:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 2	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_80 = linea.equals("wsacii-5.6.0-uat4> 2	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 81:
		        			//System.out.println(linea.equals(""));
		        			caso_81 = linea.equals("");
		        			break;
		        		case 82:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 3	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_82 = linea.equals("wsacii-5.6.0-uat4> 3	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 83:
		        			//System.out.println(linea.equals(""));
		        			caso_83 = linea.equals("");
		        			break;
		        		case 84:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 4	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_84 = linea.equals("wsacii-5.6.0-uat4> 4	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 85:
		        			//System.out.println(linea.equals(""));
		        			caso_85 = linea.equals("");
		        			break;	
		        		case 86:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 5	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_86 = linea.equals("wsacii-5.6.0-uat4> 5	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 87:
		        			//System.out.println(linea.equals(""));
		        			caso_87 = linea.equals("");
		        			break;
		        		case 88:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 6	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_88 = linea.equals("wsacii-5.6.0-uat4> 6	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 89:
		        			//System.out.println(linea.equals(""));
		        			caso_89 = linea.equals("");
		        			break;
		        		case 90:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 7	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_90 = linea.equals("wsacii-5.6.0-uat4> 7	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 91:
		        			//System.out.println(linea.equals(""));
		        			caso_91 = linea.equals("");
		        			break;	
		        		case 92:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 8	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_92 = linea.equals("wsacii-5.6.0-uat4> 8	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 93:
		        			//System.out.println(linea.equals(""));
		        			caso_93 = linea.equals("");
		        			break;
		        		case 94:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 9	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_94 = linea.equals("wsacii-5.6.0-uat4> 9	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 95:
		        			//System.out.println(linea.equals(""));
		        			caso_95 = linea.equals("");
		        			break;
		        		case 96:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 10	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_96 = linea.equals("wsacii-5.6.0-uat4> 10	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 97:
		        			//System.out.println(linea.equals(""));
		        			caso_97 = linea.equals("");
		        			break;
		        		case 98:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 11	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_98 = linea.equals("wsacii-5.6.0-uat4> 11	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 99:
		        			//System.out.println(linea.equals(""));
		        			caso_99 = linea.equals("");
		        			break;
		        		case 100:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 12	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_100 = linea.equals("wsacii-5.6.0-uat4> 12	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 101:
		        			//System.out.println(linea.equals(""));
		        			caso_101 = linea.equals("");
		        			break;	
		        		case 102:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 13	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_102 = linea.equals("wsacii-5.6.0-uat4> 13	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 103:
		        			//System.out.println(linea.equals(""));
		        			caso_103 = linea.equals("");
		        			break;
		        		case 104:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 14	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_104 = linea.equals("wsacii-5.6.0-uat4> 14	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 105:
		        			//System.out.println(linea.equals(""));
		        			caso_105 = linea.equals("");
		        			break;
		        		case 106:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 15	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_106 = linea.equals("wsacii-5.6.0-uat4> 15	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 107:
		        			//System.out.println(linea.equals(""));
		        			caso_107 = linea.equals("");
		        			break;	
		        		case 108:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 16	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_108 = linea.equals("wsacii-5.6.0-uat4> 16	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 109:
		        			//System.out.println(linea.equals(""));
		        			caso_109 = linea.equals("");
		        			break;
		        		case 110:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 17	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_110 = linea.equals("wsacii-5.6.0-uat4> 17	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 111:
		        			//System.out.println(linea.equals(""));
		        			caso_111 = linea.equals("");
		        			break;
		        		case 112:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 18	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_112 = linea.equals("wsacii-5.6.0-uat4> 18	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 113:
		        			//System.out.println(linea.equals(""));
		        			caso_113 = linea.equals("");
		        			break;	
		        		case 114:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 19	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_114 = linea.equals("wsacii-5.6.0-uat4> 19	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 115:
		        			//System.out.println(linea.equals(""));
		        			caso_115 = linea.equals("");
		        			break;
		        		case 116:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 20	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_116 = linea.equals("wsacii-5.6.0-uat4> 20	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 117:
		        			//System.out.println(linea.equals(""));
		        			caso_117 = linea.equals("");
		        			break;
		        		case 118:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 21	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_118 = linea.equals("wsacii-5.6.0-uat4> 21	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 119:
		        			//System.out.println(linea.equals(""));
		        			caso_119 = linea.equals("");
		        			break;	
		        		case 120:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 22	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_120 = linea.equals("wsacii-5.6.0-uat4> 22	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 121:
		        			//System.out.println(linea.equals(""));
		        			caso_121 = linea.equals("");
		        			break;
		        		case 122:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> 23	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL"));
		        			caso_122 = linea.equals("wsacii-5.6.0-uat4> 23	-	FF	254		----------------	FF FF FF FF FF FF FF FF 	NULL");
		        			break;
		        		case 123:
		        			//System.out.println(linea.equals(""));
		        			caso_123 = linea.equals("");
		        			break;
		        		case 124:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering erase -all"));
		        			caso_124 = linea.equals("wsacii-5.6.0-uat4> metering erase -all");
		        			break;
		        		case 125:
		        			//System.out.println(linea.equals(""));
		        			caso_125 = linea.equals("");
		        			break;	
		        		case 126:
		        			//System.out.println(linea.equals(""));
		        			caso_126 = linea.equals("");
		        			break;
		        		case 127:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> All meter were erased successfully"));
		        			caso_127 = linea.equals("wsacii-5.6.0-uat4> All meter were erased successfully");
		        			break;
		        		case 128:
		        			//System.out.println(linea.equals(""));
		        			caso_128 = linea.equals("");
		        			break;
		        		case 129:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering connect -all"));
		        			caso_129 = linea.equals("wsacii-5.6.0-uat4> metering connect -all");
		        			break;
		        		case 130:
		        			//System.out.println(linea.equals(""));
		        			caso_130 = linea.equals("");
		        			break;
		        		case 131:
		        			//System.out.println(linea.equals(""));
		        			caso_131 = linea.equals("");
		        			break;	
		        		case 132:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Connection Meter Process"));
		        			caso_132 = linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Connection Meter Process");
		        			break;
		        		case 133:
		        			//System.out.println(linea.equals(""));
		        			caso_133 = linea.equals("");
		        			break;
		        		case 134:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering disconnect -all"));
		        			caso_134 = linea.equals("wsacii-5.6.0-uat4> metering disconnect -all");
		        			break;
		        		case 135:
		        			//System.out.println(linea.equals(""));
		        			caso_135 = linea.equals("");
		        			break;
		        		case 136:
		        			//System.out.println(linea.equals(""));
		        			caso_136 = linea.equals("");
		        			break;
		        		case 137:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Disconnection Meter Process"));
		        			caso_137 = linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Disconnection Meter Process");
		        			break;	
		        		case 138:
		        			//System.out.println(linea.equals(""));
		        			caso_138 = linea.equals("");
		        			break;
		        		case 139:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> metering reset -all"));
		        			caso_139 = linea.equals("wsacii-5.6.0-uat4> metering reset -all");
		        			break;
		        		case 140:
		        			//System.out.println(linea.equals(""));
		        			caso_140 = linea.equals("");
		        			break;
		        		case 141:
		        			//System.out.println(linea.equals(""));
		        			caso_141 = linea.equals("");
		        			break;
		        		case 142:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Reset Meter Process"));
		        			caso_142 = linea.equals("wsacii-5.6.0-uat4> Excecuting Broadcast Reset Meter Process");
		        			break;
		        		case 143:
		        			//System.out.println(linea.equals(""));
		        			caso_143 = linea.equals("");
		        			break;	
		        		case 144:
		        			//System.out.println(linea.equals("wsacii-5.6.0-uat4> "));
		        			caso_144 = linea.equals("wsacii-5.6.0-uat4> ");
		        			break;
		        		//case 145:
		        			//System.out.println(linea.equals(""));
		        			//break;
		        	}
		        	//en este if se evalua si el resultado de la comparacion de cada una de las lineas es igual con el 
			        //resultado esperado, si esto es verdad se muestra un mensaje de Pass de lo contrario se muestra un Fail.
			        if(caso_1==true && caso_2==true && caso_3==true && caso_4==true && caso_5==true
			        		&& caso_6==true && caso_7==true && caso_8==true && caso_9==true && caso_10==true
			        		&& caso_11==true && caso_12==true && caso_13==true && caso_14==true && caso_15==true 
			        		&& caso_16==true && caso_17==true && caso_18==true && caso_19==true && caso_20==true 
			        		&& caso_21==true && caso_22==true && caso_23==true && caso_24==true && caso_25==true 
			        		&& caso_26==true && caso_27==true && caso_28==true && caso_29==true && caso_30==true 
			        		&& caso_31==true && caso_32==true && caso_33==true && caso_34==true && caso_35==true 
			        		&& caso_36==true && caso_37==true && caso_38==true && caso_39==true && caso_40==true 
			        		&& caso_41==true && caso_42==true && caso_43==true && caso_44==true && caso_45==true 
			        		&& caso_46==true && caso_47==true && caso_48==true && caso_49==true && caso_50==true 
			        		&& caso_51==true && caso_52==true && caso_53==true && caso_54==true && caso_55==true 
			        		&& caso_56==true && caso_57==true && caso_58==true && caso_59==true && caso_60==true 
			        		&& caso_61==true && caso_62==true && caso_63==true && caso_64==true && caso_65==true 
			        		&& caso_66==true && caso_67==true && caso_68==true && caso_69==true && caso_70==true 
			        		&& caso_71==true && caso_72==true && caso_73==true && caso_74==true && caso_75==true 
			        		&& caso_76==true && caso_77==true && caso_78==true && caso_79==true && caso_80==true 
			        		&& caso_81==true && caso_82==true && caso_83==true && caso_84==true	&& caso_85==true 
			        		&& caso_86==true && caso_87==true && caso_88==true && caso_89==true && caso_90==true
			        		&& caso_91==true && caso_92==true && caso_93==true && caso_94==true && caso_95==true 
			        		&& caso_96==true && caso_97==true && caso_98==true && caso_99==true && caso_100==true 
			        		&& caso_101==true && caso_102==true && caso_103==true && caso_104==true && caso_105==true 
			        		&& caso_106==true && caso_107==true && caso_108==true && caso_109==true && caso_110==true 
			        		&& caso_111==true && caso_112==true && caso_113==true && caso_114==true && caso_115==true 
			        		&& caso_116==true && caso_117==true && caso_118==true && caso_119==true && caso_120==true 
			        		&& caso_121==true && caso_122==true && caso_123==true && caso_124==true && caso_125==true 
			        		&& caso_126==true && caso_127==true && caso_128==true && caso_129==true && caso_130==true 
			        		&& caso_131==true && caso_132==true && caso_133==true && caso_134==true && caso_135==true 
			        		&& caso_136==true && caso_137==true && caso_138==true && caso_139==true && caso_140==true 
			        		&& caso_141==true && caso_142==true && caso_143==true && caso_144==true)
			        {
			        	imagenGood = new ImageIcon("C:/Users/Roberto/workspace/COMMAND/image/good.png");
			        	JOptionPane.showMessageDialog(null, "PASS", "PASS", 2, imagenGood);
			        }
			        else
			        {
			        	imagenFail = new ImageIcon("C:/Users/Roberto/workspace/COMMAND/image/fail.png");
			        	JOptionPane.showMessageDialog(null, "FAIL", "FAIL", 2, imagenFail);
			        }	        		
	        	}	        		        	
	        }	        
		}
		catch(Exception e)
		{
			//e.printStackTrace();	
			JOptionPane.showMessageDialog(null, "El archivo no pudo Abrirse!!!");
		}
		finally
		{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try
	         {                    
	            if( null != fr )
	            {   
	               fr.close();     
	            }                  
	         }
	         catch (Exception e2)
	         { 
	            //e2.printStackTrace();
	            JOptionPane.showMessageDialog(null, "El archivo no pudo cerrarse!!!");
	         }
		}
	}
}
