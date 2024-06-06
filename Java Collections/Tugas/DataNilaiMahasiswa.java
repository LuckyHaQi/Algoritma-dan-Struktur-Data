package Tugas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;

public class DataNilaiMahasiswa {
    static Queue<Mahasiswa> mahasiswas = new LinkedList<>();
    static Queue<MataKuliah> mataKuliahs = new LinkedList<>();
    static Queue<Nilai> nilais = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("*----------------------------------------------*");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("*----------------------------------------------*");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Nilai");
        System.out.println("6. Keluar");
        System.out.println("*----------------------------------------------*");
        System.out.print("Pilih: ");
    }

    static void inputNilai() {
        System.out.println("*-- INPUT NILAI --*");
        System.out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("*----------------------------------------------*");
        System.out.println("NIM Nama Telf");
        mahasiswas.forEach((mhs) -> {
            System.out.println(mhs);
        });
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("*----------------------------------------------*");
        System.out.println("Kode Mata Kuliah SKS");
        mataKuliahs.forEach((mk) -> {
            System.out.println(mk);
        });
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kode = sc.nextLine();
        Mahasiswa mhs = findMahasiswaByNim(nim);
        MataKuliah mk = findMataKuliahByKode(kode);
        if (mhs != null && mk != null) {
            Nilai nilaiBaru = new Nilai(mhs, mk, nilai);
            nilais.add(nilaiBaru);
            System.out.println("Nilai berhasil ditambahkan.");
        } else {
            System.out.println("Data mahasiswa atau mata kuliah tidak ditemukan.");
        }
    }

    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*----------------------------------------------*");
        System.out.println("NIM Nama Mata Kuliah SKS Nilai");
        nilais.forEach((n) -> {
            System.out.println(n);
        });
    }

    static void cariNilai() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        boolean found = false;
        for (Nilai n : nilais) {
            if (n.getNim().equals(nim)) {
                System.out.println("NIM Nama Mata Kuliah SKS Nilai");
                System.out.printf("%-5s %-10s %-10s %-2s %-4.2f\n", n.getNim(), n.getNama(), n.getMataKuliah(), n.getSks(), n.getNilai());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void sortData() {
        Nilai[] nilaiArr = nilais.toArray(new Nilai[0]);
        for (int j = 0; j < nilaiArr.length - 1; j++) {
            for (int k = 0; k < nilaiArr.length - j - 1; k++) {
                if (nilaiArr[k].getNilai() < nilaiArr[k + 1].getNilai()) {
                    Nilai temp = nilaiArr[k];
                    nilaiArr[k] = nilaiArr[k + 1];
                    nilaiArr[k + 1] = temp;
                }
            }
        }
        nilais.clear();
        Collections.addAll(nilais, nilaiArr);
        System.out.println("Data nilai telah diurutkan berdasarkan nilai.");
    }

    static void hapusData() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        boolean found = false;
        Nilai toRemove = null;
        for (Nilai n : nilais) {
            if (n.getNim().equals(nim)) {
                toRemove = n;
                found = true;
                break;
            }
        }
        if (found) {
            nilais.remove(toRemove);
            System.out.println("Data nilai berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static Mahasiswa findMahasiswaByNim(String nim) {
        for (Mahasiswa m : mahasiswas) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }

    static MataKuliah findMataKuliahByKode(String kode) {
        for (MataKuliah mk : mataKuliahs) {
            if (mk.getKode().equals(kode)) {
                return mk;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        mahasiswas.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mahasiswas.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mahasiswas.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        mahasiswas.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mahasiswas.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mahasiswas.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));
        mataKuliahs.add(new MataKuliah("00001", "Internet of Things", "3"));
        mataKuliahs.add(new MataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        mataKuliahs.add(new MataKuliah("00003", "Algoritma dan Pemrograman", "2"));
        mataKuliahs.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mataKuliahs.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", "4"));

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();  
            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                cariNilai();
                break;
                case 4:
                    sortData();
                    break;
                case 5:
                    hapusData();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih != 6);
    }
}