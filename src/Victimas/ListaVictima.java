package Victimas;

import Listas.Lista;

public class ListaVictima implements Lista<Victima> {
    private Victima[] victimas = new Victima[100];
    private int tamano;

    @Override
    public Victima find(Object cedula) {
        // Convertir cedula (int o String) al hash como String
        String cedulaHash = String.valueOf(Integer.toString((int) cedula).hashCode());
        for (int i = 0; i < tamano; i++) {
            if (victimas[i] != null && victimas[i].getCedulaHash().equals(cedulaHash)) {
                return victimas[i];
            }
        }
        return null;
    }

    @Override
    public boolean add(Victima t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(Victima t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


