/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author UTN
 */
public interface Lista <T>{
    public T find (Object id);
    public boolean add(T t);
    public boolean remove(T t);
}
