package main;

import java.util.HashMap;

public class Parkhaus {
    private int etagen;
    private int platzProEtage;
    private Fahrzeug[][] parkplatzBelegung;
    private HashMap<String, Position> fahrzeugPosition;

    public Parkhaus(int etagen, int platzProEtage) {
        this.etagen = etagen;
        this.platzProEtage = platzProEtage;
        this.parkplatzBelegung = new Fahrzeug[etagen][platzProEtage];
        this.fahrzeugPosition = new HashMap<>();
    }

    public boolean einfahrt(Fahrzeug fahrzeug) {
        for (int etage = 0; etage < etagen; etage++) {
            for (int parkplatz = 0; parkplatz < platzProEtage; parkplatz++) {
                if (parkplatzBelegung[etage][parkplatz] == null) {
                    parkplatzBelegung[etage][parkplatz] = fahrzeug;
                    fahrzeugPosition.put(fahrzeug.getNummernschild(), new Position(etage, parkplatz));
                    return true; // Fahrzeug erfolgreich eingeparkt
                }
            }
        }
        // Keinen freien Parkplatz gefunden
        return false;
    }

    public boolean ausfahrt(Fahrzeug fahrzeug) {
        if (fahrzeugPosition.containsKey(fahrzeug.getNummernschild())) {
            Position position = fahrzeugPosition.get(fahrzeug.getNummernschild());
            int etage = position.getEtage();
            int parkplatz = position.getParkplatz();
            parkplatzBelegung[etage][parkplatz] = null;
            fahrzeugPosition.remove(fahrzeug.getNummernschild());
            return true;// Fahrzeug erfolgreich raus gefahren
        }
        // Fahrzeug wird nicht gefunden
        return false;
    }

    public Position getPosition(Fahrzeug fahrzeug) {
       return fahrzeugPosition.get(fahrzeug.getNummernschild());
       
    }

    public int freieParkplaetze() {
        int frei = 0;
        for (int etage = 0; etage < etagen; etage++) {
            for (int platz = 0; platz < platzProEtage; platz++) {
                if (parkplatzBelegung[etage][platz] == null) {
                    frei++;
                }
            }
        }
        return frei; // Anzahl der freien Parkplätze zurückgeben
    }

    public int getEtagen() {
        return etagen;
    }

    public int getPlatzProEtage() {
        return platzProEtage;
    }
}
