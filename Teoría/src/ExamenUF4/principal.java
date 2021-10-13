package ExamenUF4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class principal {
    // Componentes
    CPU cpu1 = new CPU("i9-10910",5000,10, 500);
    CPU cpu2 = new CPU("i7-4900MQ",3800,4, 270);
    CPU cpu3 = new CPU("Qualcomm Snapdragon 865",1800,8, 120);
    CPU cpu4 = new CPU("MediaTek Dimensity 1000+",2000,8, 130);
    RAM ram1 = new RAM("Crucial Ballistix BL2K8G36C16U4R", 16, 112);
    RAM ram2 = new RAM("Viper Elite DDR4 2666", 8, 57);
    RAM ram3 = new RAM("LPDDR5", 6, 40);
    RAM ram4 = new RAM("LPDDR4X", 8, 50);
    HDD hdd1 = new HDD("SATA2", 500, 55);
    HDD hdd2 = new HDD("SSD", 250, 110);
    HDD hdd3 = new HDD("UFS 3.1", 128, 60);
    HDD hdd4 = new HDD("UFS 3.1", 256, 90);
    Bateria b2 = new Bateria("Green Cell® L16M2PB1 L16C2PB2 ", 3500, 100,40);
    Bateria b3 = new Bateria("Li-Polymer", 4250, 100,55);
    Bateria b4 = new Bateria("Li-Polymer", 5000, 100,65);

    // arrayList
    static ArrayList<Dispositivo> carritoCompra = new ArrayList<Dispositivo>();

    // Methods
    public static void showCarritoCompra() {
        for (Dispositivo device:carritoCompra){
            System.out.println(device.toString());
        }
    }

    public static void sortByCapacidad(){
        Collections.sort(carritoCompra, new ordenar_dispositivo_capacidad());
    }

    public static void main(String[] args) {
        sortByCapacidad();
        showCarritoCompra();

    }

}
