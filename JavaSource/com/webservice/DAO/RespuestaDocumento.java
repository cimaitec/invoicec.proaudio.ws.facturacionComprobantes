package com.webservice.DAO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="documento")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"estadoDocumento","descripcion","autorizacion","fechaAutorizacion","respuestaSRI"})
public class RespuestaDocumento
{
	
	@XmlElement(name="estado") private String estadoDocumento;
	@XmlElement(name="descripcion") private String descripcion;
	@XmlElement(name="autorizacion") private String autorizacion;
	@XmlElement(name="fechaAutorizacion") private String fechaAutorizacion;
	@XmlElement(name="respuestaSRI") private String respuestaSRI;
	
	public String getEstadoDocumento() {
		return estadoDocumento;
	}
	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRespuestaSRI() {
		return respuestaSRI;
	}
	public void setRespuestaSRI(String respuestaSRI) {
		this.respuestaSRI = respuestaSRI;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	public String getFechaAutorizacion() {
		return fechaAutorizacion;
	}
	public void setFechaAutorizacion(String fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}
	
	

}
