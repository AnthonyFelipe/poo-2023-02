public class TestaAnimais {
    public static void main(String[] args){
        Animal som[] = new Animal[3];
        som[0] = new Sapo();
        som[1] = new Cachorro();
        som[2] = new Boi();

        for(int i = 0; i<3; i++){
            System.out.println(som[i]);
        }

    }
}
