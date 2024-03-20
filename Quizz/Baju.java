public class Baju {
  private String bajuDaerah;
  private int hargaSewa;
  private int durasiSewa;

  public Baju(String bajuDaerah, int hargaSewa, int durasiSewa) {
    this.bajuDaerah = bajuDaerah;
    this.hargaSewa = hargaSewa;
    this.durasiSewa = durasiSewa;
  }
  public String bajuDaerah() {
    return bajuDaerah;
  }
  public int hargaSewa() {
    if(hargaSewa >= 100000){
      return hargaSewa;
      } else {
      return hargaSewa - (hargaSewa / 2);
      }
    }
  public int durasiSewa() {
    return durasiSewa;
  }
  public int hitungTotalSewa() {
    if (durasiSewa <= 1) {
      return durasiSewa * hargaSewa;
    } else {
      return hargaSewa + (durasiSewa - 1) * (hargaSewa / 2);
    }
  }
}
