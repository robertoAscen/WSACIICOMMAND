/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsaciicommand.ventanas;

import com.mycompany.wsaciicommand.manejadores.ManejoDeArchivos;
import com.mycompany.wsaciicommand.manejadores.ManejoDePuertos;
import com.mycompany.wsaciicommand.manejadores.ManejoDeTiempo;
import com.mycompany.wsaciicommand.manejadores.ManejoSeleccionArchivos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import jssc.SerialPortList;

/**
 * Clase diseña para contener la parte grafica y funcional de la aplicación
 * @author Roberto
 *
 */

public class CommandFrame extends JFrame 
{
	//Atributos de la clase
	private JMenuBar jmbBarra;
	private JMenu jmArchivo;
	private JMenu jmPuertos;
	private JMenu jmAyuda;
	private JMenuItem jmiAbrir;
	private JMenuItem jmiGuardar;
	private JMenuItem jmiSalir;
	private JMenuItem jmiAbrirPuerto;
	private JMenuItem jmiCerrarPuerto;
	private JMenuItem jmiInfo;
	private JPanel jpPanelArriba;
	private JPanel jpPanelAbajo;
	private JPanel jpPanelComandos;
	//private JPanel jpProgressBar;
	private JProgressBar jpbStatus;
	private TitledBorder ttArriba;
	private TitledBorder ttAbajo;
	private TitledBorder ttComandos;
	private JButton jbAbrirPuerto;
	private JButton jbCerrarPuerto;
	private JButton jbEnviarComando;
	private JButton jbLimpiar;
	private JButton jbValidar;
	private SerialPortList listPorts;
	private JLabel jlPuertos;
	private JLabel jlComandos;
	private String strPuertos[];
	private String strComandos[] = {"\n\r",
			  						"Multi Comando",
			  						"system reset\n\r",
			  						"zigbee get mac\n\r",
			  						"zigbee get channel\n\r",
			  						"zigbee get panid\n\r",
			  						"zigbee get shortaddr\n\r",
			  						"zigbee get expanid\n\r",
			  						//"modbus ping\n\r",
			  						//"io get -all\n\r",
			  						"metering baptism off\n\r",
			  						"metering baptism on\n\r",
			  						"metering autoread off\n\r",
			  						"metering autoread on\n\r",
			  						"metering show devices\n\r",
			  						"metering erase -all\n\r",
			  						"metering connect -all\n\r",
			  						"metering disconnect -all\n\r",
			  						"metering reset -all\n\r"};
	private String strNombrePuerto;
	private DefaultComboBoxModel<String> dcbPuertos;
	private DefaultComboBoxModel<String> dcbComandos;
	private JComboBox<String> jcbPuertos;
	private JComboBox<String> jcbComandos;
	private JScrollPane jspScroll;
	private JTextArea jtaConsola;
	private ManejoDePuertos mnjPuertos;
	private ManejoDeArchivos mnjArchivos;
	private ManejoSeleccionArchivos mnjsArchivos;
	private ManejoDeTiempo deley;
	
	
	/**
	 * 
	 */
	public CommandFrame()
	{
		setLayout(null);
		
		jmbBarra = new JMenuBar();
		jmbBarra.setBounds(0, 0, 1200, 20);
		jmArchivo = new JMenu("Archivo");
		jmPuertos = new JMenu("Puertos");
		jmAyuda = new JMenu("Ayuda");
		jmiAbrir = new JMenuItem("Abrir");
		jmiGuardar = new JMenuItem("Guardar");
		jmiSalir = new JMenuItem("Salir");
		jmiAbrirPuerto = new JMenuItem("Abrir Puerto");
		jmiCerrarPuerto = new JMenuItem("Cerrar Puerto");
		jmiInfo = new JMenuItem("Info");
		
		jpPanelArriba = new JPanel();
		jpPanelArriba.setLayout(null);
		ttArriba = new TitledBorder("#COM");
		jpPanelArriba.setBorder(ttArriba);
		jpPanelArriba.setBounds(10, 30, 400, 170);
		
		jpbStatus = new JProgressBar();
		jpbStatus.setBounds(10, 555, 1172, 30);
		//jpProgressBar = new JPanel(jpbStatus);
		
		jlPuertos = new JLabel("Puertos");
		jlPuertos.setBounds(10, 25, 100, 20);
		
		listPorts = new SerialPortList();
		strPuertos = listPorts.getPortNames();
		dcbPuertos = new DefaultComboBoxModel<String>(strPuertos);
		jcbPuertos = new JComboBox<String>(dcbPuertos);
		strNombrePuerto = (String)jcbPuertos.getSelectedItem();
		jcbPuertos.setBounds(10, 45, 100, 25);
		
		jlComandos = new JLabel("Comandos");
		jlComandos.setBounds(10, 25, 100, 20);
		
		dcbComandos = new DefaultComboBoxModel<String>(strComandos);
		jcbComandos = new JComboBox<String>(dcbComandos);
		jcbComandos.setBounds(10, 45, 200, 25);
		
		jbEnviarComando = new JButton("Enviar Comando");
		jbEnviarComando.setBounds(220, 45, 150, 25);
		
		jbAbrirPuerto = new JButton("Abrir Puerto");
		jbAbrirPuerto.setBounds(120, 45, 120, 25);
		
		jbCerrarPuerto = new JButton("Cerrar Puerto");
		jbCerrarPuerto.setBounds(250, 45, 120, 25);
		
		jpPanelComandos = new JPanel();
		jpPanelComandos.setLayout(null);
		ttComandos = new TitledBorder("COMANDOS");
		jpPanelComandos.setBorder(ttComandos);
		jpPanelComandos.setBounds(420, 30, 762, 170);
		
		jpPanelAbajo = new JPanel();
		ttAbajo = new TitledBorder("CONSOLA");
		jpPanelAbajo.setBorder(ttAbajo);
		jpPanelAbajo.setBounds(10, 210, 1175, 340);
		
		jbLimpiar = new JButton("Limpiar");
		jbLimpiar.setBounds(12, 600, 120, 55);
		
		jbValidar = new JButton("Validar");
		jbValidar.setBounds(1062, 600, 120, 55);
		
		jtaConsola = new JTextArea(19, 105);
		jspScroll = new JScrollPane(jtaConsola);
		jspScroll.setBounds(10, 10, 0, 0);
		
		mnjPuertos = new ManejoDePuertos(strNombrePuerto);
		mnjsArchivos = new ManejoSeleccionArchivos();
		mnjArchivos = new ManejoDeArchivos();
		deley = new ManejoDeTiempo();
		
		jbCerrarPuerto.setEnabled(false);
		jcbComandos.setEnabled(false);
		jbEnviarComando.setEnabled(false);
		jbLimpiar.setEnabled(false);
		jbValidar.setEnabled(false);
		jmiAbrir.setEnabled(false);
		jmiAbrirPuerto.setEnabled(false);
		jmiCerrarPuerto.setEnabled(false);
		
		add(jmbBarra);		
		add(jpPanelArriba);
		add(jpPanelAbajo);
		add(jpPanelComandos);
		add(jbLimpiar);
		add(jbValidar);
		add(jpbStatus);
		
		jmbBarra.add(jmArchivo);
		jmbBarra.add(jmPuertos);
		jmbBarra.add(jmAyuda);
		
		jmArchivo.add(jmiAbrir);
		jmArchivo.add(jmiGuardar);
		jmArchivo.add(jmiSalir);
		
		jmPuertos.add(jmiAbrirPuerto);
		jmPuertos.add(jmiCerrarPuerto);
		
		jmAyuda.add(jmiInfo);
		
		jpPanelArriba.add(jcbPuertos);
		jpPanelArriba.add(jlPuertos);
		jpPanelArriba.add(jbAbrirPuerto);
		jpPanelArriba.add(jbCerrarPuerto);
		
		jpPanelComandos.add(jcbComandos);
		jpPanelComandos.add(jlComandos);
		jpPanelComandos.add(jbEnviarComando);
		
		jpPanelAbajo.add(jspScroll);
		
		jbValidar.addActionListener(new ActionListener()
		{			
			//@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				String strut = mnjsArchivos.abrirChoose();
				mnjArchivos.leerArchivo(strut);
			}
		});
		
