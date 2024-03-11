package juegocartas;

import java.util.Random;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Jugador {

    private int TOTAL_CARTAS = 10;
    private int MARGEN = 20;
    private int DISTANCIA = 50;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];

    private Random r = new Random();

    public void repartir() {
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        int x = MARGEN;
        //recorrido objetual por una lista de objetos
        for (Carta c : cartas) {
            c.mostrar(pnl, x, MARGEN);
            x += DISTANCIA;
        }

        pnl.repaint();
    }

    public String getGrupos() {
        String mensaje = "No se encontraron grupos";
        int[] contadores = new int[NombreCarta.values().length];
        for (Carta c : cartas) {
            contadores[c.getNombre().ordinal()]++;
        }

        int totalGrupos = 0;
        for (int c : contadores) {
            if (c >= 2) {
                totalGrupos++;
            }
        }
        if (totalGrupos > 0) {
            mensaje = "Los grupos encontrados fueron:\n";
            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                }
            }
        }
        return mensaje;
    }
    
    public List<List<Carta>> getEscaleras() {
    // Ordenar las cartas por pinta y nombre
    Arrays.sort(cartas, Comparator.comparing(Carta::getPinta).thenComparing(Carta::getNombre));

    // Buscar escaleras
    List<List<Carta>> escalerasEncontradas = new ArrayList<>();
    List<Carta> escaleraActual = new ArrayList<>();
    escaleraActual.add(cartas[0]);
    for (int i = 1; i < cartas.length; i++) {
        if (cartas[i].getPinta() == cartas[i - 1].getPinta() &&
            (cartas[i].getNombre().ordinal() == cartas[i - 1].getNombre().ordinal() + 1 ||
             (cartas[i].getNombre() == NombreCarta.AS && cartas[i - 1].getNombre() == NombreCarta.KING) ||
             (cartas[i].getNombre() == NombreCarta.KING && cartas[i - 1].getNombre() == NombreCarta.AS))) {
            escaleraActual.add(cartas[i]);
        } else {
            if (escaleraActual.size() >= 2) {
                escalerasEncontradas.add(new ArrayList<>(escaleraActual));
            }
            escaleraActual.clear();
            escaleraActual.add(cartas[i]);
        }
    }
    if (escaleraActual.size() >= 2) {
        escalerasEncontradas.add(new ArrayList<>(escaleraActual));
    }

    return escalerasEncontradas;
}

    
    public String getEscalerasTexto() {
    List<List<Carta>> escaleras = getEscaleras();
    if (!escaleras.isEmpty()) {
        StringBuilder sb = new StringBuilder("Se encontraron las siguientes escaleras:\n");
        for (List<Carta> escalera : escaleras) {
            sb.append(escalera.get(0).getPinta()).append(" de ")
                    .append(escalera.get(0).getNombre()).append(" hasta ")
                    .append(escalera.get(escalera.size() - 1).getNombre()).append("\n");
        }
        return sb.toString();
    } else {
        return "No se encontraron escaleras";
    }
}
    
    public int calcularPuntajeTotal() {
        int puntajeTotal = 0;
        for (Carta carta : cartas) {
            if (!carta.esFigura()) {
                puntajeTotal += NombreCarta.values()[carta.getNombre().ordinal()].ordinal() + 1;
            } else {
                puntajeTotal += 10;
            }
        }
        return puntajeTotal;
	}

    
 }

