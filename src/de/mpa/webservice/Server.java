package de.mpa.webservice;

import java.io.File;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlMimeType;

import de.mpa.client.DbSearchSettings;
import de.mpa.client.DenovoSearchSettings;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Server {
	
	 @WebMethod void receiveMessage(String msg);
	 
	 @WebMethod String sendMessage();
	 
	 @WebMethod void runDbSearch(String filename, DbSearchSettings settings);
	 
	 @WebMethod void runDenovoSearch(String filename, DenovoSearchSettings settings);
	 
	 // Download a file from the server
	 @WebMethod File downloadFile(String filename);
	 
	 // Upload file to server
	 @WebMethod String uploadFile(String filename,  @XmlMimeType("application/octet-stream") DataHandler data);
}
