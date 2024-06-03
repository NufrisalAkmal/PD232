package pd232;
import java.io.*;

public class PD232 {
    public static int totalSPP; //variabel global (bisa dibaca semua blok program)
   
    public static void main(String[] args) {
       
        BufferedReader br = new BufferedReader
                (new InputStreamReader (System.in));
        try {
             
            do {
             
             //variabel 
             String nim, nama;
             int jml_semester, totalSPP;
             
             System.out.println("----------------");
             System.out.println("1. Input Data");
             System.out.println("2. Output Data");
             System.out.println("3. Logout");
             System.out.println("----------------");
             System.out.println("Pilih Menu : ");
             //inputan buefferedReader
             int menu = Integer.parseInt(br.readLine());
             
             switch(menu) {
                 case 1 : // menu 
                     System.out.print("Isi NIM : "); 
                     nim = br.readLine();
                     System.out.print("Isi Nama : ");
                     nama = br.readLine();
                     System.out.print("Isi Semester yang "
                                + "Sudah Ditempuh : ");
              jml_semester = Integer.parseInt(br.readLine());
                             
                     total_SPP(jml_semester);
                     
                     System.out.println("Total SPP : " +
                             total_SPP(jml_semester));
                     break; //program break //program break
                 case 2 : // menu 2
                     break; //program break
                 default:
                       System.exit(0);
             }
            } while (true);

        }catch (Exception e){
          System.out.println("error adalah"
                    + e.getMessage()); 
        }
    }
    static public int total_SPP(int smt){

        totalSPP = smt * 15000000;
        return totalSPP;
    }
         
    static public void cetakData(){

    }


    }