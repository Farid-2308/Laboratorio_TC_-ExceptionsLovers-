package Personas.TrabajadorSocial;

import Listas.Lista;

public class ListaTrabajador implements Lista<TrabajadorSocial>{
    private TrabajadorSocial trabajadores[] = new TrabajadorSocial[100];
    private int tamano;
    
    @Override
    public TrabajadorSocial find(Object nombre) {
        for (int i =0; i < tamano; i++){
            if (trabajadores[i] != null && trabajadores[i].getNombre().equals(nombre)){
                return trabajadores[i];
            }
        }
        return null;
    }

    @Override
    public boolean add(TrabajadorSocial t) {
        if (tamano < trabajadores.length) {
            trabajadores[tamano++] = t;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(TrabajadorSocial t) {
        for (int i = 0; i < tamano; i++) {
            if (trabajadores[i]==t) {
                trabajadores[i]=null;
                return true;
            }
        }
        return false;
    }
}