package array;

public class arraytugas {
    public static void main(String[] args) {
        String teman[][]={

                {"Bunga","Dea","Erma"},
                {"Gina","Aulia","Adjeng"},
                {"Wiwit","Tiwi","Besti"},
        };
        for(int row=0; row<teman.length; row++){
            for (int col=0; col<teman.length; col++){
                System.out.println(teman[row][col]+"\t");
            }
            System.out.println();
        }
    }

}