		jmiGuardar.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				String strut = mnjsArchivos.guardarChoose();
				String strAll = jtaConsola.getText();
				mnjArchivos.guardarArchivo(strut, strAll); 
			}
		});
		
		jbAbrirPuerto.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				mnjPuertos.abrirPuerto();
				jlPuertos.setEnabled(false);
				jcbPuertos.setEnabled(false);
				jbAbrirPuerto.setEnabled(false);
				jcbComandos.setEnabled(true);
				jbEnviarComando.setEnabled(true);
				jbValidar.setEnabled(false);
				jbLimpiar.setEnabled(true);
				jbCerrarPuerto.setEnabled(true);
			}
		});
		
		jbCerrarPuerto.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				
				mnjPuertos.cerrarPuerto();
				jlPuertos.setEnabled(true);
				jcbPuertos.setEnabled(true);
				jbAbrirPuerto.setEnabled(true);
				jcbComandos.setEnabled(false);
				jbEnviarComando.setEnabled(false);
				jbValidar.setEnabled(false);
				jbLimpiar.setEnabled(false);
				jbCerrarPuerto.setEnabled(false);
			}
		});
		
		jbEnviarComando.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(jcbComandos.getSelectedItem().equals("Multi Comando"))
				{
					for(int i=3; i<strComandos.length;i++)
					{		
						//int contStatus = 6;
						//jpbStatus.setValue(i);
							mnjPuertos.mandarMultiComando(jcbComandos.getItemAt(i));	
							deley.dormir2Segundo();	
							//contStatus += 6;
					}
					jtaConsola.append(mnjPuertos.respuestaComando());
				}
				else
				{
					mnjPuertos.mandarComando((String)jcbComandos.getSelectedItem());
					jtaConsola.append(mnjPuertos.respuestaComando());
				}				
			}
		});
		
		jmiInfo.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "App: WSAC_CommandTool\n"
													+"Fecha: 04/Agosto/2016\n"
													+ "Autor: ENERI");
			}
		});
		
		jbLimpiar.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				jtaConsola.setText("");
			}
		});
		
		jmiSalir.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		setSize(1200, 700);
		setTitle("WSAC_CommandTool");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CommandFrame ven = new CommandFrame();
	}
}