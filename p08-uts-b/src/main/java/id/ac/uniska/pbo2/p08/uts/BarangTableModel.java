/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author muham
 */
public class BarangTableModel extends AbstractTableModel { 
  
    private static final double PERSEN_DISKON = 0.10;
 
    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
 
    private final List<Barang> data = new ArrayList<>();
 
    public static String rupiah(long nilai) {
        return "Rp" + String.format("%,d", nilai).replace(',', '.');
    }
 
    public void tambah(Barang b) {
        data.add(b);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
 
    public void bersihkan() {
        data.clear();
        fireTableDataChanged();
    }
 
    public long getTotal() {
        long total = 0;
        for (Barang b : data) {
            total += b.getSubtotal();
        }
        return total;
    }
 
    public long getDiskon() {
        return Math.round(getTotal() * PERSEN_DISKON);
    }
 
    public long getBayar() {
        return getTotal() - getDiskon();
    }
 
    @Override
    public int getRowCount() {
        return data.size();
    }
 
    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }
 
    @Override
    public String getColumnName(int column) {
        return KOLOM[column];
    }
 
    @Override
    public Object getValueAt(int row, int col) {
        Barang b = data.get(row);
        switch (col) {
            case 0: return b.getNama();
            case 1: return b.getKategori().toString();
            case 2: return rupiah(b.getHarga());
            case 3: return b.getJumlah();
            case 4: return rupiah(b.getSubtotal());
            default: return "";
        }
    }
}