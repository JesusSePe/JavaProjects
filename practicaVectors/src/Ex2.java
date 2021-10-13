public class Ex2 {
    public static void main(String[] args) {
        // Variables
        int[] votos = {110, 50, 40};
        int[] escons = new int[3];
        int maxEscons = 7;
        // Asignar el primer escaño
        int[] max = new int[2];
        // max[0]=votos, max[1]=partido
        for (int i=0; i < votos.length; i++){
            if (votos[0] > max[0]){
                max[0] = votos[0];
                max[1] = i;
            }
        }
        System.out.println("El primer escaño es para "+max[1]);
        escons[max[1]]=1;
        // Loop por cada escaño restante
        for (int esco = 2; esco <= maxEscons; esco++) {
            max[0]=0;
            for (int i=0; i < votos.length; i++){
                System.out.println("Operación: "+votos[i]/(escons[i]+1)+" y max[0] = "+ max[0]);
                if ((votos[i]/(escons[i]+1)) > max[0]) {
                    max[0] = (votos[i]/(escons[i]+1));
                    max[1] = i;
                }
            }
            escons[max[1]]+=1;
            System.out.println("El escaño "+ esco+" es para "+max[1]);
        }
        System.out.println("Resultats: partit1= "+escons[0]+" partit2= "+escons[1]+" partit3= "+ escons[2]);
    }
}
