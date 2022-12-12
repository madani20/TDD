package calculator;

public class Calculator {
    public int add(String s) {
        if (s=="") return 0;
        String[] valeurs = s.split(",");
        int somme=0;
        int i=0;
            for(String v : valeurs){
            String[] vPropres = v.split("\n");
            somme += Integer.valueOf(vPropres[i]);
           }
        return somme;
    }
}
