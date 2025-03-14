public class main {
    public static void main(String[] args){
        hewan hewan1 = new hewan();
        hewan hewan2 = new hewan();
        hewan hewan3 = new hewan();

        hewan1.Namahewan = "Kucing";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "Miawwwww~~~";
        hewan1.Habitat= "Darat";

        hewan2.Namahewan = "Anjing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Woofff-Woofff!!~~";
        hewan2.Habitat= "Darat";

        hewan3.Namahewan = "Lumba-Lumba";
        hewan3.Jenis = "Mamalia";
        hewan3.Suara = "Blubub-Blubub~~~";
        hewan3.Habitat = "UDARA, AIR, DARAT";


        hewan1.tampilkaninfo();
        hewan2.tampilkaninfo();
        hewan3.tampilkaninfo();
    }
}
