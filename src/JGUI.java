import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JGUI
{
    public static void main(String[] args)
    {
        /*
        Buat aplikasi kek ada pemilik toko (Selalu Mandi Tiap Hari). Jualan 3 komoditas utama (pasta gigi 15k, sampo 9k, sabun 11k)
        Buat aplikasu buat mentotalkan transaksi (ada nama pembeli, jumlah barang dibeli, total transaksi) diatata kayak bon
         */

        //JPANEL
        JPanel isian = new JPanel();
        isian.setBounds(0,0,250,400);
        isian.setBackground(new Color(220,225,222));
        isian.setLayout(null);

        JPanel harga = new JPanel();
        harga.setBounds(250,0,600,50);
        harga.setLayout(null);

        JPanel tabel = new JPanel();
        tabel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        tabel.setBounds(200,40,600,400);


        //JFRAME
        JFrame frame = new JFrame("Toko Selalu Mandi Tiap Hari");
        frame.setLayout(null);

        //JLABEL
        //Label Nama
        JLabel label1 = new JLabel("Nama:");
        label1.setBounds(25,30,100,15);
        label1.setFont(new Font("Montserrat SemiBold",Font.PLAIN,15));
        isian.add(label1);
        //Label Pasta
        JLabel label2 = new JLabel("Pasta Gigi:");
        label2.setBounds(25,90,100,15);
        label2.setFont(new Font("Montserrat SemiBold",Font.PLAIN,15));
        isian.add(label2);
        //Label Shampo
        JLabel label3 = new JLabel("Shampo:");
        label3.setBounds(25,150,100,15);
        label3.setFont(new Font("Montserrat SemiBold",Font.PLAIN,15));
        isian.add(label3);
        //Label Sabun
        JLabel label4 = new JLabel("Sabun:");
        label4.setBounds(25,210,100,15);
        label4.setFont(new Font("Montserrat SemiBold",Font.PLAIN,15));
        isian.add(label4);
        //Label Harga
        JLabel hga = new JLabel("Pasta gigi: 15k               Sampo: 9k              Sabun: 11k");
        hga.setBounds(19,20,1000,25);
        hga.setFont(new Font("Montserrat SemiBold",Font.BOLD,17));
        harga.add(hga);

        //Jtext
        //Nama
        JTextField nama = new JTextField();
        nama.setBounds(25,50,200,30);
        isian.add(nama);
        //Pasta
        JTextField pasta = new JTextField();
        pasta.setBounds(25,110,200,30);
        isian.add(pasta);
        //Shampo
        JTextField sp = new JTextField();
        sp.setBounds(25,170,200,30);
        isian.add(sp);
        //Sabun
        JTextField sbn = new JTextField();
        sbn.setBounds(25,230,200,30);
        isian.add(sbn);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Nama");
        model.addColumn("Pasta gigi");
        model.addColumn("Shampo");
        model.addColumn("Sabun");
        model.addColumn("Total");



        //BUTTON
        JButton Add = new JButton("Tambah");
        Add.setBounds(70,280,100,40);
        Add.setFont(new Font("Montserrat SemiBold",Font.BOLD,12));
        Add.setBackground(new Color(191,201,195));
        isian.add(Add);
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nama.getText();
                int odol = Integer.parseInt(pasta.getText());
                int sampo = Integer.parseInt(sp.getText());
                int sabun = Integer.parseInt(sbn.getText());

                int hodol = odol*15000;
                int hsampo = sampo * 9000;
                int hsabun = sabun *11000;
                int total = hodol+hsabun+hsampo;
                model.addRow(new Object[]{name,odol+" x 15.000",sampo+" x 9.000",sabun+" x 11.000",total});
                nama.setText("");
                pasta.setText("");
                sp.setText("");
                sbn.setText("");

            }
        });
        tabel.add(new JScrollPane(table));

        //OUTPUT
        frame.add(isian);
        frame.add(harga);
        frame.add(tabel);
        frame.setSize(800,400);
        frame.setVisible(true);
    }
}
