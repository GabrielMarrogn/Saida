public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 1; i <= 7; i++){
            if(i == 1 || i == 7){
                for(int k = 0;k < 39; k++){
                    System.out.print("-");
                }
            }else if(i > 1 && i <7){
                for(int k = 1;k <= 39; k++){
                    if(k == 1 || k == 39){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
