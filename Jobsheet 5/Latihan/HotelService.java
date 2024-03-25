public class HotelService{
    Hotel listHotel[] = new Hotel[5];
    int ps;

    void tambah(Hotel ha){
        if (ps < listHotel.length){
            listHotel[ps] = ha;
            ps++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll(){
        for (Hotel ha : listHotel){
            ha.tampilAll();
            System.out.println("=------------------------=");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listHotel.length-1; i++){
            for(int j = 1; j < listHotel.length-i; j++){
                if(listHotel[j].bintang > listHotel[j-1].bintang){
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < listHotel.length-1; i++){
            int psMin = i;
            for(int j = i + 1; j<listHotel.length; j++){
                if(listHotel[j].harga < listHotel [psMin].harga){
                    psMin = j;
                }
            }
            Hotel tmp = listHotel [psMin];
            listHotel [psMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
}