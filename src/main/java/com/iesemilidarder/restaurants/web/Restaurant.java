package com.iesemilidarder.restaurants.web;

public class Restaurant {

    /**
     * Definim els atributs
     */
    private String nombre;
    private String address;
    private String web;
    private String telefono;
    private String type;

    /**
     * Definicio de getters
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public String getAddress() {
        return address;
    }

    public String getWeb() {
        return web;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getType() {
        return type;
    }

    /**
     * Definicio de setters
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setType(String type) {
        this.type = type;
    }
}