// Nama: Raffi Aditya Rahman  NPM: 2410010578
package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BarangTableModel extends AbstractTableModel {
    private final String[] namaKolom = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private final List<Barang> daftar = new ArrayList<>();

    @Override public int getRowCount() { return daftar.size(); }
    @Override public int getColumnCount() { return namaKolom.length; }
    @Override public String getColumnName(int kolom) { return namaKolom[kolom]; }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);
        switch (kolom) {
            case 0: return b.getNama();
            case 1: return b.getKategori();
            case 2: return formatRupiah(b.getHarga());
            case 3: return b.getJumlah();
            default: return formatRupiah(b.getSubtotal());
        }
    }

    public void tambah(Barang b) {
        daftar.add(b);
        fireTableRowsInserted(daftar.size() - 1, daftar.size() - 1);
    }

    public boolean sudahAda(String nama) {
        for (Barang b : daftar) {
            if (b.getNama().equalsIgnoreCase(nama)) return true;
        }
        return false;
    }

    public long getTotal() {
        long total = 0;
        for (Barang b : daftar) total += b.getSubtotal();
        return total;
    }

    public long getDiskon() {
        long total = getTotal();
        return total >= 100000 ? total / 10 : 0;
    }

    public long getBayar() { return getTotal() - getDiskon(); }

    public static String formatRupiah(long nilai) {
        return "Rp" + String.format("%,d", nilai).replace(',', '.');
    }
}