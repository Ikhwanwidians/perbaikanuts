import java.util.Scanner;

public class PersegiPanjang implements LuasPersegiPanjang{
    int Panjang,Lebar;
    
    public PersegiPanjang(int Panjang,int Lebar){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    
}

    public double hitungLuas() {
        double luas = Panjang * Lebar;
        return luas;
    }
    
}

