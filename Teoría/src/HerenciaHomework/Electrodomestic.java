package HerenciaHomework;

public class Electrodomestic {
    private float preu, pes;
    private String color, consum;

    // Constructors
    public Electrodomestic() {
        setPreu(100);
        setPes(5);
        setColor("Blanc");
        setConsum("F");
    }

    public Electrodomestic(float preu, float pes) {
        setPreu(preu);
        setPes(pes);
        setColor("Blanc");
        setConsum("F");
    }

    public Electrodomestic(float preu, float pes, String color, String consum) {
        setPreu(preu);
        setPes(pes);
        setColor(color);
        setConsum(consum);
    }

    // Getters & Setters

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        if (preu >= 0) {
            this.preu = preu;
        } else {
            this.preu = 100;
        }
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        if (pes >= 0) {
            this.pes = pes;
        } else {
            this.pes = 5;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.toLowerCase().matches("blanc|negre|vermell|blau|gris")){
            this.color = color;
        } else {
            this.color = "Blanc";
        }
    }

    public String getConsum() {
        return consum;
    }

    public void setConsum(String consum) {
        if (consum.toUpperCase().matches("A|B|C|D|E|F")){
            this.consum = consum;
        } else {
            this.consum = "F";
        }
    }

    // Methods
    public float preuFinal(){
        int plus = 0;
        // Check consum
        switch (getConsum()) {
            case "A":
                plus = 100;
            case "B":
                plus = 80;
            case "C":
                plus = 60;
            case "D":
                plus = 50;
            case "E":
                plus = 30;
            case "F":
                plus = 10;
        }
        // Check pes
        if (getPes() < 20) {
            plus += 10;
        } else if (getPes() < 50) {
            plus += 50;
        } else if (getPes() < 80) {
            plus += 80;
        } else {
            plus += 100;
        }
        return (getPreu()+plus);
    }

}
