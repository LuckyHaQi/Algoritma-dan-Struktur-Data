public class PersewaanAlat16 {
    AlatPesta16 list16[] = new AlatPesta16[3];
    
    public void tampilDataAlat16() {
        System.out.println("\nData Alat Pesta: \n");
        for (int i = 0; i < list16.length; i++) {
            list16[i].DataAlat16();
        }
    }

    public void urutkanHargaAscending16() {
        for (int i = 0; i < list16.length - 1; i++) {
            for (int j = 0; j < list16.length - i - 1; j++) {
                if (list16[j].hargaSewa16 > list16[j + 1].hargaSewa16) {
                    AlatPesta16 temp16 = list16[j];
                    list16[j] = list16[j + 1];
                    list16[j + 1] = temp16;
                }
            }
        }
        System.out.println("\nData Alat Pesta setelah diurutkan secara ascending:");
        tampilDataAlat16();
    }
    public void urutkanHargaDescending16() {
        for (int i = 0; i < list16.length - 1; i++) {
            for (int j = 0; j < list16.length - i - 1; j++) {
                if (list16[j].hargaSewa16 < list16[j + 1].hargaSewa16) {
                    AlatPesta16 temp16 = list16[j];
                    list16[j] = list16[j + 1];
                    list16[j + 1] = temp16;
                } 
            }
        }
        System.out.println("\nData Alat Pesta setelah diurutkan secara descending:");
        tampilDataAlat16();
    }
    public void cariAlatPesta16(String nama) {
        boolean ditemukan16 = false;
        for (int i = 0; i < list16.length; i++) {
            if (list16[i].namaAlat16.equalsIgnoreCase(nama)) {
                System.out.println("Alat ditemukan:");
                list16[i].DataAlat16();
                ditemukan16 = true;
                break;
            }
        }
        if (!ditemukan16) {
            System.out.println("Alat tidak ditemukan.");
        }
    }
}