/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ORIGAMI
 */
@Entity
@Table(name = "proyecto")
public class Proyecto {

    @Id
    private Integer id;
    private String denominacion;
    private String detalleArrastre;
    private Date fechaInicio;
    private Date fechaFin;
    private String objetivo;
    private String estado;
    private BigDecimal costoProyecto;
    private String descripcionBreve;
    private String tipo;
    private Boolean recurrente;
    private Boolean arrastre;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;
    @JoinColumn(name = "responsable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona responsable;
    @JoinColumn(name = "proceso", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Proceso proceso;
    @JoinColumn(name = "area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Area area;

    public Proyecto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDetalleArrastre() {
        return detalleArrastre;
    }

    public void setDetalleArrastre(String detalleArrastre) {
        this.detalleArrastre = detalleArrastre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(BigDecimal costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getRecurrente() {
        return recurrente;
    }

    public void setRecurrente(Boolean recurrente) {
        this.recurrente = recurrente;
    }

    public Boolean getArrastre() {
        return arrastre;
    }

    public void setArrastre(Boolean arrastre) {
        this.arrastre = arrastre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

}
