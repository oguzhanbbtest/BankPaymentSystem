package Interface;

public class Bbank implements IBank {
    private String bankname;
    private String terminal_id;
    private String password;


    public Bbank(String bankname, String terminal_id, String password) {
        this.bankname = bankname;
        this.terminal_id = terminal_id;
        this.password = password;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("Kullanici ip : " +ipAdress);
        System.out.println("Makina ip : " +this.hostIpAdress);
        System.out.println(this.bankname + " Baglanildi !");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expirationDate, String CVC) {
        // Banka ödeme işlemleri
        System.out.println("Bankadan Cevap Bekleniyor ....");
        System.out.println("Islem Basarili");
        return false;
    }
}
