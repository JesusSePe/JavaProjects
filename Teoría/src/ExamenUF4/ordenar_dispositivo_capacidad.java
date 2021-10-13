package ExamenUF4;

import java.util.Comparator;

public class ordenar_dispositivo_capacidad implements Comparator<Dispositivo> {
    @Override
    public int compare(Dispositivo d1, Dispositivo d2) {
        return d1.getDiskCapacity() - d2.getDiskCapacity();
    }
}
