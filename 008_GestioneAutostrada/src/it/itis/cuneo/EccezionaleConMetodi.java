package it.itis.cuneo;


public class EccezionaleConMetodi {

    public void metodo1() throws Exception {
        metodo2();
    }

    public void metodo2() throws Exception {
        throw new Exception("Eccezione dal metodo2");
    }

    public static void main(String[] args) throws Exception {
        EccezionaleConMetodi eccezionaleConMetodi = new EccezionaleConMetodi();
        eccezionaleConMetodi.metodo1();
    }
}
