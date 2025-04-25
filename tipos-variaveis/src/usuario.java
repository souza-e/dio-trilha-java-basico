public class usuario {
    
  

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();



        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);  
        
        
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    }
}
