import javax.swing.JOptionPane;

public class ekko {
    public static void main(String[] args) {
        int b = 0 , k = 0 , r = 0 , aa = 0 , pw = 0;
        String a = JOptionPane.showInputDialog("sayi= ");
        
        if (a.equals("0.01")) {
            for (int i=1; i<=5; i++) {
                String t = JOptionPane.showInputDialog("değer= ");
                int tt = Integer.parseInt(t);
                if(t.equals("100")){
                    b++;
                }else if (tt>100) {
                    if (tt%2==0){
                        pw = pw + tt;
                    }
                    k++; 
                }
                if ( i == 5 && b ==0 && k==0) {
                    System.out.println("Kayıt Yok");
                }else if (i==5 && (b>0 || k>0)) {
                    System.out.println("100 e eşit = " + b + " tane değer var");
                    System.out.println("100 den büyük= " + k + " tane değer var");
                    System.out.println("Çift sayıların toplamı = " + pw);
                }
        }
        
        }
        if (a.equals("0.02")) {
            for (int i=1; i<=5;i++) {
                String pp = JOptionPane.showInputDialog("true,false");
                boolean pq = Boolean.parseBoolean(pp);
                if (pq == true) {
                    r++;
                }else if (i==5 && r == 0) {
                    System.out.println("True değer girilmedi");
                }
                if (r>0) {
                    System.out.println(r + "Tane true yazdınız");
                }
            }
        }
        
        
    }
} 