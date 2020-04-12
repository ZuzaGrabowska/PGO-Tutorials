import java.awt.*;

public class Kubek {
  int pojemnosc;
  String material;
  String nadruk;
  Color kolor;


  public Kubek(String material) {
	this.material = material;
  }

  public Kubek(String material, int pojemnosc, Color kolor) {
	this.material = material;
    this.pojemnosc = pojemnosc;  
	this.kolor = kolor;
  }

  public Kubek(String material, int pojemnosc, String nadruk) {
	this.material = material;
    this.pojemnosc = pojemnosc;  
	this.nadruk =  nadruk;
  }
   // Create a class constructor for the Kubek class - zadanie 3 IV
   public Kubek(String material, int pojemnosc, Color kolor, String nadruk) {
	this.material = material;
    this.pojemnosc = pojemnosc;  
	this.nadruk = nadruk;
	this.kolor = kolor;	
  }
  

   public Kubek(String material, int pojemnosc) {
	this.material = material;
    this.pojemnosc = pojemnosc;  
  }
  

   public Kubek(String material, String nadruk) {
	this.material = material;
    this.nadruk = nadruk;
   }
   

   public Kubek(String material, Color kolor) {
	this.material = material;
	this.kolor = kolor;
   }
   

   public Kubek(int pojemnosc, String nadruk) {
    this.pojemnosc = pojemnosc;  
	this.nadruk = nadruk;
   }
   

  public static void main(String[] args) {
    Kubek zZuzaKubek = new Kubek("Plastik"); 
    System.out.println("Przypadek I Materiał. Polemnosc:" + zZuzaKubek.pojemnosc+ " Materiał:" + zZuzaKubek.material+ " Nadruk:" + zZuzaKubek.nadruk+ " Kolor:" + zZuzaKubek.kolor);
	
	Kubek IIzZuzaKubek = new Kubek("Stal", 330, Color.red); 
    System.out.println("Przypadek II Materiał Pojemność Kolor. Polemnosc:" + IIzZuzaKubek.pojemnosc+ " Materiał:" + IIzZuzaKubek.material+ " Nadruk:" + IIzZuzaKubek.nadruk+ " Kolor:" + IIzZuzaKubek.kolor);
	
	Kubek IIIzZuzaKubek = new Kubek("Drewno", 500, "Zuza"); 
    System.out.println("Przypadek III Materiał Pojelmnosc Nadruk. Polemnosc:" + IIIzZuzaKubek.pojemnosc+ " Materiał:" + IIIzZuzaKubek.material+ " Nadruk:" + IIIzZuzaKubek.nadruk+ " Kolor:" + IIIzZuzaKubek.kolor);
	
	Kubek IVzZuzaKubek = new Kubek("Drewno", 500, Color.red, "Zuza"); 
    System.out.println("Przypadek IV Materiał Pojelmnosc Kolor Nadruk. Polemnosc:" + IVzZuzaKubek.pojemnosc+ " Materiał:" + IVzZuzaKubek.material+ " Nadruk:" + IVzZuzaKubek.nadruk+ " Kolor:" + IVzZuzaKubek.kolor);
	
	Kubek VzZuzaKubek = new Kubek("Drewno", 1500); 
    System.out.println("Przypadek V Materiał Pojelmnosc. Polemnosc:" + VzZuzaKubek.pojemnosc+ " Materiał:" + VzZuzaKubek.material+ " Nadruk:" + VzZuzaKubek.nadruk+ " Kolor:" + VzZuzaKubek.kolor);
	
	Kubek VIzZuzaKubek = new Kubek("Drewno",  "Zuza"); 
    System.out.println("Przypadek VI Materiał Nadruk. Polemnosc:" + VIzZuzaKubek.pojemnosc+ " Materiał:" + VIzZuzaKubek.material+ " Nadruk:" + VIzZuzaKubek.nadruk+ " Kolor:" + VIzZuzaKubek.kolor);
	
	Kubek VIIzZuzaKubek = new Kubek("Drewno", Color.red); 
    System.out.println("Przypadek VII Materiał Pojelmnosc Kolor Nadruk. Polemnosc:" + VIIzZuzaKubek.pojemnosc+ " Materiał:" + VIIzZuzaKubek.material+ " Nadruk:" + VIIzZuzaKubek.nadruk+ " Kolor:" + VIIzZuzaKubek.kolor);
	
	Kubek VIIIzZuzaKubek = new Kubek(500, "Zuza"); 
    System.out.println("Przypadek VIII  Pojelmnosc  Nadruk. Polemnosc:" + VIIIzZuzaKubek.pojemnosc+ " Materiał:" + VIIIzZuzaKubek.material+ " Nadruk:" + VIIIzZuzaKubek.nadruk+ " Kolor:" + VIIIzZuzaKubek.kolor);
	
	
  }
}