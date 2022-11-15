import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ipt = new Scanner(System.in);
        /*//NO. 1
        int lebar = 15;
        int pjg = 20;
        System.out.println("===== No. 1 =====");
        System.out.println("Panjang:"+lebar+" cm"+"\nLuas   :"+pjg+" cm");
        System.out.println("Luas persegi panjang:"+(lebar*pjg)+" cm");

        //NO. 2
        int detik = 7200;
        int mnt = detik/60;
        int jam = detik/3600;
        System.out.println("\n===== No. 2 =====");
        System.out.printf("Detik: %ds\n",detik);
        System.out.printf("Menit: %dm\n",mnt);
        System.out.printf("Jam  : %dj\n",jam);

        //NO. 3
        System.out.println("\n===== No. 3 =====");
        System.out.print("Masukkan angka: ");
        int angka = ipt.nextInt();
        if (angka%2 == 0)
        {
            System.out.println("Angka ini genap");
        }else
        {
            System.out.println("Angka ini ganjil");
        }

        //NO. 4
        System.out.println("\n===== No. 4 =====");
        int jari = 7;
        double luas = Math.PI*Math.pow(jari,2);
        System.out.println("Luas lingkaran: "+luas);

        //NO. 5
        System.out.println("\n===== No. 5 =====");
        System.out.print("Masukkan angka ke-1: ");
        int a = ipt.nextInt();
        System.out.print("Masukkan angka ke-2: ");
        int b = ipt.nextInt();
        System.out.print("Masukkan angka ke-3: ");
        int c = ipt.nextInt();

        if ((a>b && a>c) && b<c)
        {
            System.out.println("Bilangan terbesar: "+a);
            System.out.println("Bilangan terkecil: "+b);
        }else if ((a>b && a>c) && c<b)
        {
            System.out.println("Bilangan terbesar: "+a);
            System.out.println("Bilangan terkecil: "+c);
        }else if ((b>a && b>c) && a<c)
        {
            System.out.println("Bilangan terbesar: "+b);
            System.out.println("Bilangan terkecil: "+a);
        }else if ((b>a && b>c) && c<a)
        {
            System.out.println("Bilangan terbesar: "+b);
            System.out.println("Bilangan terkecil: "+c);
        }else if ((c>a && c>b) && a<b)
        {
            System.out.println("Bilangan terbesar: "+c);
            System.out.println("Bilangan terkecil: "+a);
        }else if ((c>a && c>b) && b<a)
        {
            System.out.println("Bilangan terbesar: "+c);
            System.out.println("Bilangan terkecil: "+b);
        }else
        {
            System.out.println("Angka sama semua");
        }
        float x = (float)(a+b+c)/3;
        System.out.printf("Rata rata angka: %.2f", x);*/



        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        panel.setBackground(Color.red);
        panel.setBounds(0,0,500,500);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Nama");
        model.addColumn("Pasta gigi");
        model.addColumn("Shampo");
        model.addColumn("Sabun");
        model.addColumn("Total");
        model.addRow(new Object[]{2*2, "v2"});


        JFrame frame = new JFrame("ANjing");
        panel.add(new JScrollPane(table));
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
