public class Mahasiswa {
    String username, password;

    public void login(){
        if(username.equals("Alif Zaky Nasywa Muhammad") && password.equals("202410370110345")){
            System.out.println("login mahasiswa berhasi");
            displayInfo();
        }else{
            System.out.println("Login gagal! nama atau nim salah");
        }
    }
    public void displayInfo(){
        System.out.printf("Nama : %s \n", username);
        System.out.printf("NIM  : %s"   , password);
    }
}
