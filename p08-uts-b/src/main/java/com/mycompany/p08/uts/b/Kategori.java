// Nama: Raffi Aditya Rahman NPM : 2410010578
package com.mycompany.p08.uts.b;

public enum Kategori {
    ALAT_TULIS("Alat Tulis"), MAKANAN("Makanan"), MINUMAN("Minuman"), LAINNYA("Lainnya");

    private final String label;

    Kategori(String label) { this.label = label; }

    @Override
    public String toString() { return label; }
}