package utils;
import java.util.*;
import videojuego.personajes.*;
import videojuego.armas.*;

public class Toolbox {
    Textos textos = new Textos();
    Tiendas tiendas = new Tiendas();
    public void introduccion(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido guerrero, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Mago m) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido poseedor de magia, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Arquero a) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido hawkeye, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");

            }
        }
    }   
    
    // METODO PARA VER LAS TIENDAS Y COMPRAR ARMAS
    
    public void tiendaArmas(ArrayList<Personajes> personajes, Scanner sc, ArrayList<Armas> equipo, Objetos o) {
        String opcion = "";
        
        while (!opcion.equals("6")) {
	        textos.seleccionTiendas();
	        opcion = sc.nextLine();
	           System.out.println("aaaaaaaaaa");
	        for (Personajes p : personajes) {
	            if(p instanceof Guerrero g) {
                        Objetos objetos = new Objetos();
                        ArrayList<Espada> espadas = objetos.listaEspadas();
                        Espada espada = null;
                        System.out.println("aaaaa");
	                switch(opcion) {
	                    case "1":
	                        tiendas.tiendaArmasGuerrero1();
	                        opcion = sc.nextLine();
	                        switch(opcion) {
	                            case "1":
	                                // extrae el arma de la lista de armas                                      
                                        espada = espadas.get(0);
                                        
                                        // verifica que el jugador tiene el nivel y el dinero
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
                                        // todas las secciones son iguales
	                            case "2":
	                                espada = espadas.get(1);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(2);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(3);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(3);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no valida");
                                        break;
                                }
                                break;
	                    case "2":
	                        tiendas.tiendaArmasGuerrero2();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(5);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(6);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                               espada = espadas.get(7);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(8);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(9);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no válida");
                                        break;
	                        }
                                break;
	                    case "3":
	                        tiendas.tiendaArmasGuerrero3();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(10);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(11);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(12);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(13);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(14);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no valida");
                                        break;
	                        }
                                break;
	                    case "4":
	                        tiendas.tiendaArmasGuerrero4();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(15);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(16);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(17);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(18);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(19);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no válida");
	                        }
                                break;
	                    case "5": 
	                        tiendas.tiendaArmasGuerrero5();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(20);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(21);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(22);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(23);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(24);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            p.setMoneda(p.getMoneda()-espada.getPrecio());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opción no válida");
	                        }
                                break;
	                    case "6":
	                        System.out.println("Saliendo de las tiendas");
	                        break;
	                    default:
	                        System.out.println("Valor no válido, vuelva a intentarlo");
	                        break;
	                }
	            } else if (p instanceof Arquero a) {
	            	switch(opcion) {
                            case "1":
                                tiendas.tiendaArmasArquero1();
                                opcion = sc.nextLine();
                                Objetos objeto = new Objetos();
                                ArrayList<Flecha> flechas = objeto.listaFlechas();
                                Flecha flecha = null;

                                switch(opcion) {
                                    case "1":
                                        flecha = flechas.get(0);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "2":
                                        flecha = flechas.get(1);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "3":
                                        flecha = flechas.get(2);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "4":
                                        flecha = flechas.get(3);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "5":
                                        flecha = flechas.get(4);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "6":
                                        break;
                                }
                                break;

                            case "2":
                                tiendas.tiendaArmasArquero2();
                                opcion = sc.nextLine();
                                flechas = new Objetos().listaFlechas();

                                switch(opcion) {
                                    case "1":
                                        flecha = flechas.get(5);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "2":
                                        flecha = flechas.get(6);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "3":
                                        flecha = flechas.get(7);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "4":
                                        flecha = flechas.get(8);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "5":
                                        flecha = flechas.get(9);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "6":
                                        break;
                                }
                                break;

                            case "3":
                                tiendas.tiendaArmasArquero3();
                                opcion = sc.nextLine();
                                flechas = new Objetos().listaFlechas();

                                switch(opcion) {
                                    case "1":
                                        flecha = flechas.get(10);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "2":
                                        flecha = flechas.get(11);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "3":
                                        flecha = flechas.get(12);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "4":
                                        flecha = flechas.get(13);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "5":
                                        flecha = flechas.get(14);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "6":
                                        break;
                                }
                                break;

                            case "4":
                                tiendas.tiendaArmasArquero4();
                                opcion = sc.nextLine();
                                flechas = new Objetos().listaFlechas();

                                switch(opcion) {
                                    case "1":
                                        flecha = flechas.get(15);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "2":
                                        flecha = flechas.get(16);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "3":
                                        flecha = flechas.get(17);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "4":
                                        flecha = flechas.get(18);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "5":
                                        flecha = flechas.get(19);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "6":
                                        break;
                                }
                                break;

                            case "5":
                                tiendas.tiendaArmasArquero5();
                                opcion = sc.nextLine();
                                flechas = new Objetos().listaFlechas();

                                switch(opcion) {
                                    case "1":
                                        flecha = flechas.get(20);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "2":
                                        flecha = flechas.get(21);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "3":
                                        flecha = flechas.get(22);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "4":
                                        flecha = flechas.get(23);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "5":
                                        flecha = flechas.get(24);
                                        if (a.getMoneda() >= flecha.getPrecio()) {
                                            a.setMoneda(a.getMoneda() - flecha.getPrecio());
                                            a.setFlechas(a.getFlechas() + 1);
                                        }
                                        break;
                                    case "6":
                                        break;
                                }
                                break;

                            case "6":
                                System.out.println("Saliendo de las tiendas");
                                break;

                            default:
                                System.out.println("Valor no válido, vuelva a intentarlo");
                                break;
                        }

	            } else if (p instanceof Mago m) { // tienda de armas para el mago
                        Objetos objetos = new Objetos();
                        ArrayList<Grimorio> grimorios = objetos.listaGrimorios();
                        Grimorio grimorio = null;
	            	switch(opcion) {
	                    case "1":
	                        tiendas.tiendaArmasMago1();
	                        opcion = sc.nextLine();
                                
	                        switch(opcion) {
	                            case "1":
	                                grimorio = grimorios.get(0);
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "2":
	                                grimorio = grimorios.get(1);
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "3":
	                                grimorio = grimorios.get(2);
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "4":
	                                grimorio = grimorios.get(3);
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "5":
	                                grimorio = grimorios.get(4);
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "6":
	                                break;
	                        }
	                    case "2":
	                        tiendas.tiendaArmasMago2();
	                        switch(opcion) {
	                            case "1":
	                                grimorio = grimorios.get(5);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "2":
	                                grimorio = grimorios.get(6);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "3":
	                                grimorio = grimorios.get(7);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "4":
	                                grimorio = grimorios.get(8);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "5":
	                                grimorio = grimorios.get(9);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "6":
	                                break;
	                        }
	                    case "3":
	                        tiendas.tiendaArmasMago3();
	                        switch(opcion) {
	                            case "1":
	                                grimorio = grimorios.get(10);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "2":
	                                grimorio = grimorios.get(11);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "3":
	                                grimorio = grimorios.get(12);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "4":
	                                grimorio = grimorios.get(13);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "5":
	                                grimorio = grimorios.get(14);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "6":
	                                break;
	                        }
	                    case "4":
	                        tiendas.tiendaArmasMago4();
	                        switch(opcion) {
	                            case "1":
	                                grimorio = grimorios.get(15);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "2":
	                                grimorio = grimorios.get(16);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "3":
	                                grimorio = grimorios.get(17);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "4":
	                                grimorio = grimorios.get(18);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "5":
	                                grimorio = grimorios.get(19);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "6":
	                                break;
	                        }
	                    case "5": 
	                        tiendas.tiendaArmasMago5();
	                        switch(opcion) {
	                            case "1":
	                                grimorio = grimorios.get(20);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "2":
	                                grimorio = grimorios.get(21);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "3":
	                                grimorio = grimorios.get(22);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "4":
	                                grimorio = grimorios.get(23);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "5":
	                                grimorio = grimorios.get(24);
                                        
                                        if (m.getMoneda()>= grimorio.getPrecio()){
                                            m.setMoneda(m.getMoneda()-grimorio.getPrecio());
                                            m.setFuerza(100 + grimorio.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tiene suficiente dinero");
                                            break;
                                        }
	                            case "6":
	                                break;
	                        }
	                    case "6":
	                        System.out.println("Saliendo de las tiendas");
	                        break;
	                    default:
	                        System.out.println("Valor no válido, vuelva a intentarlo");
	                        break;
	                }
	            }
	        }
        }
    }

    public void tiendaMascotas(ArrayList<Personajes> personajes, Scanner sc) {
        System.out.println("TIENDA DE MASCOTAS");
        System.out.println("1. Gato con fortuna - 50 monedas");
        System.out.println("2. Perro sanador - 50 monedas");
        System.out.println("3. Salir");

        String opcion;
        while (true) {
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                case "2":
                    for (Personajes p : personajes) {
                        if (p.getMoneda() >= 50) {
                            p.setMoneda(p.getMoneda() - 50);
                            if (opcion.equals("1")) {
                                p.setFortuna(1);
                                System.out.println("Has comprado el gato con fortuna.");
                            } else {
                                p.setCuracion(1);
                                System.out.println("Has comprado el perro sanador.");
                            }
                        } else {
                            System.out.println("No tienes suficientes monedas.");
                        }
                    }
                    return;
                case "3":
                    return;
                default:
                    System.out.println("Opción incorrecta, selecciona entre 1, 2 o 3.");
            }
        }
    }

    public void subirNivel(Personajes p) { // este método solo se ejecuta en este archivo
        double[] niveles = {200.00, 500.00, 1000.00, 5000.00, 10000.00};
        for (double nivel : niveles) {
            if (p.getExperiencia() > nivel) {
                p.setNivelExperiencia(p.getNivelExperiencia() + 1);
                p.setVidaMaxima(p.getVidaMaxima() + 5);
                p.setFuerza(p.getFuerza() + 5);
                System.out.println(p.getNombre() + " ha subido de nivel. ¡Felicidades!");
            }
        }
    }

    public void ganarRecompensas(Personajes p) { // se ejecuta en enfrentarEnemigo()
        p.setExperiencia(p.getExperiencia()+50);

        subirNivel(p);
    }
}