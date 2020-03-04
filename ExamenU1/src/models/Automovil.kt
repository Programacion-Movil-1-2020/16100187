package models

class Automovil
{
    val Marca: String
    val Modelo: String
    val ListaCaracteristicas: MutableList<String>
    val ListaCaracteristicasEspeciales: MutableList<String>
    constructor(marca: String, modelo: String, listaCaracteristicas: MutableList<String>, listaCaracteristicasEspeciales: MutableList<String>){
        this.Marca = marca
        this.Modelo = modelo
        this.ListaCaracteristicas = listaCaracteristicas
        this.ListaCaracteristicasEspeciales = listaCaracteristicasEspeciales
    }
}